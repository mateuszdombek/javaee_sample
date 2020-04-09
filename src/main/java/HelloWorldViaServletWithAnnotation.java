import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/HelloWorldViaServletWithAnnotation")
public class HelloWorldViaServletWithAnnotation extends HttpServlet {
    public static final String TEXT_HTML = "text/html";
    private String message;

    @Override
    public void init() {
        message = "Hello World! via HelloWorldViaServletWithAnnotation";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType(TEXT_HTML);

        PrintWriter writer = resp.getWriter();
        writer.println("<h1>" + message + "</h1>");
        writer.println("<p>" + new Date().toString() + "</p>");
    }
}
