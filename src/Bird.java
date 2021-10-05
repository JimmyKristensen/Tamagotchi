public class Bird extends Tamagotchi{
    public int birdSeedsEaten;
    public Bird(String name, boolean mood, int energy, int birdSeedsEaten) {
        super(name, mood, energy);
        this.birdSeedsEaten = birdSeedsEaten;
    }

    @Override
    public void play() {
        if (this.energy > 0) {
            super.play();
            System.out.println("You threw a ball up in the air");
            System.out.println(getName() + " catched the ball in the air");
        } else{
            System.out.println(getName() + " is to tired to play and needs some sleep");
        }
    }

    @Override
    public void feed() {
        super.feed();
        System.out.println("It loved the birds seeds");
        this.birdSeedsEaten++;
    }

    public int getBirdSeedsEaten(int eatenBirdseeds){
        int amount = eatenBirdseeds;
        return amount;
    }

    public void fly(){
        System.out.println(name + " flew outside and pooped on that one neighbour's car");
        System.out.println("It seems to proud of it's self");
    }
}
