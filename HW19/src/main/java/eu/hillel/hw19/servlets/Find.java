package eu.hillel.hw19.servlets;


import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
import java.util.Arrays;

public class Find extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String wordToFind = req.getParameter("wordToFind");
        InputStream is = getClass().getClassLoader().getResourceAsStream("input.txt");
        long count = 0;
        if (is != null) {
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr);
            count = reader.lines().flatMap(line -> Arrays.stream(line.split(" ")))
                    .filter(wordToFind::equals)
                    .count();
        }
        is.close();
        resp.getWriter().println("Word: " + wordToFind + " count: " + count);
    }


}
