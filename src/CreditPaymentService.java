public class CreditPaymentService {
    public double calculate(double credit, double percent, double months) {
        double p = percent / 12 / 100;
return (p * credit) / (1 - Math.pow(1 + p, -months));
    }
}
