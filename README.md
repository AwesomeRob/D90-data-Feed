# D90-data-Feed
Mock up of data


import java.util.Random;  /** This imports the random number generator */

/**
 * Created by Rob James on 26/09/2016.
 */
public class JavaD90Feed {
    public static void main(String[] args) {


        String dln[] = new String[100]; /** String for driving licence number */
        dln[0] = "SHAPT304148AL9TP ";
        dln[1] = "JAMES508124dr9HG ";
        dln[2] = "PETER503225TJ9JJ ";
        dln[3] = "PHILL201083G99RN ";
        dln[4] = "DYER9227093DM9XX ";
        dln[5] = "MORGA320116BB9MB ";
        dln[6] = "WILLI307030DM9HH ";
        dln[7] = "THOMA603314TD9RH ";
        dln[8] = "BETTS503227DM9LK ";
        dln[9] = "DAVIN410104NB9JJ ";
        dln[10] = "JENKS601235PD9GH ";
        dln[11] = "KERMA708037JJ9FV ";
        dln[12] = "DUDLE803045HI9GG ";
        dln[13] = "VENDU902034BJ9EN ";
        dln[14] = "NEWTO804206KK9LN ";
        dln[15] = "IP999804155BS9YY ";
        dln[16] = "BOE99604032LJ9JL ";
        dln[17] = "BALL9704218ZE9KS ";
        dln[18] = "BAZIL505032J99HX ";
        dln[19] = "AUROE606085K99HS ";
        dln[20] = "DAVIE703046WE9LA ";
        dln[21] = "BENDI912195CK9PQ ";
        dln[22] = "MANSO903145HG9JN ";
        dln[23] = "KINUN405167AT9CV ";
        dln[24] = "RICHA306175DD9MM ";
        dln[25] = "LOVEL805278G99KQ ";
        dln[26] = "MONKT802304D99JH ";
        dln[27] = "NEWBY205125DT9NA ";
        dln[28] = "HAMME506179m99KD ";
        dln[29] = "DAVIE401017M98GH ";
        dln[30] = "SISSO506189P99TP ";
        dln[31] = "MICHA310098DV9NH ";
        dln[32] = "SLIMJ904153J99RM ";
        dln[33] = "DEVON405139KH9FR ";
        dln[34] = "FERRA405063EH9JN ";
        dln[35] = "TOMLI705046RJ9HS ";
        dln[36] = "MEIND605025F99JR ";
        dln[37] = "DAISY809024RH9JJ ";
        dln[38] = "LUBLO511154PO9BN ";
        dln[39] = "MOWBY906258RJ9KK ";
        dln[40] = "LEONA904156E99IJ ";
        dln[41] = "DEBBI609314JB9JE ";
        dln[42] = "HARRI609035BB9JJ ";
        dln[43] = "LAZY9707045MT9JK ";
        dln[44] = "NEIFT504076RJ9KK ";
        dln[45] = "EIWKT405064RJ8NN ";
        dln[46] = "TOBY9705046RN9KK ";
        dln[47] = "MEOGN905145HT9KJ ";
        dln[48] = "NETOM605043LK9SN ";
        dln[49] = "MOMOM805038YH9JK ";
        dln[50] = "BOWLB304056JC9KH ";
        dln[51] = "NEEKT905040J99KI ";
        dln[52] = "SADIQ905089MK9FJ ";
        dln[53] = "MESMA605034TQ9NV ";
        dln[54] = "LABUT805073K99BV ";
        dln[55] = "TOTOU605025r99JK ";
        dln[56] = "UBUNT305067LK9FR ";
        dln[57] = "LINUX305079LK9NJ ";
        dln[58] = "APPLE507034SJ9HJ ";
        dln[59] = "ANDRO406179GO9IO ";
        dln[60] = "HELLO906175H99JW ";
        dln[61] = "CHILL604056T99JJ ";
        dln[62] = "ANDRE204056R99JK ";
        dln[63] = "HOLLO608098P99KH ";
        dln[64] = "GUMBA309045TB9JK ";
        dln[65] = "PEGAS709045RH9JI ";
        dln[66] = "PEWTA405076BE9MM ";
        dln[67] = "ALBRI607098G99MA ";
        dln[68] = "WESTO607045GB9MA ";
        dln[69] = "ALBRI508096B99ER ";
        dln[70] = "HOLA9507054BR9KL ";
        dln[71] = "TSE99609054SC9NG ";
        dln[72] = "OLIVE406239OR9NN ";
        dln[73] = "JAMES202205OR9JK ";
        dln[74] = "MOGFO905064KJ9ES ";
        dln[75] = "BETTY406079M99ER ";
        dln[76] = "BOWLB705065JH9JR ";
        dln[77] = "BERES506078I99KL ";
        dln[78] = "BEATY809056B99KE ";
        dln[79] = "ALISO509087TR9PO ";
        dln[80] = "ALBRI907087Z99AK ";
        dln[81] = "MADIS708098KS9FH ";
        dln[82] = "BOWYE904056KH9JS ";
        dln[83] = "COSSI512256JD9HE ";
        dln[84] = "WINFI305067HF9KK ";
        dln[85] = "GALLI703058JE9XE ";
        dln[86] = "GUTTU305067AC9JK ";
        dln[87] = "MESSI506034KE8LL ";
        dln[88] = "VANDE409245P99NE ";
        dln[89] = "CARVE804234KJ9NE ";
        dln[90] = "FRANI607035RJ8HE ";
        dln[91] = "BEST9506078GP9KL ";
        dln[92] = "FRANK709246FR9JK ";
        dln[93] = "NIKKI607047BR9GH ";
        dln[94] = "BRVLA604056N99KL ";
        dln[95] = "ALBIE806253NR9HE ";
        dln[96] = "BESTW507034M99LK ";
        dln[97] = "VIVIE906078BR9TH ";
        dln[98] = "ABAST406056TS9WE ";
        dln[99] = "PIQUE604056NH9KL ";


        String title[] = new String[9];      /** Array to stor titles */
        title[0] = "Mr";
        title[1] = "Mrs";
        title[2] = "Miss";
        title[3] = "Ms";
        title[4] = "Dr";
        title[5] = "Rev";
        title[6] = "Sir";
        title[7] = "Lady";
        title[8] = "Lord";




        String firstName[] = new String[100]; /** Array to store first name(s) */
        firstName[0] = "Alice Louise";
        firstName[1] = "Amy";
        firstName[2] = "Annabell Mary";
        firstName[3] = "Andrew Lee";
        firstName[4] = "Alistair";
        firstName[5] = "Aurielia";
        firstName[6] = "Anthony Peter";
        firstName[7] = "Bruce";
        firstName[8] = "Brian Michael";
        firstName[9] = "Briony";
        firstName[10] = "Baryan";
        firstName[11] = "Bethan Louise";
        firstName[12] = "Brenda";
        firstName[13] = "Barbara";
        firstName[14] = "Chris John";
        firstName[15] = "Christine";
        firstName[16] = "Catherine";
        firstName[17] = "Caitlin Louise";
        firstName[18] = "Christie";
        firstName[19] = "Cooper";
        firstName[20] = "Callum John";
        firstName[21] = "Daniel";
        firstName[22] = "Derek";
        firstName[23] = "David John";
        firstName[24] = "Destiny";
        firstName[25] = "Delia";
        firstName[26] = "Diana Louise";
        firstName[27] = "Danielle";
        firstName[28] = "Eric";
        firstName[29] = "Ernie John";
        firstName[30] = "Ethel Mary";
        firstName[31] = "Estelle";
        firstName[32] = "Francis";
        firstName[33] = "Fred John";
        firstName[34] = "Frank";
        firstName[35] = "Fizel";
        firstName[36] = "Graham";
        firstName[37] = "Gareth";
        firstName[38] = "Gemma";
        firstName[39] = "Georgia";
        firstName[40] = "George John";
        firstName[41] = "Garry";
        firstName[42] = "Hayley";
        firstName[43] = "Harrison John";
        firstName[44] = "Henry";
        firstName[45] = "Harriet";
        firstName[46] = "Herbert";
        firstName[47] = "Hammad";
        firstName[48] = "Ieuan";
        firstName[49] = "Isabelle";
        firstName[50] = "Ian";
        firstName[51] = "Iolo";
        firstName[52] = "James";
        firstName[53] = "Janet Mary";
        firstName[54] = "Julie";
        firstName[55] = "Janine";
        firstName[56] = "Jenna";
        firstName[57] = "Justin";
        firstName[58] = "Jacob John";
        firstName[59] = "Katie";
        firstName[60] = "Kris";
        firstName[61] = "Katherine";
        firstName[62] = "Kamal";
        firstName[63] = "Kevin";
        firstName[64] = "Kelvin";
        firstName[65] = "Kylie Louise";
        firstName[66] = "Lee";
        firstName[67] = "Luke";
        firstName[68] = "Luigi";
        firstName[69] = "Liam";
        firstName[70] = "Letisha Louise";
        firstName[71] = "Larry";
        firstName[72] = "Mark John";
        firstName[73] = "Michael";
        firstName[74] = "Mary Louise";
        firstName[75] = "Morgan";
        firstName[76] = "Misha Louise";
        firstName[77] = "Matilda";
        firstName[78] = "Nigel John";
        firstName[79] = "Nathan";
        firstName[80] = "Niamh";
        firstName[81] = "Norris John";
        firstName[82] = "Norman";
        firstName[83] = "Neil";
        firstName[84] = "Nora Mary";
        firstName[85] = "Oliver";
        firstName[86] = "Olivia";
        firstName[87] = "Olaf";
        firstName[88] = "Peter John";
        firstName[89] = "Paula";
        firstName[90] = "Prescilla";
        firstName[91] = "Paul John";
        firstName[92] = "Robert";
        firstName[93] = "Richard";
        firstName[94] = "Rachel Louise";
        firstName[95] = "Sam";
        firstName[96] = "Sarah Louise";
        firstName[97] = "Ted";
        firstName[98] = "Vivian";
        firstName[99] = "William";

        String lastName[] = new String[100]; /** Array to store last names */
        lastName[0] = "Ahmed";
        lastName[1] = "Allyson";
        lastName[2] = "Ames";
        lastName[3] = "Anthony";
        lastName[4] = "Archibald";
        lastName[5] = "Antolin";
        lastName[6] = "Baker";
        lastName[7] = "Baxter";
        lastName[8] = "Bevan";
        lastName[9] = "Bates";
        lastName[10] = "Billard";
        lastName[11] = "Caxton";
        lastName[12] = "Cross";
        lastName[13] = "Christie";
        lastName[14] = "Caterham";
        lastName[15] = "Daniels";
        lastName[16] = "Devonald";
        lastName[17] = "Diss";
        lastName[18] = "Edwards";
        lastName[19] = "Eisenhower";
        lastName[20] = "Eccles";
        lastName[21] = "Eddershaws";
        lastName[22] = "Emilio";
        lastName[23] = "Elena";
        lastName[24] = "Francies";
        lastName[25] = "Fellows";
        lastName[26] = "Fell";
        lastName[27] = "Ford";
        lastName[28] = "Ferrara";
        lastName[29] = "Gravelle";
        lastName[30] = "Grant";
        lastName[31] = "Gillespie";
        lastName[31] = "Gutierrez";
        lastName[32] = "Guttuso";
        lastName[33] = "Graham";
        lastName[34] = "Harris";
        lastName[35] = "Harries";
        lastName[36] = "Humphries";
        lastName[37] = "Harrison";
        lastName[38] = "James";
        lastName[39] = "Jones";
        lastName[40] = "John";
        lastName[41] = "Johnson";
        lastName[42] = "Jenkins";
        lastName[43] = "Jenks";
        lastName[44] = "Jukes";
        lastName[45] = "Lamb";
        lastName[46] = "Larkin";
        lastName[47] = "Latham";
        lastName[48] = "Lesley";
        lastName[49] = "Large";
        lastName[50] = "Leeder";
        lastName[51] = "Leek";
        lastName[52] = "Leonard";
        lastName[53] = "Laferty";
        lastName[54] = "Mabe";
        lastName[55] = "MacDonald";
        lastName[56] = "McKenzie";
        lastName[57] = "Morrow";
        lastName[58] = "Morgan";
        lastName[59] = "Marsden";
        lastName[60] = "Mann";
        lastName[61] = "Macintosh";
        lastName[62] = "McNeil";
        lastName[63] = "McBrian";
        lastName[64] = "Maggs";
        lastName[65] = "Major";
        lastName[66] = "Marlow";
        lastName[67] = "Norris";
        lastName[68] = "Neville";
        lastName[69] = "Nikita";
        lastName[70] = "Naylor";
        lastName[71] = "Northcott";
        lastName[72] = "Nichols";
        lastName[73] = "Nash";
        lastName[74] = "Neal";
        lastName[75] = "Nunn";
        lastName[76] = "Northwood";
        lastName[77] = "North";
        lastName[78] = "Newton";
        lastName[79] = "O'riely";
        lastName[80] = "O'Brian";
        lastName[81] = "O'Malley";
        lastName[82] = "Oates";
        lastName[83] = "Oakley";
        lastName[85] = "Owens";
        lastName[86] = "Peters";
        lastName[87] = "Phillips";
        lastName[88] = "Roberts";
        lastName[89] = "Richards";
        lastName[90] = "Richardson";
        lastName[91] = "Raddison";
        lastName[92] = "Ritchie";
        lastName[93] = "Sullivan";
        lastName[94] = "Silva";
        lastName[95] = "Smith";
        lastName[96] = "Winfield";
        lastName[97] = "Williamson";
        lastName[98] = "Williams";
        lastName[99] = "Young";









        Random ranNumGen = new Random ();                                                                      /** Creating random number generator */
        int counter = 0;                                                                                       /** Declaring the counter variable for use in a while loop */





        /** While loop outputting all data */

        while (counter < 10) {                                                                                 /** While loop to generate X number of records */
            int randNum = ranNumGen.nextInt(99);                                                               /** Declaring the variable which holds the random number and setting it to generate numbers up to 99 */
            int randNum2 = ranNumGen.nextInt(2);
            int randNum3 = ranNumGen.nextInt(9);
            int gender = randNum2;
            int organDonation = randNum2;



            System.out.println(dln[randNum] + " " + firstName[randNum] + " " + lastName[randNum] + " " + (gender == 0 ? "M" : "F") + " " + "United Kingdom" + " " + (organDonation == 0 ? "Y" : "N") + " " );             /** Printing a record to screen */
            counter++;                                                                                         /** adding 1 to the counter */
        }



    }
}
