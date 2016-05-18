package com.theironyard;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	    System.out.println("Welcome traveller!");
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Welcome, " + name);

        System.out.println("Choose your weapon [Sword/Mace]");
        String weapon = scanner.nextLine();

        if (weapon.equalsIgnoreCase("sword") ) {
            System.out.println("Sword is a fine choice!");
        }
        else if(weapon.equalsIgnoreCase("mace") ) {
            System.out.println("Mace is a fine choice!");
        }
        else {
            throw new Exception("Invalid weapon!");
        }

        System.out.println("Choose your location [Forest/Tunnel]");
        String location = scanner.nextLine();

        if(location.equalsIgnoreCase("forest")) {
            System.out.println("Entering Forest...");
        }
        else if(location.equalsIgnoreCase("tunnel")){
            System.out.println("Entering Tunnel...");
        }
        else{
            throw new Exception("Invalid Location");
        }

    }
}
