public class DnDClass{
    public static String[] HolderClass = new String[] {"Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"};

    public static void setClassCharacteristic(){
        if(Character.CharDnDclass == "Barbarian"){
            Character.HitPoint = 12;
            Character.Strength = 16;
            Character.Dexterity = 14;
            Character.Constitution = 15;
            Character.Intelligence = 8;
            Character.Wisdom = 10;
            Character.Charisma = 12;
        }else if(Character.CharDnDclass == "Bard"){
            Character.HitPoint = 8;
            Character.Strength = 10;
            Character.Dexterity = 14;
            Character.Constitution = 13;
            Character.Intelligence = 12;
            Character.Wisdom = 13;
            Character.Charisma = 16;
        }else if(Character.CharDnDclass == "Cleric"){
            Character.HitPoint = 8;
            Character.Strength = 13;
            Character.Dexterity = 13;
            Character.Constitution = 14;
            Character.Intelligence = 10;
            Character.Wisdom = 16;
            Character.Charisma = 12;
        }else if(Character.CharDnDclass == "Druid"){
            Character.HitPoint = 8;
            Character.Strength = 10;
            Character.Dexterity = 15;
            Character.Constitution = 14;
            Character.Intelligence = 12;
            Character.Wisdom = 16;
            Character.Charisma = 10;
        }else if(Character.CharDnDclass == "Fighter"){
            Character.HitPoint = 10;
            Character.Strength = 13;
            Character.Dexterity = 16;
            Character.Constitution = 16;
            Character.Intelligence = 12;
            Character.Wisdom = 12;
            Character.Charisma = 10;
        }else if(Character.CharDnDclass == "Monk"){
            Character.HitPoint = 8;
            Character.Strength = 10;
            Character.Dexterity = 16;
            Character.Constitution = 13;
            Character.Intelligence = 12;
            Character.Wisdom = 16;
            Character.Charisma = 8;
        }else if(Character.CharDnDclass == "Paladin"){
            Character.HitPoint = 10;
            Character.Strength = 16;
            Character.Dexterity = 8;
            Character.Constitution = 16;
            Character.Intelligence = 10;
            Character.Wisdom = 13;
            Character.Charisma = 14;
        }else if(Character.CharDnDclass == "Ranger"){
            Character.HitPoint = 10;
            Character.Strength = 10;
            Character.Dexterity = 16;
            Character.Constitution = 15;
            Character.Intelligence = 13;
            Character.Wisdom = 15;
            Character.Charisma = 10;
        }else if(Character.CharDnDclass == "Rogue"){
            Character.HitPoint = 8;
            Character.Strength = 10;
            Character.Dexterity = 16;
            Character.Constitution = 12;
            Character.Intelligence = 10;
            Character.Wisdom = 14;
            Character.Charisma = 15;
        }else if(Character.CharDnDclass == "Sorcerer"){
            Character.HitPoint = 6;
            Character.Strength = 8;
            Character.Dexterity = 14;
            Character.Constitution = 16;
            Character.Intelligence = 10;
            Character.Wisdom = 12;
            Character.Charisma = 16;
        }else if(Character.CharDnDclass == "Warlock"){
            Character.HitPoint = 8;
            Character.Strength = 8;
            Character.Dexterity = 14;
            Character.Constitution = 14;
            Character.Intelligence = 10;
            Character.Wisdom = 13;
            Character.Charisma = 16;
        }else if(Character.CharDnDclass == "Wizard"){
            Character.HitPoint = 6;
            Character.Strength = 8;
            Character.Dexterity = 14;
            Character.Constitution = 14;
            Character.Intelligence = 16;
            Character.Wisdom = 14;
            Character.Charisma = 10;
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