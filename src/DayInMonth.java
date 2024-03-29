import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month that you want to count day?");
        int month = scanner.nextInt();

        String dayInMonth;
        switch (month) {
            case 2:
                dayInMonth = "có 28 or 29 ngày";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth = "có 31 ngày";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = "có 30 ngày";
                break;
            default:
                dayInMonth = "Không hợp lệ";
                break;
        }
        System.out.println("Tháng " + month + ": " + dayInMonth);
    }
}
