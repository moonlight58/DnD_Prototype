import java.util.Random;
import java.util.Scanner;

public class CombatSystem{

    static boolean CombatExit;
    static Enemy enemy;
    static Character player;

    public static int D20(){
        Random random = new Random();
        int min = 1;
        int max = 20;
        int d20 = random.nextInt((max - min) + 1 ) + min;
        return d20;
    }

    public static int D12(){
        Random random = new Random();
        int min = 1;
        int max = 12;
        int d12 = random.nextInt((max - min) + 1 ) + min;
        return d12;            
    }

    public static int D10(){
        Random random = new Random();
        int min = 1;
        int max = 10;
        int d10 = random.nextInt((max - min) + 1 ) + min;
        return d10;            
    }

    public static int D8(){
        Random random = new Random();
        int min = 1;
        int max = 8;
        int d8 = random.nextInt((max - min) + 1 ) + min;
        return d8;            
    }

    public static int D6(){
        Random random = new Random();
        int min = 1;
        int max = 6;
        int d6 = random.nextInt((max - min) + 1 ) + min;
        return d6;            
    }

    public static int D4(){
        Random random = new Random();
        int min = 1;
        int max = 4;
        int d4 = random.nextInt((max - min) + 1 ) + min;
        return d4;            
    }

    public static void AttackEnemy(Enemy enemy, Scanner scanner){
        int D20 = D20();
        System.out.println("You rolled a/an " + D20 + " + " + player.ModifierStrength);
        int Hit = D20 + player.ModifierStrength;
        System.out.println("For a total of " + Hit);
        if (Hit >= enemy.EnemyCA){
            player.CharDMG = player.getDMGClassDnD(player.CharDnDclass);
            if (D20 == 20){
                System.out.println("You've rolled a critical hit! And hit the enemy for " + 2 * player.CharDMG + " damage!");
                enemy.EnemyHitPoint -= 2 * player.CharDMG;
            } else {
                System.out.println("You hit the " + enemy.EnemyName + " for " + player.CharDMG + " damage!");
                enemy.EnemyHitPoint -= player.CharDMG;
            }
        } else {
            System.out.println("You missed the " + enemy.EnemyName);
        }
    }

    public static void AttackPlayer(Character player, Enemy enemy){
        int Hit = D20();
        System.out.println("The " + enemy.EnemyName + " rolled a/an " + Hit);
        if (Hit >= player.CA){
            if (Hit == 20){
                System.out.println("The enemy rolled a nat 20 and deals " + 2 * enemy.EnemyDMG + " damage.");
                player.HitPoint -=  2 * enemy.EnemyDMG;
            } else {
                System.out.println("The " + enemy.EnemyName + " hit you and deals " + enemy.EnemyDMG + " damage.");
            player.HitPoint -= enemy.EnemyDMG;
            }
        } else {
            System.out.println("The " + enemy.EnemyName + " missed you");
        }
    }

    public static void FleePlayer(Enemy enemy){
        int Flee = D20() + player.ModifierStrength;
        int EnemyReaction = D20();
        if (Flee > EnemyReaction){
            System.out.println("You managed to outrun the " + enemy.EnemyName);
            CombatExit = true;
        } else {
            System.out.println("Your enemy is too fast for you to run from them");
        }
    }

    public static void FleeEnemy(Character player){
        int Flee = D20();
        int PlayerReaction = D20();
        if (Flee > PlayerReaction) {
            System.out.println("The " + enemy.EnemyName + " managed to outrun you");
        } else {
            System.out.println("Your enemy couldn't outrun you");
        }
    }

    public static void Combat(Scanner scanner){
        CombatExit = false;
        enemy = new Enemy();
        enemy.setID();
        enemy.setDataMob();
        System.out.println("You are against a/an " + enemy.EnemyName);
        Sheet.setEnemyName();
        while(!CombatExit){
            Sheet.setDataSheet();
            Main.Wait(400);
            Sheet.CombatSheet();
            System.out.print("Choice : ");
            int choice = scanner.nextInt();
            Main.Wait(100);
            switch (choice) {
                case 1:
                    System.out.println("What weapon do you use ?\n[1]" + player.CharWeapon + " (" + player.CharDiceDMG + ")");
                    boolean validChoice = false;
                    while (!validChoice) {
                        choice = scanner.nextInt();
                        Main.Wait(100);
                        switch (choice) {
                            case 1:
                                validChoice = true;
                                AttackEnemy(enemy, scanner);
                                break;
                            default:
                                System.out.println("Invalid choice, Try again!");
                                System.out.print("Choice : ");
                                break;
                        }
                    }
                    Main.Wait(500);
                    if(enemy.EnemyHitPoint <= 0){
                        System.out.println("The " + enemy.EnemyName + " has been defeated!");
                        CombatExit = true;
                    }
                    int EnemyChoice = D4();
                    switch (EnemyChoice) {
                        case 1:
                            AttackPlayer(player, enemy);
                            break;
                        case 2:
                            System.out.println("The " + enemy.EnemyName + " does nothing except looking at you");
                            break;
                        case 3:
                            System.out.println("The " + enemy.EnemyName + " tries to run away from you.");
                            FleeEnemy(player);
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 2:
                    Character.Inventory(scanner);
                    Main.Wait(500);
                    break;
                case 3:
                    CompendiumMob.AfficherMobCompendium(enemy.EnemyID, scanner);
                    break;
                case 4:
                    FleePlayer(enemy);
                    Main.Wait(500);
                    break;
                default:
                    System.out.println("Invalid Choice! Try Again.");
                    Main.Wait(500);
                    break;
            }
        }
    }
    

}