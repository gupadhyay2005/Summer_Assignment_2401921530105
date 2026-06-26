class Point {

    int x;
    int y;

    void setPoint(int a, int b) {
        x = a;
        y = b;
    }

    void showPoint() {
        System.out.println("Point = (" + x + ", " + y + ")");
    }
}

public class Main {
    public static void main(String[] args) {

        Point p = new Point();

        p.setPoint(10, 20);
        p.showPoint();
    }
}
