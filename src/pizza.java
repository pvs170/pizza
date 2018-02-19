public class pizza {
    private String name;
    private int size;

    public pizza(String name, int size) {
        if (size > 0 & name name != "") {
            this.size = size;
            this.name = name;
            orderPizza();
        }
        else
        {
            System.out.println("Smth went wrong. Try another parameters and build program again ;)");
        }
    }

    private void orderPizza() {
        cookThisPizza();
        deliverThisPizza();
    }

    private void cookThisPizza() {
        System.out.println("Pizza: " + name + " with size " + size + " has been cooked");
    }

    private void deliverThisPizza() {
        System.out.println("Pizza: " + name + " with size " + size + " has been delivered");
    }
}
