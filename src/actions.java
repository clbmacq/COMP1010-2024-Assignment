import java.util.Random;

public class actions{

    public static void attack(character attacker, character target){
        Random rand = new Random();
        equipment attackerWeapon = attacker.gear.get(0);
        int roll = rand.nextInt(20);
        if (roll >= target.defense){ 
            System.out.println("Attack Successfull");
            int damage = rand.nextInt(attackerWeapon.statModifier) + (int)((attacker.strength - 10)/2);
            target.health -= damage;
            System.out.println(attacker.name + " attacked " + target.name + " with their "+ attackerWeapon.name + "! " + target.name + " took " + damage + " points of damage.");
            System.out.println(target.name + "'s Current health is: " + target.health);
        } 
        else {System.out.println("Attack Unsuccessful");
        System.out.println("You rolled " + roll + ", which is lower than " + target.name + "'s defense of " + target.defense);
        }
    }
    public static void heal(character target){
        Random rand = new Random(); // stay 
        int preHealth = target.health; // stay unless 

        if (target.health < target.maxhp){
            int healroll = rand.nextInt(10);
            target.health = target.health + healroll;
            if(target.health > target.maxhp){
                target.health = target.maxhp;
            }
            System.out.println(target.name + " healed for " + (target.health - preHealth) + " points.");
            System.out.println(target.name + "health is: " + target.health);
        } 
       
        else if (target.health == target.maxhp){
            System.out.println(target.name + " is already at Max HP");
        }
        
    }
    

}



    
