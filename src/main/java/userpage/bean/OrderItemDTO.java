package userpage.bean;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class OrderItemDTO {
	private int order_details_num;
	
	/* 주문 번호 */
	private int order_id;

	/* 상품 sort 번호 */
    private int product_sort_num;
    
	/* 주문 수량 */
    private int product_count;
    
	/* vam_orderItem 기본키 */
    private int orderItemId;
    
	/* 상품 한 개 가격 */
    private int product_price;
    
	/* DB테이블 존재 하지 않는 데이터 */
    
	/* 할인 적용된 가격 */
    private int salePrice;
    
	/* 총 가격(할인 적용된 가격 * 주문 수량) */
    private int totalPrice;
    
    // 주문 작업에 필요로 한 데이터를 세팅해주는 메서드
    public void initSaleTotal() {
		this.salePrice = (int) (this.product_price);
		this.totalPrice = this.salePrice*this.product_count;
	}

}
