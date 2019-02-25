package Ch_1_3;

import edu.princeton.cs.algs4.*;

public class Transaction {
    private int month;
    private int day;
    private int year;
    private String name;
    private double amount;

    public Transaction(String information) {
        String[] filed = information.split("\\s+|/+");
        name = filed[0];
        month = Integer.parseInt(filed[1]);
        day = Integer.parseInt(filed[2]);
        year = Integer.parseInt(filed[3]);
        amount = Double.parseDouble(filed[4]);
    }

    public String toString() {
        return name + " " + month + "/" + day + "/" + year + " " + amount;
    }

    public Transaction[] readTransactions(String s) {
        String[] transactions = s.split(",");
        int n = transactions.length;
        Queue<Transaction> q = new Queue<Transaction>();
        for (int i = 0; i < n; i++) {
            Transaction t = new Transaction(transactions[i]);
            q.enqueue(t);
        }
        Transaction[] result = new Transaction[n];
        for (int i = 0; i < n; i++) {
            result[i] = q.dequeue();
        }
        return result;
    }

    public static void main(String[] args) {
        Transaction t = new Transaction("Tom 2/28/2018 59.99");
        Transaction[] ts;
        ts = t.readTransactions("Jim 2/1/2011 30.00,Kate 3/15/2017 54.90");

        for (int i = 0; i < ts.length; i++) {
            StdOut.println(ts[i]);
        }
    }

}
