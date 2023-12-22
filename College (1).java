import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

        // Load database properties
        Properties properties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("/WEB-INF/db.properties")) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
            throw new ServletException("Error loading database properties.");
        }

        // Database connection details
        String url = properties.getProperty("db.url");
        String username = properties.getProperty("db.username");
        String password = properties.getProperty("db.password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            String sql = "INSERT INTO contact_messages (name, email, message) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, name);
                pstmt.setString(2, email);
                pstmt.setString(3, message);
                pstmt.executeUpdate();
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.sendRedirect("contact.html");
    }

    // Add a main method for testing
    public static void main(String[] args) {
        // You can add test logic here
        // Make sure to handle exceptions properly in a real-world scenario
    }
}
