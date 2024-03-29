package lesson31;

public final class Exec312 {

    public static void main(String[] args) {

        Test test = new Test();
        test.showArrayElement(test.createArray(10), 10);
    }

}

final class Test {

    int[] createArray(final int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    void showArrayElement(final int[] array, final int index) {
        try {
            System.out.println(array[index]);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            aioobe.printStackTrace();
        }
    }
}
