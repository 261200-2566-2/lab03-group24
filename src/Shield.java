public class Shield {
    private final String name;
    private int shieldLevel;
    private final double baseDefense;
    private double defense;
    private double speedDecreaseRate;
    private void UpdateSwordStats(){
        defense = baseDefense * (1 + 0.1 * shieldLevel);
        speedDecreaseRate = 0.1 + (0.04 * shieldLevel);
    }

    public Shield(String name, int level, int baseDefense){
        this.name = name;
        this.shieldLevel = level;
        this.baseDefense = baseDefense;
        UpdateSwordStats();
    }

    public void Upgrade(){
        shieldLevel += 1;
        UpdateSwordStats();
    }
    public double getSpeedDecreaseRate(){return speedDecreaseRate;}
    public String getName(){return name;}
    public int getLevel(){return shieldLevel;}

    // For test
    public void ShowStats(){
        System.out.println("Name : " + name);
        System.out.println("Level : " + shieldLevel);
        System.out.println("Defense : " + defense);
    }

}
