package adminpage.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import adminpage.dao.AdminPageDAO;
import userpage.bean.OrderDTO;
import userpage.bean.User_InfoDTO;

@Service
public class AdminPageServiceImpl implements AdminPageService {
	@Autowired
	AdminPageDAO adminPageDAO;
	@Override
	public String getUser() {
		return adminPageDAO.getUser();
	}
	@Override
	public String getProduct() {
		return adminPageDAO.getProduct();
	}
	@Override
	public List<Integer> getProductRatio() {
		List<Integer> temp = new ArrayList<Integer>();
		
		temp.add((int)(adminPageDAO.getMenProduct()/(Double.parseDouble(adminPageDAO.getProduct())-1)*100));
		temp.add((int)(adminPageDAO.getWomenProduct()/(Double.parseDouble(adminPageDAO.getProduct())-1)*100));
		temp.add((int)(adminPageDAO.getLifeStyleProduct()/(Double.parseDouble(adminPageDAO.getProduct())-1)*100));
		return temp;
	}
	@Override
	public String getTotalPrice(String date) {
		return adminPageDAO.getTotalPrice(date);
	}
	@Override
	public List<String> getSalesDatasets(String startDate,String endDate, String tempStartDate, String tempEndDate) {
		return adminPageDAO.getSalesDatasets(startDate,endDate,tempStartDate,tempEndDate);
	}
	@Override
	public List<String> getMonthUser(String startDate, String endDate, String tempStartDate, String tempEndDate) {
		return adminPageDAO.getMonthUser(startDate,endDate,tempStartDate,tempEndDate);
	}
	@Override
	public List<Integer> getUserRatio() {
		List<Integer> temp = new ArrayList<Integer>();
		
		temp.add((int)(adminPageDAO.getWebsiteUser()/(Double.parseDouble(adminPageDAO.getUser()))*100));
		temp.add((int)(adminPageDAO.getKakaoUser()/(Double.parseDouble(adminPageDAO.getUser()))*100));
		return temp;
	}
	@Override
	public List<User_InfoDTO> getUserInfo() {
		return adminPageDAO.getUserInfo();
	}
	@Override
	public List<String> getMonthMenProduct(String startDate, String endDate, String tempStartDate, String tempEndDate) {
		return adminPageDAO.getMonthMenProduct(startDate,endDate,tempStartDate,tempEndDate);
	}
	@Override
	public List<String> getMonthWomenProduct(String startDate, String endDate, String tempStartDate, String tempEndDate) {
		return adminPageDAO.getMonthWomenProduct(startDate,endDate,tempStartDate,tempEndDate);
	}
	@Override
	public List<String> getMonthLifestyleProduct(String startDate, String endDate, String tempStartDate, String tempEndDate) {
		return adminPageDAO.getMonthLifestyleProduct(startDate,endDate,tempStartDate,tempEndDate);
	}
	@Override
	public List<String> getMenCategoryProduct() {
		return adminPageDAO.getMenCategoryProduct();
	}
	@Override
	public List<String> getWomenCategoryProduct() {
		return adminPageDAO.getWomenCategoryProduct();
	}
	@Override
	public List<String> getLifestyleCategoryProduct() {
		return adminPageDAO.getLifestyleCategoryProduct();
	}
	@Override
	public List<OrderDTO> getOrderInfo() {
		return adminPageDAO.getOrderInfo();
	}
	@Override
	public void changeRank(Map<String, String> map) {
		adminPageDAO.changeRank(map);
	}
	@Override
	public void changeStatus(Map<String, String> map) {
		adminPageDAO.changeStatus(map);
	}
}
