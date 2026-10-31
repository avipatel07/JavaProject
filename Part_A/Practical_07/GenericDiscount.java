import java.util.function.UnaryOperator;
public class GenericDiscount { public static <T> T apply(T value,UnaryOperator<T> rule){return rule.apply(value);} public static void main(String[] a){System.out.println(apply(500.0,x->x*.85));System.out.println(apply("SALE",String::toLowerCase));} }
