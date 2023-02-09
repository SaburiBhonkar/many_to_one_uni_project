package com.jsp.product.review.controller;

import com.jsp.product.review.dao.ReviewDao;
import com.jsp.product.review.dto.Product;
import com.jsp.product.review.dto.Review;
import com.jsp.product.review.services.ProductServices;

public class TestDriver {

	public static void main(String[] args) {

//Insert

		Product product = new Product();
		product.setName("Shoes");
		product.setPrice(2345);

		Review review = new Review();
		review.setRating("Good");
		review.setProduct(product);

		Review review2 = new Review();
		review2.setRating("Ok");
		review2.setProduct(product);

		Review review3 = new Review();
		review3.setRating("Best");
		review3.setProduct(product);

		ProductServices productServices = new ProductServices();
		productServices.saveProduct(product, review);
		productServices.saveProduct(product, review2);
		productServices.saveProduct(product, review3);

// Delete Review

//		Review review2 = new Review();
//		review2.setId(1);
//
//		
//		ProductServices ProductServices = new ProductServices();
//		ProductServices.deletereview(review2);

// Update Review

//		Review review = new Review();
//		review.setId(4);
//		Product product = new Product();
//		product.setId(1);
//
//		ReviewDao reviewDao = new ReviewDao();
//		reviewDao.updateReview(review);

// Insert Review

//		Review review = new Review();
//		review.setRating("10");
//
//		ReviewDao reviewDao = new ReviewDao();
//		reviewDao.savereview(review);

// AllgetDetails

//		ProductServices productServices = new ProductServices();
//		productServices.getAllDetials();

	}

}
