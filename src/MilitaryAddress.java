import java.util.Random;

/**
 * Created by Rob James on 26/10/2016.
 */
public class MilitaryAddress {
    private String poBox;
    private String mBarracks;
    private String mBFPONumber;
    private String mRank;
    private String mRegiment;
    private String mServiceNumber;
    private String mUnit;
    private String Type;
    Random ranNumGen = new Random(1);

    private final String[] poBoxes = {
            "poBox 123",
            "poBox456",
            "poBox555",
            "poBox987",
    };

    private final String[] barraks = {
            "Aldershot",
            "SennyBridge",
            "Beacon Barracks",
            "Blandford Camp",
    };

    private  final String[] BFPONo = {
            "BFPO65",
            "BFPO755",
            "BFPO999",
            "BFPO7362",
    };

    public MilitaryAddress() {
        poBox = "";
        mBarracks = "";
        mBFPONumber = "";
        mRank = "";
        mRegiment = "";
        mServiceNumber = "";
        mUnit = "";
        Type = "";
    }

    private final String rank[] = {
            "Corporal",
            "Sergeant",
            "Lance Corporal",
            "Private",
    };

    private final String regiment[] = {
            "Blues and Royals",
            "Grenadier Guards",
            "ColdStream Guards",
            "The Parachute Regiment",
    };

    private final String serviceNo[] = {
            "3004455",
            "30055632",
            "3006859",
            "3009875",
    };

    public void randomise(){
        poBox = poBoxes[ranNumGen.nextInt(4)];
        mBarracks = barraks[ranNumGen.nextInt(4)];
        mBFPONumber = BFPONo[ranNumGen.nextInt(4)];
        mRank = rank[ranNumGen.nextInt(4)];
        mRegiment = regiment[ranNumGen.nextInt(4)];
        mServiceNumber = serviceNo[ranNumGen.nextInt(4)];
        mUnit = "Infantry";
        Type = "G1";
    }

    public String getPoBox() { return poBox;
    }

    public String getmBarracks() {
        return mBarracks;
    }

    public String getmBFPONumber() {
        return mBFPONumber;
    }

    public String getmRank() {
        return mRank;
    }

    public String getmRegiment() {
        return mRegiment;
    }

    public String getmServiceNumber() {
        return mServiceNumber;
    }

    public String getmUnit() {
        return mUnit;
    }

    public String getType() {
        return Type;
    }

    public Random getRanNumGen() {
        return ranNumGen;
    }


}
