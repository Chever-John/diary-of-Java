package cn.mr8god.kchaptereleven;

import typeinfo.pets.Hamster;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
import typeinfo.pets.Rat;

import java.util.LinkedList;

import static net.mindview.util.Print.print;

/**
 * @author Mr8god
 * @date 2020/4/22
 * @time 8:56
 */
public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<Pet>(Pets.arrayList(5));
        print(pets);
        print("pets.getFirst(): " + pets.getFirst());
        print("pets.element(): " + pets.element());
        print("pets.peek(): " + pets.peek());
        print("pets.remove(): " + pets.remove());
        print("pets.removeFirst(): " + pets.removeFirst());
        print("pets.poll(): " + pets.poll());
        print(pets);
        pets.addFirst(new Rat());
        print("After addFirst(): " + pets);
        pets.offer(Pets.randomPet());
        print("After offer(): " + pets);
        pets.add(Pets.randomPet());
        print("After add(): " + pets);
        pets.addLast(new Hamster());
        print("After addLast(): " +pets);
        print("pets.removeLast(): " + pets.removeLast());
        print(pets);
    }
}
