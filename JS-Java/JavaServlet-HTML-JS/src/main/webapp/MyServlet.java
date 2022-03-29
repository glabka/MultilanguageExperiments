package main.webapp;


import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/javaserver"}, loadOnStartup=1)
public class MyServlet extends HttpServlet {

    private String message;

    @Override
    public void init() throws ServletException {
        // Do required initialization
        message = "Hello World";
        System.out.println("log");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println(message);
    }

    @Override
    public void destroy() {
        // do nothing.
    }
}

