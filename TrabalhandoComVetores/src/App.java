import java.util.*;

class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------------");
        System.out.println("Insira o tamanho do vetor: ");
        int n = scanner.nextInt();
        System.out.println("Tamanho do vetor escolhido: " + n);
        System.out.println("-------------------------------------------");
        System.out.println("Agora, insira os elementos do seu vetor: ");
        ArrayList<Integer> vetor = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            vetor.add(scanner.nextInt());
        }
        System.out.println("Os " + vetor.size() + " valores informados sao: ");
        for(int i = 0; i < n; i++) {
            System.out.println(vetor.get(i));
        }
        System.out.println("-------------------------------------------");
        if(ordenadoCrescente(vetor)) {
            System.out.println("Os valores informados, estao ordenados!");
        } else {
            System.out.println("Os valores informados, nao estao ordenados!");
        }
        System.out.println("-------------------------------------------");
        int resultado = maiorDiferenca(vetor);
        System.out.println("A maior diferenca entre os elementos: " + resultado);
    }
    
    public static int maiorDiferenca(ArrayList<Integer> vetor) {
        Collections.sort(vetor);
        int resultado = vetor.get(vetor.size() - 1) - vetor.get(0);
        return resultado;
    }
    
    public static boolean ordenadoCrescente(ArrayList<Integer> vetor) {
        for(int i = 0; i < vetor.size() - 1; i++) {
            if(vetor.get(i) > vetor.get(i+1)) {
                return false;
            }
        }
        return true;
    }
}