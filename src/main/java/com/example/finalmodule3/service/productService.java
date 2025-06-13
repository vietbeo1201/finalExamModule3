package com.example.finalmodule3.service;

import com.example.finalmodule3.model.DBConnect;
import com.example.finalmodule3.model.product;
import jakarta.servlet.http.HttpServlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class productService extends HttpServlet {
    private static Connection conn = DBConnect.getConnection();

    public List<product> getAllUserService() throws SQLException {
        String sql = "select * from product";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<product> products = new ArrayList<>();
        while (resultSet.next()) {
            int productId = resultSet.getInt("productId");
            String productName = resultSet.getString("productName");
            int productPrice = resultSet.getInt("productPrice");
            int productSale = resultSet.getInt("productSale");
            int productInventory = resultSet.getInt("productInventory");
            product product = new product(productId, productName, productPrice, productSale, productInventory);
            products.add(product);
        }
        return products;
    }
}
