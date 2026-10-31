class Employee { String name; double salary; Employee(String n,double s){name=n;salary=s;} double pay(){return salary;} }
class HourlyEmployee extends Employee { int hours; HourlyEmployee(String n,double rate,int h){super(n,rate);hours=h;} double pay(){return salary*hours;} }
public class PayrollDemo { public static void main(String[] a){ Employee e=new HourlyEmployee("Mira",250,8); System.out.println(e.name+" earns "+e.pay()); } }
