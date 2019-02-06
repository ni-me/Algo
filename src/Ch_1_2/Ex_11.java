package Ch_1_2;

import edu.princeton.cs.algs4.*;

public class Ex_11 {
    private final int month;
    private final int day;
    private final int year;

    public Ex_11(int m, int d, int y) {
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

    public static void main(String[] args) {
        int m = 1;
        int d = 1;
        int y = 2018;
        Ex_11 date = new Ex_11(m, d, y);
        StdOut.println(date);
    }
}
