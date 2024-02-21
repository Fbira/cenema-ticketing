package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import pojo.User;
import service.UserDAO;

public class LoginUser extends HttpServlet {

  private static final long serialVersionUID = 1L;

  public LoginUser() {
    super();
  }

  protected void doPost(
    HttpServletRequest request,
    HttpServletResponse response
  ) throws ServletException, IOException {
    System.out.println("made it to LoginUser");

    String email = request.getParameter("email");
    String password = request.getParameter("password");

    System.out.println(email + " " + " " + password);

    HttpSession session = request.getSession();
    User user = new UserDAO().get(email, password);

    System.out.println(user);

    if (user == null) {
      session.setAttribute("user", user);
      response.sendRedirect("movies.jsp");
      System.out.println("login success...");
    } else {
      request.setAttribute("error", "INVALID LOGIN INFORMATION");
      request.getRequestDispatcher("register.jsp").forward(request, response);
      System.out.println("login failed...");
    }
  }
}
