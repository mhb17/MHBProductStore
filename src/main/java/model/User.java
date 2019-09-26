package model;

import org.springframework.stereotype.Component;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotBlank;


@Component
public class User {
 //   @Min(8)
    private String password;
  //  @Min(3)
    private String userName;
 //   @NotBlank(message = "Enter your Name")
    private String name;
 //   @Email
  //  @NotBlank(message = "Enter your Email")
    String email;
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public User() {
    }

//    public User(@Min(8) String password, @Min(3) String userName, @NotBlank(message = "Enter your Name") String name, @Email @NotBlank(message = "Enter your Email") String email) {
//        this.password = password;
//        this.userName = userName;
//        this.name = name;
//        this.email = email;
//    }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public boolean isUserpasswordEqual (String passwordWord ,String userName)
    {
        return (this.getPassword() ==passwordWord&&this.userName==userName);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
