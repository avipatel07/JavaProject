import java.util.Map;
public class TemplateFiller {
    public static void main(String[] args) {
        String template = "Hello {name}, your appointment is on {date}.";
        Map<String,String> values = Map.of("name","Aarav","date","Monday");
        for (var entry : values.entrySet())
            template = template.replace("{"+entry.getKey()+"}", entry.getValue());
        System.out.println(template);
    }
}
