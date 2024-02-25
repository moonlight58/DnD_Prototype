import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Play {

    static boolean PlayExit = false;

    public static int setRandomEventNumber(){
        Random random = new Random();
        int min = 0;
        int max = 2;
        int range = max - min + 1;
        int EventRandomNumber = random.nextInt(range) + min;
        return EventRandomNumber;
    }

    public static void RandomEvent(int EventRandomNumber, Scanner scanner){
        if (EventRandomNumber == 2){
            Main.ScreenClean(); 
            CombatSystem.Combat(scanner);
        } else if (EventRandomNumber == 1){
            System.out.println("Something isn't normal, you don't feel safe in this room");
        } else if (EventRandomNumber == 0){
            System.out.println("This room is empty- ohhh a coin~~~");
        } 
    }
    
    public static void PlayExit(Scanner scanner){
        System.out.println("Want to quit playing?");
        Main.Wait(500);
        System.out.println("[1]Yes [2]No");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You will loose all progress. Are you sure ?");
                Main.Wait(500);
                System.out.println("[1]I'm sure, do it! [2]Nuh uh, want to stay!");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        PlayExit = true;
                        System.out.print("Exiting the game");
                        for (int i = 0; i < 3; i++){
                            Main.Wait(500);
                            System.out.print(".");
                        }
                        Main.Wait(500);
                        Main.ScreenClean();
                        break;
                    case 2:
                        break;
                    default:
                        System.out.println("Invalid Choice! Try Again.");
                        Main.Wait(500);
                        break;
                }
            case 2:
                break;
            default:
                System.out.println("Invalid Choice! Try Again.");
                Main.Wait(500);
                break;
        }
    }

    public static void play(Scanner scanner) {
        PlayExit = false;
        while (!PlayExit) {
            try {
                System.out.println("[1]Move to another room [2]Inventory [3]Compendium [4]Option");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        RandomEvent(setRandomEventNumber(), scanner);
                        Main.Wait(500);
                        break;
                    case 2:
                        Character.Inventory(scanner);
                        Main.Wait(500);
                        break;
                    case 3:
                        while(!CompendiumMob.CompendiumExit){
                            CompendiumMob.Compendium(scanner);
                        }
                        Main.Wait(500);
                        CompendiumMob.CompendiumExit = false;
                        break;
                    case 4:
                        PlayExit(scanner);
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Consume invalid input to avoid an infinite loop
            }
        }
    }
}