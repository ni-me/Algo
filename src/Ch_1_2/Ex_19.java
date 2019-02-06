package Ch_1_2;

import edu.princeton.cs.algs4.*;

public class Ex_19 {
    private int month;
    private int day;
    private int year;
    private String name;
    private double amount;

    public void Date(String date) {
        String[] filed = date.split("/");
        month = Integer.parseInt(filed[0]);
        day = Integer.parseInt(filed[1]);
        year = Integer.parseInt(filed[2]);

        StdOut.println(month + "/" + day + "/" + year);
    }

    public void Transaction(String information) {
        String[] filed = information.split("\\s+|/+");
        name = filed[0];
        month = Integer.parseInt(filed[1]);
        day = Integer.parseInt(filed[2]);
        year = Integer.parseInt(filed[3]);
        amount = Double.parseDouble(filed[4]);

        StdOut.println(name + " " + month + "/" + day + "/" + year + " " + amount);
    }

    public static void main(String[] args) {
        Ex_19 test = new Ex_19();
        test.Date("5/22/2009");
        test.Transaction("Tom 5/22/2009 11.39");
    }
}
