package mk.ukim.finki.wp.lab.web.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mk.ukim.finki.wp.lab.model.Book;
import mk.ukim.finki.wp.lab.service.BookService;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.web.IWebExchange;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

import java.util.List;

import java.io.IOException;

@WebServlet(name = "BookListServlet",urlPatterns = "/servlet/books")
public class BookListServlet extends HttpServlet
{
    private final SpringTemplateEngine templateEngine;
    private final BookService bookService;


    public BookListServlet(SpringTemplateEngine templateEngine, BookService bookService) {
        this.templateEngine = templateEngine;
        this.bookService = bookService;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        IWebExchange webExchange = JakartaServletWebApplication
                .buildApplication(getServletContext())
                .buildExchange(request, response);

        WebContext webContext = new WebContext(webExchange);

        List<Book> books = bookService.listAll();

        webContext.setVariable("books", books);

        templateEngine.process("listBooks.html", webContext, response.getWriter());
    }
}
