public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint topRight;
    private MyPoint bottomRight;
    private MyPoint bottomLeft;

    public MyRectangle(MyPoint point1, MyPoint point2) {
        // if point1 is top-left of point2
        if (point1.getX() <= point2.getX() && point1.getY() >= point2.getY()) {
            this.topLeft = point1;
            this.bottomRight = point2;
            this.topRight = new MyPoint(bottomRight.getX(), topLeft.getY());
            this.bottomLeft = new MyPoint(topLeft.getX(), bottomRight.getY());
            // if point1 is top-right of point2
        } else if (point1.getX() >= point2.getX() && point1.getY() >= point2.getY()) {
            this.topRight = point1;
            this.bottomLeft = point2;
            this.topLeft = new MyPoint(bottomLeft.getX(), topRight.getY());
            this.bottomRight = new MyPoint(topRight.getX(), bottomLeft.getY());
            // if point1 is bottom-right of point2
        } else if (point1.getX() >= point2.getX() && point1.getY() <= point2.getY()) {
            this.bottomRight = point1;
            this.topLeft = point2;
            this.topRight = new MyPoint(bottomRight.getX(), topLeft.getY());
            this.bottomLeft = new MyPoint(topLeft.getX(), bottomRight.getY());
            // if point1 is bottom-left of point2
        } else if (point1.getX() <= point2.getX() && point1.getY() <= point2.getY()) {
            this.bottomLeft = point1;
            this.topRight = point2;
            this.bottomRight = new MyPoint(topRight.getX(), bottomLeft.getY());
            this.topLeft = new MyPoint(bottomLeft.getX(), topRight.getY());
        }
    }

    public String toString() {
        return "MyRectangle(" +
                "top-left=" + topLeft +
                ", top-right=" + topRight +
                ", bottom-right=" + bottomRight +
                ", bottom-left=" + bottomLeft +
                '}';
    }
}
