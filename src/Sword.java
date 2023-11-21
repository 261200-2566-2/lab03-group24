public class Sword {
    private final String name;
    private int swordLevel;
    private double baseDamage;
    private double damage;
    private double speedDecreaseRate;
    private void UpdateSwordStats(){
        damage = baseDamage * (1 + 0.1 * swordLevel);
        speedDecreaseRate = 0.1 + (0.04 * swordLevel);
    }

    public Sword(String name, int level, int baseDamage){
        this.name = name;
        this.swordLevel = level;
        this.baseDamage = baseDamage;
        UpdateSwordStats();
    }

    public void Upgrade(){
        swordLevel += 1;
        UpdateSwordStats();
    }
    public double getSpeedDecreaseRate(){return speedDecreaseRate;}
    public String getName(){return name;}
    public int getLevel(){return swordLevel;}

    public double getDamage() {
        return damage;
    }

    // For test
    public void ShowStats(){
        System.out.println("Name : " + name);
        System.out.println("Level : " + swordLevel);
        System.out.println("Damage : " + damage);
    }
}
