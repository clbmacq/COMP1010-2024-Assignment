
import java.util.Random;

public class actions {
    public static void attack(character attacker, character target) {
        //creating random object
        Random rand = new Random();
        equipment attackerWeapon = attacker.gear.get(0);
        int roll = rand.nextInt(20) + 1; // generate number from 1 - 20
        
        if (roll >= target.defense){
            System.out.println("Attack Successfull");
            int damage = rand.nextInt(attackerWeapon.statModifier - 1) + 1 + (int)((attacker.strength - 10)/2); // calculate damage based on weapon and strength
            target.health -= damage;
            if (target.health < 0) { target.health = 0;}
            System.out.println(attacker.name + " attacked " + target.name + " with their "+ attackerWeapon.name + "! " + target.name + " took " + damage + " points of damage.");
            System.out.println("\n" + target.name + "'s Current health is: " + target.health + " Out Of " + target.maxhp);
        }
        else {System.out.println
        ("Attack Unsuccessful");
        System.out.println(attacker.name + " rolled " + roll + ", which is lower than " + target.name + "'s defense of " + target.defense);
        }
    }
    
    public static void heal(character target) {
        Random rand = new Random();
        int preHealth = target.health;

        if (target.health < target.maxhp){
            int healroll = rand.nextInt(10) + 1;
            target.health = target.health + healroll;
            if (target.health > target.maxhp) {
                target.health = target.maxhp;
            }
            System.out.println(target.name + " healed for " + (target.health - preHealth) + " points.");
            System.out.println(target.name + "'s health is: " + target.health);
        } 
        else if (target.health == target.maxhp){
            System.out.println(target.name + " is already at Max HP");
        }
    }
}



    
