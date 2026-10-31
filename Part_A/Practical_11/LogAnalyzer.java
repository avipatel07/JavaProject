import java.nio.file.*;import java.io.IOException;
public class LogAnalyzer { public static void main(String[] a)throws IOException{Path p=Path.of(a.length==0?"app.log":a[0]);if(!Files.exists(p)){System.out.println("Log file not found: "+p);return;}long errors=Files.lines(p).filter(s->s.toUpperCase().contains("ERROR")).count();System.out.println("Error lines: "+errors);} }
