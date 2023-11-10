package co.yedam.product.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.yedam.common.DataSourceMybatis;
import co.yedam.product.mapper.ProductMapper;
import co.yedam.product.service.ProductService;
import co.yedam.product.service.ProductVO;

public class ProductServiceImpl implements ProductService{


	SqlSession sqlSession = DataSourceMybatis.getInstance().openSession(true); //true는 자동커밋을한다는뜻
	ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
	
		
	@Override
	public List<ProductVO> productList() {
		//return dao.selectList();
		return mapper.selectList();
	}

	@Override
	public ProductVO getProduct(String productNo) {
		//dao.updateCnt(boardNo);
		//return dao.select(boardNo);
		return mapper.select(productNo);
	}

}