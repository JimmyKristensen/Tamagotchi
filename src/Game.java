import java.util.Scanner;

public class Game {
    public static int monkeyCheck = 1;
    public static int birdCheck = 2;

    public static void main(String[] args) {
        // Needs to creat an instance of the object before the if statement
        // if not created the class would only live in the if statement
        Monkey monkey = null;
        Bird bird = null;
        Scanner scanner = new Scanner(System.in);

        greetings();
        int userAnimalChoice = scanner.nextInt();

        boolean checkIfChoiceIsMonkeyOrBird = false;
        do {
            if (userAnimalChoice == monkeyCheck) {
                checkIfChoiceIsMonkeyOrBird = true;
            } else if (userAnimalChoice == birdCheck) {
                checkIfChoiceIsMonkeyOrBird = true;
            } else {
                System.out.println("Pls pick either 1 or 2");
                userAnimalChoice = scanner.nextInt();
            }
        }
        while (!checkIfChoiceIsMonkeyOrBird);

        printSelectedAnimal(userAnimalChoice);
        String userNameInput = scanner.next();

        // Creates a new animal
        if (userAnimalChoice == monkeyCheck) {
            monkey = new Monkey(userNameInput, true, 10, 0);
        } else if (userAnimalChoice == birdCheck) {
            bird = new Bird(userNameInput, true, 10, 0);
        } else {
            System.out.println("Pls pick a valid number");
        }

        boolean userInputLoop = false;
        do {
            // Print out users options
            if (userAnimalChoice == monkeyCheck) {
                int getAmountEaten = monkey.getEatenBananaAmount(monkey.bananasEaten);
                userInteractionInterface(getAmountEaten);
            } else if (userAnimalChoice == birdCheck) {
                int getAmountEaten = bird.getBirdSeedsEaten(bird.birdSeedsEaten);
                userInteractionInterface(getAmountEaten);
            }

            int userInteractionChoice = scanner.nextInt();
            if (userInteractionChoice == 0){
                userInputLoop = endGame();
                System.out.println("Thanks for playing");
            } else {
                if (userAnimalChoice == monkeyCheck) {
                    monkeyInteractionInput(monkey, userInteractionChoice);
                } else if (userAnimalChoice == birdCheck) {
                    birdInteractionInput(bird, userInteractionChoice);
                }
            }
        }
        while (!userInputLoop);

    }

    public static void greetings() {
        System.out.println("Greeting do you wanna create a monkey or a bird?");
        System.out.println("Press 1 for monkey and 2 for bird");
    }

    public static void printSelectedAnimal(int intForChosenAnimal) {
        if (intForChosenAnimal == monkeyCheck) {
            System.out.println("You have chosen to create a monkey. What shall it be named?");
        } else if (intForChosenAnimal == birdCheck) {
            System.out.println("You have chosen to create a bird. What shall it be named?");
        }
    }

    public static void userInteractionInterface(int getAmountEaten) {
        System.out.println("What would you now like to do?");
        System.out.println("1 - play");
        System.out.println("2 - feed");
        System.out.println("3 - sleep");
        System.out.println("4 - check mood");
        if (getAmountEaten > 5) {
            System.out.println("5 - special interaction");
        }
        System.out.println("0 - stop for today");
    }

    public static void monkeyInteractionInput(Monkey monkey, int userInput) {
        switch (userInput) {
            case 1:
                monkey.play();
                break;
            case 2:
                monkey.feed();
                break;
            case 3:
                monkey.sleep();
                break;
            case 4:
                monkey.whatIsItMood(monkey.energy);
                break;
            case 5:
                monkey.returnToMonkey();
                break;
        }
    }

    public static void birdInteractionInput(Bird bird, int userInput) {
        switch (userInput) {
            case 1:
                bird.play();
                break;
            case 2:
                bird.feed();
                break;
            case 3:
                bird.sleep();
                break;
            case 4:
                bird.whatIsItMood(bird.energy);
                break;
            case 5:
                bird.fly();
                break;
        }
    }

    public static boolean endGame(){
        return true;
    }

}
