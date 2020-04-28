package cn.mr8god.refactoring;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Mr8god
 * @date 2020/4/12
 * @time 00:29
 */
public class Customer {
    private static String _name;
    private static Vector _rentals = new Vector();

    public Customer(String name){
        _name = name;
    }

    public void addRental(Rental arg){
        _rentals.addElement(arg);
    }

    public static String getName(){
        return _name;
    }

    public static String statement(){
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();

            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";

        return result;

    }

    private double amountFor(Rental aRental){
        return aRental.getCharge();
    }

    private static double getTotalCharge(){
        double result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()){
            Rental each = (Rental)rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    private static int getTotalFrequentRenterPoints(){
        int result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }
}
