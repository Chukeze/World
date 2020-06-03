package com.simworld.objects;

import java.util.Objects;
import java.util.Scanner;

public class User {
    public String characterName;
    public String userName;
    public String password;

    public void SignUp(){//the username and password are saved and stored to server
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create Your Username");
        this.userName = scanner.nextLine();//store the input of the user
        System.out.println("Create your Password: only letters.");
        this.password = scanner.nextLine();
        scanner.close();
        System.out.println("Successfully created");
    }

    public void Login(){//login with username and password used from the signup()
        int login_tries = 0;
        while (login_tries <= 3) {//gives them 3 attempt at login, check that they input the right thing, then login
                //check if login was successful
                System.out.println("You have 3 login attempts");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter Your Username");
                String userName = scanner.nextLine();//store the input of the user
                String password = scanner.nextLine();
                System.out.println("Enter your Password");
                System.out.print("Password can only be letter values");

                //SafeChecks
                boolean check_userName = userName.equals(" ");//check that the username is a string
                boolean check_password = password.equals(" ");//check that the password is a string
                if (check_userName & check_password){//Check If The login put is correct
                    Login();
                }else {
                    System.out.println("Incorrect try again, you have 2 more tries");
                    login_tries++;
                }
                if (Objects.equals(userName, characterName)){//check that their username is not their character name
                    System.out.print("Incorrect try again,");
                    System.out.print("input your user login info not your character's name");
                }
                if (login_tries >= 3){
                System.out.println("max attempt reach logging unsuccessful"+ "check back in 5 minutes");
                }
            }
    }
    public void setCharacterName(){

    }
}
