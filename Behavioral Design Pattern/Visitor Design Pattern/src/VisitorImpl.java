public class VisitorImpl implements Visitor{
    @Override
    public int visit(Water water) {
        int cardPrice = 0;
        if(water.getPrice() > 50){
            cardPrice = water.getPrice() - 10; // 50 tl ve üzeri su alışverişlerinde 10 tl indirim.
        }else {
            cardPrice = water.getPrice();
        }
        return cardPrice;
    }

    @Override
    public int visit(Computer computer) {
        int cardPrice = 0;
        if(computer.getPrice() > 5000){
            cardPrice = computer.getPrice() - 150; // 5000 tl ve üzeri su alışverişlerinde 150 tl indirim.
        }else {
            cardPrice = computer.getPrice();
        }
        return cardPrice;
    }
}
