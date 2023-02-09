package com.jsp.product.review.services;

import com.jsp.product.review.dao.ProductDao;
import com.jsp.product.review.dao.ReviewDao;
import com.jsp.product.review.dto.Product;
import com.jsp.product.review.dto.Review;

public class ProductServices {
	ProductDao productDao = new ProductDao();
	ReviewDao reviewDao = new ReviewDao();

	// Insert
	public Product saveProduct(Product product, Review review) {
		return productDao.saveProduct(product, review);
	}

	// Delete
	public Review deletereview(Review review) {
		return reviewDao.deletereview(review);
	}

	// Update
	public Review updatereview(Review review) {
		return reviewDao.updateReview(review);
	}

	// saveReview
	public Review savereview(Review review) {
		return reviewDao.savereview(review);
	}

	// getAlldetails
	public void getAlldetails() {
		productDao.getAlldeatils();
	}
}
