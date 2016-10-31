import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * Created by Rob James on 27/10/2016.
 */
public class ImageDetails {

    Random ranNumGen = new Random(1);
    //UUID uuid = UUID.randomUUID();
    //String randomUUIDString = uuid.toString();

    private final String photoLic[] = {
            "Photocard",
            "Paper",
    };
    String isPhotoCard;

    Date imageCaptureDate;

    private final String imgType[] = {
            "Jpeg",
            "png",
    };
    String imageFormat;
    String imageID;

    private final String imgOrig[] = {
            "UKPS",
            "Pol Scanned",
    };
    String imageOrigin;

    Date imageValidFrom;
    Date imageValidTo;


    public void randomise() {
        isPhotoCard = photoLic[ranNumGen.nextInt(2)];;
        imageCaptureDate = LicDates.RandomDate(2005, 2015);;
        imageFormat = imgType[ranNumGen.nextInt(2)];
        //imageID = randomUUIDString;
        imageOrigin = imgOrig[ranNumGen.nextInt(2)];
        imageValidFrom = imageCaptureDate;
        imageValidTo = LicDates.RandomDate(2015, 2025);
    }


    public String getIsPhotoCard() {
        return isPhotoCard;
    }

    public Date getImageCaptureDate() {
        return imageCaptureDate;
    }

    public String getImageFormat() {
        return imageFormat;
    }

    public String getImageID() {
        return imageID;
    }

    public String getImageOrigin() {
        return imageOrigin;
    }

    public Date getImageValidFrom() {
        return imageValidFrom;
    }

    public Date getImageValidTo() {
        return imageValidTo;
    }




}
