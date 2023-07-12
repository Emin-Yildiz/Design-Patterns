/*
Alt sistemlerdeki karmaşık algoritmalardan uzak olarak sonucu alıp döndüren class bu class'dır.
 */
class DeptCalc{ //Facade Class
    private Member member;
    private BookDebt bookDebt;
    private MembershipDebt membershipDebt;
    private CafeteriaDebt cafeteriaDebt;
    private ParkDebt parkDebt;

    public DeptCalc(Member member){
        member = member;
        bookDebt = new BookDebt(member);
        membershipDebt = new MembershipDebt();
        cafeteriaDebt = new CafeteriaDebt();
        parkDebt = new ParkDebt();
    }

    public double calculateTotalDept(){
        double totalDebt = 0;

        totalDebt+=bookDebt.calculateDebt()+membershipDebt.calculateDebt()+
                cafeteriaDebt.calculateDebt()+ parkDebt.calculateDebt();

        return totalDebt;
    }

}