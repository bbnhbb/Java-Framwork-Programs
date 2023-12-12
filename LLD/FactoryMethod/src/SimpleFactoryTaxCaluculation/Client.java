package SimpleFactoryTaxCaluculation;

import SimpleFactoryTaxCaluculation.Algo.TaxRegimeCalculate;
import SimpleFactoryTaxCaluculation.TaxRegimeFactory;
import SimpleFactoryTaxCaluculation.TaxRegime;

public class Client {
    public static void main(String[] args) {
        SalaryDetails sd = new SalaryDetails();
        sd.setBasePay(10000F);
        sd.setHra(5000F);
        sd.setLta(3000F);

        TaxRegimeCalculate taxRegime = TaxRegimeFactory.getTaxRegime(TaxRegime.OLD);
        System.out.println(taxRegime.claculateTax(sd));

    }
}
