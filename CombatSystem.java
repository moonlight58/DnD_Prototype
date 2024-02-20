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

    public static void Attack(Enemy enemy){
        int Hit = D20();
        if (Hit >= enemy.EnemyCA){
            System.out.println("You hit the " + enemy.EnemyName + " for " + player.CharDMG + " damage!");
            enemy.EnemyHitPoint -= player.CharDMG;
        }
    }

    public static void Flee(){
        int Flee = D20();
    }

    public static void Combat(){
        CombatExit = false;
        enemy = new Enemy();
        enemy.setID();
        System.out.println("You are against a/an" + enemy);
        Scanner scanner = new Scanner(System.in);
        while(!CombatExit){
            Sheet.CombatSheet();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Attack(enemy);
                    break;
                case 2:
                    System.out.println("Didn't do the Inventory, check for later update");
                default:
                    System.out.println("Invalid Choice! Try Again.");
                    break;
            }

        }
        scanner.close();
    }

}