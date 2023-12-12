package SimpleFactory;

public class Run {
    public static void main(String[] args) {
        SalaryDetails details = new SalaryDetails();

        Double tax = TaxCalculator.calculateTax(TaxRegime.NEW, details);
//      // out put 18 is old 5 is new
        System.out.println(tax);
    }
}
