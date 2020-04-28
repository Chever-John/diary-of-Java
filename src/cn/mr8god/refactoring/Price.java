package cn.mr8god.refactoring;

/**
 * @author Mr8god
 * @date 2020/4/12
 * @time 19:17
 */
abstract class Price {
    abstract int getPriceCode();

    abstract double getCharge(int daysRented);
    int getFrequentRenterPoints(int daysRented){
        if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1){
            return 2;
        }else{
            return 1;
        }
    }
}

class ChildrensPrice extends Price{
    @Override
    int getPriceCode(){
        return Movie.CHILDRENS;
    }

    @Override
    double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3){
            result += (daysRented - 3) * 1.5;
        }
        return result;
    }
}

class NewReleasePrice extends Price{
    @Override
    int getPriceCode(){
        return Movie.NEW_RELEASE;
    }

    @Override
    double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}

class RegularPrice extends Price{
    @Override
    int getPriceCode(){
        return Movie.REGULAR;
    }

    @Override
    double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2) {
            result += (daysRented - 2) * 3.5;
        }
        return result;
    }
}