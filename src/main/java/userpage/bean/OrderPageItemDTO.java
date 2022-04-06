package userpage.bean;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class OrderPageItemDTO {
	
	/* 뷰로부터 전달받을 값 */
    private int product_sort_num;
    
    private int product_count;
    
	/* DB로부터 꺼내올 값 */
    private String product_name;
    
    private int product_price;
        
	/* 만들어 낼 값 */
    private int salePrice;
    
    private int totalPrice;
        

	public void initSaleTotal() {
		this.salePrice = (int) (this.product_price);
		this.totalPrice = this.salePrice*this.product_count;		
	}


	
    
}
