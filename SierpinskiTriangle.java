import edu.princeton.cs.algs4.StdDraw;

public class SierpinskiTriangle {

    public static void main(String[] args){
        drawSetup();
        drawSierpinskiTriangle(0.05, 0.05, 0.4, 1);

    }

    public static void drawSetup(){
        StdDraw.setPenRadius(0.005);
        StdDraw.setPenColor(StdDraw.BLACK);
    }

    public static void drawSierpinskiTriangle(double x, double y, double sideLength, int order) {
        if(order == 0){
            StdDraw.line(x, y, x + sideLength, y);
            StdDraw.line(x, y, x + (sideLength/2.0), Math.sqrt((sideLength * sideLength) - ((sideLength/2.0) * (sideLength/2.0))));
            StdDraw.line(x + sideLength, y, x + (sideLength/2.0), Math.sqrt((sideLength * sideLength) - ((sideLength/2.0) * (sideLength/2.0))));
        }
        else {
            drawSierpinskiTriangle(x, y, sideLength/2.0, order-1);
            drawSierpinskiTriangle(x + sideLength/2.0, y, sideLength/2.0, order-1);
            drawSierpinskiTriangle(x + sideLength/4.0, y + (Math.sqrt((sideLength * sideLength) - ((sideLength/2.0) * (sideLength/2.0)))/2), sideLength/2.0, order-1);
        }

    }

}
