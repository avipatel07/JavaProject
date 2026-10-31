public class CinemaShow {
    private final int capacity;
    private int booked;
    public CinemaShow(int seats) { capacity = seats; }
    public boolean book(int count) {
        if (count <= 0 || booked + count > capacity) return false;
        booked += count; return true;
    }
    public int available() { return capacity - booked; }
    public static void main(String[] args) {
        CinemaShow show = new CinemaShow(60);
        System.out.println("Booking 4: " + show.book(4));
        System.out.println("Booking 58: " + show.book(58));
        System.out.println("Seats left: " + show.available());
    }
}
