public class Main {
    public static void main(String[] args)
    {
        Element[] items = new Element[]{new Computer(20, "1234"),
                new Computer(100, "5678"), new Water(10, 2000),
                new Water(5, 500)};

        int total = calculatePrice(items);
        System.out.println("Total Cost = "+total);
    }

    private static int calculatePrice(Element[] items)
    {
        Visitor visitor = new VisitorImpl();
        int sum=0;
        for(Element item : items)
        {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}