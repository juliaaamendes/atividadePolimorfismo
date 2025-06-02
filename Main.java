import java.util.Scanner;
import fisica.TesteEspelho;
import arte.TesteArte;
import matematica.Main_mat;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha a disciplina:");
            System.out.println("1 - Arte");
            System.out.println("2 - Física");
            System.out.println("3 - Matemática");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> arte.TesteArte.executar();
                case 2 -> fisica.TesteEspelho.executar();
                case 3 -> matematica.Main_mat.executar();
                case 0 -> System.out.println("Encerrando programa.");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}