package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import pojo.User;
import service.UserDAO;

public class SaveUser extends HttpServlet {

  private static final long serialVersionUID = 1L;

  public SaveUser() {
    super();
  }

  protected void doPost(
    HttpServletRequest request,
    HttpServletResponse response
  ) throws ServletException, IOException {
    response.setContentType("text/html");

    System.out.println("user SaveUser");

    PrintWriter out = response.getWriter();

    // Retrieve user input from the form
    String email = request.getParameter("email");
    String fName = request.getParameter("fName");
    String lName = request.getParameter("lName");
    String gender = request.getParameter("gender");
    String password = request.getParameter("password");
    String confirm_password = request.getParameter("confirm_password");
    int age = Integer.parseInt(request.getParameter("age"));

    // Create a User object
    User user = new User();

    user.setEmail(email);
    user.setFirstName(fName);
    user.setLastName(lName);
    user.setGender(gender);
    user.setPassword(password);
    user.setConfirmPassword(confirm_password);
    user.setAge(age);

    // Call the UserDAO's save() method to save the user

    int status = UserDAO.save(user);
    System.out.println("made it to useDAO");

    if (status > 0) {
      //         out.print("<p>Record saved successfully!</p>");
      request.getRequestDispatcher("movies.jsp").include(request, response);
    } else {
      out.println("Sorry! unable to save record");
    }

    out.close();
  }
}
