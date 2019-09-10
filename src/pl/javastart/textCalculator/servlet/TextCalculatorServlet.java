package pl.javastart.textCalculator.servlet;

import pl.javastart.textCalculator.service.TextService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calctext")
public class TextCalculatorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        String text = request.getParameter("addedText");
        PrintWriter writer = response.getWriter();

        if (!(text.equals(null) || text.equals(""))) {
            TextService service = new TextService();
            writer.println(text + "<br/>");
            writer.println("<h2> Ilość słów: " + service.numberOfWords(text) + "</h2>");
            writer.println("<h2> Ilość znaków: " + service.numberOfCharacters(text) + "</h2>");
            writer.println("<h2> Ilość znaków (bez spacji): "
                    + service.numberOfCharactersWithNoSpaces(text) + "</h2>");
            writer.println("<h2>Palindrom: " + service.isPalindrome(text) + "</h2>");
        } else {
            writer.println("Tekst jest pusty, dodaj tekst");
        }
    }
}
