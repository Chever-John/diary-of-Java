package cn.mr8god.kchaptereleven;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.Iterator;
import java.util.List;

/**
 * @author Mr8god
 * @date 2020/4/20
 * @time 9:59
 */
public class SimpleIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(12);
        System.out.println(pets);
        Iterator<Pet> it = pets.iterator();
        while(it.hasNext()){
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
        for (Pet p :
                pets) {
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
        it = pets.iterator();
        for (int i = 0; i < 6; i++){
            it.next();
            it.remove();
        }
        System.out.println(pets);
    }
}
