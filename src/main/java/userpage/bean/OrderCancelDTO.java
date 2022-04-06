package userpage.bean;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class OrderCancelDTO {

	private String user_id;
	
	private int order_id;
	
	private String keyword;
	
	private int amount;
	
	private int pageNum;

	
	
	
}
