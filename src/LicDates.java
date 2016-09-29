import java.util.GregorianCalendar;

/**
 * Created by Rob James on 27/09/2016.
 */
public class LicDates {
    public static String simpleMessage2() {


        GregorianCalendar gc = new GregorianCalendar();

        int year = randBetween(2013, 2026);

        gc.set(gc.YEAR, year);

        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

        gc.set(gc.DAY_OF_YEAR, dayOfYear);

        //System.out.println(gc.get(gc.DAY_OF_MONTH) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.YEAR));
        String LicenceDate = gc.get(gc.DAY_OF_MONTH) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.YEAR);
        return LicenceDate;
    }

    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
}