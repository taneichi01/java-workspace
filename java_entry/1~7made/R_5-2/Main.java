
public class Main {
    public static void main(String[] args) {
        String title = "たいとる";
        String address = "outlook.jp";
        String text = "本文";
        email(title, address, text);
    }
    public static void email(String title, String address, String text) {

    
        System.out.println(address + "に、以下のメールアドレスを送信しました");
            System.out.println("本文:" +text);
            System.out.println("件名:" + title);

    }
}
