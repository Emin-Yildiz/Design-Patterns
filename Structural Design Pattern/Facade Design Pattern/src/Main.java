public class Main {
    public static void setMemberBooks(Member member){
        member.rentBook(new Book("Kuzuların Sessizliği",5,8));
        member.rentBook(new Book("Dune",10,10));
        member.rentBook(new Book("Psikiyatrist",14,11));
        member.rentBook(new Book("Hayvan Çiftliği",8,7));
    }

    public static void main(String[] args){

        Member member = new Member(1,"Emin");
        setMemberBooks(member);

        System.out.println("Toplam borç : "+new DeptCalc(member).calculateTotalDept());

    }
}