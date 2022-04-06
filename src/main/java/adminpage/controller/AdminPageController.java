package adminpage.controller;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import adminpage.service.AdminPageService;
import userpage.bean.AddressDTO;
import userpage.bean.CartListDTO;
import userpage.bean.MenuImgDTO;
import userpage.bean.OrderDTO;
import userpage.bean.ProductDTO;
import userpage.bean.User_InfoDTO;
import userpage.service.UserPageService;

@RestController
@RequestMapping(value = "/admin")
public class AdminPageController {
	@Autowired
	AdminPageService adminPageService;
	SimpleDateFormat sdf;
	
	@GetMapping(value = "/getUser")
	public String getUser() {
		return adminPageService.getUser();
	}
	
	@GetMapping(value = "/getProduct")
	public String getProduct() {
		return adminPageService.getProduct();
	}
	
	@GetMapping(value = "/getTotalPrice")
	public String getTotalPrice() {
		sdf=new SimpleDateFormat("yyyy-MM");
		Calendar cal=Calendar.getInstance();
		cal.setTime(new Date());
		String date=sdf.format(cal.getTime());
		System.out.println(date);
		return adminPageService.getTotalPrice(date);
	}
	
	
	@GetMapping(value = "/getProductRatio")
	public List<Integer> getProductRatio(){
		return adminPageService.getProductRatio();
	}
	
	@GetMapping(value = "/getMonthDateLabels")
	public List<String> getMonthDateLabels(){
		List<String> list = new ArrayList<String>();
		sdf=new SimpleDateFormat("yyyy-MM");
		Calendar cal=Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(cal.MONTH, -5);
		list.add(sdf.format(cal.getTime()));
		cal.add(cal.MONTH, +1);
		list.add(sdf.format(cal.getTime()));
		cal.add(cal.MONTH, +1);
		list.add(sdf.format(cal.getTime()));
		cal.add(cal.MONTH, +1);
		list.add(sdf.format(cal.getTime()));
		cal.add(cal.MONTH, +1);
		list.add(sdf.format(cal.getTime()));
		cal.add(cal.MONTH, +1);
		list.add(sdf.format(cal.getTime()));
		return list;
	}
	@GetMapping(value = "/getSalesDatasets")
	public List<String> getSalesDatasets(){
		sdf=new SimpleDateFormat("yyyy-MM");
		Calendar cal=Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(cal.MONTH, -5);
		String startDate =sdf.format(cal.getTime()); 
		cal.add(cal.MONTH,+6);
		String endDate=sdf.format(cal.getTime());
		
		sdf=new SimpleDateFormat("yyyy-MM-dd");
		cal.add(cal.MONTH, -6);
		cal.set(cal.DATE, 1);
		String tempStartDate=sdf.format(cal.getTime());
		cal.add(cal.MONTH, +5);
		cal.set(cal.DATE, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		String tempEndDate=sdf.format(cal.getTime());
		
		return adminPageService.getSalesDatasets(startDate,endDate,tempStartDate,tempEndDate);
	}
	@GetMapping(value = "/getMonthUser")
	public List<String> getMonthUser(){
		sdf=new SimpleDateFormat("yyyy-MM");
		Calendar cal=Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(cal.MONTH, -5);
		String startDate =sdf.format(cal.getTime()); 
		cal.add(cal.MONTH,+6);
		String endDate=sdf.format(cal.getTime());
		
		sdf=new SimpleDateFormat("yyyy-MM-dd");
		cal.add(cal.MONTH, -6);
		cal.set(cal.DATE, 1);
		String tempStartDate=sdf.format(cal.getTime());
		cal.add(cal.MONTH, +5);
		cal.set(cal.DATE, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		String tempEndDate=sdf.format(cal.getTime());
		
		return adminPageService.getMonthUser(startDate,endDate,tempStartDate,tempEndDate);
	}
	@GetMapping(value = "/getUserRatio")
	public List<Integer> getUserRatio(){
		return adminPageService.getUserRatio();
	}
	@GetMapping(value = "/getUserInfo")
	public List<User_InfoDTO> getUserInfo(){
		return adminPageService.getUserInfo();
	}
	@GetMapping(value = "/getMonthMenProduct")
	public List<String> getMonthMenProduct(){
		sdf=new SimpleDateFormat("yyyy-MM");
		Calendar cal=Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(cal.MONTH, -5);
		String startDate =sdf.format(cal.getTime()); 
		cal.add(cal.MONTH,+6);
		String endDate=sdf.format(cal.getTime());
		
		sdf=new SimpleDateFormat("yyyy-MM-dd");
		cal.add(cal.MONTH, -6);
		cal.set(cal.DATE, 1);
		String tempStartDate=sdf.format(cal.getTime());
		cal.add(cal.MONTH, +5);
		cal.set(cal.DATE, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		String tempEndDate=sdf.format(cal.getTime());
		
		return adminPageService.getMonthMenProduct(startDate,endDate,tempStartDate,tempEndDate);
	}
	@GetMapping(value = "/getMonthWomenProduct")
	public List<String> getMonthWomenProduct(){
		sdf=new SimpleDateFormat("yyyy-MM");
		Calendar cal=Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(cal.MONTH, -5);
		String startDate =sdf.format(cal.getTime()); 
		cal.add(cal.MONTH,+6);
		String endDate=sdf.format(cal.getTime());
		
		sdf=new SimpleDateFormat("yyyy-MM-dd");
		cal.add(cal.MONTH, -6);
		cal.set(cal.DATE, 1);
		String tempStartDate=sdf.format(cal.getTime());
		cal.add(cal.MONTH, +5);
		cal.set(cal.DATE, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		String tempEndDate=sdf.format(cal.getTime());
		
		return adminPageService.getMonthWomenProduct(startDate,endDate,tempStartDate,tempEndDate);
	}
	@GetMapping(value = "/getMonthLifestyleProduct")
	public List<String> getMonthLifestyleProduct(){
		sdf=new SimpleDateFormat("yyyy-MM");
		Calendar cal=Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(cal.MONTH, -5);
		String startDate =sdf.format(cal.getTime()); 
		cal.add(cal.MONTH,+6);
		String endDate=sdf.format(cal.getTime());
		
		sdf=new SimpleDateFormat("yyyy-MM-dd");
		cal.add(cal.MONTH, -6);
		cal.set(cal.DATE, 1);
		String tempStartDate=sdf.format(cal.getTime());
		cal.add(cal.MONTH, +5);
		cal.set(cal.DATE, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		String tempEndDate=sdf.format(cal.getTime());
		
		return adminPageService.getMonthLifestyleProduct(startDate,endDate,tempStartDate,tempEndDate);
	}
	@GetMapping(value = "/getMenCategoryProduct")
	public List<String> getMenCategoryProduct(){
		return adminPageService.getMenCategoryProduct();
	}
	@GetMapping(value = "/getWomenCategoryProduct")
	public List<String> getWomenCategoryProduct(){
		return adminPageService.getWomenCategoryProduct();
	}
	@GetMapping(value = "/getLifestyleCategoryProduct")
	public List<String> getLifestyleCategoryProduct(){
		return adminPageService.getLifestyleCategoryProduct();
	}
	@GetMapping(value = "/getOrderInfo")
	public List<OrderDTO> getOrderInfo(){
		return adminPageService.getOrderInfo();
	}
	@PostMapping(value="/changeRank")
	public void changeRank(@RequestBody Map<String,String> map) {
		adminPageService.changeRank(map);
	}
	@PostMapping(value="/changeStatus")
	public void changeStatus(@RequestBody Map<String,String> map) {
		adminPageService.changeStatus(map);
	}
	
	
}
