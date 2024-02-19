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

    public static void setCharacterName() {
        int NameSpaceToAdd = 59 - Character.name.length();
        SheetName = Character.name;
        for (int i = 0; i < NameSpaceToAdd; i++) {
            SheetName += " ";
        }
        //System.out.println(SheetName + ".");
    }

    public static void setCharacterRace(){
        int RaceSpaceToAdd = 69 - Character.CharRace.length();
        SheetRace = Character.CharRace;
        for (int i = 0; i < RaceSpaceToAdd; i++){
            SheetRace += " ";
        }
    }

    public static void setCharacterClass(){
        int ClassSpaceToAdd = 68 - Character.CharDnDclass.length();
        SheetClass = Character.CharDnDclass;
        for (int i = 0; i < ClassSpaceToAdd; i++){
            SheetClass += " ";
        }
    }

    public static void setCharacterLevel(){
        SheetLevel = Integer.toString(Character.CharLevel);
        String LevelAsString = String.valueOf(SheetLevel);
        int length = LevelAsString.length();
        int LevelSpaceToAdd = 68 - length;
        for (int i = 0; i < LevelSpaceToAdd; i++){
            SheetLevel += " ";
        }
    }

    public static void setCA(){
        SheetCA = Integer.toString(Character.CA);
        String CaAsString = String.valueOf(SheetCA);
        int length = CaAsString.length();
        int CASpaceToAdd = 57 - length;
        for (int i = 0; i < CASpaceToAdd; i++){
            SheetCA += " ";
        }
    }

    public static void setHP(){
        SheetHP = Integer.toString(Character.HitPoint);
        String HpAsString = String.valueOf(SheetHP);
        int length = HpAsString.length();
        int HPspaceToAdd = 58 - length;
        for (int i = 0; i < HPspaceToAdd; i++){
            SheetHP += " ";
        }
    }

    public static void setStrength(){
        SheetStrength = Integer.toString(Character.Strength);
        String STRAsString = String.valueOf(SheetStrength);
        int length = STRAsString.length();
        int STRSpaceToAdd = (7 - length)/2;
        for (int i = 0; i < STRSpaceToAdd; i++){
            SheetStrength += " ";
        }
        SheetModifStrength = Integer.toString(Character.ModifierStrength);
        String ModSTRAsString = String.valueOf(SheetModifStrength);
        int Modlength = ModSTRAsString.length();
        int ModSTRSpaceToAdd = (7 - Modlength)/2;
        for (int i = 0; i < ModSTRSpaceToAdd; i++){
            SheetModifStrength += " ";
        }
    }

    public static void setDexterity(){
        SheetDexterity = Integer.toString(Character.Dexterity);
        String DEXAsString = String.valueOf(SheetDexterity);
        int length = DEXAsString.length();
        int DEXSpaceToAdd = (7 - length)/2;
        for (int i = 0; i < DEXSpaceToAdd; i++){
            SheetDexterity += " ";
        }
        SheetModifDexterity = Integer.toString(Character.ModifierDexterity);
        String ModDEXAsString = String.valueOf(SheetModifDexterity);
        int Modlength = ModDEXAsString.length();
        int ModDEXSpaceToAdd = (7 - Modlength)/2;
        for (int i = 0; i < ModDEXSpaceToAdd; i++){
            SheetModifDexterity += " ";
        }
    }
    
    public static void setConstitution(){
        SheetConstitution = Integer.toString(Character.Constitution);
        String CONAsString = String.valueOf(SheetConstitution);
        int length = CONAsString.length();
        int CONSpaceToAdd = (7 - length)/2;
        for (int i = 0; i < CONSpaceToAdd; i++){
            SheetConstitution += " ";
        }
        SheetModifConstitution = Integer.toString(Character.ModifierConstitution);
        String ModCONAsString = String.valueOf(SheetModifConstitution);
        int Modlength = ModCONAsString.length();
        int ModCONSpaceToAdd = (7 - Modlength)/2;
        for (int i = 0; i < ModCONSpaceToAdd; i++){
            SheetModifConstitution += " ";
        }
    }

    public static void setIntelligence(){
        SheetIntelligence = Integer.toString(Character.Intelligence);
        String INTAsString = String.valueOf(SheetIntelligence);
        int length = INTAsString.length();
        int INTSpaceToAdd = (7 - length)/2;
        for (int i = 0; i < INTSpaceToAdd; i++){
            SheetIntelligence += " ";
        }
        SheetModifIntelligence = Integer.toString(Character.ModifierIntelligence);
        String ModINTAsString = String.valueOf(SheetModifIntelligence);
        int Modlength = ModINTAsString.length();
        int ModINTSpaceToAdd = (7 - Modlength)/2;
        for (int i = 0; i < ModINTSpaceToAdd; i++){
            SheetModifIntelligence += " ";
        }
    }

    public static void setWisdom(){
        SheetWisdom = Integer.toString(Character.Wisdom);
        String WISAsString = String.valueOf(SheetWisdom);
        int length = WISAsString.length();
        int WISSpaceToAdd = (7 - length)/2;
        for (int i = 0; i < WISSpaceToAdd; i++){
            SheetWisdom += " ";
        }
        SheetModifWisdom = Integer.toString(Character.ModifierWisdom);
        String ModWISAsString = String.valueOf(SheetModifWisdom);
        int Modlength = ModWISAsString.length();
        int ModWISSpaceToAdd = (7 - Modlength)/2;
        for (int i = 0; i < ModWISSpaceToAdd; i++){
            SheetModifWisdom += " ";
        }
    }

    public static void setCharisma(){
        SheetCharisma = Integer.toString(Character.Charisma);
        String CHAAsString = String.valueOf(SheetCharisma);
        int length = CHAAsString.length();
        int CHASpaceToAdd = (7 - length)/2;
        for (int i = 0; i < CHASpaceToAdd; i++){
            SheetCharisma += " ";
        }
        SheetModifCharisma = Integer.toString(Character.ModifierCharisma);
        String ModCHAAsString = String.valueOf(SheetModifCharisma);
        int Modlength = ModCHAAsString.length();
        int ModCHASpaceToAdd = (7 - Modlength)/2;
        for (int i = 0; i < ModCHASpaceToAdd; i++){
            SheetModifCharisma += " ";
        }
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
                "|                                                                             |\n" + //
                "|  Equipment:                                                                 |\n" + //
                "|  - Main Weapon:                                                             |\n" + //
                "|  - Secondary Weapon:                                                        |\n" + //
                "|  - Armor:                                                                   |\n" + //
                "|  - Magic Items:                                                             |\n" + //
                "|  - Currency:                                                                |\n" + //
                "|                                                                             |\n" + //
                "|  Character Background:                                                      |\n" + //
                "|_____________________________________________________________________________|");
    }
}
