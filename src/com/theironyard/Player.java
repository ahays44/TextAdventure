package com.theironyard;

import java.util.ArrayList;

/**
 * Created by austinhays on 5/18/16.
 */
public class Player extends Character {
    String weapon;
    String location;

    ArrayList<String> items = new ArrayList<>();

    public Player() {
        this.health = 20;
        this.damage = 20;
    }

    public void chooseName() {

        System.out.println("What is your name?");
        name = Main.nextLine();
        System.out.printf("Welcome %s!\n", name);
    }

    public void chooseWeapon() throws Exception {

        System.out.println("Choose your weapon [Sword/Mace]");
        weapon = Main.nextLine();

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
        location = Main.nextLine();

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

    public void findItem(String item) {
        System.out.printf("You found %s! Pick it up? [Y/N]\n", item);
        String answer = Main.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            items.add(item);
            System.out.printf("You now have %s items!\n", items.size());
        }
        else {
            System.out.println("You have passed over the item!");
        }
    }

    public String getWeapon() {
        return weapon;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<String> getItems() {
        return items;
    }
}
