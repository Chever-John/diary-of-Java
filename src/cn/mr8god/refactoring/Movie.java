package cn.mr8god.refactoring;

/**
 * @author Mr8god
 * @date 2020/4/12
 * @time 00:01
 */
public class Movie {
    private Price _price;

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode){
        _title = title;
       setPriceCode(priceCode);
    }

    // 第二次重构之Movie类内保存一个Price对象
    public int getPriceCode(){
        return _price.getPriceCode();
    }

    public String getTitle(){
        return _title;
    }

    double getCharge(int daysRented){
        return _price.getCharge(daysRented);
    }
    public void setPriceCode(int arg) {
        switch (arg){
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDRENS:
                _price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

//    public void setPriceCode(int arg){
//        _priceCode = arg;
//    }


    int getFrequentRenterPoints(int daysRented){
        return _price.getFrequentRenterPoints(daysRented);
    }
}
