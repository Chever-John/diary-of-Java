package cn.mr8god.refactoring;

/**
 * @author Mr8god
 * @date 2020/4/12
 * @time 00:14
 */
public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented){
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented(){
        return _daysRented;
    }

    public Movie getMovie(){
        return _movie;
    }

    double getCharge(){
        return _movie.getCharge(_daysRented);
    }

    int getFrequentRenterPoints(){
        return _movie.getFrequentRenterPoints(_daysRented);
    }
}
