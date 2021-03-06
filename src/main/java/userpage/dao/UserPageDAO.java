package userpage.dao;

import java.util.List;
import java.util.Map;

import userpage.bean.AddressDTO;
import userpage.bean.CartListDTO;
import userpage.bean.ListDTO;
import userpage.bean.MenuImgDTO;
import userpage.bean.OrderDTO;
import userpage.bean.OrderItemDTO;
import userpage.bean.OrderPageItemDTO;
import userpage.bean.ProductDTO;
import userpage.bean.Product_ImageFileDTO;
import userpage.bean.Product_SortDTO;
import userpage.bean.User_InfoDTO;

public interface UserPageDAO {

	public User_InfoDTO loginOk(Map<String, String> map);

	public List<ListDTO> getList(Map<String, String> map);

	public int getSearchTotalA(Map<String, String> map);

	public void joinOk(User_InfoDTO user_infoDTO);

	public User_InfoDTO checkId(String id);

	public void editOk(User_InfoDTO user_infoDTO);

	public void deleteOk(User_InfoDTO user_infoDTO);

	public List<User_InfoDTO> findIdEmail(Map<String, String> map);

	public List<User_InfoDTO> findIdPhone(Map<String, String> map);

	public User_InfoDTO findPwdEmail(Map<String, String> map);

	public User_InfoDTO findPwdPhone(Map<String, String> map);

	public void updatePwd(Map<String, String> map);

	public List<Product_ImageFileDTO> getDetailImg(int product_number);

	public ProductDTO getProduct(int product_number);

	public List<Product_SortDTO> getSizes(int product_number);

	public List<AddressDTO> getAddresses(String user_id);

	public void addNew(Map<String, String> map);

	public AddressDTO getEdit(String addr_number);

	public void addEdit(AddressDTO addressDTO);

	public void delEdit(String addr_number);
	
	public List<ListDTO> getSearchList(Map<String, String> map);

	public int getSearchTotalB(Map<String, String> map);

	public List<CartListDTO> cartList(String userId);

	public void deleteCart(int cart_number);

	public void addCart(CartListDTO cartListDTO);

	public CartListDTO getQuickorder(int product_sort_number);

	public List<MenuImgDTO> getMainImg();

	public List<MenuImgDTO> getNavImg();

	public List<ListDTO> getMainProduct();

	public List<OrderItemDTO> getOrderItemInfo(int order_id);

	public User_InfoDTO getMemberInfo(String user_id);

	public OrderDTO getOrder(int order_id);

	public void orderCancle(int order_id);

	public void deductMoney(User_InfoDTO member);

	public void deductStock(Product_SortDTO productSort);

	public Product_SortDTO getProductsInfo(int product_sort_num);

	public void deleteOrderCart(CartListDTO dto);

	public void enrollOrderItem(OrderItemDTO oit);

	public int order(OrderDTO ord);

	public OrderItemDTO getOrderInfo(int product_sort_num);

	public OrderPageItemDTO getGoodsInfo(int product_sort_num);

	public void orderdetail(OrderItemDTO oid);

	public List<OrderDTO> getOrderHistory(String user_id);

}
