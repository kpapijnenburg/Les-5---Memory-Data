public class Program {

    public static void main(String[] args) {
        StackOverflow so = new StackOverflow();
        OutOfMemory om = new OutOfMemory();
        OnOffBit ofbit = new OnOffBit();
        OnOffBool ofbool = new OnOffBool();

//        ____________________________________________________________________
//        Opdracht 1A
//        Chicken roept egg aan die weer chicken aanroept totdat er een StackOverflowException op word gegooit.
//        so.chicken();
//
//        ____________________________________________________________________
//        Opdracht 1B
//        Deze mehode maakt een nieuwe array aan die meer ruimte in beslag neemt dan er in de heap beschikbaar is.
//        om.generateOOM();
//
//        ____________________________________________________________________
//        Opdracht 1C
//
//        int i = 42;
//        float f = 1.0f / i;
//        System.out.println(i * f);
//        System.out.println((i * f == 1.0f));
//
//        int j = 41;
//        float x = 1.0f / j;
//        System.out.println(j * x);
//        System.out.println((i * x == 1.0f));
//
//        Het tweede stuk code geeft false aan doordat floats niet acuraat berekent kunnen worden en er dus afrondings fouten voor komen.
//       ____________________________________________________________________
//         Opdracht 2A
//
//         Oplossing 1: if statement omgezet naar een switch statement.
//        ofbit.oplossing1();
//
//        Oplossing 2: if statements vervangen door while statements. niet erg mooie oplossing.
//        ofbit.oplossing2();
//
//        Oplossing 3: Ternary operator gebruikt om de byte waarde te veranderen.
//        ofbit.oplossing3();
//        ____________________________________________________________________
//
//        Opdracht 2B
//
//        oplossing 1: bit = !bit.
//        ofbool.oplossing1();
//
//        Oplossing 2: Er word gekeken of i / 4 gelijk is aan 0.
//        ofbool.oplossing2();
//        ____________________________________________________________________
//        Extra opdracht
//
//        Dezelfde waarde als de byte is berekend door te kijken of de modulus van i gelijk is aan 0.
//        ofbit.notBit();

    }
}


