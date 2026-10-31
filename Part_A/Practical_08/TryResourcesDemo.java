import java.io.*;
public class TryResourcesDemo { public static void main(String[] a){try(BufferedWriter w=new BufferedWriter(new FileWriter("sample.txt"))){w.write("MiniBank record");System.out.println("Saved sample.txt");}catch(IOException e){System.out.println(e.getMessage());}} }
