public class Hero {
    // 属性の定義
    String name; //名前の宣言フィールド
    int hp;//hpの宣言フィールド
    // 操作の定義 
    public void attack() {} 
    public void sleep() { 
        this.hp = 100;
        System.out.println(this.name + "は、眠った!");
    }
    public void sit (int sec) {
        this.hp +=sec; 
        System.out.println
        (this.name + "は、" + sec + "秒座った!");
        System.out.println("HPが" + sec + "ポイント回復した!");
    }
    public void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ" );
        System.out.println("5のダメージ!");
        System.out.println("GAME OVERA");
        System.out.println("最終HPは" + this.hp + "でした");
    }
    public void run() {
        System.out.println(this.name + "は、逃げ出した!");
        System.out.println("GAME OVERA");
        System.out.println("最終HPは" + this.hp + "でした");
    }
}
