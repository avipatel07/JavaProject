import java.util.*;
public class DiscountRuleDemo { public static void main(String[] a){Map<String,Integer> discounts=Map.of("student",10,"member",15,"festival",20);String type=a.length>0?a[0]:"student";System.out.println(discounts.getOrDefault(type,0)+"% discount");} }
