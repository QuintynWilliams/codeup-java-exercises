public class SyntaxLesson {

    public static void main(String[] args) {
//      Comment
        /*      Another Comment*/
        /*
            Multi-Line Comment
         */
//      Declaring Variables
//      Initialization AFTER Declarization
//        int weight;
//        weight = 12;
//      All at once
//        String breed = "Toy Spaniel";
//        String name = "Grinch";
//        int cuteness = 10;
//      A statement:
//      JVM, do something
//        System.out.println(name + " is a " + breed);
//        System.out.println(cuteness + name);

//      Datatypes:
//      Very small numbers: byte, -128 to 127
        byte smol = 12;
//      Small numbers: short, -32,768 to 32,767
        short small = 240;

//      Small >into> Big >NOT> Small
//        small = smol;
//      smol = small;

//      Casting: trims binary data-type resulting in binary for a different value
        smol = (byte) small;
//      Large Values: long, -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long bigNumber;
//      Denotes a Long value - - - V
        bigNumber = 900000000000000L;
//        System.out.println(smol); //results in -16


//      Floats vs doubles
//        Floats: numbers with decimals -3.4E38 to 3.4E38 with up to 7 significant digits
        float imafloat;

//        Doubles: Greater precision and capacity -1.7E308 to 1.7E308 with up to 16 significant digits
        double imadouble = 9.0123456789012;

//      4bytes of storage vs 8 bytes
//        imafloat = imadouble;

    }

}