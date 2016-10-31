
/**
 * Created by Rob James on 27/10/2016.
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class CPC {
    private String creatingReasonCode;
    private String updateReason;
    private Date recordvalidFrom;
    private Date recordvalidTo;
    private Date LGVValidFrom;
    private Date PCVValidFrom;
    private Date PCVValidTo;
    Random ranNumGen = new Random(1);

    private final String[] creatingReasCode = {
            "Ren",
            "FI",
            "Dup",
    };
    private final String[] updatingReason = {
            "Renewal",
            "First Issue",
            "Duplicate",
    };

    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date todaydate = new Date();


    public CPC() {
//        creatingReasonCode = "";
//        updateReason = "";
//        recordvalidFrom = todaydate ;
//        recordvalidTo = todaydate;
//        LGVValidFrom = todaydate;
//        PCVValidFrom = todaydate;
//        PCVValidTo = todaydate;
        Random ranNumGen = new Random();
        int num = ranNumGen.nextInt(3);
        creatingReasonCode = creatingReasCode[num];
        updateReason = updatingReason[num];
        recordvalidFrom = LicDates.RandomDate(2014, 2015);
        recordvalidTo = LicDates.RandomDate(2019, 2023);
        LGVValidFrom = LicDates.RandomDate(1989, 2013);
        PCVValidFrom = LicDates.RandomDate(1983, 2013);
        PCVValidTo = LicDates.RandomDate(2016, 2025);
        }


    public void randomise(){
        Random ranNumGen = new Random();
        int num = ranNumGen.nextInt(3);
        creatingReasonCode = creatingReasCode[num];
        updateReason = updatingReason[num];
        recordvalidFrom = LicDates.RandomDate(2014, 2015);
        recordvalidTo = LicDates.RandomDate(2019, 2023);
        LGVValidFrom = LicDates.RandomDate(1989, 2013);
        PCVValidFrom = LicDates.RandomDate(1983, 2013);
        PCVValidTo = LicDates.RandomDate(2016, 2025);
    }


    public String getCreatingReasonCode() {
        return creatingReasonCode;
    }

    public String getUpdateReason() {
        return updateReason;
    }

    public Date getRecordvalidFrom() {
        return recordvalidFrom;
    }

    public Date getRecordvalidTo() {
        return recordvalidTo;
    }

    public Date getLGVValidFrom() {
        return LGVValidFrom;
    }

    public Date getPCVValidFrom() {
        return PCVValidFrom;
    }

    public Date getPCVValidTo() {
        return PCVValidTo;
    }

    public Random getRanNumGen() {
        return ranNumGen;
    }

    public String[] getCreatingReasCode() {
        return creatingReasCode;
    }

    public String[] getUpdatingReason() {
        return updatingReason;
    }

    public DateFormat getDateFormat() {
        return dateFormat;
    }

    public Date getTodaydate() {
        return todaydate;
    }
}






