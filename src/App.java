public class App {
    public static void main(String[] args) throws Exception {

        weapon WepLongSword = new weapon("ShortSword", 8);
        weapon WepShortSword = new weapon("LongSword", 6);
        weapon WepMachete = new weapon("Machete", 8);
        weapon WepDagger = new weapon("Dagger", 4);

        character Bob = new character("Bob", 10, 10, 10, 10, 10, "Enemy", WepLongSword);
        Bob.getInfo();
    
        character Caleb = new character("Caleb", 10, 10, 10, 10, 10, "Player", WepShortSword);
        Caleb.getInfo();

        character Jayden = new character("Jayden", 30, 30 ,5, 7, 5, "Player", WepMachete);
        Jayden.getInfo();

        character Mimo = new character("Mimo", 20, 20, 5, 13, 15, "Enemy",WepDagger);
        Mimo.getInfo();

    }




    
}


