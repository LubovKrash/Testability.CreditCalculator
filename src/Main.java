//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit = 1_000_000;
        double percent = 9.99;
        double months = 24;
        int paiment = (int) service.calculate(credit, percent, months);
        System.out.println(paiment);
    }
}

