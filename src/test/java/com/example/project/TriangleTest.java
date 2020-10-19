package com.example.project;

public class TriangleTest {
    public static void main(String[] args) {

        Triangle someTriangle = new Triangle(0, 5, 10, 15, 5, 0);
        Triangle someOtherTriangle = new Triangle();

        double T0x0 = someTriangle.getx0();
        double T0y0 = someTriangle.gety0();
        double T0x1 = someTriangle.getx1();
        double T0y1 = someTriangle.gety1();
        double T0x2 = someTriangle.getx2();
        double T0y2 = someTriangle.gety2();

        System.out.println("Triangle 1 Point 1 = (" + T0x0 + "," + T0y0 + "). Expected: (0,5).");
        System.out.println("Triangle 1 Point 2 = (" + T0x1 + "," + T0y1 + "). Expected: (10,15).");
        System.out.println("Triangle 1 Point 3 = (" + T0x2 + "," + T0y2 + "). Expected: (5,0).");

        double T1x0 = someOtherTriangle.getx0();
        double T1y0 = someOtherTriangle.gety0();
        double T1x1 = someOtherTriangle.getx1();
        double T1y1 = someOtherTriangle.gety1();
        double T1x2 = someOtherTriangle.getx2();
        double T1y2 = someOtherTriangle.gety2();

        System.out.println("Triangle 2 Point 1 = (" + T1x0 + "," + T1y0 + "). Expected: (0,0).");
        System.out.println("Triangle 2 Point 2 = (" + T1x1 + "," + T1y1 + "). Expected: (0,0).");
        System.out.println("Triangle 2 Point 3 = (" + T1x2 + "," + T1y2 + "). Expected: (0,0).");

        double T0P = someTriangle.getPerimeter();
        double T1P = someOtherTriangle.getPerimeter();
        double T0A = someTriangle.getArea();
        double T1A = someOtherTriangle.getArea();

        System.out.println("Triangle 1 Perimeter = " + T0P + ". Expected: 37.");
        System.out.println("Triangle 1 Area = " + T0A + ". Expected: 50.");
        System.out.println("Triangle 2 Perimeter = " + T1P + ". Expected: 0.");
        System.out.println("Triangle 2 Area = " + T1A + ". Expected: 0.");

        someTriangle.translateX(5);
        someTriangle.translateY(-10);
        someOtherTriangle.translateX(-1000);
        someOtherTriangle.translateY(100);

        double T0x0v2 = someTriangle.getx0();
        double T0y0v2 = someTriangle.gety0();
        double T0x1v2 = someTriangle.getx1();
        double T0y1v2 = someTriangle.gety1();
        double T0x2v2 = someTriangle.getx2();
        double T0y2v2 = someTriangle.gety2();

        System.out.println("Triangle 1 Point 1 = (" + T0x0v2 + "," + T0y0v2 + "). Expected: (5,-5).");
        System.out.println("Triangle 1 Point 2 = (" + T0x1v2 + "," + T0y1v2 + "). Expected: (15,5).");
        System.out.println("Triangle 1 Point 3 = (" + T0x2v2 + "," + T0y2v2 + "). Expected: (10,-10).");

        double T1x0v2 = someOtherTriangle.getx0();
        double T1y0v2 = someOtherTriangle.gety0();
        double T1x1v2 = someOtherTriangle.getx1();
        double T1y1v2 = someOtherTriangle.gety1();
        double T1x2v2 = someOtherTriangle.getx2();
        double T1y2v2 = someOtherTriangle.gety2();

        System.out.println("Triangle 2 Point 1 = (" + T1x0v2 + "," + T1y0v2 + "). Expected: (-1000,100).");
        System.out.println("Triangle 2 Point 2 = (" + T1x1v2 + "," + T1y1v2 + "). Expected: (-1000,100).");
        System.out.println("Triangle 2 Point 3 = (" + T1x2v2 + "," + T1y2v2 + "). Expected: (-1000,100).");

        double Side1 = someTriangle.getSide(0,1);
        double Side2 = someTriangle.getSide(1,2);
        double Side3 = someTriangle.getSide(2,0);

        System.out.print("Triangle 1 has side lengths: " + Side1 + ", " + Side2 + ", " + Side3 + ". ");
        System.out.println("Expected: 14.14, 15.81, 7.07.");

    }
}
