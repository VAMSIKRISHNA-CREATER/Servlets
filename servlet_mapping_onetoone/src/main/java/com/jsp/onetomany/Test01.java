package com.jsp.onetomany;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test01 {
	public static void main(String[] args) {
		EntityManagerFactory rEMF = Persistence.createEntityManagerFactory("vk");
		System.out.println(rEMF);
	}
}
