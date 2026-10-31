public class ParkingLot {
    private final int capacity;
    private int occupied;
    public ParkingLot(int capacity) { this.capacity = capacity; }
    public void enter() {
        if (occupied == capacity) System.out.println("Lot full");
        else System.out.println("Ticket number " + (++occupied));
    }
    public void exit() {
        if (occupied == 0) System.out.println("No vehicle to exit");
        else { occupied--; System.out.println("Exit recorded"); }
    }
    public static void main(String[] args) {
        ParkingLot p = new ParkingLot(2); p.enter(); p.enter(); p.enter(); p.exit();
        System.out.println("Occupied: " + p.occupied);
    }
}
