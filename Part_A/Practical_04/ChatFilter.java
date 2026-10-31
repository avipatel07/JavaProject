import java.util.*;
public class ChatFilter {
    public static void main(String[] args) {
        Set<String> blocked = Set.of("spamword","abuse");
        String message = args.length == 0 ? "Hello team, no spamword please" : String.join(" ",args);
        StringBuilder clean = new StringBuilder();
        for (String word : message.split("\\s+"))
            clean.append(blocked.contains(word.toLowerCase()) ? "[filtered]" : word).append(' ');
        System.out.println(clean.toString().trim());
    }
}
