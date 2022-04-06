package adminpage.dao;

import java.util.List;
import java.util.Map;

import userpage.bean.OrderDTO;
import userpage.bean.User_InfoDTO;

public interface AdminPageDAO {

	public String getUser();

	public String getProduct();

	public int getMenProduct();

	public int getWomenProduct();

	public int getLifeStyleProduct();

	public String getTotalPrice(String date);

	public List<String> getSalesDatasets(String startDate, String endDate, String tempStartDate, String tempEndDate);

	public List<String> getMonthUser(String startDate, String endDate, String tempStartDate, String tempEndDate);

	public int getKakaoUser();

	public int getWebsiteUser();

	public List<User_InfoDTO> getUserInfo();

	public List<String> getMonthMenProduct(String startDate, String endDate, String tempStartDate, String tempEndDate);

	public List<String> getMonthWomenProduct(String startDate, String endDate, String tempStartDate, String tempEndDate);

	public List<String> getMonthLifestyleProduct(String startDate, String endDate, String tempStartDate, String tempEndDate);

	public List<String> getMenCategoryProduct();

	public List<String> getWomenCategoryProduct();

	public List<String> getLifestyleCategoryProduct();

	public List<OrderDTO> getOrderInfo();

	public void changeRank(Map<String, String> map);

	public void changeStatus(Map<String, String> map);
}
