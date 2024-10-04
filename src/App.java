import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        equipment WepLongsword = new equipment("Weapon", "LongSword", 10);
        equipment WepShortsword= new equipment("Weapon", "Shortsword", 10);
        equipment WepMachete = new equipment("Weapon", "Machete", 10);
        equipment WepDagger = new equipment("Weapon", "Dagger", 10);

        ArrayList<equipment> gearbob = new ArrayList<equipment>();
        ArrayList<equipment> gearcaleb = new ArrayList<equipment>();
        ArrayList<equipment> gearjayden = new ArrayList<equipment>();
        ArrayList<equipment> gearmimo = new ArrayList<equipment>();

        character Bob = new character("Bob", 10, 10, 10, 10, 10, "Enemy", gearbob);
        gearbob.add(WepLongsword);
        Bob.getInfo();
    
        character Caleb = new character("Caleb", 10, 10, 10, 10, 10, "Player", gearcaleb);
        gearcaleb.add(WepShortsword);
        Caleb.getInfo();

        character Jayden = new character("Jayden", 30, 30 ,5, 7, 5, "Player", gearjayden);
        gearjayden.add(WepMachete);
        Jayden.getInfo();

        character Mimo = new character("Mimo", 20, 20, 5, 13, 15, "Enemy",gearmimo);
        gearmimo.add(WepDagger);
        Mimo.getInfo();


        // Scanner myObj = new Scanner(System.in);  
        // String userName = myObj.nextLine();  
        // myObj.close();
    }

    

}