public class Main2 {//仮想世界に勇者とお化けキノコを2引き生み出す
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "ミナト";
        h.hp = 100;

        Matango ml = new Matango();
        ml.hp = 50;
        ml.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';

        //冒険の始まり
        h.slip();
        ml.run();
        m2.run();
        h.run();
    }
}
