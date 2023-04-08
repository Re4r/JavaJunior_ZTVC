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

public final class Exec35 {

    public static void main(String[] args) {
        
        

        File file = new File("D:\\lessonZT\\names.txt");
        var result = unitFactory(file);

        

        for (var u : result) {
            System.out.println(u.getName());
            System.out.println(u.getArmor());
            System.out.println("----------");
        }

    }

    private static ArrayList<String> listOfNames(File file) {
        ArrayList<String> names = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                names.add(line);
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return names;
    }

    private static int createArmorValue() {
        return (int) (Math.random() * 99);
    }

    private static ArrayList<Unit> createEmptyUnitGroup(ArrayList<String> names, Supplier<Unit> supplier) {
        ArrayList<Unit> units = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            units.add(supplier.get());
        }
        return units;
    }
    
    static ArrayList<Unit> unitFactory(File file) {
        var lon = listOfNames(file);
        var eug = createEmptyUnitGroup(lon, () -> new Unit(null, 0));
        for (int i = 0; i < eug.size(); i++) {
            eug.get(i).setName(lon.get(i));
            eug.get(i).setArmor(createArmorValue());
        }
        return eug;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
    
    

}
