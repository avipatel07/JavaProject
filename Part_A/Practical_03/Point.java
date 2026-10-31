import java.util.*;
public class Point {
    private final int x, y;
    public Point(int x, int y) { this.x=x; this.y=y; }
    @Override public boolean equals(Object o) {
        if (!(o instanceof Point p)) return false;
        return x == p.x && y == p.y;
    }
    @Override public int hashCode() { return Objects.hash(x,y); }
    public static void main(String[] args) {
        Set<Point> points = new HashSet<>(List.of(new Point(2,3), new Point(2,3), new Point(4,5)));
        System.out.println("Distinct coordinate pairs: " + points.size());
    }
}
