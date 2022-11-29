package Zalikova_robota_zavd12;

import java.util.*;

public class Zavd_12 {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(1,2));
        points.add(new Point(2,3));
        points.add(new Point(3,2));
        points.add(new Point(1,1));
        points.add(new Point(4,6));
        points.add(new Point(3,0));
        points.add(new Point(6,8));
        points.add(new Point(9,2));
        List<Line> lines = new ArrayList<>();
        lines.add(new Line(1,2,-5));
        lines.add(new Line(2,4,-6));
        lines.add(new Line(4,3,2));
        lines.add(new Line(2,1,6));
        Map<Line,Integer> mapLinesIntersection = new HashMap<>();

        for(Line line :lines){
            int counter = 0;
            for(Point point:points){
                if(line.intersectionWithPoint(point)){
                    counter +=1;
                }
            }
            mapLinesIntersection.put(line,counter);
        }
        for(Line line :mapLinesIntersection.keySet()){
            System.out.println(line.toString()+" :"+ mapLinesIntersection.get(line));
        }
    }
}
class Point{
    int x;
    int y;
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
class Line {
    int a;
    int b;
    int c;
    Line(int a,int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void setB(int b) {
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getB() {
        return b;
    }

    public int getA() {
        return a;
    }

    public int getC() {
        return c;
    }
    public Boolean intersectionWithPoint(Point point){
        return this.a * point.getX() + this.b * point.getY() + this.c == 0;
    }

    @Override
    public String toString() {
        return "Line{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
