public class Main {
 public static void main(String[] args) {
    System.out.println("あなたの運勢を占います");
    int fortune = new java.util.Random().nextInt(5) + 1;
    switch (fortune) {
      case 1:
      case 2:
        System.out.println("いいね!");
        break;
      case 3:
      case 4:
        System.out.println("普通です");
        break;
      case 5:
      case 6:
        System.out.println("うーん");
    } 
 }
    
}
