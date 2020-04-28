    package cn.mr8god.kchaptereleven;

    import typeinfo.pets.Pet;
    import typeinfo.pets.Pets;

    import java.util.*;

    /**
     * @author Mr8god
     * @date 2020/4/20
     * @time 10:41
     */
    public class CrossContainterIteration {
        public static void display(Iterator<Pet> it){
            while (it.hasNext()){
                Pet p = it.next();
                System.out.print(p.id() + ":" + p + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            ArrayList<Pet> pets = Pets.arrayList(8);
            LinkedList<Pet> petsLL = new LinkedList<Pet>(pets);
            HashSet<Pet> petsHs = new HashSet<Pet>(pets);
            TreeSet<Pet> petsTs = new TreeSet<Pet>(pets);
            display(pets.iterator());
            display(petsLL.iterator());
            display(petsHs.iterator());
            display(petsTs.iterator());
        }
    }
