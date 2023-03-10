package com.en3873.spring.ex.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ex01Controller {
	
	@ResponseBody // 데이터를 적절한 contenttype에 담아주는 어노테이
	@RequestMapping("/lifecycle/ex01/1")
	public String stringResponse() {
		return "예제 1번 문자열을 담는 response";
	}
	
	@ResponseBody
	@RequestMapping("/lifecycle/ex01/2")
	public Map<String, Integer> mapResponse() {
		// 과일이름:가격
		Map<String, Integer> fruitMap = new HashMap<>();
		fruitMap.put("apple", 1500);
		fruitMap.put("banana", 3000);
		fruitMap.put("orange", 1000);
		
		return fruitMap;
	}

}
