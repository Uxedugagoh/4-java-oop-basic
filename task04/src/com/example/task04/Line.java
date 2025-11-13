package com.example.task04;

/**
 * Класс отрезка
 * */
public class Line {
    private Point start;
    private Point end;

    public Line(Point p1, Point p2) {
        this.start = p1;
        this.end = p2;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "Line{" +
                "p1=" + start +
                ", p2=" + end +
                '}';
    }

    public boolean isCollinearLine(Point p) {
        int dx1 = end.x - start.x;
        int dy1 = end.y - start.y;

        int dx = p.x - start.x;
        int dy = p.y - start.y;

        return (dx1 * dy - dx * dy1) == 0;
    }
}
