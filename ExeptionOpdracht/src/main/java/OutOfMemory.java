public class OutOfMemory {

    public void generateOOM() {
        Integer[] array = new Integer[20000 * 20000];
    }
}
