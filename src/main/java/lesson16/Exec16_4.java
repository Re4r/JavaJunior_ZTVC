
package lesson16;

public class Exec16_4 {
        
        private static final String STR = "Соображения высшего порядка, "
                                + "а также реализация намеченного плана развития "
                                + "представляет собой интересный эксперимент проверки "
                                + "всесторонне сбалансированных нововведений? "
                                + "Таким образом, рамки и место обучения кадров "
                                + "обеспечивает актуальность системы масштабного "
                                + "изменения ряда параметров! Дорогие друзья, "
                                + "сложившаяся структура организации "
                                + "напрямую зависит от системы обучения кадров,"
                                + "соответствующей насущным потребностям.";
 
        public static void main(String[] args) {
                
                //transformPoetry(STR);
                transformPoetry2(STR);
                
        }
        
        static void transformPoetry(String string) {
                String string2 = string.toUpperCase();
                char c1;
                char c2;
                
                for (int i = 0; i < string.length(); i++) {
                        c1 = string.charAt(i);
                        c2 = string2.charAt(i);
                        if (c1 != ',' && c1 != ':' && c1 != ' ' && c1 != '.' && c1 == c2 && c1 != '?' && c1 != '!') {
                                System.out.println();
                                System.out.print(c1);
                                continue;
                        }
                        System.out.print(c1);
                }
                System.out.println();
        }
        
        static void transformPoetry2(String str) {
                String str2 = str.toUpperCase();
                char c1;
                char c2;
                for (int i = 0; i < str.length(); i++) {
                        c1 = str.charAt(i);
                        c2 = str2.charAt(i);
                        if (c1 == c2 && c1 != ',' && c1 != '!' && c1 != '?' && c1 != ' ' && c1 != '.') {
                                System.out.println();
                                System.out.print(c1);
                                continue;
                        }
                        System.out.print(c1);
                }
                System.out.println();
        }

}
