package clacapp.logics;


public class Calc {
      public static void main(String[] args) {
        int a = 10; int b = 2;
        int total = CalcLogic.tasu(a, b); //FDCQでなくてもエラーにならない
        int delta = CalcLogic.hiku(a, b); //FDCQを指定しなくてもよい
        System.out.println("足すと" + total + "引くと" + delta);
    }
}
/*  jvm起動時はこのファイルで起動する
    コード6-5 クラスをパッケージに所属させる。(package.main)
  

*/