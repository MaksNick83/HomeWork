package eu.hillel.hw19.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;


public class Sort extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String valueToSort = req.getParameter("valueToSort");
        PrintWriter writer = resp.getWriter();
        int[] numbers = Arrays.stream(valueToSort.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.sort(numbers);

        writer.println("Sort numbers:" + Arrays.toString(numbers));
    }
}
