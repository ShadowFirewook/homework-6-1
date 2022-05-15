public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon("Steel Arms", "Sword");
        Boss boss = new Boss(1000,65 );
        boss.setWeapon(weapon);
        System.out.println("Здоровье: " + boss.getHP() + " Урон: "+ boss.getDMG() + " Тип оружия: " + boss.getWeapon().getWeaponType() +" Оружие: "+ boss.getWeapon().getWeaponName());
    }
}
