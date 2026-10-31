import java.util.*;
class SimpleStack<T>{private final Deque<T> data=new ArrayDeque<>();void push(T v){data.push(v);}T pop(){return data.pop();}boolean isEmpty(){return data.isEmpty();}}
public class GenericStackDemo { public static void main(String[] a){SimpleStack<String>s=new SimpleStack<>();s.push("first");s.push("second");while(!s.isEmpty())System.out.println(s.pop());} }
