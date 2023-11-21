// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    //Test
        Character james = new Character(0,50);
        Sword excalibur = new Sword("Excalibur",5,10);
        Shield rustyShield = new Shield("Rusty Shield",5,5);

        james.EquipSword(excalibur);
        //james.EquipShield(rustyShield);

        james.ShowStats();
        System.out.println("====================================");
        excalibur.Upgrade();
        rustyShield.ShowStats();
        System.out.println("====================================");
        excalibur.ShowStats();
        System.out.println("====================================");
        james.ShowStats();
    }
}