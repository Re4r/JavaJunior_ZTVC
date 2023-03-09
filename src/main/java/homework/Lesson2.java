
package homework;


public class Lesson2 {
    public static void main(String[] args) {
        // Primitive:
        // Numeric:
        // Integers:
        // Byte:
        String b1 = Integer.toBinaryString((byte) 12);
        String b2 = Integer.toHexString((byte)12);
        String b3 = Integer.toOctalString((byte) 12);
        byte b4 = 12;
        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);
        
        // Short:
        String s1 = Integer.toBinaryString((short) 1300);
        String s2 = Integer.toHexString((short) 1300);
        String s3 = Integer.toOctalString((short) 1300);
        short s4 = 1300;
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
        
        // Integer:
        String i1 = Integer.toBinaryString(0);
        
        
    }
}
