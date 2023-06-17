package calcapp.main;
import calcapp.logics.ClacLogic;

public class Calc {
      public static void main(String[] args) {
        int a = 10; int b = 2;
        int total = CalcLogics.tasu(a, b); //FDCQでなくてもエラーにならない
        int delta = calcapp.logics.CalcLogics.hiku(a, b); //FDCQを指定しなくてもよい
        System.out.println("足すと" + total + "引くと" + delta);
    }
}
/*  jvm起動時はこのファイルで起動する
    コード6-5 クラスをパッケージに所属させる。(package.main)
    コード6-8 import パッケージ名.クラス名 文の追加 (import calcapp.logics.ClacLogic;)



*/