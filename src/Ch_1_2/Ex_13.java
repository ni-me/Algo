package Ch_1_2;

import edu.princeton.cs.algs4.*;

public class Ex_13 {
    private String who;
    private Date when;
    private double amount;

    public Ex_13(String who, Date when, double amount) {
        this.who = who;
        this.when = when;
        this.amount = amount;
    }

    public String who() {
        return who;
    }

    public Date when() {
        return when;
    }

    public double amount() {
        return amount;
    }

    public String toString() {
        return when + "\n" + who + "\n" + amount;
    }

    public static void main(String[] args) {
        Date date = new Date(12, 1, 2018);
        String name = "Tim";
        double amount = 100.01;

        Ex_13 test = new Ex_13(name, date, amount);
        StdOut.println(test);

    }
}
