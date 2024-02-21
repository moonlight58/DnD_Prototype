import java.util.Random;

public class Enemy {
    public static int EnemyHitPoint;
    public static int EnemyCA;
    public static int EnemySpeed;
    public static String EnemyName;
    public static String EnemyWeapon;
    public static int EnemyDMG;
    public static int EnemyID;

    static String EnemyNameHolder[] = new String[] {"Centaur", "Dragon", "Ghost", "Gnoll", "Goblin", "Flesh Golem", "Hobgoblin", "Imp", "Kobold", "Ogre", "Skeleton", "Zombie"};

    public static int setRandomMobNumber(){
        Random random = new Random();
        int min = 0;
        int max = 11;
        int range = max - min + 1;
        int MobIdNumber = random.nextInt(range) + min;
        return MobIdNumber;
    }

    public void setDataMob(){
        switch (EnemyName){
            case "Centaur":
                EnemyID = 0;
                EnemyHitPoint = 45;
                EnemyCA = 12;
                EnemyWeapon = "Pike";
                EnemyDMG = 9; //(1D10 + 4) piercing damage.
                break;
            case "Dragon":
                EnemyID = 1;
                EnemyHitPoint = 256;
                EnemyCA = 19;
                EnemyWeapon = "Claw";
                EnemyDMG =  15; //(2d6 + 8) slashing damage.
                break;
            case "Ghost":
                EnemyID = 2;
                EnemyHitPoint = 45;
                EnemyCA = 11;
                EnemyWeapon = "Withering Touch";
                EnemyDMG = 17; //(4d6 + 3) necrotic damage.
                break;
            case "Gnoll":
                EnemyID = 3;
                EnemyHitPoint = 22;
                EnemyCA = 15;
                EnemyWeapon = "Spear";
                EnemyDMG = 5; //(1d6 + 2) piercing damage
                break;
            case "Goblin":
                EnemyID = 4;
                EnemyHitPoint = 7;
                EnemyCA = 15;
                EnemyWeapon = "Scimitar";
                EnemyDMG = 5; //(1d6 + 2) slashing damage.
                break;
            case " Flesh Golem":
                EnemyID = 5;
                EnemyHitPoint = 93;
                EnemyCA = 9;
                EnemyWeapon = "Slam";
                EnemyDMG = 13; //(2d8 + 4) bludgeoning damage.
                break;
            case "Hobgoblin":
                EnemyID = 6;
                EnemyHitPoint = 11;
                EnemyCA = 18;
                EnemyWeapon = "Longsword";
                EnemyDMG = 5; //(1d8 + 1) piercing damage.
                break;
            case "Imp":
                EnemyID = 7;
                EnemyHitPoint = 10;
                EnemyCA = 13;
                EnemyWeapon = "Sting";
                EnemyDMG = 5; //(1d4 + 3) piercing damage
                break;
            case "Kobold":
                EnemyID = 8;
                EnemyHitPoint = 5;
                EnemyCA = 12;
                EnemyWeapon = "Dagger";
                EnemyDMG = 4; //(1d4 + 2) piercing damage.
                break;
            case "Ogre":
                EnemyID = 9;
                EnemyHitPoint = 59;
                EnemyCA = 11;
                EnemyWeapon = "Greatclub";
                EnemyDMG = 13; //(2d8 + 4) bludgeoning damage.
                break;
            case "Skeleton":
                EnemyID = 10;
                EnemyHitPoint = 13;
                EnemyCA = 13;
                EnemyWeapon = "Shortsword";
                EnemyDMG = 5; //(1d6 + 2) piercing damage.
                break;
            case "Zombie":
                EnemyID = 11;
                EnemyHitPoint = 22;
                EnemyCA = 8;
                EnemyWeapon = "Slam";
                EnemyDMG = 4; //(1d6 + 1) bludgeoning damage.
                break;
        }
    }

    public String setID(){
        EnemyName = EnemyNameHolder[setRandomMobNumber()];
        return EnemyName;
    }
}