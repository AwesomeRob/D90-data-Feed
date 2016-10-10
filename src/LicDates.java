import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Rob James on 27/09/2016.
 */
public class LicDates {
    public static Date RandomDate(int StartYear, int EndYear) {


        GregorianCalendar gc = new GregorianCalendar();

        int year = randBetween(StartYear, EndYear);

        gc.set(gc.YEAR, year);

        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

        gc.set(gc.DAY_OF_YEAR, dayOfYear);

        //System.out.println(gc.get(gc.DAY_OF_MONTH) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.YEAR));
        String LicenceDate = gc.get(gc.YEAR) + "-" +  (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd");

        try {
            return sdf.parse(LicenceDate);
            // System.out.println(date); //Tue Aug 31 10:20:56 SGT 1982
        }
        catch (ParseException e)
        {
            // System.out.write(e.getCause());
        }



        return null;

    }

    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
}