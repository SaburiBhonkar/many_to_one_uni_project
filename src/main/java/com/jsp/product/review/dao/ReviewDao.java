package com.jsp.product.review.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.product.review.dto.Review;

public class ReviewDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("saburi");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Review deletereview(Review review) {
		Review review2 = entityManager.find(Review.class, review.getId());
		entityTransaction.begin();
		entityManager.persist(review2);
		entityTransaction.commit();
		System.out.println("Record deleted");
		return review2;

	}

	public Review savereview(Review review) {
		Review review2 = entityManager.find(Review.class, review.getId());
		entityTransaction.begin();
		entityManager.persist(review);
		entityTransaction.commit();
		System.out.println("Record added");
		return review;
	}

	public Review updateReview(Review review) {
		Review review2 = entityManager.find(Review.class, review.getId());
		if (review2 != null) {
			review2.setRating(review.getRating());
			System.out.println("review updated");
		} else
			System.out.println("Id not found");

		entityTransaction.begin();
		entityManager.merge(review2);
		entityTransaction.commit();
		return review2;

	}

}
