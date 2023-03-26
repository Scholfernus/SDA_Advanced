package org.example.pl.SDA.pol141.JA.Day3.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EqualsTask {
    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
// D o  P O P R A W Y ! ! ! ! ! ! !
    public static void main(String[] args) {

        List<Point> points = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            points.add(new Point(random.nextInt(5), random.nextInt(5)));
        }
        System.out.println(points);
        points.equals(points.contains(new Point(2, 3)));
    }

}

