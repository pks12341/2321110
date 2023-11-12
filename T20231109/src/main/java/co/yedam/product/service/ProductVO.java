package co.yedam.product.service;

import java.util.Date;

import lombok.Data;

@Data
public class ProductVO {
	
		private String  prodCode;
		private String prodName;
		private String prodDesc;
		private int  price;
		private int  offPrice;
		private int likeIt;
		private String prodImage;
	
		
		
}
