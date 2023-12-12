package SimpleFactoryTaxCaluculation.Algo;

import SimpleFactoryTaxCaluculation.SalaryDetails;

public class OldTaxRegime implements TaxRegimeCalculate {
    @Override
    public Double claculateTax(SalaryDetails salaryDetails) {
        return  0.4 * salaryDetails.getBasePay()
                + 0.3 * salaryDetails.getHra();
    }
}
