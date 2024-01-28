import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        double dificult = 0;
        String nome[] = new String[entrada];
        double notaF[] = new double[entrada];
        double notas[]= new double[7];
        DecimalFormat decimal = new DecimalFormat("0.00");

        for(int i = 0; i < entrada; i++){
            nome[i] = sc.next();
            dificult = sc.nextDouble();
            for(int k = 0; k < notas.length; k++){
                notas[k] = sc.nextDouble();
            }
            maiorMenos(notas);
            notaF[i] = soma(notas, dificult);
        }

        for(int i =0; i < nome.length; i++){
            System.out.print(nome[i] +" ");
            System.out.println(decimal.format(notaF[i]));

        }

        sc.close();
    }

    public static double soma(double[]arr, double dificult){
        double soma = 0;
        for(int i = 0; i < arr.length; i++){
            soma += arr[i];
        }
        soma = soma * dificult;
        return soma;
    }

    public static double[] maiorMenos(double[] arr){
        int maior = 0;
        int menor = 0;
        double temp = 0;

        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                temp = arr[i];
                maior = i;
            }else if(arr[i] > temp){
                temp = arr[i];
                maior = i;
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                temp = arr[i];
                menor = i;
            }else if(arr[i] < temp){
                temp = arr[i];
                menor = i;
            }
        }

        arr[menor] = 0;
        arr[maior] = 0;

        return arr;
    }
}
