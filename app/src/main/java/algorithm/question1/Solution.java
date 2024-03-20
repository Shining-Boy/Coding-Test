package algorithm.question1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    private static class Point {
        public final long x, y;
        
        private Point(long x, long y){
            this.x = x;
            this.y = y;
        }
    }

    private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2){
        if(a1*b2 - b1*a2 == 0) return null;

        double x = (double) (b1*c2 - b2*c1) / (a1*b2 - b1*a2);
        double y = (double) (a1*c2 - a2*c1) / (b1*a2 - a1*b2);

        if(x%1!=0 || y%1!=0) return null;

        System.out.println(x + ", " + y);

        return new Point((long)x, (long)y);
    }

    private Point getMinimumPoint(List<Point> points){
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for(Point point : points){
            if(point.x < x) x = point.x;
            if(point.y < y) y = point.y;
        }

        return new Point(x, y);
    }

    private Point getmaximumPoint(List<Point> points){
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for(Point point : points){
            if(point.x > x) x = point.x;
            if(point.y > y) y = point.y;
        }

        return new Point(x, y);
    }

    public String[] solution(int[][] lines){
        List<Point> intersectionPoints = new ArrayList<>();
        for(int i=0; i<lines.length-1; i++){
            for(int j=i+1; j<lines.length; j++){
                Point intersectionPoint = intersection((long)lines[i][0], (long)lines[i][1], (long)lines[i][2], 
                                                        (long)lines[j][0], (long)lines[j][1], (long)lines[j][2]);
                
                if(intersectionPoint != null) intersectionPoints.add(intersectionPoint);
            }
        }

        Point maxPoint = getmaximumPoint(intersectionPoints);
        Point minPoint = getMinimumPoint(intersectionPoints);
        char[][] drawIntersection = new char[(int)(maxPoint.y-minPoint.y+1)][(int)(maxPoint.x-minPoint.x+1)];
        for(char[] drawRow : drawIntersection){
            Arrays.fill(drawRow, '.');
        }
        for(Point intersectionPoint : intersectionPoints){
            int xPoint = (int)(intersectionPoint.x - minPoint.x);
            int yPoint = (int)(maxPoint.y - intersectionPoint.y);

            drawIntersection[yPoint][xPoint] = '*';
        }        

        String[] result = new String[drawIntersection.length];
        for(int i=0; i<drawIntersection.length; i++){
            result[i] = String.valueOf(drawIntersection[i]);
        }
        return result;
    }
}
