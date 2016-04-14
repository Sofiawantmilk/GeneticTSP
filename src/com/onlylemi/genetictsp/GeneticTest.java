package com.onlylemi.genetictsp;

import java.util.Random;

/**
 * GeneticTest
 *
 * @author: onlylemi
 */
public class GeneticTest {

    public static void main(String[] args) {
        Point[] points = new Point[30];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point();
            points[i].x = new Random().nextInt(200);
            points[i].y = new Random().nextInt(200);
        }

        GeneticMath gm = new GeneticMath();
        int[] best;
        best = gm.tsp(points);

        int n = 0;
        while (n++ < 100) {
            best = gm.nextGeneration();

            System.out.println("best distance:" + gm.getBestDist() +
                    " current generation:" + gm.getCurrentGeneration() +
                    " mutation times:" + gm.getMutationTimes());
            for (int i = 0; i < best.length; i++) {
                System.out.print(best[i] + " ");
            }
            System.out.println();
        }
    }
}