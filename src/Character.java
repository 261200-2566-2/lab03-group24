public class Character {
    private int level;
    private double maxHP, hp, maxMana, mana;
    private double baseSpeed , speed ,maxSpeed;
    private Sword sword;
    private Shield shield;

    private void UpdateStats(){
        maxHP = 100 + (10 * level);
        maxMana = 50 + (2 * level);
        maxSpeed = baseSpeed * (1 + 0.03 * level);
    }
    private void UpdateSpeed(){
        if(sword == null && shield == null) {
            speed = maxSpeed;
            return;
        }
        if(sword != null) speed *= sword.getSpeedDecreaseRate();
        if(shield != null) speed *= shield.getSpeedDecreaseRate();
    }
    public Character(int level, float speed){
        this.level = level;
        this.baseSpeed = speed;
        sword = null;
        shield = null;
        UpdateStats();

        hp = maxHP;
        mana = maxMana;
        this.speed = maxSpeed;
    }

    public void LevelUp(){
        level += 1;
        UpdateStats();
    }
    public void EquipSword(Sword sword){
        this.sword = sword;
        UpdateSpeed();
    }
    public void UnequipSword(){
        if(sword != null){
            sword = null;
            UpdateSpeed();
        }else{
            System.out.println("Sword currently unequipped.");
        }
    }
    public void EquipShield(Shield shield){
        this.shield = shield;
        UpdateSpeed();
    }

    public void UnequipShield(){
        if(shield != null){
            shield = null;
            UpdateSpeed();
        }else{
            System.out.println("Sword currently unequipped.");
        }
    }

    //For Test
    public void ShowStats(){
        System.out.println("Level : " + level);
        System.out.println("HP : " + hp + "/" + maxHP);
        System.out.println("Mana : " + mana + "/" + maxMana);
        System.out.println("Speed : " + speed + "/" + maxSpeed);
        System.out.println(sword != null ? "Sword : " + sword.getName() + " Lv." + sword.getLevel() : "Sword : none");
        System.out.println(shield != null ? "Shield : " + shield.getName() + " Lv." + shield.getLevel() : "Shield : none");
    }

}
