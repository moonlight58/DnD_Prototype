public class Sheet {
    private static String SheetName;
    private static String SheetRace;
    private static String SheetClass;
    private static String SheetLevel;
    private static String SheetCA;
    private static String SheetHP;
    private static String SheetStrength;
    private static String SheetDexterity;
    private static String SheetConstitution;
    private static String SheetIntelligence;
    private static String SheetWisdom;
    private static String SheetCharisma;
    private static String SheetModifStrength;
    private static String SheetModifDexterity;
    private static String SheetModifConstitution;
    private static String SheetModifIntelligence;
    private static String SheetModifWisdom;
    private static String SheetModifCharisma;
    private static String HPCombatEnemy;
    private static String HPCombatChar;
    private static String CACombatEnemy;
    private static String CACombatChar;

    public static String formatStringWithSpaces(String input, int targetLength) {
        int spaceToAdd = targetLength - input.length();
        return input + " ".repeat(Math.max(0, spaceToAdd));
    }
    
    public static void setCharacterName() {
        SheetName = formatStringWithSpaces(Character.name, 59);
    }
    
    public static void setCharacterRace() {
        SheetRace = formatStringWithSpaces(Character.CharRace, 69);
    }
    
    public static void setCharacterClass() {
        SheetClass = formatStringWithSpaces(Character.CharDnDclass, 68);
    }
    
    public static void setCharacterLevel() {
        SheetLevel = formatStringWithSpaces(Integer.toString(Character.CharLevel), 68);
    }
    
    public static void setCA() {
        SheetCA = formatStringWithSpaces(Integer.toString(Character.CA), 57);
    }
    
    public static void setHP() {
        SheetHP = formatStringWithSpaces(Integer.toString(Character.HitPoint), 58);
    }    

    public static void setStrength(){
        SheetStrength = String.format("%-7s", Character.Charisma);
        SheetModifStrength = String.format("%-7s", Character.ModifierCharisma);
    }

    public static void setDexterity(){
        SheetDexterity = String.format("%-7s", Character.Charisma);
        SheetModifDexterity = String.format("%-7s", Character.ModifierCharisma);
    }
    
    public static void setConstitution(){
        SheetConstitution = String.format("%-7s", Character.Charisma);
        SheetModifConstitution = String.format("%-7s", Character.ModifierCharisma);
    }

    public static void setIntelligence(){
        SheetIntelligence = String.format("%-7s", Character.Charisma);
        SheetModifIntelligence = String.format("%-7s", Character.ModifierCharisma);
    }

    public static void setWisdom(){
        SheetWisdom = String.format("%-7s", Character.Charisma);
        SheetModifWisdom = String.format("%-7s", Character.ModifierCharisma);
    }

    public static void setCharisma(){
        SheetCharisma = String.format("%-7s", Character.Charisma);
        SheetModifCharisma = String.format("%-7s", Character.ModifierCharisma);
    }

    public static void setCombatHP(){
        HPCombatChar = String.format("%-17s",Character.HitPoint);
        HPCombatEnemy = String.format("%-17s",Enemy.EnemyHitPoint);
    }

    public static void setCombatCA(){
        CACombatEnemy = String.format("%-17s", Enemy.EnemyCA);
        CACombatChar = String.format("%-17s", Character.CA);    
    }

    public static void setWeapon(){
        
    }

    public static void setDataSheet(){
        setCharacterName();
        setCharacterRace();
        setCharacterClass();
        setCharacterLevel();
        setStrength();
        setDexterity();
        setConstitution();
        setIntelligence();
        setWisdom();
        setCharisma();
        setCA();
        setHP();
        setCombatHP();
        setCombatCA();
        setWeapon();
    }

    public static void CharSheet() {
        System.out.println("_______________________________________________________________________________\n" + //
                "|                                                                             |\n" + //
                "|                                D&D CHARACTER SHEET                          |\n" + //
                "|_____________________________________________________________________________|\n" + //
                "|                                                                             |\n" + //
                "|  Character Name: " + SheetName + "|\n" + //
                "|_____________________________________________________________________________|\n" + //
                "|                                                                             |\n" + //
                "|  Race: " + SheetRace + "|\n" + //
                "|_____________________________________________________________________________|\n" + //
                "|                                                                             |\n" + //
                "|  Class: " + SheetClass + "|\n" + //
                "|_____________________________________________________________________________|\n" + //
                "|                                                                             |\n" + //
                "|  Level: " + SheetLevel + "|\n" + //
                "|_____________________________________________________________________________|\n" + //
                "|                                                                             |\n" + //
                "|  Alignment:                                                                 |\n" + //
                "|_____________________________________________________________________________|\n" + //
                "|                                                                             |\n" + //
                "|  Hit Points (HP): " + SheetHP + "|\n" + //
                "|_____________________________________________________________________________|\n" + //
                "|                                                                             |\n" + //
                "|  Class Armor (CA): " + SheetCA + "|\n" + //
                "|_____________________________________________________________________________|\n" + //
                "|                                                                             |\n" + //
                "|  Attributes:                                                                |\n" + //
                "|  _______  _______  _______  _______  _______  _______                       |\n" + //
                "| |  STR  ||  DEX  ||  CON  ||  INT  ||  WIS  ||  CHA  |                      |\n" + //
                "| |   "+ SheetStrength + "||   "+ SheetDexterity +"||   "+ SheetConstitution +"||   "+ SheetIntelligence +"||   "+ SheetWisdom+"||   "+ SheetCharisma +"|                      |\n" + //
                "| |_______||_______||_______||_______||_______||_______|                      |\n" + //
                "| |   "+ SheetModifStrength +"||   "+ SheetModifDexterity +"||   "+ SheetModifConstitution +"||   "+ SheetModifIntelligence +"||   "+ SheetModifWisdom +"||   "+ SheetModifCharisma +"|                      |\n" + //
                "| |_______||_______||_______||_______||_______||_______|                      |\n" + //
                "|                                                                             |\n" + //
                "|  Skills:                                                                    |\n" + //
                "|  1.                                                                         |\n" + //
                "|  2.                                                                         |\n" + //
                "|  3.                                                                         |\n" + //
                "|  4.                                                                         |\n" + //
                "|  5.                                                                         |\n" + //
                "|_____________________________________________________________________________|\n");
    }

    public static void CombatSheet(){
        System.out.println("|================================================================|Combat Sheet|=================================================================|\n" + //
                "|                                  You                                  |                                 Enemy                                 |\n" + //
                "|               HP                                     " + HPCombatChar + "|               HP                                     " + HPCombatEnemy + "|\n" + //
                "|               AC                                     " + CACombatChar + "|               AC                                     " + CACombatEnemy + "|\n" + //
                "|             WEAPON                                 WEAPON             |             WEAPON                                 WEAPON             |\n" + //
                "|                                                                       |                                                                       |\n" + //
                "|            [1]Attack                            [2]Inventory          |                                                                       |\n" + //
                "|             [3]Info                                [4]Run             |                                                                       |\n" + //
                "|                                                                       |                                                                       |\n" + //
                "|===============================================================================================================================================|\n");
        
    }
}
