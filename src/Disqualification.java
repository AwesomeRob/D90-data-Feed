import java.util.Date;

/**
 * Created by Rob James on 27/10/2016.
 */
public class Disqualification {
    // IEP Disqualification Variables
    Date disqDate = LicDates.RandomDate(2010, 2013);
    Date disqFromDate = disqDate;
    Date disqToDate = LicDates.RandomDate(2014, 2017);;
    //Boolean forLife;
    int endorsementID ;
    Boolean concurrent;
    String type;
    Date disqvalidFrom;
    Date disqvalidTo;
    //End
}
