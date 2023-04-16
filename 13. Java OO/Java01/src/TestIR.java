
public class TestIR {

    public static void main(String[] args) {

        double salario = 3300.0;

        if(salario < 2600.0) { 
            System.out.println("Su tasa es del  15%");
            System.out.println("Puede deducir hasta R$ 350");
        }
        if(salario < 3750.0) { 
            System.out.println("Su tasa es del  22,5%");
            System.out.println("Puede deducir hasta R$ 636");
        }    
    }
}