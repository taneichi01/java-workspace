public class Main {
    public static void main(String[] args) {
        // 1.勇者よ、この仮想世界に生まれよ！
        Hero h = new Hero();
        // 2.フィールド初期値セット
        h.name = "ミナト";
        h.hp = 100;
        System.out.println("勇者" + h.name + "生み出した!");
        // 勇者のメソッドを生み出してゆく
        h.sit(5);
        h.slip();
        h.sit(25);
        h.run();

        // お化けキノコよ、この仮想世界に生まれよ！
        // 勇者よ、戦うのだ
        // お化けキノコよ、逃げるのだ
    }
}