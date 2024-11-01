import java.util.Random;

public class Actions {
    public static void attack(GameCharacter attacker, GameCharacter target) {
        //creating random object
        Random rand = new Random();
        Equipment attackerWeapon = attacker.gear.get(0);
        int roll = rand.nextInt(20) + 1; // generate number from 1 - 20
        
        if (roll >= target.defense) {
            System.out.println("Attack Successfull");
            int damage = rand.nextInt(attackerWeapon.statModifier - 1) + 1 + (int)((attacker.strength - 10)/2); // calculate damage based on weapon and strength
            target.health -= damage;
            if (target.health < 0) { // check to make sure health does not go negative
                target.health = 0;
            }
            System.out.println(attacker.name + " attacked " + target.name + " with their "+ attackerWeapon.name + "! " + target.name + " took " + damage + " points of damage.");
            System.out.println("\n" + target.name + "'s Current health is: " + target.health + " Out Of " + target.maxHP);
        }
        else {System.out.println
        ("Attack Unsuccessful");
        System.out.println(attacker.name + " rolled " + roll + ", which is lower than " + target.name + "'s defense of " + target.defense);
        }
    }
    
    public static void heal(GameCharacter target) {
        Random rand = new Random();
        int preHealth = target.health;

        if (target.health < target.maxHP) {
            int healRoll = rand.nextInt(10) + 1;
            target.health = target.health + healRoll;
            if (target.health > target.maxHP) { // check to make sure health does not exceed max
                target.health = target.maxHP;
            }
            System.out.println(target.name + " healed for " + (target.health - preHealth) + " points.");
            System.out.println(target.name + "'s health is: " + target.health);
        } 
        else if (target.health == target.maxHP) {
            System.out.println(target.name + " is already at Max HP");
        }
    }
}



    
