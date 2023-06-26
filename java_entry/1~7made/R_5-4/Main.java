public class Main {
    public static void main(String[] args) {
        double bottom = 4.0;// 三角の底辺の長さ、単位はcm
        double height = 2.0;// 三角の高さ、単位はcm　
        System.out.println("三角の底辺の長さが" + bottom +"cmです。" + "三角の高さは" + height + "cmの場合" + "面積は");
        calcTriangleArea(bottom,height);





        double circleArea = calcCircleArea(5.0);
        System.out.println("円の面積は" + circleArea + "平方cmです");
    }    


    public static void calcTriangleArea(double bottom, double height) {
    System.out.println(bottom * height / 2);
    // 自力
}


public static double calcCircleArea(double sac) {
    double area =(sac * sac * 3.14);
    return area;
    // 回答例
}
}