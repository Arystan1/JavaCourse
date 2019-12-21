package com.company;

public class User {
    private String login = new String();
    private String password = new String();
    private String role = new String();

    public User()
    {
        this.login = "Empty";
        this.password = "Empty";
        this.role = "Empty";
    }

    public void setLogin(String login)
    {
        this.login = login;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

    public String getLogin()
    {
        return this.login;
    }

    public String getPassword()
    {
        return this.password;
    }

    public String getRole()
    {
        return this.role;
    }

    public boolean compare(User user)
    {
        boolean bLogin = this.login == user.login;
        boolean bPassword = this.password == user.password;
        boolean bRole = this.role == user.role;

        if(bLogin && bPassword && bRole)
        {
            return true;
        }
        return false;
    }
}
