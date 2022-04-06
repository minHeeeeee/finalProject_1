package userpage.bean;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class OrderDTO {
	/* 주문 번호 */
	private int order_id;
	
	private String order_name;
	
	/* 배송 받는이 */
	private String name;
	
	/* 주문 회원 아이디 */
	private String user_id;
	
	/* 우편번호 */
	private int zipcode;
	
	/* 회원 주소 */
	private String addr1;
	
	/* 회원 상세주소 */
	private String addr2;
	
	private int tel;
	private int phone;
	/* 주문 상태 */
	private String status;
	
	/* 배송비 */
	private int deliveryCost;
	
	/* 주문 날짜 */
	private Date orderdate;
	
	/* DB테이블 존재 하지 않는 데이터 */
	
	private int finalTotalPrice;
	
	private String message;

}
