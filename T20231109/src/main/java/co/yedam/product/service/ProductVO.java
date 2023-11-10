package co.yedam.product.service;

import java.util.Date;

import lombok.Data;

@Data
public class ProductVO {
	
		private String prodCode;
		private String prodName;
		private String prodDesc;
		private String price;
		private String offPrice;
		private int likeIt;
		private String prodImage;
	
		
		
}
