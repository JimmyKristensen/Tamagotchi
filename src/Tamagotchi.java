public class Tamagotchi {
    public String name;
    public boolean mood;
    public int energy;
    public int energySpent = 2;
    public int recoverEnergi = 5;

    public Tamagotchi(String name, boolean mood, int energy) {
        this.name = name;
        this.mood = mood;
        this.energy = energy;
    }

    public void play(){
        System.out.println(name + " are exited play");
        this.energy = this.energy - energySpent;
    }

    public void feed(){
        System.out.println("You gave your pet some food");
    }

    public void sleep(){
        System.out.println(name + " is going to take a nap");
        if (this.energy + recoverEnergi >= 11){
            this.energy = 10;
        } else {
            this.energy = this.energy + recoverEnergi;
        }
    }

    public void whatIsItMood(int energyCheck){
        if (energyCheck > 5){
            System.out.println("It's energetic");
        } else{
            System.out.println("It's low on energy and might need some sleep");
        }
    }

    public String getName(){
        return this.name;
    }

}
