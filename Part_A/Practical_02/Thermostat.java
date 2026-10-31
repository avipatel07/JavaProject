public class Thermostat {
    private double temperature;
    public Thermostat(double initial) { temperature = initial; }
    public void setTemperature(double value) {
        if (value < 10 || value > 35) System.out.println("Set point must be 10 to 35 C");
        else { temperature = value; System.out.println("Target set to " + temperature + " C"); }
    }
    public void status(double room) {
        System.out.println(room < temperature - 1 ? "Heating required" :
            room > temperature + 1 ? "Cooling required" : "Temperature is comfortable");
    }
    public static void main(String[] args) {
        Thermostat t = new Thermostat(24); t.setTemperature(22); t.status(19); t.status(22.5);
    }
}
