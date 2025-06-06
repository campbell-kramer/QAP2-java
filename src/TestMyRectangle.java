public class TestMyRectangle {
    public static void main(String[] args) {

        // point1 is top-left of point2
        MyRectangle rectangle1 = new MyRectangle(new MyPoint(1,9), new MyPoint(9,1));
        System.out.println("\ntest when point1 is top-left of point2:");
        System.out.println(rectangle1);

        // point1 is top-right of point2
        MyRectangle rectangle2  = new MyRectangle(new MyPoint(9,9), new MyPoint(1,1));
        System.out.println("\ntest when point1 is top-right of point2:");
        System.out.println(rectangle2);

        // point1 is bottom-right of point2
        MyRectangle rectangle3  = new MyRectangle(new MyPoint(9,1), new MyPoint(1,9));
        System.out.println("\ntest when point1 is bottom-right of point2:");
        System.out.println(rectangle3);

        // point1 is bottom-left of point2
        MyRectangle rectangle4  = new MyRectangle(new MyPoint(1,1), new MyPoint(9,9));
        System.out.println("\ntest when point1 is bottom-left of point2:");
        System.out.println(rectangle4);

        // point1 is at the same coordinates as point2
        MyRectangle rectangle5  = new MyRectangle(new MyPoint(8,8), new MyPoint(8,8));
        System.out.println("\ntest when point1 is at the same coordinates as point2:");
        System.out.println(rectangle5);

    }
}
