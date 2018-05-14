package pl.sii.eu;

import pl.sii.eu.model.Amount;
import pl.sii.eu.model.Currency;

public class CurrencyConverterImpl implements CurrencyConverter {


    private double setPrecision(double value, int precision)
    {
        if (precision < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, precision);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    @Override
    public Amount convertToPln(Amount euroAmount){

        if(!new Amount(euroAmount.getValue(),Currency.EUR).equals(euroAmount))
        {
            throw new IllegalArgumentException();
        }

        double doubleValue=  Double.longBitsToDouble(euroAmount.getValue());
        return new Amount(
                Double.doubleToLongBits(
                        setPrecision( doubleValue* EURO_TO_PLN_RATIO, Amount.PRECISION)
                                        ), Currency.PLN );

    }

    @Override
    public Amount convertToEur(Amount plnAmount){
        if(!new Amount(plnAmount.getValue(),Currency.PLN).equals(plnAmount))
        {
            throw new IllegalArgumentException();
        }
        double doubleValue=  Double.longBitsToDouble(plnAmount.getValue());
        return new Amount(
                Double.doubleToLongBits(
                        setPrecision( doubleValue/ EURO_TO_PLN_RATIO, Amount.PRECISION)
                ), Currency.EUR );
    }

}
