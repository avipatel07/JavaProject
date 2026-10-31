import java.util.*;
public class WordFrequency { public static void main(String[] a){String line=a.length==0?"java is fun and java is useful":String.join(" ",a);Map<String,Integer> count=new TreeMap<>();for(String w:line.toLowerCase().split("\\W+"))if(!w.isBlank())count.merge(w,1,Integer::sum);count.forEach((k,v)->System.out.println(k+" : "+v));} }
