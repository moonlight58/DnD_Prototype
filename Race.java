import java.util.Scanner;

public class Race{
    public static Scanner scanner = new Scanner(System.in);
    public static String[] HolderRace = new String[] {"Dwarf","Elf","Halfling","Human","Dragonborn","Gnome","Half-Elf","Half-Orc","Tiefling"};
    public static boolean RaceExit = false;
    public static boolean InfosExit = false;

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
                break;
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
            case "Half-Elf":
                Character.Charisma += 2;
                Character.Wisdom += 1;
                Character.Strength += 1;
                break;
            case "Half-Orc":
                Character.Strength += 2;
                Character.Constitution += 1;
                break;
            case "Tiefling":
                Character.Intelligence += 1;
                Character.Charisma += 2;
                break;
            default:
                break;
        }
    }
    


    public static void InfoRace(){
        InfosExit = false;
        while (!InfosExit) {
            Main.ScreenClean();
            System.out.println("Informations about the races\n");
            for (int i = 0; i < HolderRace.length; i++){
                System.out.println("["+(i+1)+"] "+HolderRace[i]);
            }
            System.out.println("\nInsert the number corresponding to the race, it will provide you information about the race :");
            
            String input = scanner.next();
            
            try {
                int i = Integer.parseInt(input);
                if (i >= 1 && i <= HolderRace.length) {
                    Information(HolderRace[i-1]);
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and " + HolderRace.length + ".");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }
            
            System.out.println("Do you want to choose a race? (yes/no)");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("yes")) {
                InfosExit = true;
                break;
            } else if (choice.equalsIgnoreCase("no")) {
            } else {
                System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
            }
        }
    }
    
    
    

    public static void Information(String Race){
        switch(Race){
            case "Dwarf":
                System.out.println("\n"+ Race +" : \nKingdoms rich in ancient grandeur, halls carved into the roots of mountains,\nthe echoing of picks and hammers in deep mines and blazing forges,\na commitment to clan and tradition, and a burning hatred of goblins\nand orcs—these common threads unite all dwarves.\n\nAbility Score Increase. Your Wisdom score increases by 1.\n" + //
                        "\n" + //
                        "Dwarven Toughness. Your hit point maximum increases by 1, and it increases by 1 every time you gain a level.\n");
                break;
            case "Elf":
                System.out.println("\n"+ Race + " : \nElves are a magical people of otherworldly grace, living in the world\nbut not entirely part of it. They live in places of ethereal beauty, in\nthe midst of ancient forests or in silvery spires glittering with faerie\nlight, where soft music drifts through the air and gentle fragrances\nwaft on the breeze. Elves love nature and magic, art and artistry,\nmusic and poetry, and the good things of the world.\n" + //
                "\n" + //
                "Ability Score Increase. Your Dexterity score increases by 2.\n" + //
                "\t\t\tYour Intelligence score increases by 1.\n");
                break;
            case "Halfling":
                System.out.println("\n" + Race + " : \nThe comforts of home are the goals of most halflings’ lives: a place to\nsettle in peace and quiet, far from marauding monsters and clashing\narmies; a blazing fire and a generous meal; fine drink and fine conversation.\nThough some halflings live out their days in remote agricultural communities,\nothers form nomadic bands that travelconstantly, lured by the open road\nand the wide horizon to discover the wonders of new lands and peoples.\nButeven these wanderers love peace, food, hearth, and home, though\nhome might be a wagon jostling along an dirt road or a raft floating\ndownriver.\n" + //
                "\n" + //
                "Ability Score Increase. Your Dexterity score increases by 2.\n" + //
                "\t\t\tYour Constitution score increases by 1.\n");
                break;
            case "Human":
                System.out.println("\n" + Race + " : \nIn the reckonings of most worlds, humans are the youngest of the common races, late to arrive\non the world scene and short-lived in comparison to dwarves, elves, and dragons. Perhaps it is\nbecause of their shorter lives that they strive to achieve as much as they can in the years\nthey are given. Or maybe they feel they have something to prove to the elder races, and that’s\nwhy they build their mighty empires on the foundation of conquest and trade. Whatever drives\nthem, humans are the innovators, the achievers, and the pioneers of the worlds.\n" + //
                "\n" + //
                "Ability Score Increase. Your ability scores each increase by 1.\n");
                break;
            case "Dragonborn":
                System.out.println("\n" + Race + " : \nBorn of dragons, as their name proclaims, the dragonborn walk proudly\nthrough a world that greets them with fearful incomprehension.\nShaped by draconic gods or the dragons themselves, dragonborn\noriginally hatched from dragon eggs as a unique race, combining the best attributes of dragons and humanoids. Some dragonborn are\nfaithful servants to true dragons, others form the ranks of soldiers in\ngreat wars, and still others find themselves adrift, with no clear calling\nin life.\n" + //
                "\n" + //
                "Ability Score Increase. Your Strength score increases by 2,\n\t\t\tYour Charisma score increases by 1.\n");
                break;
            case "Gnome":
                System.out.println("\n" + Race + " : \nA constant hum of busy activity pervades the warrens and\nneighborhoods where gnomes form their close-knit communities.\nLouder sounds punctuate the hum: a crunch of grinding gears here, a\nminor explosion there, a yelp of surprise or triumph, and especially\nbursts of laughter. Gnomes take delight in life, enjoying every\nmoment of invention, exploration, investigation, creation, and play.\n" + //
                "\n" + //
                "Ability Score Increase. Your Intelligence score increases by 2.\n\t\t\tYour Constitution score increases by 1.\n");
                break;
            case "Half-Elf":
                System.out.println("\n" + Race + " : \nWalking in two worlds but truly belonging to neither, half-elves combine\nwhat some say are the best qualities of their elf and human parents:\nhuman curiosity, inventiveness, and ambition tempered by the refined\nsenses, love of nature, and artistic tastes of the elves. Some half-elves live\namong humans, set apart by their emotional and physical differences,\nwatching friends and loved ones age while time barely touches them.\nOthers live with the elves, growing restless as they reach adulthood in the\ntimeless elven realms, while their peers continue to live as children. Many\nhalf-elves, unable to fit into either society, choose lives of solitary\nwandering or join with other misfits and outcasts in the adventuring life.;\n" + //
                "\n" + //
                "Ability Score Increase. Your Charisma score increases by 2,\n\t\t\tand two other ability scores of your choice increase by 1.(WIS/STR)\n");
                break;
            case "Half-Orc":
                System.out.println("\n" + Race + " : \nWhether united under the leadership of a mighty warlock or having\nfought to a standstill after years of conflict, orc and human tribes\nsometimes form alliances, joining forces into a larger horde to the terror\nof civilized lands nearby. When these alliances are sealed by marriages,\nhalf-orcs are born. Some half-orcs rise to become proud chiefs of orc\ntribes, their human blood giving them an edge over their full-blooded orc\nrivals. Some venture into the world to prove their worth among humans\nand other more civilized races. Many of these become adventurers,\nachieving greatness for their mighty deeds and notoriety for their\nbarbaric customs and savage fury.\n" + //
                "\n" + //
                "Ability Score Increase. Your Strength score increases by 2,\n\t\t\tand your Constitution score increases by 1.\n");
                break;
            case "Tiefling":
                System.out.println("\n" + Race + " : \nTo be greeted with stares and whispers, to suffer violence and insult on the street, to see\nmistrust and fear in every eye: this is the lot of the tiefling. And to twist the knife,\ntieflings know that this is because a pact struck generations ago infused the essence of\nAsmodeus—overlord of the Nine Hells—into their bloodline. Their appearance and their\nnature are not their fault but the result of an ancient sin, for which they and their\nchildren and their children’s children will always be held accountable.\n" + //
                "\n" + //
                "Ability Score Increase. Your Intelligence score increases by 1,\n\t\t\tand your Charisma score increases by 2.\n");
                break;
            default:
                System.err.println("Error! Unknown character race!");
                break;
        }
    }
}