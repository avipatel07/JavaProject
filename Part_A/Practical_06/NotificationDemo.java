interface Sender { void send(String message); }
public class NotificationDemo { public static void main(String[] a){ Sender email=m->System.out.println("Email: "+m); Sender sms=m->System.out.println("SMS: "+m); email.send("Class at 10");sms.send("Lab moved"); } }
