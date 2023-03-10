package com.en3873.spring.ex.database.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.en3873.spring.ex.database.dao.UsedGoodsDAO;
import com.en3873.spring.ex.database.model.UsedGoods;

@Service
public class UsedGoodsBO {
	
	@Autowired
	private UsedGoodsDAO usedGoodsDAO;
	
	// used_goods 테이블을 전체 데이터 조회가능
	public List<UsedGoods> getUsedGoodsList() {
		List<UsedGoods>usedGoodsList =  usedGoodsDAO.selectUsedGoodsList();
		return usedGoodsList;
	}

}
