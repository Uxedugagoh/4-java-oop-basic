package com.example.task05;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private final Point[] points = new Point[100];
    private int endIndex;
    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        for (int i = 0; i < points.length; i++) {
            this.points[i] = new Point(points[i].getX(), points[i].getY());
        }
        endIndex = points.length;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        this.points[endIndex] = new Point(point.getX(), point.getY());
        endIndex += 1;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        Point point = new Point(x, y);
        this.points[endIndex] = point;
        endIndex += 1;
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double summ = 0;
        for (int i = 0; i < endIndex - 1; i++) {
            summ += this.points[i].getLength(this.points[i+1]);
        }
        return summ;
    }

}
