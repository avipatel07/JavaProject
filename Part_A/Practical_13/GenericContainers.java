import java.util.*;
public class GenericContainers { public static <T> void show(Collection<T> values){for(T v:values)System.out.println(v);} public static void main(String[] a){show(List.of("Java","OOP","Generics"));show(List.of(10,20,30));} }
