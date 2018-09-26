public class OnOffBool {

    public void oplossing1() {
        boolean bit = false;

        for (int i = 0; i < 20; i += 2) {

            System.out.println("Value of i: " + i + ", value of bit: " + bit);

            bit = !bit;
        }
    }

    public void oplossing2 (){
        boolean bit = false;

        for (int i = 0; i < 20; i += 2){

            System.out.println("Value of i: " + i + ", value of bit: " + bit);

            bit = i % 4 == 0;
        }
    }
}
