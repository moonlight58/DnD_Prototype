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
    static String CharDiceDMG;
    static int CharDMG;

    public void setName(){
        System.out.println("What is the name of your new character : ");
        name = scanner.nextLine();
        
        while (name.length() > 50) {
            System.out.println("Your name must not exceed 50 characters. Please enter a shorter name: ");
            name = scanner.nextLine();
        }
    
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
                    
                    while (name.length() > 50) {
                        System.out.println("Your name must not exceed 50 characters. Please enter a shorter name: ");
                        name = scanner.nextLine();
                    }
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

    public static void setRace(){
        while (!Race.RaceExit) {
            System.out.println("Choose your race by entering the corresponding number: ");
            for (int i = 0; i < Race.HolderRace.length; i++){
                System.out.println("[" + (i+1) + "] " + Race.HolderRace[i]);
                Main.Wait(50);
            }
            System.out.println("[" + (Race.HolderRace.length+1) + "] Information about the races");
            System.out.print("Your choice : ");
            int n = scanner.nextInt();
            if (n-1 < Race.HolderRace.length && n >= 0){
                String CharRace = Race.HolderRace[n-1];
                Main.Wait(500);
                System.out.println(CharRace + " has been selected.");
                Main.Wait(500);
                System.out.println();
                Race.RaceExit = true;
            } else if (n-1 == Race.HolderRace.length){
                Race.InfoRace();
            } else {
                System.out.println("Invalid input. Please enter a number.");
            }   
        }
    }

    public static int getDMGClassDnD(String CharDnDclass) {
    
        switch (CharDnDclass) {
            case "Barbarian":
                CharDMG = CombatSystem.D12();
                break;
            case "Bard":
            case "Cleric":
                CharDMG = CombatSystem.D8();
                break;
            case "Druid":
            case "Monk":
            case "Ranger":
            case "Warlock":
                CharDMG = CombatSystem.D6();
                break;
            case "Fighter":
                CharDMG = CombatSystem.D10();
                break;
            case "Paladin":
                int CharDMG1 = CombatSystem.D6();
                //System.out.println(CharDMG1+" Damage CharDMG1");
                int CharDMG2 = CombatSystem.D6();
                //System.out.println(CharDMG2+" Damage CharDMG2");
                CharDMG = CharDMG1 + CharDMG2;
                //System.out.println(CharDMG+" Total DMG");
                break;
            case "Rogue":
            case "Sorcerer":
            case "Wizard":
                CharDMG = CombatSystem.D8();
                break;
            default:
                System.out.println("Classe inconnue: " + CharDnDclass);
                break;
        }
    
        return CharDMG;
    }
    

    public static void Inventory(Scanner scanner){
        Sheet.CharSheet();
    }
}
