package com.emmanuel.plumas.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.emmanuel.plumas.UserService;

@Controller
public class Accueil extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private UserService u;
	public Accueil() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		String nom=u.getUser((long) 2).getIdentifiant();
		request.setAttribute("nom",nom);
		//Transmission de l'objet request et l'objet response à la jsp
		this.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
