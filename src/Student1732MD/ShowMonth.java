package Student1732MD;

public class ShowMonth {

    enum Month {
        January, February, March,
        April, May, June,
        July, August, September,
        October, November, December
    };

    public void WhichMonthIsIt(Month _currentMonth) {

        switch (_currentMonth) {
            case January:
                System.out.println("Month is January");
                break;
            case February:
                System.out.println("Month is February");
                break;
            case March:
                System.out.println("Month is March");
                break;
            case April:
                System.out.println("Month is April");
                break;
            case May:
                System.out.println("Month is May");
                break;
            case June:
                System.out.println("Month is June");
                break;
            case July:
                System.out.println("Month is July");
                break;
            case August:
                System.out.println("Month is August");
                break;
            case September:
                System.out.println("Month is September");
                break;
            case October:
                System.out.println("Month is October");
                break;
            case November:
                System.out.println("Month is November");
                break;
            case December:
                System.out.println("Month is December");
                break;
            default:
                System.out.println("sos");
        }
    }

}
