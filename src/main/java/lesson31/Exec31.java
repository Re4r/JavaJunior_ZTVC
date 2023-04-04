package lesson31;

import java.io.*;

public class Exec31 {

    public static void main(String[] args) {
        File file = makePath("D:\\lessonZT\\test31.txt");
        write(file);
        read(file);

    }

    static File makePath(String path) {
        return new File(path);
    }

    static void write(File file) {
        try (FileOutputStream fos = new FileOutputStream(file)) {
            for (int i = 0; i < 10; i++) {
                fos.write(i);
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    static void read(File file) {

        try (FileInputStream fis = new FileInputStream(file)) {
            for (int i = 0; i < 10; i++) {
                System.out.println(" " + fis.read());
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

}
