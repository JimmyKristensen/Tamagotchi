public class Monkey extends Tamagotchi{
    public int bananasEaten;

    public Monkey(String name, boolean mood, int energy, int bananasEaten) {
        super(name, mood, energy);
        this.bananasEaten = bananasEaten;
    }

    @Override
    public void play() {
        if (this.energy > 0) {
            super.play();
            System.out.println("You gave " + getName() + " a gameboy");
        } else{
            System.out.println(getName() + " is to tired to play and needs some sleep");
        }
    }

    @Override
    public void feed(){
        super.feed();
        System.out.println("You gave " + getName() + " a banana");
        this.bananasEaten++;
    }

    public int getEatenBananaAmount(int bananasEaten){
        int amount = bananasEaten;
        return amount;
    }

    public void returnToMonkey(){
        System.out.println(name + " reaches it's hand out");
        System.out.println("Return to monkey my friend");
    }

}
