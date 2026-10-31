public class TollBooth {
    private int vehicles, amount;
    public void collect(String type) {
        int fee = switch (type.toLowerCase()) {
            case "car" -> 50; case "truck" -> 100; case "bus" -> 80;
            default -> -1;
        };
        if (fee < 0) { System.out.println("Unknown vehicle"); return; }
        vehicles++; amount += fee;
        System.out.println(type + " : toll Rs." + fee);
    }
    public void report() { System.out.println("Vehicles: " + vehicles + ", collection: Rs." + amount); }
    public static void main(String[] args) {
        TollBooth booth = new TollBooth();
        booth.collect("car"); booth.collect("bus"); booth.collect("truck"); booth.report();
    }
}
