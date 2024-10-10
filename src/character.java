import java.util.ArrayList;

public class character {
    String name; 
    int health;
    int strength;
    int defense;
    int speed;
    String team; 
    int maxhp;
    ArrayList<equipment> gear = new ArrayList<equipment>();
    equipment equipment;
    
    
// ----- Playable Character ----- //
    public character(String name, int health, int maxhp, int strength, int defense, int speed, String team, ArrayList<equipment> gear){
        this.name = name; // name
        this.health = health; // current hitpoints
        this.maxhp = maxhp; // max hitpoints
        this.strength = strength; // determines damage
        this.defense = defense; // determines chance of being hit
        this.speed = speed; // determines initiative / move order
        this.team = team; // enemy or player team
        this.gear = gear; // equipped weapon
    }

    public void attack(character target) {
        int roll = (int)Math.random() * 20;
        if (roll >= target.defense){ 
            System.out.println("Attack Successfull");
                int damage = (int)(Math.random() * this.gear.get(0).statModifier);
                target.health -= damage;
            } else System.out.println("Attack Unsuccessful");
    }



    



 //A typical turn-based RPG involves two teams, each consisting of one or more characters, fighting until one team has had all their characters reach 0 "health points". On their turn, characters can perform two or more actions, such as attacking or defending. Often, characters cannot take actions if they do not have any health points left.
// In most text-based games (like this one), information on the outcome of an action is delivered to the player via an easy-to-read, sometimes exciting string, such as "Aang attacked Deadpool! Deadpool took 5 points of damage!"
// A character generally has a few base "stats" such as strength, intelligence and defence that dictate the outcome of an action. For instance, if character A attacks character B, compare A's strength against B's defence. “Dice rolls” or other randomness is often factored into an outcome to give the game some unpredictability and excitement. E.g., a number between 0-5 is added to attack damage, or a dice roll determines if the attack hits or not.
// The order in which characters take turns may be team-by-team, back-and-forth, or determined using some sort of “initiative” stat and dice roll.
// Characters themselves often have other elements that impact their stats or the potential outcome of an action. This may include equipment (armour, particular weapons, or enchanted rings), attributes based on race (Orc, Elf, Alien, Robot) and class (Rogue, Engineer, Barbarian, Mage), and even other “stat effects” (Poisoned, Wounded).

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

    public void getSpeed(character x){
        System.out.println(x.name + "'s Speed is: " + x.speed);
    }
    public void getTeam(character x){
        System.out.println(x.name + "'s Team is: " + x.team);
    }
    public void getWeapon(character x){
            System.out.println(x.name + "'s equipped weapon is: " + x.gear.get(0).name);

    }
    
    public static String getInfo(character x) {
        return(  
        " (Health: " + x.health 
        + " Strength: " + x.strength 
        + " Defense: " + x.defense 
        + " Speed: " + x.speed 
        + " Weapon: " + x.gear.get(0).name + ")");
    }

}




// // ----- Enemy Character----- //
//     public character(String name, int health, int maxhp, int strength, int defense, int speed, String team){
//         this.name = name; // name
//         this.health = health; // current hitpoints
//         this.maxhp = maxhp; // max hitpoints
//         this.strength = strength; // determines damage
//         this.defense = defense; // determines chance of being hit
//         this.speed = speed; // detemines initiative/move order
//         this.team = team; // enemy or player team
//     }

