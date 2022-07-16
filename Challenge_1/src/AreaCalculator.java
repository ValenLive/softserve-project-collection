public class AreaCalculator {
    private double edgeA;
    private double edgeB;
    private double edgeC;
    private double edgeD;

    public AreaCalculator(double edgeA, double edgeB, double edgeC, double edgeD) {
        setEdgeA(edgeA);
        setEdgeB(edgeB);
        setEdgeC(edgeC);
        setEdgeD(edgeD);
    }

    private void setEdgeA(double edgeA) {
        this.edgeA = edgeA <= 0 ? 0 : edgeA;
    }

    private void setEdgeB(double edgeB) {
        this.edgeB = edgeB <= 0 ? 0 : edgeB;
    }

    private void setEdgeC(double edgeC) {
        this.edgeC = edgeC <= 0 ? 0 : edgeC;
    }

    private void setEdgeD(double edgeD) {
        this.edgeD = edgeD <= 0 ? 0 : edgeD;
    }

    public double getFigureArea() {
        //Find g length of ABG
        double edgeG = Math.sqrt(Math.pow(edgeA, 2) + Math.pow(edgeB, 2));
        //Area of ABG
        double areaABG = (edgeA * edgeB) / 2;
        //Area of EGDC
        double areaEGDC = (edgeG + edgeD) / 2 * edgeC;
        //Area of figure
        return areaEGDC + areaABG;
    }
}
