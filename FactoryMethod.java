import java.util.Scanner;

interface Currency{
    String getSymbol();
}

class MXN implements Currency {
    @Override
    public String getSymbol() {
           return "MXN";
    }
}

class PoundSterling implements Currency {
    @Override
    public String getSymbol() {
           return "Sterling £";
    }
}

class USDollar implements Currency {
    @Override
    public String getSymbol() {
           return "USD";
    }
}

class MonedaFactory {

    public static Currency crearMoneda (String pais) {
    if (pais. equalsIgnoreCase ("México")){
           return new MXN();
    }else if(pais. equalsIgnoreCase ("UK")){
           return new PoundSterling();
    }else if(pais. equalsIgnoreCase ("US")){
           return new USDollar();
     }
    throw new IllegalArgumentException("No se puede obtener información del país.");
    }
}

public class FactoryMethod {
    public static void main(String args[]) {
           System.out.println("Introduzca el país del cuál quiere crear la moneda; 'México', 'UK', 'US' ");
           Scanner entrada = new Scanner(System.in);
           String pais = entrada.nextLine();
           Currency moneda = MonedaFactory.crearMoneda(pais);
           System.out.println("La moneda que se maneja en "+pais+ " es: " + moneda.getSymbol());
    }
}
