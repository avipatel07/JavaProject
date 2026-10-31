import java.nio.file.*;
public class FolderReport { public static void main(String[] a)throws Exception{Path root=Path.of(a.length==0?".":a[0]);try(var paths=Files.walk(root)){paths.forEach(System.out::println);}} }
