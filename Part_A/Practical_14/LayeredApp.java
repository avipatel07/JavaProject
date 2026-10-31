import java.util.*;
class AccountService { private final Map<Integer,Double> balances=new HashMap<>(); void add(int id,double amount){balances.put(id,amount);} double balance(int id){return balances.getOrDefault(id,0.0);} }
public class LayeredApp { public static void main(String[] a){AccountService service=new AccountService();service.add(101,2500);System.out.println("Account 101 balance: "+service.balance(101));} }
