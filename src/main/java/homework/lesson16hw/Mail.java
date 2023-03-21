
package homework.lesson16hw;

public class Mail {
        
        private static String m1 = "ya@yahoo.com";
        private static String m2 = "one@mail.ru";
        private static String m3 = "two@gmail.com";
        
        private static String[] str = {m1, m2, m3};
        
        public static void main(String[] args) {
                for (String string : str) {
                        showDomainName(string);
                }
        }
        
        static void showDomainName(String string) {
                String result = string.substring(string.indexOf("@") + 1, string.indexOf("."));
                System.out.println(result);
        }

}
