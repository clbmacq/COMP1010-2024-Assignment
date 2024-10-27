
import java.util.ArrayList;

public class GameCharacter {
    public String name; 
    public int health;
    public int strength;
    public int defense;
    public String team; 
    public int maxHP;
    public ArrayList<Equipment> gear = new ArrayList<>();
    
// ----- Playable Character ----- //
    public GameCharacter(String name, int health, int maxHP, int strength, int defense, String team, ArrayList<Equipment> gear) {
        this.name = name; // name
        this.health = health; // current hitpoints
        this.maxHP = maxHP; // max hitpoints
        this.strength = strength; // determines damage
        this.defense = defense; // determines chance of being hit
        this.team = team; // enemy or player team
        this.gear = gear; // equipped weapon
    }
   
    public static String getInfo(GameCharacter x) {
        return (    " (Health: " + x.health + " Strength: " + x.strength + " Defense: " + x.defense + " Weapon: " + x.gear.get(0).name + ")");
    }
}

