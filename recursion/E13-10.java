public class PolygonArea{
    public static double calculateArea(double[] x, double[] y, int i){
        if(i >= x.length - 2){
            return 0;
        }
        double a = x[i] * y[i+1] + x[i+1] * y[i] + x[i+2] * y[i];
        double b = y[i] * x[i+1] - y[i+1] * x[i] - y[i+2] * x[i];
        return ((a - b) / 2) + calculateArea(x, y, i+3);
    }

    public static void main(String [] args){
        //Using recurison, compute the area of a polygon.
        //Cut off a trinagle and use the fact that a triangle
        //with corners (x1, y1), (x2, y2), (x3, y3) has area
        //   |x1y2 + x2y3 + x3y1 - y1x2 - y2x3 - y3x1|
        //                divided by 2

        double[] x = {1, 2, 3, 4, 5, 6};
        double[] y = {1, 2, 3, 4, 5, 6};

        System.out.println("Area:");
        System.out.println(calculateArea(x, y, 0));
    }
}
