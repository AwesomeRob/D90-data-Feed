import sun.java2d.pipe.SpanShapeRenderer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Random;  /** This imports the random number generator */
import java.text.SimpleDateFormat;
import java.util.List;



/**
 * Created by Rob James on 26/09/2016.
 */
public class JavaD90Feed {
    public static void main(String[] args) {

        /** String Array for driving licence number */
        final String[] dln = {
                "SHAPT304148AL9TP",
                "JAMES508124dr9HG",
                "PETER503225TJ9JJ",
                "PHILL201083G99RN",
                "DYER9227093DM9XX",
                "MORGA320116BB9MB",
                "WILLI307030DM9HH",
                "THOMA603314TD9RH",
                "BETTS503227DM9LK",
                "DAVIN410104NB9JJ",
                "JENKS601235PD9GH",
                "KERMA708037JJ9FV",
                "DUDLE803045HI9GG",
                "VENDU902034BJ9EN",
                "NEWTO804206KK9LN",
                "IP999804155BS9YY",
                "BOE99604032LJ9JL",
                "BALL9704218ZE9KS",
                "BAZIL505032J99HX",
                "AUROE606085K99HS",
                "DAVIE703046WE9LA",
                "BENDI912195CK9PQ",
                "MANSO903145HG9JN",
                "KINUN405167AT9CV",
                "RICHA306175DD9MM",
                "LOVEL805278G99KQ",
                "MONKT802304D99JH",
                "NEWBY205125DT9NA",
                "HAMME506179m99KD",
                "DAVIE401017M98GH",
                "SISSO506189P99TP",
                "MICHA310098DV9NH",
                "SLIMJ904153J99RM",
                "DEVON405139KH9FR",
                "FERRA405063EH9JN",
                "TOMLI705046RJ9HS",
                "MEIND605025F99JR",
                "DAISY809024RH9JJ",
                "LUBLO511154PO9BN",
                "MOWBY906258RJ9KK",
                "LEONA904156E99IJ",
                "DEBBI609314JB9JE",
                "HARRI609035BB9JJ",
                "LAZY9707045MT9JK",
                "NEIFT504076RJ9KK",
                "EIWKT405064RJ8NN",
                "TOBY9705046RN9KK",
                "MEOGN905145HT9KJ",
                "NETOM605043LK9SN",
                "MOMOM805038YH9JK",
                "BOWLB304056JC9KH",
                "NEEKT905040J99KI",
                "SADIQ905089MK9FJ",
                "MESMA605034TQ9NV",
                "LABUT805073K99BV",
                "TOTOU605025r99JK",
                "UBUNT305067LK9FR",
                "LINUX305079LK9NJ",
                "APPLE507034SJ9HJ",
                "ANDRO406179GO9IO",
                "HELLO906175H99JW",
                "CHILL604056T99JJ",
                "ANDRE204056R99JK",
                "HOLLO608098P99KH",
                "GUMBA309045TB9JK",
                "PEGAS709045RH9JI",
                "PEWTA405076BE9MM",
                "ALBRI607098G99MA",
                "WESTO607045GB9MA",
                "ALBRI508096B99ER",
                "HOLA9507054BR9KL",
                "TSE99609054SC9NG",
                "OLIVE406239OR9NN",
                "JAMES202205OR9JK",
                "MOGFO905064KJ9ES",
                "BETTY406079M99ER",
                "BOWLB705065JH9JR",
                "BERES506078I99KL",
                "BEATY809056B99KE",
                "ALISO509087TR9PO",
                "ALBRI907087Z99AK",
                "MADIS708098KS9FH",
                "BOWYE904056KH9JS",
                "COSSI512256JD9HE",
                "WINFI305067HF9KK",
                "GALLI703058JE9XE",
                "GUTTU305067AC9JK",
                "MESSI506034KE8LL",
                "VANDE409245P99NE",
                "CARVE804234KJ9NE",
                "FRANI607035RJ8HE",
                "BEST9506078GP9KL",
                "FRANK709246FR9JK",
                "NIKKI607047BR9GH",
                "BRVLA604056N99KL",
                "ALBIE806253NR9HE",
                "BESTW507034M99LK",
                "VIVIE906078BR9TH",
                "ABAST406056TS9WE",
                "PIQUE604056NH9KL",

        };

        /** String array for title */
        final String[] title = {
                "Mrs",
                "Miss",
                "Ms",


        };

        /** Array to store MALE first name(s) */
        final String[] firstNameMale = {
                "Andrew",
                "Alistair",
                "Anthony",
                "Bruce",
                "Brian",
                "Callum",
                "Daniel",
                "Derek",
                "David",
                "Eric",
                "Ernie",
                "Francis",
                "Fred",
                "Frank",
                "Fizel",
                "Graham",
                "Gareth",
                "George",
                "Garry",
                "Harrison",
                "Henry",
                "Herbert",
                "Hammad",
                "Ieuan",
                "Ian",
                "Iolo",
                "James",
                "Justin",
                "Jacob",
                "Kris",
                "Kamal",
                "Kevin",
                "Kelvin",
                "Lee",
                "Luke",
                "Luigi",
                "Liam",
                "Larry",
                "Mark",
                "Michael",
                "Morgan",
                "Nigel",
                "Nathan",
                "Norris",
                "Norman",
                "Neil",
                "Oliver",
                "Olaf",
                "Peter",
                "Paul",
                "Robert",

        };


        /** Array to store FEMALE first name(s) */
        final String[] firstNameFemale = {
                "Amy",
                "Annabel",
                "Aurielia",
                "Briony",
                "Bethan",
                "Brenda",
                "Barbara",
                "Christine",
                "Catherine",
                "Caitlin",
                "Christie",
                "Destiny",
                "Delia",
                "Diana",
                "Danielle",
                "Ethel",
                "Estelle",
                "Francis",
                "Gemma",
                "Georgia",
                "Hayley",
                "Harriet",
                "Isabelle",
                "Janet",
                "Julie",
                "Janine",
                "Jenna",
                "Katie",
                "Kris",
                "Katherine",
                "Kylie",
                "Lee",
                "Letisha",
                "Mary",
                "Misha",
                "Matilda",
                "Niamh",
                "Nora",
                "Olivia",
                "Paula",
                "Priscilla",
                "Rachel",
                "Sam",
                "Sarah",
                "Sibon",
                "Tabitha",
                "Rowena",
                "Kirsty",
                "Katrina",
                "Vivian",
        };


        /** Array to store MALE middle name(s) */
        final String[] middleNameMale = {
                "Andre",
                "Ali",
                "Tony",
                "",
                "Christopher",
                "",
                "Daniel",
                "Derek",
                "David",
                "Dall",
                "",
                "Ernie",
                "Edwin",
                "Frederick",
                "Franz",
                "",
                "Graham",
                "Gareth",
                "George John",
                "Gary",
                "Harri",
                "Henry",
                "Herbert",
                "",
                "Ian",
                "",
                "Dave",
                "James",
                "Jack",
                "Jacob John",
                "",
                "Kevin",
                "Kelvin",
                "Leigh",
                "Luke",
                "Leonard",
                "Noel",
                "Largo",
                "Marc",
                "Mikey",
                "May",
                "Mogford",
                "",
                "Nigel John",
                "Norman",

                "Paul John",
                "Robert",
                "Richard",
                "Viv",
                "Will",
        };

        /** Array to store FEMALE middle name(s) */
        final String[] middleNameFemale = {
                "Amy",
                "Angharad",
                "Alison",
                "Betty",
                "Blodwen",
                "Beau",
                "Chrystal",
                "Cerry",
                "Cariad",
                "Delyth",
                "Diana",
                "Delia",
                "Diane",
                "Dorothy",
                "Deborah",
                "Carolie",
                "Carly",
                "Elleri",
                "Francine",
                "",
                "Gemma",
                "",
                "Hazel",
                "Harriett",
                "",
                "Izzy",
                "Janet Mary",
                "Julie",
                "Hillary",
                "Jennaveve",
                "Kate",
                "Krissy",
                "Katherine",
                "",
                "Kylie Louise",
                "Leigh",
                "Louise",
                "May",
                "Jane",
                "",
                "",
                "",
                "Nora Mary",
                "Olivia",
                "",
                "Paula",
                "",
                "Rachel Louise",
                "Sam",
                "Sara",
                "Viv",
        };

        /** Array to store last names */
        final String[] lastName = {
                "Ahmed",
                "Allyson",
                "Ames",
                "Anthony",
                "Archibald",
                "Antolin",
                "Baker",
                "Baxter",
                "Bevan",
                "Bates",
                "Billard",
                "Caxton",
                "Cross",
                "Christie",
                "Caterham",
                "Daniels",
                "Devonald",
                "Diss",
                "Edwards",
                "Eisenhower",
                "Eccles",
                "Eddershaws",
                "Emilio",
                "Elena",
                "Francies",
                "Fellows",
                "Fell",
                "Ford",
                "Ferrara",
                "Gravelle",
                "Grant",
                "Gillespie",
                "Gutierrez",
                "Guttuso",
                "Graham",
                "Harris",
                "Harries",
                "Humphries",
                "Harrison",
                "James",
                "Jones",
                "John",
                "Johnson",
                "Jenkins",
                "Jenks",
                "Jukes",
                "Lamb",
                "Larkin",
                "Latham",
                "Lesley",
                "Large",
                "Leeder",
                "Leek",
                "Leonard",
                "Laferty",
                "Mabe",
                "MacDonald",
                "McKenzie",
                "Morrow",
                "Morgan",
                "Marsden",
                "Mann",
                "Macintosh",
                "McNeil",
                "McBrian",
                "Maggs",
                "Major",
                "Marlow",
                "Norris",
                "Neville",
                "Nikita",
                "Naylor",
                "Northcott",
                "Nichols",
                "Nash",
                "Neal",
                "Nunn",
                "Northwood",
                "North",
                "Newton",
                "O'riely",
                "O'Brian",
                "O'Malley",
                "Oates",
                "Oakley",
                "Owens",
                "Peters",
                "Phillips",
                "Roberts",
                "Richards",
                "Richardson",
                "Raddison",
                "Ritchie",
                "Sullivan",
                "Silva",
                "Smith",
                "Winfield",
                "Williamson",
                "Williams",
                "Young",

        };

        /** Array for prov entitlements */
        final String[] provEntitlement = {
                "A1 A B BE F K L N P",
                "A A1 BE F K L N P",
                "C1 F K L N P",
                "D1 F K L N P",
                "C1 F K L N P",
                "D F K L N P",
                "B F K L N P",
                "F K L N P",
                "D1E F K L N P",
        };


        /** Array for full entitlements */
        final String[] fullEntitlement = {
                "Null",
                "B",
                "A B BE",
                "B BE B1 C1 C1E",
                "B D1",
                "B BE C1 C1E C CE",
                "A",
                "B BE",
                "A B D1",
        };


        /** Creating random number generator in main */
        Random ranNumGen = new Random();
        /** Declaring the counter variable for use in a while loop */
        int counter = 0;
        /**Importing random date function*/





        /** String array for test pass category & date */
        final String[] testPass = {
                "Null",
                "B",
                "A B BE",
                "B BE B1 C1 C1E",
                "B D1",
                "B BE C1 C1E C CE",
                "A",
                "B BE",
                "A B D1",
        };

        /** String array for place of birth */
        final String[] birthPlace = {
                "Wales",
                "England",
                "Scotland",
                "Northern Ireland",
                "United Kingdom",
                "Spain",
                "USA",
                "Great Britain",
                "Australia",
        };

        // Open the address file
        // Check valid path
        String csvFilePath = "C:\\Work Docs\\Java Code Drivers PoC\\Address Data\\valid_addresses.csv";
        String line;
        String delimiter = ",";
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(csvFilePath));
            line = br.readLine();
        }
        catch (IOException e)
        {
            System.out.println("There was a problem opening the address file: " + e.getMessage());
            br = null;
        }



        /** While loop outputting all data ****************************************************************************** */


        while (counter < 20) {          /** #start of While loop to generate X number of records */


            int randNumDln = ranNumGen.nextInt(99);/** Declaring the variable which holds the random number and setting it to generate numbers up to 99 */
            int randNumMn = ranNumGen.nextInt(50); //Middle Name random generator
            int randNumMale = ranNumGen.nextInt(50);
            int randNumFemale = ranNumGen.nextInt(50);
            //int randNumFn = ranNumGen.nextInt(99);
            int randNumLn = ranNumGen.nextInt(99);
            int randNumPoB = ranNumGen.nextInt(9);
            int randNumBool = ranNumGen.nextInt(2);                                                               /** generating a second random number */
            int randNumTitle = ranNumGen.nextInt(3);
            int randNumProv = ranNumGen.nextInt(9);
            int randNumFull;
            int randNumTp;
            //int gender = randNumBool;
            int organDonation = randNumBool;

            String firstName;
            String mddleName;
            String surName;
            String gender;
            String Title;


            Date DoB = LicDates.RandomDate(1920,1999);
            Date issueDate = LicDates.RandomDate(2010,2015);
            Date expiryDate = LicDates.RandomDate(2016,2026);
            Date photoExpDate = LicDates.RandomDate(2016,2026);


            randNumFull = randNumProv;
            randNumTp = randNumProv;



            if (randNumBool == 0) {
                firstName = firstNameMale[randNumMale];
                mddleName = middleNameMale[randNumMn];
                gender = "M";
            }
            else {
                firstName = firstNameFemale[randNumFemale];
                mddleName = middleNameFemale[randNumMn];
                gender = "F";
            }

            if (gender == "M") {
                Title = "Mr";
            }
            else {
                Title = title[randNumTitle];
            }

            // Get an address line
            line = "";
            try {
                line = br.readLine();
            }
            catch (IOException e) {
                System.out.println("There was a problem reading a line from the address file: " + e.getMessage());
            }

            // Split the line into an array
            String[] col = line.split(delimiter);

            // Reads the array into separate strings
            String line1 = col[0];
            String line2 = col[1];
            String line3 = col[2];
            String line4 = col[3];
            String posttown = col[4];
            String postcode = col[5];
            // Additional IEP Address Fields
            String Country; // could reuse country of birth array?
            String langCode;
            String pafKey;
            String orgName;
            String buildingNumber;
            String buildingName;
            String subBuildingName;
            String tfare;
            String dtfair;
            String ddtfare;
            String dLocality;
            String ddLocality;
            //post Town;
            String County;
            //String postCode;
            String poBox;
            String mBarracks;
            String mBFPONumber;
            String mRank;
            String mRegiment;
            String mServiceNumber;
            String mUnit;
            String Type;
            Date validFrom = LicDates.RandomDate(1983,2015);
            Date validTo = LicDates.RandomDate(2015,2016);
            String vanityInfo;
            List<String> uLine;
            String uPostCode;
            String value;  //Used ind public enum AddressType
            String valueName;  //Used ind public enum AddressType
            // End of IEP Address Variables;

            // IEP's Birth Details variables
            String verificationLevelBirthDateCode;
            String verificationLevelBirthDateName;
            //Date getDate();
            // End of IEP's Birth Details Variables

            // IEP's Certificate of Professional Competence Variables
            String creatingReasonCode;
            String updatingReasonCode;
            Date recordvalidFrom;
            Date recordvalidTo;
            Date LGVValidFrom;
            Date PCVValidFrom;
            Date PCVValidTo;
            //End of IEP's Certificate of Professional Competence Variables

            // IEP's Conduct Case Variables
            Date decisionDate;
            String letterType;
            String letter;
            String lgvLGVAppealResult;
            String LGVOutcome;
            Date LGVRevocationValidFrom;
            Date LGVRevocationValidTo;
            String PCVAppealResult;
            String PCVOutcome;
            Date PCVRecovationValidFrom;
            Date PCVRevocationValidTo;
            String publicEnquiryStatusType;
            Date startDate;
            String statusType;
            int TAOPartyID;
            //List<ConductCaseEvent> events;   //needs to be uncommented
            //End of IEP Conduct Case Variables

            // IEP's Conduct Case Event Variables        ARE THESE VARIABLES OR ARE THEY ACTUALLY CLASSES?
            Date eventDate;
            String eventType;
            String nonEndorsableOffence;
            //Date getEventDate();      //Needs uncommenting
            //End of IEP Conduct Case Variables

            // IEP Country Variables
            String name;
            String Code;
            String internalName;
            String internalCode;
            //public String getName();
            //End of IEP Variables

            // IEP Death details Variables
            Date deathDate;
            String verificationLevelDeathDateCode;
            // END

            // IEP Disqualification Variables
            Date disqDate;
            Date disqFromDate;
            Date disqToDate;
            Boolean forLife;
            int endorsementID;
            Boolean concurrent;
            String type;
            Date disqvalidFrom;
            Date disqvalidTo;
            //End

            // IEP Driver Variables
            // List<DriverNumber> driverNumberHistory;       NEEDS UNCOMMENTING
            // List<DrierFlag> flags;                        "
            // private Licence licence;
            // private DriverStatus status;
            // private DriverStatedFlags driverStatedFlags
            Date firstProvisionalDate;
            Date DisqualifiedUntilDate;
            // private disqualificationUntilType disqualifiedUntilType;
            String HROType;
            // List<ConductCase> ConductCases;
            // private Disqualification matchedDisqualification;
            // List<Disqualification> disqualifications;
            // List<TachoCard> tachoCards;
            //List<CertificateOfProfessionalCompetence> CPCs;
            // List<DriverQualificaitonCard> DQCs;
            // List<TestPass> testPasses;
            // List<String> errorCodes;
            Boolean nslInCorruptedRange;
            // List<LicenceToken> licenceTokens;
            Boolean blockedRecord = false;
            String deltaFileName;
            Date CreationTime;












                System.out.println( dln[randNumDln] + " / " + Title + " / " +
                    firstName + " "+ mddleName + " / " + lastName[randNumLn] + " / " + DoB.toString() +
                    " / " + gender + " / " + birthPlace[randNumPoB] + " / " + line1 + "," + line2 + "," + posttown + "," + postcode + " / " + (organDonation == 0 ? "Y" : "N") +
                    " / " + testPass[randNumTp] + " / " + fullEntitlement[randNumFull] + " / " + provEntitlement[randNumProv]
                        + " / " + issueDate.toString() + " / " + expiryDate.toString() + " / " + photoExpDate.toString() + " / ");             /** Printing a record to screen */

            /** adding 1 to the counter */
            counter++;


        }
    }

}

