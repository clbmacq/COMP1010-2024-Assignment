package main;
import java.util.ArrayList;

public class character {
    public String name; 
    public int health;
    public int strength;
    public int defense;
    public String team; 
    public int maxhp;
    public ArrayList<equipment> gear = new ArrayList<>();
    
// ----- Playable Character ----- //
    public character(String name, int health, int maxhp, int strength, int defense, String team, ArrayList<equipment> gear){
        this.name = name; // name
        this.health = health; // current hitpoints
        this.maxhp = maxhp; // max hitpoints
        this.strength = strength; // determines damage
        this.defense = defense; // determines chance of being hit
        this.team = team; // enemy or player team
        this.gear = gear; // equipped weapon
    }

    public void getName(character x){
        System.out.println(x.name + "'s Name is: " + x.name);
    }

    public void getHealth(character x){
        System.out.println(x.name + "'s Health is: " + x.health);
    }
    
    public void getStrength(character x){
        System.out.println(x.name + "'s Strength is: " + x.strength);
    }

    public void getDefense(character x){
        System.out.println(x.name + "'s Defense is: " + x.defense);
    }

    public void getTeam(character x){
        System.out.println(x.name + "'s Team is: " + x.team);
    }

    public void getWeapon(character x){
            System.out.println(x.name + "'s equipped weapon is: " + x.gear.get(0).name);
    }
    
    public static String getInfo(character x) {
        return (    " (Health: " + x.health + " Strength: " + x.strength + " Defense: " + x.defense + " Weapon: " + x.gear.get(0).name + ")");
    }
}
