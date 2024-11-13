package com.gnmuthu.newlibrarymanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The UserInformation class manages a collection of User objects.
 * It allows for the entry of new users and displays the list of available users.
 */
public class UserInformation {

    private static List<User> users = new ArrayList<>();

    /**
     * Retrieves the list of users.
     *
     * @return the list of users
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     * Prompts the user to enter user details (name, gender, department, and ID)
     * and adds the new User to the list of users. Displays all the users after
     * adding the new user.
     */
    public void userEntry() {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter User's Name");
        String userName = scanner.nextLine();
        
        System.out.println("Enter User's Gender");
        String gender = scanner.nextLine();
        
        System.out.println("Enter Department");
        String department = scanner.nextLine();
        
        System.out.println("Enter User Id");
        String userId = scanner.nextLine();
        
        scanner.close();

        // Create a new User object and add it to the list
        User userEntry = new User(userName, gender, department, userId);
        users.add(userEntry);
        
        // Display all available users
        System.out.println("List of Available users:");
        for (User user : users) {
            System.out.println(user.getUserName());
        }
    }
}

/**
 * The User class represents a user with a name, gender, department, and ID.
 */
class User {

    private String userName;
    private String gender;
    private String department;
    private String userId;

    /**
     * Constructs a new User with the specified name, gender, department, and ID.
     *
     * @param userName   the name of the user
     * @param gender     the gender of the user
     * @param department the department of the user
     * @param userId     the unique ID of the user
     */
    public User(String userName, String gender, String department, String userId) {
        this.userName = userName;
        this.gender = gender;
        this.department = department;
        this.userId = userId;
    }

    /**
     * Gets the name of the user.
     *
     * @return the user's name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the name of the user.
     *
     * @param userName the new name of the user
     */
    public void setUsername(String userName) {
        this.userName = userName;
    }

    /**
     * Gets the gender of the user.
     *
     * @return the user's gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender of the user.
     *
     * @param gender the new gender of the user
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets the department of the user.
     *
     * @return the user's department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department of the user.
     *
     * @param department the new department of the user
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Gets the unique ID of the user.
     *
     * @return the user's ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the unique ID of the user.
     *
     * @param userId the new ID of the user
     */
    public void setUserid(String userId) {
        this.userId = userId;
    }
}

