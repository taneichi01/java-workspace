public class Calc {
  public static void main(String[] args) {
        int a = 10; int b = 2;
        int total = CalcLogic.tasu(a, b);
        int delta = CalcLogic.hiku(a, b);
        System.out.println("足すと" + total + "引くと" + delta);
    }
}
// コード6-3　ソースファイルの分割
// コード6-4修正箇所
// int total = CalcLogic.tasu(a, b);
// int delta = CalcLogic.hiku(a, b);
// jvm起動時はこのファイルで起動する
