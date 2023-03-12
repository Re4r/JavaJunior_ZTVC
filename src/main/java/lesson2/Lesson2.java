
package lesson2;


public class Lesson2 {
    public static void main(String[] args) {
        // Primitive:
        // Numeric:
        // Integers:
        byte b1 = Byte.MIN_VALUE;
        byte b2 = Byte.MAX_VALUE;
        
        short s1 = Short.MIN_VALUE;
        short s2 = Short.MAX_VALUE;
        
        int i1 = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        
        long l1 = Long.MIN_VALUE;
        long l2 = Long.MAX_VALUE;
        
        // Floating - point:
        float f1 = Float.MIN_VALUE;
        float f2 = Float.MAX_VALUE;
        
        double d1 = Double.MIN_VALUE;
        double d2 = Double.MAX_VALUE;
        
        // Character:
        char c1 = 'a';
        char c2 = 'A';
        char c3 = '7';
        char c4 = 90;
        char c5 = '\u1234';
        
        // Boolean
        boolean bool1 = true;
        boolean bool2 = false;
        
        String example = Integer.toBinaryString(999);
        String example1 = Integer.toHexString(999);
        String example2 = Integer.toOctalString(999);
        
        
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println(example + " " + example1 + " " + example2);
        
    }
}
