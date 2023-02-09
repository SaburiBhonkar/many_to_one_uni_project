package com.jsp.product.review.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.product.review.dto.Product;
import com.jsp.product.review.dto.Review;

public class ProductDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("saburi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Product saveProduct(Product product, Review review) {
		entityTransaction.begin();
		entityManager.persist(product);
		entityManager.persist(review);
		entityTransaction.commit();
		System.out.println("Record Added");
		return product;

	}

	public void getAlldeatils() {
		String sql1 = "select product from Product product";
		String sql2 = "select review from Review review";
		Query query1 = entityManager.createQuery(sql1);
		Query query2 = entityManager.createQuery(sql2);

		List<Product> product = query1.getResultList();
		List<Review> review = query2.getResultList();

		for (Review r : review) {
			System.out.println("======");
			System.out.println(r.getId());
			System.out.println(r.getRating());
		}

		for (Product p : product) {
			System.out.println("======");
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getPrice());
		}
	}

}
