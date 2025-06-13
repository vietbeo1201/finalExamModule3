package com.example.finalmodule3.controller;

import com.example.finalmodule3.model.DBConnect;
import com.example.finalmodule3.model.product;
import com.example.finalmodule3.service.productService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet (name="productController", urlPatterns = "/product/*")
public class productController extends BaseController {
    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getPathInfo();
        if (uri == null){
            uri = "";
        }
        switch (uri){
            case "/products":
                try {
                    getAllUsers(req, resp);
                    renderView("/view/product/allProduct.jsp", req, resp);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
        }
    }

    public void getAllUsers(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ServletException, IOException {
        productService service = new productService();
        List<product> products =  service.getAllUserService();
        req.setAttribute("products", products);
    }

}
