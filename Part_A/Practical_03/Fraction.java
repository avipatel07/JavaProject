public class Fraction {
    private final int numerator, denominator;
    public Fraction(int n, int d) {
        if (d == 0) throw new IllegalArgumentException("Denominator cannot be zero");
        int sign = d < 0 ? -1 : 1, g = gcd(Math.abs(n), Math.abs(d));
        numerator = sign*n/g; denominator = Math.abs(d)/g;
    }
    private static int gcd(int a,int b) { while(b!=0){int t=a%b;a=b;b=t;} return a==0?1:a; }
    public Fraction add(Fraction f) { return new Fraction(numerator*f.denominator+f.numerator*denominator, denominator*f.denominator); }
    public String toString() { return numerator + "/" + denominator; }
    public static void main(String[] args) {
        System.out.println(new Fraction(1,3).add(new Fraction(1,6)));
    }
}
