package Zalikova_robota_zavd13;

import java.util.*;

public class Zavd_13 {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(1,3));
        points.add(new Point(2,1));
        points.add(new Point(1,2));
        points.add(new Point(5,2));
        points.add(new Point(3,0));
        points.add(new Point(1,1));
        points.add(new Point(4,0));
        Circle circle = new Circle(0,0,3);
        Map<Point,Double> mapPointsWithLength = new HashMap<>();
        List<Double> lengths = new ArrayList<>();
        for(Point point:points){
            if(circle.isPointHere(point)){
                mapPointsWithLength.put(point,circle.getLengthToCenter(point));
                lengths.add(circle.getLengthToCenter(point));
            }
        }
        Collections.sort(lengths);
        System.out.println(lengths);
        List<Point> trash = new ArrayList<>();
        for(Double length :lengths){
            for(Point point: mapPointsWithLength.keySet()){
                if(Objects.equals(mapPointsWithLength.get(point), length) && !trash.contains(point)){
                    System.out.println(point+" : "+mapPointsWithLength.get(point));
                    trash.add(point);

                }
            }
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

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
class Circle{
    int x;
    int y;
    int r;
    Circle(int x,int y, int r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public int getR() {
        return r;
    }
    public double getLengthToCenter(Point point){
        return Math.sqrt(Math.pow(this.x- point.getX(),2)+Math.pow(this.y - point.getY(),2));
    }
    public Boolean isPointHere(Point point){
        return (Math.pow(point.getX()+this.x,2)+Math.pow(point.getY()+this.y,2) <= Math.pow(this.r,2));
    }
    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }
}