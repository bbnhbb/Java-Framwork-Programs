package SimpleFactory.Algo;

import SimpleFactory.SalaryDetails;

public class NewTaxAlgo implements TaxAlgo {
    @Override
    public Double calculateTax(SalaryDetails details) {
        return 18D;
    }
}
