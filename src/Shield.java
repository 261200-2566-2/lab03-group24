public class Shield {
    private int shield_level;
    private int baseShield;

    private double shielddefense;

    public Shield(int _level , int _baseShield){
        this.shield_level = _level;
        this.baseShield = _baseShield;
        setShielddefense();
    }
    private void setShielddefense(){
        shielddefense = baseShield*(1+(0.05*shield_level));

    }
    public void UpgradeSword(){
        shield_level += 1 ;
        setShielddefense();
    }

}
