public class Main {
 public static void main(String[] args) {
    System.out.println("数当てゲーム");
    int ans = new java.util.Random().nextInt(9) + 1;
    for (int i = 0; i < 5; i++) {
        System.out.println("0~9の数字を入力してください");
        int num = new java.util.Scanner(System.in).nextInt();
        if (ans == num){
            System.out.println("当たり!");
            break;
        } else {
            System.out.println("はずれ");
        }
    }
   System.out.println("ゲームを終了します。");
 } 
}