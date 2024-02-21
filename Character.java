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
    static int CharSpeed = 10;

    static Scanner scanner = new Scanner(System.in);
    static int choice = 0;
    static String name;
    static String CharRace;
    static String CharDnDclass;
    static String CharWeapon;
    static int CharDMG;

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
        Main.Wait(1000);
    }

    public void setClass() {
        System.out.println("Choose your class by entering the corresponding number: ");
        for (int i = 0; i < DnDClass.HolderClass.length; i++){
            System.out.println("["+(i+1)+"]"+DnDClass.HolderClass[i]);
            Main.Wait(50);
        }
        System.out.print("Your choice : ");
        int n = scanner.nextInt();
        CharDnDclass = DnDClass.HolderClass[n-1];
        Main.Wait(500);
        System.out.println(CharDnDclass + " has been selected.");
        DnDClass.setClassCharacteristic();
        System.out.println("");
        Main.Wait(500);
    }

    public void setRace(){
        System.out.println("Choose your race by entering the corresponding number: ");
        for (int i = 0; i < Race.HolderRace.length; i++){
            System.out.println("["+ (i+1) +"]"+Race.HolderRace[i]);
            Main.Wait(50);
        }
        System.out.print("Your choice : ");
        int n = scanner.nextInt();
        CharRace = Race.HolderRace[n-1];
        Main.Wait(500);
        System.out.println(CharRace + " has been selected.");
        Main.Wait(500);
        System.out.println();
    }

    public static int getDMGClassDnD(){
        switch(CharDnDclass){
            case "Barbarian":
                CharDMG = CombatSystem.D12();
            case "Bard":
                CharDMG = CombatSystem.D8();
            case "Cleric":
                CharDMG = CombatSystem.D8();
            case "Druid":
                CharDMG = CombatSystem.D6();
            case "Fighter":
                CharDMG = CombatSystem.D10();
            case "Monk":
                CharDMG = CombatSystem.D6();
            case "Paladin":
                CharDMG = CombatSystem.D6() + CombatSystem.D6();
            case "Ranger":
                CharDMG = CombatSystem.D6();
            case "Rogue":
                CharDMG = CombatSystem.D8();
            case "Sorcerer":
                CharDMG = CombatSystem.D8();
            case "Warlock":
                CharDMG = CombatSystem.D6();
            case "Wizard":
                CharDMG = CombatSystem.D8();  
        }
        return CharDMG;
    }
}
