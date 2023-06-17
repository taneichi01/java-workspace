public class Main {
public static void main(String[] args) {
    System.out.println("ようこそ占いの館へ");
    System.out.println("あなたのお名前を入力してください");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.print("あなたの年齢を入力してください");
    String ageString = new java.util.Scanner(System.in).nextLine();
    int n = Integer.parseInt(ageString);
    int age = n;

    int r = new java.util.Random().nextInt(3);
    int fortune = r;
    fortune++;
    System.out.println("占いの結果が出ました!");
    System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + r + "です!" );
    System.out.println("1:大吉2:中吉3:吉4:凶");    

}    
}
