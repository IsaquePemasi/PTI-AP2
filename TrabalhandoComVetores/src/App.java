import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
//ARRAY_LIST
        ArrayList <Integer> dados = new ArrayList<>();
        for (int i = 0; i <10; i++) {
            dados.add(random.nextInt(1000));
        }
//INICIALIZAÇÃO
        System.out.println("Qual é a quantidade de elementos que serão lidos, no vetor?");
        String quantidade = scanner.nextLine();

            System.out.println(dados);
      

    }
}
