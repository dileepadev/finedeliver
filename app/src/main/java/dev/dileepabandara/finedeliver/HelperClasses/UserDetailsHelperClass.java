/*
   --------------------------------------
      Developed by
      Dileepa Bandara
      https://dileepabandara.github.io
      contact.dileepabandara@gmail.com
      ©dileepabandara.dev
      2021
   --------------------------------------
*/

package dev.dileepabandara.finedeliver.HelperClasses;

import com.google.firebase.database.PropertyName;

public class UserDetailsHelperClass {

    private String userName, userPhone, userEmail, userPassword;

    public UserDetailsHelperClass() {
    }

    public UserDetailsHelperClass(String userName, String userPhone, String userEmail, String userPassword) {
        this.userName = userName;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    @PropertyName("Name")
    public String getUserName() {
        return userName;
    }

    @PropertyName("Name")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @PropertyName("Phone")
    public String getUserPhone() {
        return userPhone;
    }

    @PropertyName("Phone")
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    @PropertyName("Email")
    public String getUserEmail() {
        return userEmail;
    }

    @PropertyName("Email")
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @PropertyName("Password")
    public String getUserPassword() {
        return userPassword;
    }

    @PropertyName("Password")
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
