package pl.sii.eu.test;

import org.junit.jupiter.api.Test;
import pl.sii.eu.CurrencyConverterImpl;
import pl.sii.eu.model.Amount;
import pl.sii.eu.model.Currency;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrencyConverterTest {

    @Test
    public void testConvertingToPln(){
        CurrencyConverterImpl converter = new CurrencyConverterImpl();
        long value = (converter.convertToPln(new Amount(Double.doubleToLongBits(100), Currency.EUR)).getValue());
        assertEquals(425.18, Double.longBitsToDouble(value));
    }

    @Test
    public void testConvertingToEur(){
        CurrencyConverterImpl converter = new CurrencyConverterImpl();
        long eurVal = (converter.convertToEur(new Amount(Double.doubleToLongBits(425.18), Currency.PLN)).getValue());
        assertEquals(100, Double.longBitsToDouble(eurVal));
    }


}
