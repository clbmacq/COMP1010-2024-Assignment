public class character {
    String name; 
    int health;
    int strength;
    int defense;
    int speed;
    int intelligence;
    String team;
    int maxhp;
    String weapon;
    
// ----- Playable Character ----- //
    public character(String name, int health, int maxhp, String weapon, int strength, int defense, int speed, String team){
        this.name = name; // name
        this.health = health; // current hitpoints
        this.maxhp = maxhp; // max hitpoints
        this.weapon = weapon;  // equipped weapon
        this.strength = strength; // determines damage
        this.defense = defense; // determines chance of being hit
        this.speed = speed; // determines initiative / move order
        this.team = team; // enemy or player team
    }


// ----- Enemy Character----- //
    public character(String name, int health, int maxhp, int strength, int defense, int speed, String team){
        this.name = name; // name
        this.health = health; // current hitpoints
        this.maxhp = maxhp; // max hitpoints
        this.strength = strength; // determines damage
        this.defense = defense; // determines chance of being hit
        this.speed = speed; // detemines initiative/move order
        this.team = team; // enemy or player team
    }





}
 //A typical turn-based RPG involves two teams, each consisting of one or more characters, fighting until one team has had all their characters reach 0 "health points". On their turn, characters can perform two or more actions, such as attacking or defending. Often, characters cannot take actions if they do not have any health points left.
// In most text-based games (like this one), information on the outcome of an action is delivered to the player via an easy-to-read, sometimes exciting string, such as "Aang attacked Deadpool! Deadpool took 5 points of damage!"
// A character generally has a few base "stats" such as strength, intelligence and defence that dictate the outcome of an action. For instance, if character A attacks character B, compare A's strength against B's defence. “Dice rolls” or other randomness is often factored into an outcome to give the game some unpredictability and excitement. E.g., a number between 0-5 is added to attack damage, or a dice roll determines if the attack hits or not.
// The order in which characters take turns may be team-by-team, back-and-forth, or determined using some sort of “initiative” stat and dice roll.
// Characters themselves often have other elements that impact their stats or the potential outcome of an action. This may include equipment (armour, particular weapons, or enchanted rings), attributes based on race (Orc, Elf, Alien, Robot) and class (Rogue, Engineer, Barbarian, Mage), and even other “stat effects” (Poisoned, Wounded).

//     public void getName(){
//         System.out.println("Character's Name is: " + name);
//     }

//     public void getHealth(){
//         System.out.println("Character's Health is:" + health);
//     }

//     public void getStrength(){
//         System.out.println(name + " Strength is:" + strength);
//     }

//     public void getDefense(){
//         System.out.println(name + " Defense is:" + defense);
//     }

//     public void getSpeed(){
//         System.out.println(name + " Speed is:" + speed);
//     }
//     public void getIntelligence(){
//         System.out.println("Character's Name is: " + intelligence);
//     }
//    public void getTeam(){
//         System.out.println("Character's Name is: " + team);
//     }
//     public void getInfo(){
//         System.out.println(name + " information:");
//         System.out.println("+ Health: " + health);
//         System.out.println("+ Strength: " + strength);
//         System.out.println("+ Defense: " + defense);
//         System.out.println("+ Speed: " + speed);
//         System.out.println("+ Intelligence: " + intelligence);
//         System.out.println("+ Team: " + team);
        
//     }
// }

