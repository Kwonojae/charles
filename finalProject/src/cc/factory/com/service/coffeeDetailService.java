package cc.factory.com.service;

import java.util.List;
import java.util.Map;

import cc.factory.com.dto.SideDto;
import cc.factory.com.dto.cartDto;
import cc.factory.com.dto.coffeeDto;
import cc.factory.com.dto.orderDetailDto;
import cc.factory.com.dto.orderDto;
import cc.factory.com.dto.orderParam;

public interface coffeeDetailService {

	public coffeeDto getDetailOne(int seq);
	public boolean addCartOne(cartDto dto);
	public List<cartDto> getCartAll(String id);
	public List<SideDto> getSyrupAll();
	public int getVisitCount(String id);
	public boolean addOrder(orderDto dto);
	public boolean updateVisitCount(String id);
	public boolean updateOrderCount(String seq);
	
	public List<coffeeDto> getCoffeeList();
	public List<coffeeDto> getCoffeeKindList(int kind);
	public boolean cartDel(int seq);
	
	//추가
	public List<coffeeDto> bestCoffee();
	
	// 추가 2020.10.15
	public List<orderDetailDto> myOrderList(orderParam param);
		
}
