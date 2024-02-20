public class Race{
    public static String[] HolderRace = new String[] {"Dwarf","Elf","Halfling","Human","Dragonborn","Gnome","Half-elf","Half-orc","Tiefling"};

    public static void setRacialCharacteristic(){
        switch (Character.CharRace) {
            case "Dwarf":
                Character.Wisdom += 1;
                Character.HitPoint += 1;
                break;
            case "Elf":
                Character.Dexterity += 2;
                Character.Intelligence += 1;
                break;
            case "Halfling":
                Character.Dexterity += 2;
                Character.Constitution += 1;
            case "Human":
                Character.Strength += 1;
                Character.Dexterity += 1;
                Character.Constitution += 1;
                Character.Intelligence += 1;
                Character.Wisdom += 1;
                Character.Charisma += 1;
                break;
            case "Dragonborn":
                Character.Strength += 2;
                Character.Charisma += 1;
                break;
            case "Gnome":
                Character.Constitution += 1;
                Character.Intelligence += 2;
                break;
            case "Half-elf":
                Character.Charisma += 2;
                Character.Wisdom += 1;
                Character.Strength += 1;
                break;
            case "Half-orc":
                Character.Strength += 2;
                Character.Constitution += 1;
                break;
            case "Tiefling":
                Character.Intelligence += 1;
                Character.Charisma += 2;
            default:
                break;
        }
    }
}