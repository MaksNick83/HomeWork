package eu.hillel.hw20.servlet;

import eu.hillel.hw20.entity.Order;
import eu.hillel.hw20.repository.OrderRepository;
import eu.hillel.hw20.repository.OrderRepositoryImpl;
import eu.hillel.hw20.service.OrderService;
import eu.hillel.hw20.service.OrderServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/getByNumber")
public class getByNumberServlet extends HttpServlet {

    private OrderService orderService;

    public getByNumberServlet() {
        OrderRepository orderRepository = new OrderRepositoryImpl();
        this.orderService = new OrderServiceImpl(orderRepository);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/jsp/getByNumber.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String orderNumber = req.getParameter("orderNumber");
        List<Order> orders = orderService.getByNumber(orderNumber);
        req.setAttribute("orders", orders);
        req.getRequestDispatcher("/jsp/getByNumber.jsp").forward(req, resp);
    }
}
