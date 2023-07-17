import java.util.Scanner;

public class Main {

    private DispenseChain chain1;

    public Main(){
        this.chain1 = new Dolar50Dispenser();
        DispenseChain chain2 = new Dolar30Dispenser();
        DispenseChain chain3 = new Dolar20Dispenser();
        DispenseChain chain4 = new Dolar10Dispenser();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);
    }

    public static void main(String[] args) {
        Main main = new Main();
        while (true) {
            int amount = 0;
            System.out.println("Para miktarını giriniz: ");
            Scanner in = new Scanner(System.in);
            amount = in.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Miktar 10'un katları olacaak şekilde girilmelidir !!!!!!!!!!!!!!!!");
                continue;
            }
            main.chain1.dispense(new Currency(amount));
        }
    }
}