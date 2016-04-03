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
default:
    System.out.println("sos");
        }
    }

}
