
package com.zara.larson;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;


@WebServlet(urlPatterns = {"/zeytindali"},description = "Sarkilar Türü gelincek",
        initParams = {@WebInitParam(name="Sevulepen",value="Sel sal"),
                      @WebInitParam(name="gel dul",value="lu deli gu")})
public class Indila extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        if(ServletFileUpload.isMultipartContent(req)){
            try{
                List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest((RequestContext) req);
                for(FileItem item : multiparts){
                    if(!item.isFormField()){
                        String name = new File(item.getName()).getName();
                        item.write(new File("C:/guru/upload"+File.separator+name));
                    }
                }
                
                req.setAttribute("gurumesaji", "File Uploaded Successfly.");
            
            }catch(Exception ext){
            
                req.setAttribute("gurumesaji", "File Upload Failed due to +"+ext);
            }
        }else{
            req.setAttribute("gurumesaji", "Not file found.");
            
            req.getRequestDispatcher("Result.jsp").forward(req, resp);
        }
        
    }
    
    
}
