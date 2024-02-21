package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pojo.User;

public class UserDAO {

  //	save to database
  public static int save(User user) {
    int status = 0;
    System.out.println("user save");

    try {
      // Establish Connection
      Connection conn = DBService.openConnection();

      PreparedStatement ps = conn.prepareStatement(
        "insert into users(email, fName, lName, gender, user_password, age) values (?,?,?,?,?,?)"
      );

      ps.setString(1, user.getEmail());
      ps.setString(2, user.getFirstName());
      ps.setString(3, user.getLastName());
      ps.setString(4, user.getGender());
      ps.setString(5, user.getPassword());
      ps.setInt(6, user.getAge());

      status = ps.executeUpdate();
      conn.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }

    return status;
  }

  public static int update(User user) {
    int status = 0;
    try {
      Connection conn = DBService.openConnection();

      PreparedStatement ps = conn.prepareStatement(
        "update users set email=?, fName=?, lName=?, gender=?, user_password=?, age=?, where id=?"
      );

      ps.setString(1, user.getEmail());
      ps.setString(2, user.getFirstName());
      ps.setString(3, user.getLastName());
      ps.setString(4, user.getGender());
      ps.setString(5, user.getPassword());
      ps.setInt(6, user.getAge());

      status = ps.executeUpdate();

      conn.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }

    return status;
  }

  public User get(String email, String password) {
    User user = new User();
    try {
      Connection conn = DBService.openConnection();

      PreparedStatement ps = conn.prepareStatement(
        "select * from users where email = ? and password = ?"
      );

      ps.setString(1, email);
      ps.setString(2, password);
      ResultSet rs = ps.executeQuery();

      if (rs.next()) {
        user.setEmail(rs.getString("email"));
        user.setFirstName(rs.getString("fName"));
        user.setLastName(rs.getString("lName"));
        user.setGender(rs.getString("gender"));
        user.setAge(Integer.parseInt(rs.getString("age")));

        System.out.println(user.getFirstName());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return user;
  }
}
