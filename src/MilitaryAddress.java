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
    Random ranNumGen = new Random();

    private final String[] poBoxes = {
            "poBox 123",
            "poBox456",
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

    public void randomise(){
        poBox = poBoxes[ranNumGen.nextInt(1)];
        mBarracks = "Aldershot";
        mBFPONumber = "BFPO 65";
        mRank = "Corporal";
        mRegiment = "Grenadier Gaurds";
        mServiceNumber = "30093857";
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
