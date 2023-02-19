import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortNotebookMain {
    public static void main(String[] args) {

        Comparator<Notebook> priceComparator = (note1, note2) -> {
            if (note1.price > note2.price)
                return 1;
            else if (note1.price < note2.price)
                return -1;
            return 0;
        };

        Comparator<Notebook> ramComparator = (note1, note2) -> note1.ram - note2.ram;

        List<Notebook> notebooks = new ArrayList<Notebook>();
        notebooks.add(new Notebook(38879, 8));
        notebooks.add(new Notebook(33990, 8));
        notebooks.add(new Notebook(75990, 16));
        notebooks.add(new Notebook(43990, 8));
        notebooks.add(new Notebook(41990, 8));
        notebooks.add(new Notebook(41990, 16));
        notebooks.add(new Notebook(41990, 8));
        notebooks.add(new Notebook(57990, 16));
        List<Notebook> notebooks1 = new ArrayList<Notebook>(notebooks);
        List<Notebook> notebooks2 = new ArrayList<Notebook>(notebooks);
        System.out.print("До сортировки\n");
        System.out.println(notebooks);
        notebooks1.sort(priceComparator);
        System.out.print("Сортировка по цене\n");
        System.out.println(notebooks1);
        notebooks2.sort(ramComparator);
        System.out.print("Сортировка по памяти\n");
        System.out.println(notebooks2);
        Collections.sort(notebooks);
        System.out.print("Сортировка сначала по памяти, потом по цене\n");
        System.out.println(notebooks);
    }
}
