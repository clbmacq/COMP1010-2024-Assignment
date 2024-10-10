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
            System.out.println(attacker.name + " attacked " + target.name + "! " + target.name + " took " + damage + "points of damage.");
        } 
        else System.out.println("Attack Unsuccessful");
    }
}   