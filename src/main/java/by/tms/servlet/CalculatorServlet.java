package by.tms.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet("/calc")
public class CalculatorServlet extends HttpServlet {
    private final Calculator calculator = new Calculator();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pages/calc.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");
        String type = req.getParameter("type");

        double Num1 = Double.parseDouble(num1);
        double Num2 = Double.parseDouble(num2);
        Operation operation = new Operation(Num1,Num2,type);
        Optional<Operation> result = calculator.calculate(operation);
        String s = result.toString();

        req.setAttribute("result", s);
        req.getRequestDispatcher("/pages/calc.jsp").forward(req,resp);

    }
}
