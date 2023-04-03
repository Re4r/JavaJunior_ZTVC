package lesson31;
import java.io.*;
public class Exec31 {
    
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\lessonZT\\test31.txt");
        FileInputStream fis = new FileInputStream(file);
        fis.read();
        FileOutputStream fos = new FileOutputStream(file);
        for (int i = 0; i < 100; i++) {
            fos.write(i);
        }
    }

}
