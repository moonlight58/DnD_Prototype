public class DnDClass{
    public static String[] HolderClass = new String[] {"Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"};

    public static void setClassCharacteristic(){
        switch(Character.CharDnDclass) {
            case "Barbarian":
                Character.HitPoint = 12;
                Character.Strength = 16;
                Character.Dexterity = 14;
                Character.Constitution = 15;
                Character.Intelligence = 8;
                Character.Wisdom = 10;
                Character.Charisma = 12;
                Character.CharWeapon = "GreatAxe"; //1d12 slashing
                Character.CharDiceDMG = "1d12";
                break;
            case "Bard":
                Character.HitPoint = 8;
                Character.Strength = 10;
                Character.Dexterity = 14;
                Character.Constitution = 13;
                Character.Intelligence = 12;
                Character.Wisdom = 13;
                Character.Charisma = 16;
                Character.CharWeapon = "Rapier"; // 1d8 piercing
                Character.CharDiceDMG = "1d8";
                break;
            case "Cleric":
                Character.HitPoint = 8;
                Character.Strength = 13;
                Character.Dexterity = 13;
                Character.Constitution = 14;
                Character.Intelligence = 10;
                Character.Wisdom = 16;
                Character.Charisma = 12;
                Character.CharWeapon = "Warhammer"; //1d8 bludgeoning
                Character.CharDiceDMG = "1d8";
                break;
            case "Druid":
                Character.HitPoint = 8;
                Character.Strength = 10;
                Character.Dexterity = 15;
                Character.Constitution = 14;
                Character.Intelligence = 12;
                Character.Wisdom = 16;
                Character.Charisma = 10;
                Character.CharWeapon = "Scimitar"; //1d6 slashing
                Character.CharDiceDMG = "1d6";
                break;
            case "Fighter":
                Character.HitPoint = 10;
                Character.Strength = 13;
                Character.Dexterity = 16;
                Character.Constitution = 16;
                Character.Intelligence = 12;
                Character.Wisdom = 12;
                Character.Charisma = 10;
                Character.CharWeapon = "Glaive"; //1d10 slashing
                Character.CharDiceDMG = "1d10";
                break;
            case "Monk":
                Character.HitPoint = 8;
                Character.Strength = 10;
                Character.Dexterity = 16;
                Character.Constitution = 13;
                Character.Intelligence = 12;
                Character.Wisdom = 16;
                Character.Charisma = 8;
                Character.CharWeapon = "Shortsword"; //1d6 piercing
                Character.CharDiceDMG = "1d6";
                break;
            case "Paladin":
                Character.HitPoint = 10;
                Character.Strength = 16;
                Character.Dexterity = 8;
                Character.Constitution = 16;
                Character.Intelligence = 10;
                Character.Wisdom = 13;
                Character.Charisma = 14;
                Character.CharWeapon = "Maul"; //2d6 bludgeoning
                Character.CharDiceDMG = "2d6";
                break;
            case "Ranger":
                Character.HitPoint = 10;
                Character.Strength = 10;
                Character.Dexterity = 16;
                Character.Constitution = 15;
                Character.Intelligence = 13;
                Character.Wisdom = 15;
                Character.Charisma = 10;
                Character.CharWeapon = "Shortsword"; //1d6 piercing
                Character.CharDiceDMG = "1d6";
                break;
            case "Rogue":
                Character.HitPoint = 8;
                Character.Strength = 10;
                Character.Dexterity = 16;
                Character.Constitution = 12;
                Character.Intelligence = 10;
                Character.Wisdom = 14;
                Character.Charisma = 15;
                Character.CharWeapon = "Rapier"; //1d8 piercing
                Character.CharDiceDMG = "1d8";
                break;
            case "Sorcerer":
                Character.HitPoint = 6;
                Character.Strength = 8;
                Character.Dexterity = 14;
                Character.Constitution = 16;
                Character.Intelligence = 10;
                Character.Wisdom = 12;
                Character.Charisma = 16;
                Character.CharWeapon = "Greatclub"; //1d8 bludgeoning
                Character.CharDiceDMG = "1d8";
                break;
            case "Warlock":
                Character.HitPoint = 8;
                Character.Strength = 8;
                Character.Dexterity = 14;
                Character.Constitution = 14;
                Character.Intelligence = 10;
                Character.Wisdom = 13;
                Character.Charisma = 16;
                Character.CharWeapon = "Handaxe"; //1d6 slashing
                Character.CharDiceDMG = "1d6";
                break;
            case "Wizard":
                Character.HitPoint = 6;
                Character.Strength = 8;
                Character.Dexterity = 14;
                Character.Constitution = 14;
                Character.Intelligence = 16;
                Character.Wisdom = 14;
                Character.Charisma = 10;
                Character.CharWeapon = "Quarterstaff"; //1d6 bludgeoning or 1d8bludgeoning (2 hands)
                Character.CharDiceDMG = "1d8";
                break;
            default:
                System.out.println("HUH???!!! A class? nuh uh!");
        }
        
    }

    public static void setModifier(){
        Character.ModifierStrength = (Character.Strength/2)-5;
        Character.ModifierDexterity = (Character.Dexterity/2)-5;
        Character.ModifierConstitution = (Character.Constitution/2)-5;
        Character.ModifierWisdom = (Character.Wisdom/2)-5;
        Character.ModifierIntelligence= (Character.Intelligence/2)-5;
        Character.ModifierCharisma = (Character.Charisma/2)-5;
    }

    public static void setHPModifier(){
        Character.HitPoint += Character.ModifierConstitution;
    }
}