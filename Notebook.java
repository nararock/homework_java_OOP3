public class Notebook implements Comparable<Notebook> {
    double price;
    int ram;

    public Notebook(double price, int ram) {
        this.price = price;
        this.ram = ram;
    }

    @Override
    public int compareTo(Notebook anotherNotebook) {
        if (ram > anotherNotebook.ram)
            return 1;
        else if (ram < anotherNotebook.ram)
            return -1;
        else {
            if (price > anotherNotebook.price)
                return 1;
            else if (price < anotherNotebook.price)
                return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("\nram: %d Gb, price: %.2f руб.", ram, price);
    }
}