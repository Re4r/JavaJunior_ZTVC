
package homework.lesson16hw;

public class Mail {
        
        private static String m1 = "ya@yahoo.com";
        private static String m2 = "one@mail.ru";
        private static String m3 = "two@gmail.com";
        
        public static void main(String[] args) {
                showDomainName(m3);
        }
        
        static void showDomainName(String string) {
                String result = string.substring(string.indexOf("@") + 1, string.indexOf("."));
                System.out.println(result);
        }

}
