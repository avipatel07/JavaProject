import java.util.function.DoubleUnaryOperator;
public class DiscountEngine { static double apply(double price,DoubleUnaryOperator rule){return rule.applyAsDouble(price);} public static void main(String[] a){double p=1000;System.out.println(apply(p,x->x*.9));System.out.println(apply(p,x->x-150));} }
