package Task_2;

public class Line {
    private Point pointA;
    private Point pointB;

    public Line(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    @Override
    public String toString() {
        return "{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                '}';
    }

    public void print(){
        System.out.println(this);
    }
}
