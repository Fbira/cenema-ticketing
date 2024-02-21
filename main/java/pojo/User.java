package pojo;

public class User {
    private String email, fName, lName, gender, password, confirm_password;
    private int id, age;
    
    public int getId() {  
        return id;  
    }  
    public void setId(int id) {  
        this.id = id;  
    }  
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getFirstName() {
        return fName;
    }
    
    public void setFirstName(String fName) {
        this.fName = fName;
    }
    
    public String getLastName() {
        return lName;
    }
    
    public void setLastName(String lName) {
        this.lName = lName;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getConfirmPassword() {
        return confirm_password;
    }
    
    public void setConfirmPassword(String confirm_password) {
        this.confirm_password = confirm_password;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}