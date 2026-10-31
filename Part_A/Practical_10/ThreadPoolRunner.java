import java.util.concurrent.*;
public class ThreadPoolRunner { public static void main(String[] a){try(ExecutorService pool=Executors.newFixedThreadPool(3)){for(int i=1;i<=6;i++){int task=i;pool.submit(()->System.out.println("Task "+task+" by "+Thread.currentThread().getName()));}}} }
