
package homework.lesson13hw;

public class Exec {
        
        public static void main(String[] args) {
                
                Exec.showDaysQuantity(Month.JUNE);
                
        }
        
        static void showDaysQuantity(Month month) {
                switch (month) {
                        case JANUARY:
                                System.out.println("30");
                                break;
                        case FEBRUARY:
                                System.out.println("31");
                                break;
                        case MARCH:
                                System.out.println("134");
                                break;
                        case APRIL:
                                System.out.println("456");
                                break;
                        case MAY:
                                System.out.println("378");
                                break;
                        case JUNE:
                                System.out.println("987");
                                break;
                        case JULY:
                                System.out.println("145");
                                break;
                        case AUGUST:
                                System.out.println("654");
                                break;
                        case SEPTEMBER:
                                System.out.println("789");
                                break;
                        case OCTOBER:
                                System.out.println("632");
                                break;
                        case NOVEMBER:
                                System.out.println("907");
                                break;
                        case DECEMBER:
                                System.out.println("342");
                                break;
                        default:
                                throw new AssertionError();
                }
        }
        
                

}
