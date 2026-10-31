class MediaItem { int daysLate; MediaItem(int d){daysLate=Math.max(0,d);} double fee(){return daysLate*2.0;} }
class PremiumMedia extends MediaItem { PremiumMedia(int d){super(d);} double fee(){return daysLate*4.5;} }
public class MediaFeeDemo { public static void main(String[] a){System.out.println("Standard: "+new MediaItem(3).fee());System.out.println("Premium: "+new PremiumMedia(3).fee());} }
