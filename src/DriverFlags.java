import java.util.Date;
import java.util.Random;

/**
 * Created by Rob James on 30/10/2016.
 */
public class DriverFlags {

    Random ranNumGen = new Random();

    String flag ;
    Date driverFlagValidFrom;
    Date driverFlagValidTo;
    private final String isManual[] ={
            "Y",
            "N",
    };
    String manual = isManual[ranNumGen.nextInt(2)];

    private final String dupOfLic[] = {
            "Y",
            "N",
    };
    String duplicateOfLicence;

    private final String xOfLic[] ={
            "Y",
            "N",
    };
    Boolean exchangeOfLicence;

    private final String highFeePaid[]={
            "Y",
            "N",
    };
    Boolean higherFeePaid;

    private final String isYngDvr[] ={
            "Y",
            "N",
    };
    Boolean onYoungDriverScheme;

    private final String paidUp[] ={
            "Y",
            "N",
    };
    Boolean lifeFeePaid;

    private final String mim[] ={
            "Y",
            "N",
    };
    Boolean medicalInvestigationRequiredForMedicalIssue;

    private final String OrdMim[] ={
            "Y",
            "N",
    };
    Boolean ordinaryMedicalInvestigaitonInProgress;

    private final String OrdMimDec[] ={
            "Y",
            "N",
    };
    Boolean ordinaryMedicalDeclerationMade;

    private final String mimpapers[] ={
            "Y",
            "N",
    };
    Boolean ordinaryMedicalPapersHled;

    private final String photoInvSnt[] ={
            "Y",
            "N",
    };
    String photoInvitationSent;

    private final String mobility[] ={
            "Y",
            "N",
    };
    Boolean receivesMobilityallowance;

    private final String rest[] ={
            "Y",
            "N",
    };
    Boolean restrictedAsSpecifiedInSecretaryOfStateNotice;

    private final String sightCorr[] ={
            "Y",
            "N",
    };
    Boolean sightCorrectionRequired;

    private final String vocMim[] ={
            "Y",
            "N",
    };
    Boolean vocationalMedicalPapersHeld;

    private final String vocMimOngong[] ={
            "Y",
            "N",
    };
    Boolean vocationalMedicalInvestigationInProgress;

    private final String xEndorse[] ={
            "Y",
            "N",
    };
    Boolean excessEndorsements;

    private final String disquak[] ={
            "Y",
            "N",
    };
    Boolean disqualified;

    private final String isDttp[] ={
            "Y",
            "N",
    };
    Boolean dttp;

    private final String isRttp[] ={
            "Y",
            "N",
    };
    Boolean rttp;

    private final String isDtetp[] ={
            "Y",
            "N",
    };
    Boolean dtetp;




}
