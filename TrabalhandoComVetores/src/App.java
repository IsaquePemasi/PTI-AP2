import java.util.*;

class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------------");
        System.out.println("Enter vector size: ");
        int n = scanner.nextInt();
        System.out.println("Chosen vector size: " + n);
        System.out.println("-------------------------------------------");
        System.out.println("Now insert your vector elements: ");
        ArrayList<Integer> vetor = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            vetor.add(scanner.nextInt());
        }
        System.out.println("Os " + vetor.size() + " informed values are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(vetor.get(i));
        }
        System.out.println("-------------------------------------------");
        if (ordenadoCrescente(vetor)) {
            System.out.println("The reported values are sorted!");
        } else {
            System.out.println("The reported values are not sorted!");
        }
        System.out.println("-------------------------------------------");
        int resultado = maiorDiferenca(vetor);
        System.out.println("The biggest difference between the elements: " + resultado);
    }

    public static int maiorDiferenca(ArrayList<Integer> vetor) {
        Collections.sort(vetor);
        int resultado = vetor.get(vetor.size() - 1) - vetor.get(0);
        return resultado;
    }

    public static boolean ordenadoCrescente(ArrayList<Integer> vetor) {
        for (int i = 0; i < vetor.size() - 1; i++) {
            if (vetor.get(i) > vetor.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}