import java.util.*;
public class UniqueVisitors { public static void main(String[] a){List<String> visits=List.of("u01","u02","u01","u03","u02");Set<String> unique=new LinkedHashSet<>(visits);System.out.println("Unique visitors: "+unique.size());System.out.println(unique);} }
