import java.util.Arrays;

public class TestMyLine {
    public static void main(String[] args) {
        // create point objects
        MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint(8, 9);
        MyPoint point3 = new MyPoint(3, 4);
        MyPoint point4 = new MyPoint(10, 11);

        // create line objects
        System.out.println("\nTEST LINE CREATION");
        MyLine line1 = new MyLine(point1, point2);
        MyLine line2 = new MyLine(7, 8, 14, 15);
        System.out.println("line1:  " + line1);
        System.out.println("line2:  " + line2);

        // test get methods ---------------------------------------
        System.out.println("\nTESTING GET METHODS");
        System.out.println("line1 getBeginX:  " + line1.getBeginX());
        System.out.println("line1 getBeginY:  " + line1.getBeginY());
        System.out.println("line1 getEndX:  " + line1.getEndX());
        System.out.println("line1 getEndY:  " + line1.getEndY());
        System.out.println("line1 getBeginXY:  " + Arrays.toString(line1.getBeginXY()));
        System.out.println("line1 getEndXY:  " + Arrays.toString(line1.getEndXY()));
        System.out.println("line1 begin:  " + line1.getBegin());
        System.out.println("line1 end:  " + line1.getEnd());

        // test set methods ---------------------------------------
        System.out.println("\nTESTING SET METHODS");
        // test setBegin() and setEnd() methods
        line1.setBegin(point3);
        line1.setEnd(point4);
        System.out.println("after setBegin/setBegin:  " + line1);

        // test setBeginX/setBeginY/setEndX/setEndY
        line1.setBeginX(5);
        line1.setBeginY(6);
        line1.setEndX(12);
        line1.setEndY(13);
        System.out.println("after setBeginX/setBeginY/setEndX/setEndY:  " + line1);

        // test setBeginXY and setEndXY
        line1.setBeginXY(16, 17);
        line1.setEndXY(30, 31);
        System.out.println("after setBeginXY/setEndXY:  " + line1);

        // test length and gradient
        System.out.println("\nTEST LENGTH AND GRADIENT METHODS");
        System.out.println("length:  " + line1.getLength());
        System.out.println("gradient (rads):  " + line1.getGradient());
    }
}