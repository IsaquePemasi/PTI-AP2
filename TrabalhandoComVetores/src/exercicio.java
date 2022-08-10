import java.util.*;

class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o tamanho do vetor: ");
        int n = sc.nextInt();
        System.out.println("Este eh o tamanho do vetor escolhido: " + n);
        System.out.println("Agora insira os elementos do seu vetor: ");
        ArrayList<Integer> vetor = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            vetor.add(sc.nextInt());
        }
        for(int i = 0; i < n; i++) {
            System.out.println(vetor.get(i));
        }
    
        if(ordenadoCrescente(vetor)) {
            System.out.println("Esta ordenado!");
        } else {
            System.out.println("Nao esta ordenado!");
        }
        int resultado = maiorDiferenca(vetor);
        System.out.println("A maior diferenca entre elementos eh: " + resultado);
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