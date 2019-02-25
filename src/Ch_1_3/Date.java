package Ch_1_3;


public class Date {
    private final int month;
    private final int day;
    private final int year;

    public Date(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }

    public Date(String date) {
        String[] s = date.split("\\/");
        if (s.length != 3) {
            throw new IllegalArgumentException("Arguments illegal: " + date);
        }
        month = Integer.parseInt(s[0]);
        day = Integer.parseInt(s[1]);
        year = Integer.parseInt(s[2]);
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
        return month() + "/" + day() + "/" + year();
    }

    public boolean equals(Object x) {
        if (this == x) return true;
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;
        Date that = (Date) x;
        if (this.day != that.day) return false;
        if (this.month != that.month) return false;
        if (this.year != that.year) return false;
        return true;
    }

    public Date[] readDates(String s) {
        String[] dates = s.split(" ");
        int n = dates.length;
        Queue<Date> q = new Queue<Date>();
        for (int i = 0; i < n; i++) {
            q.enqueue(new Date(dates[i]));
        }
        Date[] result = new Date[n];
        for (int i = 0; i < n; i++) {
            result[i] = q.dequeue();
        }
        return result;
    }


    public static void main(String[] args) {
        String s = "11/30/2009 1/12/2012";
        Date d = new Date("10/21/2011");
        Date[] dates = d.readDates(s);
        for (int i = 0; i < dates.length; i++) {
            System.out.println(dates[i]);
        }
    }
}