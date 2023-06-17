public class Main {
    public static void main(String[] args) {
        String address = "outlook.jp";
        String text = "aaaaaaaaaaaaaaaaaaaaaaaaa";
        email(address, text);
    }
    public static void email(String address, String text) {
        System.out.println(address + "以下のアドレスにメールを送信しました。");
        System.out.println("件名:無題");
        System.out.println("本文:" + text);
    }
    
}