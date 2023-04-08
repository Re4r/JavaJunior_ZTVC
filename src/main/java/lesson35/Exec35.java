package lesson35;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Predicate;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exec35 {

    public static void main(String[] args) throws FileNotFoundException, IOException{

        File file = new File("D:\\lessonZT\\names.txt");
        
        ArrayList<String> names = new ArrayList<>();
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            names.add(line);
        }
        for (String s : names) {
            System.out.println(s);
        }
    
    }
    
    
    
    

}

final class Unit {

    private String name;
    private int armor;

    public Unit(String name, int armor) {
        this.name = name;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public int getArmor() {
        return armor;
    }

}
