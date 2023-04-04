package lesson31;

import java.io.*;

public class Exec31 {

    public static void main(String[] args) {

//        File file = new File("D:\\lessonZT\\test31.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            for (int i = 0; i < 10; i++) {
                fos.write(i);
            }

            FileInputStream fis = new FileInputStream(file);
            for (int i = 0; i < 10; i++) {
                System.out.print(" " + fis.read());
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }

    }

    static File makePath(String path) {
        return new File(path);
    }

    static void write(File file) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe);
        }
    }

}
