public class PasswordChecker {
    public static String rate(String s) {
        int score = 0;
        if (s.length() >= 8) score++;
        if (s.matches(".*[A-Z].*")) score++;
        if (s.matches(".*[a-z].*")) score++;
        if (s.matches(".*[0-9].*")) score++;
        if (s.matches(".*[^A-Za-z0-9].*")) score++;
        return score <= 2 ? "Weak" : score <= 4 ? "Moderate" : "Strong";
    }
    public static void main(String[] args) {
        for (String p : args.length == 0 ? new String[]{"hello","Hello123","H3llo@World"} : args)
            System.out.println(p + " -> " + rate(p));
    }
}
