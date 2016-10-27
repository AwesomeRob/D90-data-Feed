import java.util.Date;

/**
 * Created by Rob James on 27/10/2016.
 */
public class Endorsement {
    //IEP Endorsement Variables
    final int endorsementID[] = {
            1,
            2,
            3,
            4,
            15,
            28,
            73,

    };
    final int disqual[] = {
            0,
            1,
    };
    final String endorsementCode[] = {
            "AC10",
            "BA10",
            "CD30",
            "DR10",
            "DR60",
            "IN10",
            "MS30",
    };
    final String convictingCourt[] = {
            "MoJC15",
            "MoJC15",
            "MoJC15",
            "MoJC15",
            "MoJC15",
            "MoJC15",
            "MoJC15",
            "MoJC15",
            "MoJC15",
    };
    Date offence = LicDates.RandomDate(2008, 2010);
    Date expires = LicDates.RandomDate(2011, 2012);
    Date removed = expires;
    Date conviction = LicDates.RandomDate(2009, 2011);
    Date sentencing = conviction;
    final String duration[] = {
            "12 mo",
            "18 mo",
            "17 mo",
            "24 mo",
    };
    final Double fine[] = {
            194.65,
            2000.00,
            1000.00,
            1567.93,
    } ;
    String fineCurrency = "£";
    String rehabilitated;
    final int noPoints[] ={
            3,
            6,
            10,
            7,
    } ;

    String AlcoholLevel;
    String alcoholTestType;
    String appealCourt;
    Date disqualReIm;
    Date disqualRemov;
    Date disqualSusPA;
    String sentencingcourt;
    String susPrisonSentenceDur;
    String custodialPeriod;
    Date indicativeRehabSpentDate;
    //Boolean nonEndorsableOffence;    says this is already declared somewhere else
    //End

}
