package co.yedam.product.web;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.common.Command;
import co.yedam.product.service.ProductService;
import co.yedam.product.service.ProductVO;
import co.yedam.product.serviceImpl.ProductServiceImpl;

public class ProductList implements Command {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		String path = "product/productList.tiles";
		
		ProductService svc = new ProductServiceImpl();
		List<ProductVO> list = svc.productList();

		req.setAttribute("list", list);
	//	System.out.println(list);
		// 다른페이지로 이동할정보를 가지고있다
		// 페이지 요청(boardList.do) -> 요청 재 지정(board/boardList.jsp).
		RequestDispatcher rd = req.getRequestDispatcher(path);// .forward(req, resp);
		try {
			rd.forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
