import java.util.Random;
public class Character {
    private final String name;
    private int level;
    private double maxHp, hp;
    private double maxMana, mana;
    private final double baseSpeed;
    private double speed, maxSpeed;
    private Sword sword;
    private Shield shield;
    public Character(String name, int level, float speed){
        this.name = name;
        this.level = level;
        this.baseSpeed = speed;
        sword = null;
        shield = null;
        UpdateStats();

        hp = maxHp;
        mana = maxMana;
        this.speed = maxSpeed;
    }

    private void UpdateStats(){
        maxHp = 100 + (10 * level);
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
    public void LevelUp(){
        level += 1;
        UpdateStats();
    }
    public void Equip(Sword sword){
        if(this.sword == null){
            this.sword = sword;
            UpdateSpeed();
        }else{
            System.out.println("Need to unequip " + sword.getName() + " first.");
        }
    }
    public void Equip(Shield shield){
        if(this.shield == null){
            this.shield = shield;
            UpdateSpeed();
        }else{
            System.out.println("Need to unequip " + shield.getName() + " first.");
        }
    }
    public void UnequipSword(){
        if(sword != null){
            sword = null;
            UpdateSpeed();
        }else{
            System.out.println("Sword currently unequipped.");
        }
    }
    public void UnequipShield(){
        if(shield != null){
            shield = null;
            UpdateSpeed();
        }else{
            System.out.println("Sword currently unequipped.");
        }
    }
    private void attack(Character enemy){
        // attack enemy
        if(this.sword != null){
            System.out.println(this.name + " Attack " + enemy.name);
            double dmg = enemy.shield != null ? this.sword.getDamage() - enemy.shield.getDefense() : this.sword.getDamage();
            if(enemy.shield != null){
                if(dmg > 0){
                    enemy.takeDamage(dmg);
                }else{
                    System.out.println(enemy.name + " Blocked!! Nothing happen ~");
                }
            }else{
                enemy.takeDamage(dmg);
            }

        }else{
            System.out.println(this.name + " have no sword!! Cannot Attack " + enemy.name);
        }
    }
    private void takeDamage(double damage){
        this.hp -= damage;
        System.out.println(this.name + " took damage " + damage);
    }
    public static void Fight(Character p1,Character p2){
        if(p1.speed > p2.speed){
            p1.attack(p2);
            p2.attack(p1);
        }else if(p1.speed < p2.speed){
            p2.attack(p1);
            p1.attack(p2);
        }else{
            Random random = new Random();
            switch (random.nextInt(0,2)){
                case 0: {
                    p1.attack(p2);
                    p2.attack(p1);
                    break;
                }
                case 1:
                    p2.attack(p1);
                    p1.attack(p2);
                    break;
            }
        }
    }

    //For Test
    public void ShowStats(){
        System.out.println("Name : " + name);
        System.out.println("Level : " + level);
        System.out.println("HP : " + hp + "/" + maxHp);
        System.out.println("Mana : " + mana + "/" + maxMana);
        System.out.println("Speed : " + speed + "/" + maxSpeed);
        System.out.println(sword != null ? "Sword : " + sword.getName() + " Lv." + sword.getLevel() : "Sword : none");
        System.out.println(shield != null ? "Shield : " + shield.getName() + " Lv." + shield.getLevel() : "Shield : none");
    }

}