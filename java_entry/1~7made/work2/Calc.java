package calcapp.main;


public class Calc {
      public static void main(String[] args) {
        int a = 10; int b = 2;
        int total = calcapp.logics.CalcLogic.tasu(a, b); //FDCQでなくてもエラーにならない
        int delta = calcapp.logics.CalcLogic.hiku(a, b); //FDCQを指定しなくてもよい
        System.out.println("足すと" + total + "引くと" + delta);
    }
}
