package Ch_1_2;

import edu.princeton.cs.algs4.*;

public class Ex_12 {
    private final int month;
    private final int day;
    private final int year;
    private int count;
    private boolean operation;
    private String week;

    public Ex_12(int m, int d, int y) {
        if (isLegal(m, d, y)) {
            month = m;
            day = d;
            year = y;
        } else {
            throw new IllegalArgumentException("date is illegal");
        }
    }

    public int month() {
        return month;
    }

    public int day() {
        return day;
    }

    public int year() {
        return year;
    }

    public String toString() {
        return month + "/" + day + "/" + year;
    }

    private boolean isLegal(int m, int d, int y) {
        boolean is_legal = true;
        if (((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) && m == 2 && d != 29) is_legal = false;
        else if (m < 1 || m > 12 || d < 1) is_legal = false;
        else if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && d > 31) is_legal = false;
        else if ((m == 4 || m == 6 || m == 9 || m == 11) && d > 30) is_legal = false;
        else if (((y % 4 != 0 || y % 100 == 0) && y % 400 != 0) && m == 2 && d > 28) is_legal = false;
        return is_legal;
    }

    public void dayOfTheWeek() {
        if (!operation) {
            int Feb = 28;
            for (int i = 0; i < (year - 2000); i++) {
                if (((2000 + i) % 4 == 0 && (2000 + i) % 100 != 0) || (2000 + i) % 400 == 0) count += 366;
                else count += 365;
            }
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) Feb = 29;
            for (int i = 1; i <= (month - 1); i++) {
                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10) count += 31;
                else if (i == 2) continue;
                else count += 30;
            }

            count = count + Feb + day;

            switch ((count - 1) % 7) {
                case 0:
                    week = "Saturday";
                    break;
                case 1:
                    week = "Sunday";
                    break;
                case 2:
                    week = "Monday";
                    break;
                case 3:
                    week = "Tuesday";
                    break;
                case 4:
                    week = "Wednesday";
                    break;
                case 5:
                    week = "Thursday";
                    break;
                case 6:
                    week = "Friday";
                    break;
            }
            operation = true;
        }
        StdOut.println(week);

    }

    public static void main(String[] args) {
        int m = 5;
        int d = 2;
        int y = 2001;

        Ex_12 date = new Ex_12(m, d, y);
        date.dayOfTheWeek();
    }
}
