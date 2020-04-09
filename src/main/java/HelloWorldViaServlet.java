import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class HelloWorldViaServlet extends HttpServlet {
    private final static String contentTypeTextOrHtml = "text/html";
    private String message;

    @Override
    public void init() {
        message = "Hello World! via Servlet";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws IOException {
        response.setContentType(contentTypeTextOrHtml);
        PrintWriter writer = response.getWriter();

        log("Getting HelloWorld with date and time");
        writer.println("<h1>" + message + "</h1>");
        writer.println("<p>" + new Date().toString() + "</p>");

        log("Getting client info");
        writer.println("clientRemoteAddress:" + req.getRemoteAddr());

        log("Getting server info");
        writer.println("status: " + response.getStatus());
        writer.println("servletInfo: " + this.getServletInfo());
    }
}
