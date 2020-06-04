package com.emmanuel.plumas;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
//@Service
public class App 
{
	
	
	@Autowired
	IUserEntityRepository repoUtilisateur;
	 
	
	
	public void test() {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Objet optional gère un éventuel objet vide au lieu de null
		Optional<UserEntity> user=repoUtilisateur.findById((long) 2);
		//Méthode get() qui permet de récupérer le contenu d'un optionnal et getIdentifiant est défini dans la classe UserEntity
		UserEntity u=user.get();
		System.out.println(u.getIdentifiant());
		} 
	
	public static void main(String[] args) {
		
		System.out.println( "Hello World!" );
		App a=new App();
    	a.test();
    }
	
}