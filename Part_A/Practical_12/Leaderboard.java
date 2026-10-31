import java.util.*;
public class Leaderboard { public static void main(String[] a){Map<String,Integer> scores=new HashMap<>(Map.of("Asha",88,"Dev",94,"Mira",91));scores.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed()).forEach(e->System.out.println(e.getKey()+" "+e.getValue()));} }
