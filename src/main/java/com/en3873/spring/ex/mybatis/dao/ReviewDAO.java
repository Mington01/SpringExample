package com.en3873.spring.ex.mybatis.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.en3873.spring.ex.mybatis.model.Review;

@Repository
public interface ReviewDAO {
	
	public Review selectReview(@Param("id") int id);
	
	public int insertReview(
			@Param("id") int id
			, @Param("storeName") String storeName
			, @Param("menu") String menu
			, @Param("userName") String userName
			, @Param("point") double point
			, @Param("review") String review
			);
	
	public int insertReviewByObject(Review review);
}
