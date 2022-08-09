import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
//ARRAY_LIST
        ArrayList <Integer> dados = new ArrayList<>();
        for (int i = 0; i <100; i++) {
            dados.add(random.nextInt(9999));
        }
//INICIALIZAÇÃO
        System.out.println("Qual é a quantidade de elementos que serão lidos, no vetor?");
        String quantidade = scanner.nextLine();

        for(int i=0; i<quantidade.length(); i++){
            System.out.println(dados);
        }
            //System.out.println(dados);

    }
}
