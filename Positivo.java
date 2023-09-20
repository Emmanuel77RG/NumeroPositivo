import java.util.Scanner;

public class Positivo {

    float numero;
    Scanner entrada = new Scanner(System.in);

    public void Valores(){
        System.out.println("Introduzca un número real");
        numero = entrada.nextFloat();
        Op(numero);
    }

    public void Op(float numero){
        
        
        if (numero>0) {
            System.out.println(numero+" es mayor que cero");
        }
    }

    public static void main(String[] args) {
        Positivo rune = new Positivo();
        rune.Valores();
    }
}