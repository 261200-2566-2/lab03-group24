// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //james charactor
        Character james = new Character("james",100,50);
        Sword excalibur = new Sword("Excalibur",5,11);
        Shield rustyShield = new Shield("Rusty Shield",5,5);

        // tent charactor
        Character tent = new Character("tent",100,60);
        Sword tenchin = new Sword("tenchin",5,11);
        Shield hung = new Shield("hung Shield",5,5);

//test upgradeequipment
//        excalibur.ShowStats();
//        System.out.println("=================================================");
//        excalibur.Upgrade();
//        excalibur.ShowStats();
//        System.out.println("=================================================");
//        hung.ShowStats();
//        System.out.println("=================================================");
//        hung.Upgrade();
//        hung.ShowStats();
//        System.out.println("=================================================");

//test Characterlevelup
//        james.ShowStats();
//        james.LevelUp();
//        james.ShowStats();
//        System.out.println("=================================================");
//        tent.ShowStats();
//        tent.LevelUp();
//        tent.ShowStats();
//        System.out.println("=================================================");



// Test Fight
         james.Equip(excalibur);
         james.Equip(rustyShield);
         james.ShowStats();
         System.out.println("=================================================");
         excalibur.ShowStats();
         rustyShield.ShowStats();
         System.out.println("=================================================");
         tent.Equip(hung);
         tent.Equip(tenchin);
         tent.ShowStats();
         tent.LevelUp();
         System.out.println("=================================================");
         tenchin.ShowStats();
         hung.ShowStats();
         System.out.println("=================================================");

         Character.Fight(james,tent);

         james.ShowStats();
         System.out.println("=================================================");
         tent.ShowStats();
         System.out.println("=================================================");

    }
}