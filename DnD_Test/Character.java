import java.util.Scanner;

public class Character {

    static int HitPoint;
    static int Strength;
    static int Dexterity;
    static int Constitution;
    static int Wisdom;
    static int Intelligence;
    static int Charisma;

    static int Expertise = 2; //At level 1
    static int CA = 10;

    static int ModifierStrength = (Strength/2)-5;
    static int ModifierDexterity = (Dexterity/2)-5;
    static int ModifierConstitution = (Constitution/2)-5;
    static int ModifierWisdom = (Wisdom/2)-5;
    static int ModifierIntelligence= (Intelligence/2)-5;
    static int ModifierCharisma = (Charisma/2)-5;

    static int CharLevel = 1;

    static Scanner scanner = new Scanner(System.in);
    static int choice = 0;
    static String name;
    static String CharRace;
    static String CharDnDclass;

    public void setName(){
        System.out.println("What is the name of your new character : ");
        name = scanner.nextLine();
        while (choice != 1){
            System.out.println("Are you sure that your name is " + name + " ?");
            System.out.println("[1]Yes [2]No");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("What is your new name ?");
                    name = scanner.nextLine();
                    break;
                default:
                    System.out.println("Please enter a valid number.");
                    break;
            }
        }
        Main.Wait();
    }

    public void setClass() {
        System.out.println("Choose your class by entering the corresponding number: ");
        for (int i = 0; i < DnDClass.HolderClass.length; i++){
            System.out.println("["+(i+1)+"]"+DnDClass.HolderClass[i]);
        }
        System.out.print("Your choice : ");
        int n = scanner.nextInt();
        CharDnDclass = DnDClass.HolderClass[n-1];
        Main.Wait();
        System.out.println(CharDnDclass + " has been selected.");
        DnDClass.setClassCharacteristic();
        System.out.println("");
        Main.Wait();
    }

    public void setRace(){
        System.out.println("Choose your race by entering the corresponding number: ");
        for (int i = 0; i < Race.HolderRace.length; i++){
            System.out.println("["+(i+1)+"]"+Race.HolderRace[i]);
        }
        System.out.print("Your choice : ");
        int n = scanner.nextInt();
        CharRace = Race.HolderRace[n-1];
        Main.Wait();
        System.out.println(CharRace + " has been selected.");
        Main.Wait();
        System.out.println();
    }
}
