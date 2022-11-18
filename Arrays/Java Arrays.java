// Two Decimal Places Java

//https://www.baeldung.com/java-number-formatting

/**
1. Formatting With String#format

double value = 4.2352989244d;
String.format("%.2f", value);

2. Decimal Formatting by Rounding

a. BigDecimal for Number Formatting

BigDecimal bd = new BigDecimal(num).setScale(2, RoundingMode.HALF_UP);  

b. double scale = Math.pow(10, places);
    return Math.round(value * scale) / scale;
    
    .....
