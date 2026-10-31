interface Switchable { void switchOn(); }
class Fan implements Switchable { public void switchOn(){System.out.println("Fan is running");} }
class Light implements Switchable { public void switchOn(){System.out.println("Light is glowing");} }
public class RemoteControl { public static void main(String[] a){ Switchable[] devices={new Fan(),new Light()}; for(Switchable d:devices)d.switchOn(); Runnable beep=()->System.out.println("Remote beep");beep.run(); } }
