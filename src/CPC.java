import java.util.Date;

/**
 * Created by Rob James on 27/10/2016.
 */
public class CPC {

    // IEP's Certificate of Professional Competence Variables
    String creatingReasonCode = "Issued";
    final String[] updatingReasonCode = {
            "Renewal",
            "First Issue",
            "Duplicate",
    };
    Date recordvalidFrom;
    Date recordvalidTo;
    Date LGVValidFrom;
    Date PCVValidFrom;
    Date PCVValidTo;

}

    String creatingReasonCode = "Issued";
    final String[] updatingReasonCode = {
            "Renewal",
            "First Issue",
            "Duplicate",
    };

    recordvalidFrom = LicDates.RandomDate(2014, 2015);
    recordvalidTo = LicDates.RandomDate(2019, 2023);
    LGVValidFrom = LicDates.RandomDate(1989, 2013);
    PCVValidFrom = LicDates.RandomDate(1983, 2013);
    PCVValidTo = LicDates.RandomDate(2016, 2025);

