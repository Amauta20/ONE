public class TestIR2 {

    public static void main(String[] args) {

        // De 1900.0 hasta 2800.0 el IR es de 7.5% y se pueden deducir $ 142
        // De 2800.01 hasta 3751.0 el IR es de de 15% y se pueden deducir $ 350
        // De 3751.01 hasta 4664.00 el IR es de de 22.5% y se pueden deducir $ 636

        double salario = 3300.0;

        if(salario >= 1900.0 && salario <= 2800.0) {
            System.out.println("Su tasa es 7%");
            System.out.println("Usted puede deducir hasta $ 142");
        } else if(salario >= 2800.01 && salario <= 3751.0) {
            System.out.println("Su tasa es 15%");
            System.out.println("Usted puede deducir hasta $ 350");
        } else if(salario >= 3751.01 && salario <= 4664.0) {
            System.out.println("Su tasa es 22.5%");
            System.out.println("Usted puede deducir hasta $ 636");
        }

    }
}
