package com.en3873.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.en3873.spring.ex.mybatis.bo.ReviewBO;
import com.en3873.spring.ex.mybatis.model.Review;

@RequestMapping("/mybatis")
@Controller
public class ReviewController {
	
	@Autowired
	private ReviewBO reviewBO;
	
	// id 가 3인 데이터 조회
	@RequestMapping("/ex01")
	@ResponseBody
	public Review review(
//			@RequestParam("id")int id
//			@RequestParam(value="id", required=false) int id
			@RequestParam(value="id", defaultValue="3") int id
			) {
		
		Review review = reviewBO.getReview(id);
		
		return review;
		
	}
	@RequestMapping("/ex02'")
	public String addReview() {
		
		//int count = reviewBO.addReview(21,  null, "콤비네이션피자", "김인규", 4.5, "할인도 많이 받고 잘 먹었습니다.")
		Review review = new Review();
		review.setId(22);
		review.setStoreName("BHC");
		review.setMenu("뿌링클");
		review.setUserName("김인규");
		review.setPoint(4.0);
		review.setReview("역시 뿌링클이 진리입니다!!");
		
		int count = reviewBO.addReviewByObject(review);
		
		return "삽입결과 : " + count;
	}

}
