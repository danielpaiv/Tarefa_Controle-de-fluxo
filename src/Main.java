import javax.print.attribute.standard.Media;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

            calcularMedia();
            resultado();

        }
        private static void calcularMedia(){

            int avaliacao1 = 7;
            int avaliacao2 =8;
            int avaliacao3 = 9;
            int avaliacao4 =8;

            int nun5 = avaliacao1 + avaliacao2;
            int nun6 = nun5 + avaliacao3;
            int Total = nun6 + avaliacao4;

            int Media = Total /4;

            System.out.println("Total:" + Total);
            System.out.println("Média:" + Media);
        }

        private static void resultado(){


            Scanner s = new Scanner(System.in);

            System.out.println("Digite a nota do aluno");

            int result = s.nextInt();

            if (result >= 7){
                System.out.println("Aluno aprovado");
            }
            else if (result >= 5 && result <= 7){
                System.out.println("Aluno em recuperação");
            }
            else {
                System.out.println("Aluno reprovado");
            }


        }



    }
