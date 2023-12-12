package SimpleFactory;

import SimpleFactory.Algo.NewTaxAlgo;
import SimpleFactory.Algo.OldTaxAlgo;
import SimpleFactory.Algo.TaxAlgo;

public class TaxCalculatorFactory {

    public static TaxAlgo getTaxCalculator(TaxRegime regime) {
        switch (regime) {
            case OLD :
                return new OldTaxAlgo();
            case NEW:
                return new NewTaxAlgo();
        }

        throw new RuntimeException("Invalid regime" + regime);
    }

}
