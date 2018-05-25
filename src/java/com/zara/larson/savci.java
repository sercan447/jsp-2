
package com.zara.larson;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/kardesian"},description = "Belki geçer uzsutmuzden bir KUŞ ANKA",
            initParams = {@WebInitParam(name="Fransa",value="indila"),
                          @WebInitParam(name="Portekiz",value="Ronaldo"),
                          @WebInitParam(name="ABD",value="Rihanna")
                        })
public class savci extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
       ServletConfig config = super.getServletConfig();
        
        String veri1 = config.getInitParameter("Fransa");
        String veri2 = config.getInitParameter("Portekiz");
        String veri3 = config.getInitParameter("ABD");
        
        String usernmae = req.getParameter("username");
        String pass = req.getParameter("password");
     
        
        if(usernmae.isEmpty() || pass.isEmpty()){
            
           req.setAttribute("olumsuz", "Tekrardan Deneyin bos alanlar mevcut");
         
            RequestDispatcher tekrar = req.getRequestDispatcher("Register_3.jsp");
            tekrar.include(req, resp);
       }else{
            
            req.setAttribute("olumlu", "Hersey Başarılı bir şekilde gerçekleştirildi.");
            req.setAttribute("veri1", veri1);
            req.setAttribute("veri2", veri2);
            req.setAttribute("veri3", veri3);
            
            
            
            RequestDispatcher yonlendir = req.getRequestDispatcher("Register_4.jsp");   
            yonlendir.forward(req, resp);
        }
        
    }
    
    
    
    
}
