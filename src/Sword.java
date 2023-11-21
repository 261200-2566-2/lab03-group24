public class Sword {
    private int swordLevel;
    private final int baseDamage;
    private int swordDamage;

    public Sword(int level, int baseDamage){
        this.swordLevel = level;
        this.baseDamage = baseDamage;
        setSwordDamage();
    }
    private void setSwordDamage(){
        swordDamage = baseDamage + (swordLevel * 4);
    }


    public void UpgradeSword(){
        swordLevel += 1;
        setSwordDamage();
    }
}
