package adminpage.service;

import java.util.List;
import java.util.Map;

import userpage.bean.OrderDTO;
import userpage.bean.User_InfoDTO;

public interface AdminPageService {

	public String getUser();

	public String getProduct();

	public List<Integer> getProductRatio();

	public String getTotalPrice(String date);

	public List<String> getSalesDatasets(String startDate, String endDate, String tempStartDate, String tempEndDate);

	public List<String> getMonthUser(String startDate, String endDate, String tempStartDate, String tempEndDate);

	public List<Integer> getUserRatio();

	public List<User_InfoDTO> getUserInfo();

	public List<String> getMonthLifestyleProduct(String startDate, String endDate, String tempStartDate,
			String tempEndDate);
	public List<String> getMonthMenProduct(String startDate, String endDate, String tempStartDate,
			String tempEndDate);
	public List<String> getMonthWomenProduct(String startDate, String endDate, String tempStartDate,
			String tempEndDate);

	public List<String> getMenCategoryProduct();

	public List<String> getWomenCategoryProduct();

	public List<String> getLifestyleCategoryProduct();

	public List<OrderDTO> getOrderInfo();

	public void changeRank(Map<String, String> map);

	public void changeStatus(Map<String, String> map);

}
