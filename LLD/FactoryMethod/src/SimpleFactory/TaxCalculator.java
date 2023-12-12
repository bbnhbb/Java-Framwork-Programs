package SimpleFactory;

public class TaxCalculator {
    public static Double calculateTax(TaxRegime regime, SalaryDetails salaryDetails) {
        return TaxCalculatorFactory.getTaxCalculator(regime).calculateTax(salaryDetails);
    }
}
