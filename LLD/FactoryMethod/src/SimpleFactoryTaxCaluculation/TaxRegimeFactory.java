package SimpleFactoryTaxCaluculation;

import SimpleFactoryTaxCaluculation.Algo.NewTaxRegime;
import SimpleFactoryTaxCaluculation.Algo.OldTaxRegime;
import SimpleFactoryTaxCaluculation.Algo.TaxRegimeCalculate;

public class TaxRegimeFactory {

    public static TaxRegimeCalculate getTaxRegime(TaxRegime type) {
        if (type.equals(TaxRegime.NEW)) {
            return new NewTaxRegime();
        } else {
            return new OldTaxRegime();
        }
    }
}
