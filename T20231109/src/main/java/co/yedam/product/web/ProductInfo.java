package co.yedam.product.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.common.Command;
import co.yedam.product.service.ProductService;
import co.yedam.product.service.ProductVO;
import co.yedam.product.serviceImpl.ProductServiceImpl;

public class ProductInfo implements Command {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		String path = "product/productInfo.tiles";
		
		// boardNo : 1 => DB search => jsp.
		String pco = req.getParameter("pco");
		ProductService svc = new ProductServiceImpl();
		ProductVO vo = svc.getProduct(pco); // 문자->숫자

		req.setAttribute("vo", vo);
		List<ProductVO> list = svc.selectReList();
		req.setAttribute("list", list);
		//System.out.println(vo);
		// 요청재지정.
		try {
			req.getRequestDispatcher(path).forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
