import java.util.Date;
import java.util.Random;

/**
 * Created by Rob James on 27/10/2016.
 */
public class Endorsement {

    Random ranNumGen = new Random();

    int endorseID;
    final int endorsementID[] = {
            1,
            2,
            3,
            4,
            15,
            28,
            73,

    };
    int disqualified;
    final int disqual[] = {
            0,
            1,
    };
    String endorsCode;
    final String endorsementCode[] = {
            "DR10",
            "DR20",
            "DR10",
            "DR20",
            "DR10",
            "DR20",
            "DR10",
    };
    String convCourt;
    final String convictingCourt[] = {
            "MoJC3",
            "MoJC115",
            "MoJC150",
            "MoJC10",
            "MoJC14",
            "MoJC47",
            "MoJC26",
            "MoJC195",
            "MoJC138",
    };
    Date offenceDate;
    Date offence = LicDates.RandomDate(2008, 2010);
    Date expiresDate;
    Date expires = LicDates.RandomDate(2011, 2012);
    Date removed = expires;
    Date convictionDate;
    Date conviction = LicDates.RandomDate(2009, 2011);
    Date sentencing = conviction;
    String endorseDuration;
    Double fineAmount;
    final Double fine[] = {
            194.65,
            2000.00,
            1000.00,
            1567.93,
    };
    String fineCurrency = "£";
    String rehabilitated;
    int numOfPoints;
    final int noPoints[] = {
            3,
            6,
            10,
            7,
    };
    String AlcLvl;
    final String AlcoholLevel[] = {
            "41 mg",
            "89.5mg",
            "64 mg",
            "103 mg",
    };
    String alcoholTestType = "Breath";
    String appealCourt;
    Date disqualReIm;
    Date disqualRemov;
    Date disqualSusPA;
    String sentCourt;
    final String sentencingcourt[] = {
            "Neath",
            "Cardiff",
            "Abbingdon",
            "Dagenham",
    };
    String susPrisonSentenceDur;
    String custodialPeriod = "N";
    Date indicativeRehabSpentDate;






    public void randomise() {
        endorseID = endorsementID[ranNumGen.nextInt(7)];
        disqualified = disqual[ranNumGen.nextInt(2)];
        endorsCode = endorsementCode[ranNumGen.nextInt(7)];
        convCourt = convictingCourt[ranNumGen.nextInt(9)];
        offenceDate = offence = LicDates.RandomDate(2008, 2010);
        expiresDate = expires = LicDates.RandomDate(2011, 2012);
        removed = expires;
        convictionDate = conviction = LicDates.RandomDate(2009, 2011);
        sentencing = conviction;
        fineAmount = fine[ranNumGen.nextInt(4)];
        fineCurrency = "£";
        numOfPoints = noPoints[ranNumGen.nextInt(4)];
        AlcLvl = AlcoholLevel[ranNumGen.nextInt(4)];
        alcoholTestType = "Breath";
        sentCourt = sentencingcourt[ranNumGen.nextInt(4)];
        custodialPeriod = "N";
    }

    public int getEndorseID() {
        return endorseID;
    }

    public int getDisqualified() {
        return disqualified;
    }

    public String getEndorsCode() {
        return endorsCode;
    }

    public String getConvCourt() {
        return convCourt;
    }

    public Date getOffenceDate() {
        return offenceDate;
    }

    public Date getExpiresDate() {
        return expiresDate;
    }

    public Date getRemoved() {
        return removed;
    }

    public Date getConviction() {
        return conviction;
    }

    public Date getSentencing() {
        return sentencing;
    }

    public Double getFineAmount() {
        return fineAmount;
    }

    public String getFineCurrency() {
        return fineCurrency;
    }

    public int getNumOfPoints() {
        return numOfPoints;
    }

    public String getAlcLvl() {
        return AlcLvl;
    }

    public String getAlcoholTestType() {
        return alcoholTestType;
    }

    public String getSentCourt() {
        return sentCourt;
    }

    public String getCustodialPeriod() {
        return custodialPeriod;
    }


}