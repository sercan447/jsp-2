package com.zara.larson;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/guru_registering"}, description = "Aciklama satiri eklemek icin",
            initParams = {@WebInitParam(name="abd",value="eminem"),
                          @WebInitParam(name="ingiltere",value="jason statham"),
                          @WebInitParam(name="fransa" ,value="SOS")})
public class phone extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        String first_name = req.getParameter("first_isim");
        String last_name = req.getParameter("last_isim");
        String username = req.getParameter("user_isim");
        String password = req.getParameter("password");
        String adres = req.getParameter("adres");
        String contact = req.getParameter("contact");
        
        if(first_name.isEmpty() || last_name.isEmpty() || username.isEmpty() ||
           password.isEmpty()  || adres.isEmpty() || contact.isEmpty()){
        
            RequestDispatcher reqdis = req.getRequestDispatcher("Register_1.jsp");
            reqdis.include(req, resp);
                    
            
        }else{
             req.setAttribute("Kullaniciadi", username);
            RequestDispatcher regdis2 = req.getRequestDispatcher("Register_2.jsp");
            regdis2.forward(req, resp);
           
        }
        
        
    }
    
    
    
    
}
