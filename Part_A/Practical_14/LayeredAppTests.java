// Manual test harness; run with: java LayeredAppTests
public class LayeredAppTests { public static void main(String[] a){AccountService service=new AccountService();service.add(7,125.0);if(service.balance(7)!=125.0)throw new AssertionError("Balance test failed");System.out.println("All manual checks passed");} }
