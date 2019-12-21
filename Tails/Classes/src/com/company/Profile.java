package com.company;

public class Profile {
    private String firstName = new String();
    private String lastName = new String();
    private User user = new User();

    public Profile()
    {
        this.firstName = "Empty";
        this.lastName = "Empty";
        this.user = new User();
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public User getRole()
    {
        return this.user;
    }

    public boolean compare(Profile profile)
    {
        boolean bFirstName = this.firstName == profile.firstName;
        boolean bLastName = this.lastName == profile.lastName;
        boolean bUser = profile.user.compare(profile.user);

        if(bFirstName && bLastName && bUser)
        {
            return true;
        }
        return false;
    }

    public void printProfile()
    {
        System.out.println("Print profile:");
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println("----------------------");
        System.out.println(this.user.getLogin());
        System.out.println(this.user.getPassword());
        System.out.println(this.user.getRole());
    }

}
