import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1;
        float num2, soma=0, tempF,tempC,tempK, mSeg,kmHora;

        System.out.println("Informe qual questão deseja visualizar;(1 - 53)");
        int questao = scan.nextInt();
        switch (questao) {
            // Q1 - Faca um programa que leia um numero inteiro e o imprima.
            case 1:
                System.out.println("Informe um número inteiro!");
                num1 = scan.nextInt();
                System.out.println("O número informado foi: " + num1);
            break;
            // Q2 - Faca um programa que leia um numero real e o imprima.
            case 2:
                System.out.println("Informe um número Real!");
                num2 = scan.nextFloat();
                System.out.println("O número informado foi: " + num2);
            break;
            // Q3 - Peca ao usuario para digitar tres valores inteiros e imprima a soma deles.
            case 3:
                int i = 0;
                while (i < 3){
                    System.out.println("informe um número!");
                    num2 = scan.nextFloat();
                    soma = num2 + soma;
                    i++;
                }
                System.out.println("A soma dos números é " + soma);
            break;
            // Q4 - Leia um numero real e imprima o resultado do quadrado desse numero.
            case 4:
                System.out.println("Informe um número!");
                num2 = scan.nextFloat();
                System.out.println("O quadrado desse número é " + Math.pow(num2,2));
            break;
            // Q5 - Leia um numero real e imprima a quinta parte deste numero.
            case 5:
                System.out.println("Informe um número!");
                num2 = scan.nextFloat();
                System.out.println("A quinta parte desse número é: " + num2/5);
            break;
            // Q6 Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit.
            case 6:
                System.out.println("Informe uma temperatura em graus Celcius!");
                tempC = scan.nextFloat();
                tempF = tempC*9/5+32;
                System.out.println("A temperatura informada, em graus Fahrenheit, é de " + tempF + " Graus");
            break;
            // Q7 - Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius.
            case 7:
                System.out.println("Informe uma temperatura em graus Fahrenheit!");
                tempF = scan.nextFloat();
                tempC = (tempF-32)*5/9;
                System.out.printf("A temperatura informada, em graus Celcius, é de %.2f %n", tempC);
            break;
            // Q8 - Leia uma temperatura em graus Kelvin e apresente-a convertida em graus Celsius.
            case 8:
                System.out.println("Informe uma temperatura em Graus Kelvin:");
                tempK = scan.nextFloat();
                tempC = (float) (tempK-273.15);
                System.out.printf("A temperatura informada, em graus Celcius, é de %.2f %n",tempC);
            break;
            // Q9 - Leia uma temperatura em graus Celsius e apresente-a convertida em graus Kelvin.
            case 9:
                System.out.println("Informe uma temperatura em Graus Celcius:");
                tempC = scan.nextFloat();
                tempK = (float) (tempC+273.15);
                System.out.printf("A temperatura informada, em graus Kelvin, é de %.2f %n",tempK);
            break;
            // Q10 - Leia uma velocidade em km/h e apresente-a convertida em m/s.
            case 10:
                System.out.println("Informe uma velocidade em Km/h:");
                kmHora = scan.nextFloat();
                mSeg = (float) (kmHora/3.6);
                System.out.println("A velocidade informada em m/s é de " + mSeg + "metros por segundo");
            break;
        }
    }
}