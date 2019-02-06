package Ch_1_2;

import edu.princeton.cs.algs4.*;

public class Ex_14 {
    private String who;
    private Date when;
    private double amount;

    public Ex_14(String who, Date when, double amount) {
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

    public boolean equal(Object x) {
        if (this == x) return true;
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;

        Ex_14 that = (Ex_14) x;

        if (that.who != who) return false;
        if (that.amount != amount) return false;
        if (!that.when.equals(when)) return false;
        return true;
    }

    public static void main(String[] args) {
        Date d_1 = new Date(10, 10, 2001);
        Date d_2 = new Date(10, 10, 2001);
        Ex_14 t_1 = new Ex_14("Tim", d_1, 100);
        Ex_14 t_2 = new Ex_14("Tom", d_2, 100);
        StdOut.println(t_1.equal(t_2));
    }
}
