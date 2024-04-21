package com.controller;

import com.usermodel.UserModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MyController {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Data");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		UserModel um=new UserModel();
		um.setName("Sing Shab");
		um.setPassword("HiddenArgument");
		um.setMobile("964658246");
		um.setWork("Hacker");
		em.persist(um);
//		UserModel userModel=(UserModel)	em.find(UserModel.class, 1);
//		System.out.println(userModel);
		em.getTransaction().commit();
	}

}
