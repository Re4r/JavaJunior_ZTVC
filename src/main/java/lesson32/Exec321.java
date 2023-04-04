package lesson32;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exec321 {

    public static void main(String[] args) {

        File file1 = new File("D:\\lessonZT\\source.txt");
        File file2 = new File("D:\\lessonZT\\dest.txt");
        
        copyFile(file1, file2);

    }

    static void copyFile(File file1, File file2) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);
            fos.write(fis.readAllBytes());
        } catch (FileNotFoundException fnfe) {
            fnfe.getMessage();
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.getMessage();
            ioe.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException ioe) {
                ioe.getMessage();
                ioe.printStackTrace();
            }
        }
    }
}
