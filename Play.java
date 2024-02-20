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

    public static void RandomEvent(int EventRandomNumber){
        if (EventRandomNumber == 2){        
            CombatSystem.Combat();
        } else if (EventRandomNumber == 1){
            System.out.println("Something isn't normal, you don't feel safe in this room");
        } else if (EventRandomNumber == 0){
            System.out.println("This room is empty- ohhh a coin~~~");
        } 
    }

    public static void play() {
        Scanner scanner = new Scanner(System.in);
        while (!PlayExit) {
            System.out.println("[1]Move to another room [2]Inventory [3]Compendium [4]Option");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    RandomEvent(setRandomEventNumber());
                    Main.Wait(500);
                    break;
                case 2:
                    System.out.println("Didn't do the inventory thing, wait a bit please!");
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
                    System.out.println("Want to quit playing?");
                    Main.Wait(500);
                    System.out.println("[1]Yes [2]No");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("You will loose all progress. Are you sure ?");
                            Main.Wait(500);
                            System.out.println("[1]I'm sure, do it! [2]Nuh uh, want to stay!");
                            choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    PlayExit = true;
                                    Main.Exit = true;
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
        }
        scanner.close();
    }
}