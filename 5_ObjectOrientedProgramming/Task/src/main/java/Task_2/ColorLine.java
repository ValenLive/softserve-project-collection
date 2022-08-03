package Task_2;

public class ColorLine extends Line{
    private String color;

    public ColorLine(Point pointA, Point pointB, String color) {
        super(pointA, pointB);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "color='" + color + '\'' +
                '}';
    }

    public void print(){
        System.out.println(this);
    }
}
