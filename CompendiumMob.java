import java.util.Scanner;
public class CompendiumMob{

    static boolean CompendiumExit = false;

    public static void Compendium(Scanner scanner) {
        for (int i = 0; i < Enemy.EnemyNameHolder.length; i++) {
            System.out.println("[" + (i + 1) + "] " + Enemy.EnemyNameHolder[i]);
            Main.Wait(50);
        }
        System.out.println("[" + (Enemy.EnemyNameHolder.length + 1) +"] Get out of the compendium");
        Main.Wait(500);
        System.out.println("\nVeuillez insérer le numéro associé au monstre du compendium :");
        int token = scanner.nextInt();
        AfficherMobCompendium(token - 1, scanner);
    }
    
    public static void AfficherMobCompendium(int MobCompendium, Scanner scanner) {
        if (MobCompendium < Enemy.EnemyNameHolder.length && MobCompendium >= 0){
            System.out.println("[" + (MobCompendium + 1) + "] " + Enemy.EnemyNameHolder[MobCompendium]+"\n");
        } else if (MobCompendium == Enemy.EnemyNameHolder.length){
            System.out.print("Exiting the compendium");
            for (int i = 0; i < 3; i++){
                System.out.print('.');
                Main.Wait(500);
            }
            System.out.println("");
            CompendiumExit = true;
        } else {
            System.out.println("Please enter a valid number within the range.");
            Compendium(scanner);
        }
    }
}