public class BookDebt { // kitap borçlanması

    private Member member;
    private static double penaltyRate = 0.65;

    public BookDebt(Member member) {
        this.member = member;
    }
    public double calculateDebt(){

        double debt = 0;

        for(Book book : member.getBooks()){
            if(book.hasTimeOut()){
                debt+= ((book.getActualHoldingDay()*Book.defaultRentingPrice))+((book.getActualHoldingDay()-book.getScheduledHoldingDay())*penaltyRate);
            }
            else{
                debt+=(book.getActualHoldingDay()*Book.defaultRentingPrice);
            }
        }
        return debt;
    }
}
