import java.util.Date;
import java.util.Random;

/**
 * Created by Rob James on 27/10/2016.
 */
public class Disqualification {

    Random ranNumGen = new Random(1);

    Date disqDate;
    Date disqFromDate;
    Date disqToDate;
    private final int endorseID[] = {
            46374,
            495834,
            5964383,
            58694,
    };
    int endorsementID;
    private final String endorseType[] = {
            "Over Alcohol Limit",
            "In Excess of Alcohol Limit",
            "Unfit through drink",
            "Exceeded Alcohol Limit for driving",
    };
    String type;
    Date disqvalidFrom;
    Date disqvalidTo;


    private final String disqual[] ={
            "Y",
            "N",
    };

    String disqualified = disqual[ranNumGen.nextInt(2)];;

    private final String isDttp[] ={
            "Y",
            "N",
    };
    String dttp = isDttp[ranNumGen.nextInt(2)];;

    private final String isRttp[] ={
            "Y",
            "N",
    };
    String  rttp = isRttp[ranNumGen.nextInt(2)];;

    private final String isDtetp[] ={
            "Y",
            "N",
    };
    String dtetp = isDtetp[ranNumGen.nextInt(2)];
    //**********************************************************************************


    public void randomise() {

        disqDate = LicDates.RandomDate(2010, 2013);
        disqFromDate = disqDate;
        disqToDate = LicDates.RandomDate(2014, 2017);
        endorsementID = endorseID[ranNumGen.nextInt(4)];
        type = endorseType[ranNumGen.nextInt(4)];
        disqvalidFrom = disqDate;
        disqvalidTo = disqToDate;

    }

    public Date getDisqDate() {
        return disqDate;
    }

    public Date getDisqFromDate() {
        return disqFromDate;
    }

    public Date getDisqToDate() {
        return disqToDate;
    }

    public int getEndorsementID() {
        return endorsementID;
    }

    public String getType() {
        return type;
    }

    public Date getDisqvalidFrom() {
        return disqvalidFrom;
    }

    public Date getDisqvalidTo() {
        return disqvalidTo;
    }
    public String getDisqualified() {
        return disqualified;
    }

    public String getDttp() {
        return dttp;
    }

    public String getRttp() {
        return rttp;
    }

    public String getDtetp() {
        return dtetp;
    }

}
