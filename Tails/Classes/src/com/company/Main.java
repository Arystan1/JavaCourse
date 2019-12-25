package com.company;

public class Main {

    public static void main(String[] args) {

        User newUser = new User();
        Profile newProfile = new Profile();
        User newUser1 = new User();
        Profile newProfile1 = new Profile();

        newUser.setLogin("login");
        newUser.setPassword("password");
        newUser.setRole("admn");

        newProfile.setFirstName("admin");
        newProfile.setLastName("adminov");
        newProfile.setUser(newUser);

        newProfile.printProfile();

        newUser1.setLogin("login");
        newUser1.setPassword("password");
        newUser1.setRole("admin");

        newProfile1.setFirstName("admin");
        newProfile1.setLastName("adminov");
        newProfile1.setUser(newUser);

        newProfile1.printProfile();

        //System.out.println("result of compare : " + newUser.compare(newUser1));
        System.out.println("result of compare : " + newProfile.equals(newProfile));

    }
}
