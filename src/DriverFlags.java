import java.util.Date;
import java.util.Random;

/**
 * Created by Rob James on 30/10/2016.
 */
public class DriverFlags {

    Random ranNumGen = new Random(1);

    Date driverFlagValidFrom;
    Date driverFlagValidTo;
    private final String isManual[] ={
            "Y",
            "N",
    };
    String manual;

    private final String dupOfLic[] = {
            "Y",
            "N",
    };
    String duplicateOfLicence;

    private final String xOfLic[] ={
            "Y",
            "N",
    };
    String exchangeOfLicence;

    private final String highFeePaid[]={
            "Y",
            "N",
    };
    String higherFeePaid;

    private final String isYngDvr[] ={
            "Y",
            "N",
    };
    String onYoungDriverScheme;

    private final String paidUp[] ={
            "Y",
            "N",
    };
    String  lifeFeePaid;

    private final String mim[] ={
            "Y",
            "N",
    };
    String medicalInvestigationRequiredForMedicalIssue;

    private final String OrdMim[] ={
            "Y",
            "N",
    };
    String ordinaryMedicalInvestigaitonInProgress;

    private final String OrdMimDec[] ={
            "Y",
            "N",
    };
    String ordinaryMedicalDeclerationMade;

    private final String mimpapers[] ={
            "Y",
            "N",
    };
    String ordinaryMedicalPapersHled;

    private final String photoInvSnt[] ={
            "Y",
            "N",
    };
    String photoInvitationSent;

    private final String mobility[] ={
            "Y",
            "N",
    };
    String receivesMobilityallowance;

    private final String rest[] ={
            "Y",
            "N",
    };
    String restrictedAsSpecifiedInSecretaryOfStateNotice;

    private final String sightCorr[] ={
            "Y",
            "N",
    };
    String sightCorrectionRequired;

    private final String vocMim[] ={
            "Y",
            "N",
    };
    String vocationalMedicalPapersHeld;

    private final String vocMimOngong[] ={
            "Y",
            "N",
    };
    String vocationalMedicalInvestigationInProgress;

    private final String xEndorse[] ={
            "Y",
            "N",
    };
    String excessEndorsements;




    public void randomise() {
        driverFlagValidFrom = LicDates.RandomDate(2009, 2011);;
        driverFlagValidTo = LicDates.RandomDate(2012, 2014);;
        manual = isManual[ranNumGen.nextInt(2)];
        duplicateOfLicence = isManual[ranNumGen.nextInt(2)];;
        exchangeOfLicence = xOfLic[ranNumGen.nextInt(2)];;
        higherFeePaid = highFeePaid[ranNumGen.nextInt(2)];;
        onYoungDriverScheme = isYngDvr[ranNumGen.nextInt(2)];;
        lifeFeePaid= paidUp[ranNumGen.nextInt(2)];;
        medicalInvestigationRequiredForMedicalIssue = mim[ranNumGen.nextInt(2)];;
        ordinaryMedicalInvestigaitonInProgress = OrdMim[ranNumGen.nextInt(2)];;
        ordinaryMedicalDeclerationMade = OrdMimDec[ranNumGen.nextInt(2)];;
        ordinaryMedicalPapersHled = mimpapers[ranNumGen.nextInt(2)];;
        photoInvitationSent = photoInvSnt[ranNumGen.nextInt(2)];;
        receivesMobilityallowance = mobility[ranNumGen.nextInt(2)];;
        restrictedAsSpecifiedInSecretaryOfStateNotice = rest[ranNumGen.nextInt(2)];;
        sightCorrectionRequired = sightCorr[ranNumGen.nextInt(2)];;
        vocationalMedicalPapersHeld =vocMim[ranNumGen.nextInt(2)];;
        vocationalMedicalInvestigationInProgress = vocMimOngong[ranNumGen.nextInt(2)];;
        excessEndorsements = xEndorse[ranNumGen.nextInt(2)];;

    }

    public Date getDriverFlagValidFrom() {
        return driverFlagValidFrom;
    }

    public Date getDriverFlagValidTo() {
        return driverFlagValidTo;
    }

    public String getManual() {
        return manual;
    }

    public String getDuplicateOfLicence() {
        return duplicateOfLicence;
    }

    public String getExchangeOfLicence() {
        return exchangeOfLicence;
    }

    public String getHigherFeePaid() {
        return higherFeePaid;
    }

    public String getOnYoungDriverScheme() {
        return onYoungDriverScheme;
    }

    public String getLifeFeePaid() {
        return lifeFeePaid;
    }

    public String getMedicalInvestigationRequiredForMedicalIssue() {
        return medicalInvestigationRequiredForMedicalIssue;
    }

    public String getOrdinaryMedicalInvestigaitonInProgress() {
        return ordinaryMedicalInvestigaitonInProgress;
    }

    public String getOrdinaryMedicalDeclerationMade() {
        return ordinaryMedicalDeclerationMade;
    }

    public String getOrdinaryMedicalPapersHled() {
        return ordinaryMedicalPapersHled;
    }

    public String getPhotoInvitationSent() {
        return photoInvitationSent;
    }

    public String getReceivesMobilityallowance() {
        return receivesMobilityallowance;
    }

    public String getRestrictedAsSpecifiedInSecretaryOfStateNotice() {
        return restrictedAsSpecifiedInSecretaryOfStateNotice;
    }

    public String getSightCorrectionRequired() {
        return sightCorrectionRequired;
    }

    public String getVocationalMedicalPapersHeld() {
        return vocationalMedicalPapersHeld;
    }

    public String getVocationalMedicalInvestigationInProgress() {
        return vocationalMedicalInvestigationInProgress;
    }

    public String getExcessEndorsements() {
        return excessEndorsements;
    }



}
