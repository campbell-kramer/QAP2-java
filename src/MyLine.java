public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    // construct line with 4 coordinates
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    // construct line with 2 MyPoint objects
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // get beginning of line
    public MyPoint getBegin() {
        return begin;
    }

    // set beginning of line
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    // get end of line
    public MyPoint getEnd() {
        return end;
    }

    // set end of line
    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // get X value of beginning of line
    public int getBeginX() {
        return begin.getX();
    }

    // set X value of beginning of line
    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    // get Y value of beginning of line
    public int getBeginY() {
        return begin.getY();
    }

    // set Y value of beginning of line
    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    // get X value of end of line
    public int getEndX() {
        return end.getX();
    }

    // set X value of end of line
    public void setEndX(int x) {
        this.end.setX(x);
    }

    // get Y value of end of line
    public int getEndY() {
        return end.getY();
    }

    // get Y value of end of line
    public void setEndY(int y) {
        this.end.setY(y);
    }

    // get X and Y values of beginning of line
    public int[] getBeginXY() {
        return new int[]{begin.getX(), begin.getY()};
    }

    // set X and Y values of beginning of line
    public void setBeginXY(int x, int y) {
        this.begin.setXY(x, y);
    }

    // get X and Y values of end of line
    public int[] getEndXY() {
        return new int[]{end.getX(), end.getY()};
    }

    // set X and Y values of end of line
    public void setEndXY(int x, int y) {
        this.end.setXY(x, y);
    }

    // get length of line
    public double getLength() {
        return begin.distance(this.end);
    }

    // get gradient/angle of line relative to x-axis
    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }

    public String toString() {
        return ("MyLine[begin=" + begin + ",end=" + end + "]");
    }


}
