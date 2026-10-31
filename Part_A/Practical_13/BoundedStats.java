import java.util.*;
public class BoundedStats { static <T extends Number> double average(List<T> values){return values.stream().mapToDouble(Number::doubleValue).average().orElse(0);} public static void main(String[] a){System.out.println(average(List.of(10,20,30,40)));} }
