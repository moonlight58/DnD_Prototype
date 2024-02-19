import java.util.Scanner;

public class Main {
    
    public static void ScreenClean(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static void Wait(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    static boolean Exit = false;
    public static void main(String[] args) {
        ScreenClean();
        System.out.println("Welcome to my game about Dungeon and Dragon! Please be indulgent that it's still under development...\n");
        System.out.println("[1]Play the game [2]About the game [3]Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                System.out.println("Welcome to the game!");
                Character player = new Character();
                player.setName();
                player.setClass();
                DnDClass.setClassCharacteristic();
                player.setRace();
                Race.setRacialCharacteristic();
                DnDClass.setModifier();
                DnDClass.setHPModifier();
                Sheet.setDataSheet();
                System.out.println("Welcome to Dungeons and Dragons, " + Character.name + "! You're a " + Character.CharDnDclass + ". Let's start the adventure!");
                Scanner sc = new Scanner(System.in);
                while(!Main.Exit){
                    System.out.println("[1]Begin the adventure [2]Character [3]More Information [4]Exit");
                    int choice2 = sc.nextInt();
                    switch(choice2){
                        case 1:
                            Play.play();
                            break;
                        case 2:
                            Sheet.CharSheet();
                            break;
                        case 3:
                            System.out.println("Information about this game will be released soon!");
                            break;
                        case 4:
                            Main.Exit = true;
                            System.out.println("Exiting the game...");
                            Wait();
                            ScreenClean();
                            break;
                        default:
                            System.out.println("Invalid Choice! Try Again.");
                            break;
                    }
                    Wait();
                }
                sc.close();
                break;
            case 2:
                System.out.println("The game doesn't have any lore. Please wait for any update in the future");
                break;
            case 3:
                Main.Exit = true;
                System.out.println("Exiting the game...");
                Wait();
                ScreenClean();
                break;
            default:
                System.out.println("Invalid Choice! Please try again.");
                break;
        }
        scanner.close();
    }
}
