public class character {
    String name; 
    int health;
    int strength;
    int defense;
    int speed;

    public character(String name, int health, int strength, int defense, int speed){
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
        this.speed = speed;
    }

    public void getName(){
        System.out.println("Character's Name is: " + name);
    }

    public void getHealth(){
        System.out.println("Character's Health is:" + health);
    }

    public void getStrength(){
        System.out.println(name + " Strength is:" + strength);
    }

    public void getDefense(){
        System.out.println(name + " Defense is:" + defense);
    }

    public void getSpeed(){
        System.out.println(name + " Speed is:" + speed);
    }

    public void getInfo(){
        System.out.println(name + " information:");
        System.out.println("+ Health: " + health);
        System.out.println("+ Strength: " + strength);
        System.out.println("+ Defense: " + defense);
        System.out.println("+ Speed: " + speed);
    }
}
