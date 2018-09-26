public class OnOffBit {

    public void oplossing1() {

        byte bit = 0;

        for (int i = 0; i < 20; i += 2) {

            System.out.println("Value of i: " + i + ", value of bit: " + bit);

            switch (bit) {
                case 1:
                    bit = 0;
                    break;
                case 0:
                    bit = 1;
                    break;
            }
        }
    }

    public void oplossing2() {

        byte bit = 0;

        for (int i = 0; i < 20; i += 2) {

            System.out.println("Value of i: " + i + ", value of bit: " + bit);

            while (i % 4 == 0) {
                bit = 1;
                break;
            }
            while (i % 4 != 0) {
                bit = 0;
                break;
            }
        }
    }

    public void oplossing3() {

        byte bit = 0;

        for (int i = 0; i < 20; i += 2) {

            System.out.println("Value of i: " + i + ", value of bit: " + bit);

            bit = (bit == 0) ? (byte) 1 : 0;

        }
    }

    public void notBit() {

        int result;

        for (int i = 0; i < 20; i += 2) {

            if (i % 4 == 0) {
                result = 0;
            } else {
                result = 1;
            }

            System.out.println("Value of i: " + i + ", value of bit: " + result);
        }
    }
}
