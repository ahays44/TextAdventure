package com.theironyard;

/**
 * Created by austinhays on 5/18/16.
 */
public class Player {
    String name;
    String weapon;
    String location;

    public void chooseName() {

        System.out.println("What is your name?");
        String name = Main.scanner.nextLine();
        System.out.println("Welcome, " + name);
    }

    public void chooseWeapon() throws Exception {

        System.out.println("Choose your weapon [Sword/Mace]");
        String weapon = Main.scanner.nextLine();

        if (weapon.equalsIgnoreCase("sword") ) {
            System.out.println("Sword is a fine choice!");
        }
        else if(weapon.equalsIgnoreCase("mace") ) {
            System.out.println("Mace is a fine choice!");
        }
        else {
            throw new Exception("Invalid weapon!");
        }
    }

    public void chooseLocation() throws Exception {
        System.out.println("Choose your location [Forest/Tunnel]");
        String location = Main.scanner.nextLine();

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
