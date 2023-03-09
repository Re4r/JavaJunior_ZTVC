
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
        String i2 = Integer.toHexString(0);
        String i3 = Integer.toOctalString(0);
        int i4 = 0;
        int i5 = Integer.parseInt(s3);
        System.out.println(i1 + " " + i2 + " " + i3 + " " + i4 + " " + i5);
        
        // Long:
        String l1 = Long.toBinaryString(123456789);
        String l2 = Long.toHexString(123456789);
        String l3 = Long.toOctalString(123456789);
        long l4 = 123456789;
        System.out.println(l1 + " " + l2 + " " + l3 + " " + l4);
        
        // Floating - point:
        // Float:
        float f1 = 10.10f;
        float f2 = 22.22f;
        System.out.println(f1 + " " + f2);
        
        // Double:
        double d1 = 12.12;
        double d2 = 14.14;
        System.out.println(d1 + " " + d2);
        
        // Boolean:
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(bool1 + " " + bool2);
        
        // Character:
        char c1 = 'A';
        char c2 = 90;
        char c3 = '\u1234';
        System.out.println(c1 + " " + c2 + " " + c3);
    }
}
