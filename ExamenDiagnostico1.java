
import java.util.Random;
import java.util.Scanner;

public class ExamenDiagnostico1 {
    public static void main(String[] args) {

        System.out.println ("Inicio");
        int i = 0;

        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int n = r.nextInt(100)+1;
        int resp = 0;
        int cont = 0;
        
        System.out.println();
        int vidas = 5;
        do{
            System.out.println("Número de oportunidades: " + vidas);
            System.out.print("Ingrese un número de 1 a 100: ");
            resp = s.nextInt();
            
            if (resp == n){
                System.out.println("Has acertado");
                cont = 1;
            }else{
                vidas--;
                if(vidas==0){
                    cont = 1;
                }
            }
        }while(cont==0);
        
        if (vidas==0){
            System.out.println("Has fallado");
        }else{
            System.out.println("Oportunidades restantes: " + vidas);
        }
    }   
}