public class equipment {
String type;
String name;
int statModifier;

// weapons list
equipment WepLongsword = new equipment("Weapon", "LongSword", 10);
equipment WepShortsword= new equipment("Weapon", "Shortsword", 10);
equipment WepMachete = new equipment("Weapon", "Machete", 10);
equipment WepDagger = new equipment("Weapon", "Dagger", 10);


public equipment(String type, String name, int statModifier){
    this.type = type;
    this.name = name;
    this.statModifier = statModifier;

    }

}

