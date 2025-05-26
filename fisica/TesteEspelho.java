package fisica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteEspelho {
    public static void executar(){
        Scanner sc = new Scanner(System.in);
        List<Espelho> espelhos = new ArrayList<>();
        String opcao;

        do{
            System.out.print("Digite o tipo de espelho (plano, concavo, convexo): ");
            opcao = sc.nextLine().toLowerCase();

            while (!opcao.equals("plano") && !opcao.equals("concavo") && !opcao.equals("convexo")) {
                System.out.println("Tipo inválido.");
                System.out.println("Digite novamente (plano, concavo, convexo): ");
                opcao=sc.nextLine().toLowerCase();
            }

            System.out.println("Descreva a situação de uso do espelho: ");
            String descricao = sc.nextLine();

            Espelho e = switch (opcao) {
                case "plano" -> new EspelhoPlano(descricao);
                case "concavo" -> new EspelhoConcavo(descricao);
                default -> new EspelhoConvexo(descricao);

            };

            espelhos.add(e);

            System.out.print("Deseja adicionar outro? (s/n): "); 

        } while (sc.nextLine().equalsIgnoreCase("s"));

        System.out.println("\n--- Resultados dos espelhos criados ---");
        for (Espelho e : espelhos) {
            e.exibirTipo();
            System.out.println("Descricao: " +e.descricao);
            e.comportamentoImagem();
            System.out.println();
        }

        sc.close();
    }
}