package cn.mr8god.kchaptereleven.self;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Mr8god
 * @date 2020/4/20
 * @time 9:20
 */
public class Gerbil {
    private int getbilNumber;
    public Gerbil(int i){
        getbilNumber = i;
    }
    public void hop(){
        System.out.println("Gerbil " + getbilNumber + " hop");
    }
    public static class Tester{
        public static void main(String[] args) {
            ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
            for (int i = 0; i < 10; i++){
                gerbils.add(new Gerbil(i));
            }
            System.out.println("第一波输出已经结束");
            for (int i = 0; i < gerbils.size(); i++){
                gerbils.get(i).hop();
            }
//            for (Gerbil c :
//                    gerbils) {
//                c.hop();
//            }
            Iterator<Gerbil> g = gerbils.iterator();

            while (g.hasNext()) {
                Gerbil c = g.next();
                c.hop();
            }
        }
    }
}


