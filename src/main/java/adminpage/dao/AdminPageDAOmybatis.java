package adminpage.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import userpage.bean.OrderDTO;
import userpage.bean.User_InfoDTO;

@Repository
@Transactional
public class AdminPageDAOmybatis implements AdminPageDAO {
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public String getUser() {
		return sqlSession.selectOne("adminPageSQL.getUser");
	}

	@Override
	public String getProduct() {
		return sqlSession.selectOne("adminPageSQL.getProduct");
	}

	@Override
	public int getMenProduct() {
		return sqlSession.selectOne("adminPageSQL.getMenProduct");
	}
	@Override
	public int getWomenProduct() {
		return sqlSession.selectOne("adminPageSQL.getWomenProduct");
	}
	@Override
	public int getLifeStyleProduct() {
		return sqlSession.selectOne("adminPageSQL.getLifeStyleProduct");
	}
	@Override
	public String getTotalPrice(String date) {
		return sqlSession.selectOne("adminPageSQL.getTotalPrice",date);
	}
	@Override
	public List<String> getSalesDatasets(String startDate,String endDate, String tempStartDate, String tempEndDate) {
		System.out.println(startDate);
		System.out.println(endDate);
		System.out.println(tempStartDate);
		System.out.println(tempEndDate);
		Map<String,String> map = new HashMap<String,String>();
		map.put("startDate", startDate);
		map.put("endDate", endDate);
		map.put("tempStartDate", tempStartDate);
		map.put("tempEndDate", tempEndDate);
		return sqlSession.selectList("adminPageSQL.getSalesDatasets",map);
	}
	@Override
	public List<String> getMonthUser(String startDate, String endDate, String tempStartDate, String tempEndDate) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("startDate", startDate);
		map.put("endDate", endDate);
		map.put("tempStartDate", tempStartDate);
		map.put("tempEndDate", tempEndDate);
		return sqlSession.selectList("adminPageSQL.getMonthUser",map);
	}
	@Override
	public int getKakaoUser() {
		return sqlSession.selectOne("adminPageSQL.getKakaoUser");
	}
	@Override
	public int getWebsiteUser() {
		return Integer.parseInt(this.getUser())-this.getKakaoUser();
	}
	@Override
	public List<User_InfoDTO> getUserInfo() {
		return sqlSession.selectList("adminPageSQL.getUserInfo");
	}
	@Override
	public List<String> getMonthMenProduct(String startDate, String endDate, String tempStartDate, String tempEndDate) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("startDate", startDate);
		map.put("endDate", endDate);
		map.put("tempStartDate", tempStartDate);
		map.put("tempEndDate", tempEndDate);
		return sqlSession.selectList("adminPageSQL.getMonthMenProduct",map);
	}
	@Override
	public List<String> getMonthWomenProduct(String startDate, String endDate, String tempStartDate, String tempEndDate) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("startDate", startDate);
		map.put("endDate", endDate);
		map.put("tempStartDate", tempStartDate);
		map.put("tempEndDate", tempEndDate);
		return sqlSession.selectList("adminPageSQL.getMonthWomenProduct",map);
	}
	@Override
	public List<String> getMonthLifestyleProduct(String startDate, String endDate, String tempStartDate, String tempEndDate) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("startDate", startDate);
		map.put("endDate", endDate);
		map.put("tempStartDate", tempStartDate);
		map.put("tempEndDate", tempEndDate);
		return sqlSession.selectList("adminPageSQL.getMonthLifestyleProduct",map);
	}
	@Override
	public List<String> getMenCategoryProduct() {
		List<String> list = new ArrayList<String>();
		list.add(sqlSession.selectOne("adminPageSQL.getMenTopCategoryProduct"));
		list.add(sqlSession.selectOne("adminPageSQL.getMenBottomCategoryProduct"));
		list.add(sqlSession.selectOne("adminPageSQL.getMenBagCategoryProduct"));
		list.add(sqlSession.selectOne("adminPageSQL.getMenHeadwearCategoryProduct"));
		list.add(sqlSession.selectOne("adminPageSQL.getMenAccessoriesCategoryProduct"));
		list.add(sqlSession.selectOne("adminPageSQL.getMenShoesCategoryProduct"));
		list.add(sqlSession.selectOne("adminPageSQL.getMenETCCategoryProduct"));
		return list;
	}
	@Override
	public List<String> getWomenCategoryProduct() {
		return sqlSession.selectList("adminPageSQL.getWomenCategoryProduct");
	}
	@Override
	public List<String> getLifestyleCategoryProduct() {
		List<String> list = new ArrayList<String>();
		list.add("0");
		list.add("0");
		list.add("0");
		list.add("0");
		list.add("0");
		list.add("0");
		list.add(sqlSession.selectOne("adminPageSQL.getLifestyleCategoryProduct"));
		return list; 
	}
	@Override
	public List<OrderDTO> getOrderInfo() {
		return sqlSession.selectList("adminPageSQL.getOrderInfo");
	}
	@Override
	public void changeRank(Map<String, String> map) {
		sqlSession.update("adminPageSQL.changeRank", map);
	}
	@Override
	public void changeStatus(Map<String, String> map) {
		sqlSession.update("adminPageSQL.changeStatus", map);
	}
}
