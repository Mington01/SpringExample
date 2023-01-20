package com.en3873.spring.ex.mybatis.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.en3873.spring.ex.mybatis.dao.ReviewDAO;
import com.en3873.spring.ex.mybatis.model.Review;

@Service
public class ReviewBO {
	
	@Autowired
	private ReviewDAO reviewDAO;
	
	public Review getReview(int id) {
		
		// 파라미터로 전달 받은 id 데이터 조회
		Review review = reviewDAO.selectReview(id);
		return review;
	}
	
	public int addReview(int id, String storeName, String menu, String userName, double point, String review) {
		
		return reviewDAO.insertReview(id, storeName, menu, userName, point, review);
		
	}
	
	public int addReviewByObject(Review review) {
		
		return reviewDAO.insertReviewByObject(review);
	}

}
