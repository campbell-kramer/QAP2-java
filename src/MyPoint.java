public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return ("(" + this.x + "," + this.y + ")");
    }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return (Math.sqrt((yDiff * yDiff) + (xDiff * xDiff)));
    }

    public double distance(MyPoint targetPoint) {
        int xDiff = this.x - targetPoint.x;
        int yDiff = this.y - targetPoint.y;
        return (Math.sqrt((yDiff * yDiff) + (xDiff * xDiff)));
    }

    public double distance() {
        int xDiff = this.x;
        int yDiff = this.y;
        return (Math.sqrt((yDiff * yDiff) + (xDiff * xDiff)));
    }

}