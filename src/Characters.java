public class Characters {
    private int hp;
    private int level;
    private int mana;
    private String name;

    private void _Characters (String _name , int _hp, int _level , int _mana){
        this.hp = _hp;
        this.level = _level;
        this.mana = _mana;
        this.name = _name;

    }
    public void rename (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
