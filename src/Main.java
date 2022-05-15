public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(1000,65);
        System.out.println("Здоровье: " + boss.getHP() + " Урон: "+ boss.getDMG());
    }
}
