import java.util.Scanner;

public class Main {
    
    public static void ScreenClean(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static void Wait(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    static boolean Exit = false;
    public static void main(String[] args) {
        ScreenClean();
        System.out.println("Welcome to my game about Dungeons and Dragons! Please be indulgent that it's still under development...\n");
        Scanner scanner = new Scanner(System.in);
        while(!Exit){
            System.out.println("[1]Play the game [2]About the game [3]Exit");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Welcome to the game!");
                    Character player = new Character();
                    Wait(500);
                    player.setName();
                    player.setClass();
                    DnDClass.setClassCharacteristic();
                    player.setRace();
                    Race.setRacialCharacteristic();
                    DnDClass.setModifier();
                    DnDClass.setHPModifier();
                    Sheet.setDataSheet();
                    System.out.println("Welcome to Dungeons and Dragons, " + player.name + "! You're a " + player.CharDnDclass + ". Let's start the adventure!");
                    Scanner sc = new Scanner(System.in);
                    while(!Exit){
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
                                System.out.println("More information on the game will be available soon!");
                                break;
                            case 4:
                                Main.Exit = true;
                                System.out.print("Exiting the game");
                                for (int i = 0; i < 3; i++){
                                    Main.Wait(500);
                                    System.out.print(".");
                                }
                                Wait(500);
                                ScreenClean();
                                break;
                            default:
                                System.out.println("Invalid Choice! Try Again.");
                                break;
                        }
                        Wait(1000);
                    }
                    sc.close();
                    break;
                case 2:
                    System.out.println("The game doesn't have any information right now. Please wait for any update in the future");
                    Wait(500);
                    break;
                case 3:
                    Exit = true;
                    System.out.print("Exiting the game");
                    for (int i = 0; i < 3; i++){
                        Main.Wait(500);
                        System.out.print(".");
                    }
                    Wait(500);
                    ScreenClean();
                    break;
                default:
                    System.out.println("Invalid Choice! Please try again.");
                    break;
            }  
        }
        scanner.close();
    }
}
