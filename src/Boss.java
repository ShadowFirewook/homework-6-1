public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public Boss(int HP,int DMG){
        super();
        this.HP = HP;
        this.DMG = DMG;
    }
}
