import java.util.Random;
import java.util.Scanner;

public class Main_mat {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in, "UTF-8");
        Random random = new Random();
        int op=0;
        int l=0;
        int b=0;
        int a=0;
        int l2 = 0;

        String q = "null";
        String resposta = "null";

        Quadrado quadrado = new Quadrado();
        Retangulo retangulo = new Retangulo();
        Triangulo triangulo = new Triangulo();

    //menu principal (com laço de repetição):
        while(op != 5){
            System.out.println("Você selecionou a opção matemática");
            System.out.println("Escolha o que deseja fazer:");
            System.out.println("1- Estudar as figuras geométricas planas");
            System.out.println("2- Fazer exercícios sobre o quadrado");
            System.out.println("3- Fazer exercícios sobre o retângulo");
            System.out.println("4- Fazer exercícios sobre o triângulo");
            System.out.println("5- Sair");
            op = scanner.nextInt();
            scanner.nextLine();
        

        switch(op){
            //Estudar figuras (apresenta definição e dá exemplos);
            case 1:
            System.out.println("Você escolheu estudar as figuras geométricas planas!");
            System.out.println("Este sistema ajuda você a estudar as três principais figuras geométricas planas: O quadrado, o círculo e o triângulo");
            quadrado.exibirDefinicao();
            quadrado.mostrarExemplo();
            retangulo.exibirDefinicao();
            retangulo.mostrarExemplo();
            triangulo.exibirDefinicao();
            triangulo.mostrarExemplo();
            break;

            //Exercícios quadrado (area e perímetro) (if quadrado para escolher entre área o perímetro):
            case 2:
            System.out.println("Vamos fazer exercícios sobre o quadrado!");
            System.out.println("Você deseja fazer exercícios sobre a área ou o perímetro do quadrado?");
            q = scanner.nextLine().trim();
            l = 1+ random.nextInt(100);
            int aq = 1+ random.nextInt(2);

            if(q.equalsIgnoreCase("área") || q.equalsIgnoreCase("area") ){
                //area (menu (numero randomizado entre 1 e 2 para escolher entre os 2 exercicios)):
                switch(aq){
                    case 1:
                    //1- da o numero (random int) do lado e o usuário deve calcular a área
                    System.out.println("Qual é a área (em cm) de um quadrado de lado " +l+ " cm?");
                    resposta = scanner.nextLine().trim();

                    if (resposta.equalsIgnoreCase(l*l+ "cm")){
                        System.out.println("Parabéns! Sua resposta está correta!");
                    } else {
                        System.out.println("Oh não! Parece que sua resposta está incorreta!");
                        System.out.println("Sua resposta: " +resposta);
                        System.out.println("Resposta correta: " +l*l+ " cm");
                    };
                    break;

                    case 2:
                    // 2- da o numero da área (random int com raiz quadrada inteira) e o usuário deve desobrir o lado
                    int raiz = 1 + random.nextInt(10);
                    int area = raiz * raiz;

                    System.out.println("Qual é o lado (em cm) de um quadrado de área " +area+ " cm?");
                    resposta = scanner.nextLine().trim();

                    if (resposta.equalsIgnoreCase(raiz+ "cm")){
                        System.out.println("Parabéns! Sua resposta está correta!");
                    } else {
                        System.out.println("Oh não! Parece que sua resposta está incorreta!");
                        System.out.println("Sua resposta: " +resposta);
                        System.out.println("Resposta correta: " +raiz+ " cm");
                    };
                    break;
                    
                };
            } else if(q.equalsIgnoreCase("perimetro")||q.equalsIgnoreCase("perímetro")){

                switch(aq){
                    case 1:
                    //perímetro: 1- da o número do lado (random int) e o usuário deve calcular o perímetro
                    System.out.println("Qual o perímetro (em cm) de um quadrado de lado "+l+" cm?");
                    resposta = scanner.nextLine().trim();

                    if (resposta.equalsIgnoreCase(l*4+ "cm")){
                        System.out.println("Parabéns! Sua resposta está correta!");
                    } else {
                        System.out.println("Oh não! Parece que sua resposta está incorreta!");
                        System.out.println("Sua resposta: " +resposta);
                        System.out.println("Resposta correta: " +l*4+ " cm");
                    };
                    break;
                    case 2:
                    // 2- da o número do perímtero (random int divisível por 4) e o usuário deve descobrir o lado
                    int p4 = 1 + random.nextInt(100);
                    int p = p4*4;

                    System.out.println("Qual o lado (em cm) de um quadrado de perímetro "+p+" cm?");
                    resposta = scanner.nextLine().trim();

                    if (resposta.equalsIgnoreCase(p4+ "cm")){
                        System.out.println("Parabéns! Sua resposta está correta!");
                    } else {
                        System.out.println("Oh não! Parece que sua resposta está incorreta!");
                        System.out.println("Sua resposta: " +resposta);
                        System.out.println("Resposta correta: " +p4+ " cm");
                    };
                    break;

                }
            } else{
                System.out.println("Opção inválida, encerre o programa e tente novamente");
            };
            break;
            case 3:
            //Exercícios retângulo (area e perímetro) (menu retângulo para escolher entre área e perímetro):
            System.out.println("Vamos fazer exercícios sobre o retângulo!");
            System.out.println("Você deseja fazer exercícios sobre a área ou o perímetro do retângulo?");
            q = scanner.nextLine().trim();
            l = 1+ random.nextInt(100);
            b = 1+ random.nextInt(100);

            if(q.equalsIgnoreCase("área") || q.equalsIgnoreCase("area")){
            //area: da o numero do lado (random int) e base (random int) do lado e o usuário deve calcular a área
            System.out.println("Qual é a área (em cm) de um retângulo de lado " +l+ " cm e base " +b+ " cm?");
                    resposta = scanner.nextLine().trim();

                    if (resposta.equalsIgnoreCase(l*b+ "cm")){
                        System.out.println("Parabéns! Sua resposta está correta!");
                    } else {
                        System.out.println("Oh não! Parece que sua resposta está incorreta!");
                        System.out.println("Sua resposta: " +resposta);
                        System.out.println("Resposta correta: " +l*b+ " cm");
                    };
            } else if(q.equalsIgnoreCase("perimetro")||q.equalsIgnoreCase("perímetro")) {
                //perímetro: da o número do lado (random int) e da base (random int) e o usuário deve calcular o perímetro
                System.out.println("Qual é o perímetro (em cm) de um retângulo de lado " +l+ " cm e base " +b+ " cm?");
                    resposta = scanner.nextLine().trim();

                    if (resposta.equalsIgnoreCase(l*2+b*2+ "cm")){
                        System.out.println("Parabéns! Sua resposta está correta!");
                    } else {
                        System.out.println("Oh não! Parece que sua resposta está incorreta!");
                        System.out.println("Sua resposta: " +resposta);
                        System.out.println("Resposta correta: " +l*2+b*2+ " cm");
                    };
            } else {
                System.out.println("Opção inválida, encerre o programa e tente novamente");
            };
            break;
            case 4:
            //Exercícios triângulo (area e perímetro) (menu retângulo para escolher entre área e perímetro):
            System.out.println("Vamos fazer exercícios sobre o triângulo!");
            System.out.println("Você deseja fazer exercícios sobre a área ou o perímetro do triângulo?");
            q = scanner.nextLine().trim();
            l = 1+ random.nextInt(100);
            b = 1+ random.nextInt(100);
            a = 1+ random.nextInt(50);
            l2 = 1+ random.nextInt(100);

            if(q.equalsIgnoreCase("área") || q.equalsIgnoreCase("area")){
            //area: da o numero da altura (random int par) e da base (random int par) e o usuário deve calcular a área
                a = a*2;
                b = b*2;

                System.out.println("Qual é a área (em cm) de um triângulo de base " +b+ " cm e altura " +a+ " cm?");
                resposta = scanner.nextLine().trim();
                if (resposta.equalsIgnoreCase(a*b/2+ "cm")){
                        System.out.println("Parabéns! Sua resposta está correta!");
                    } else {
                        System.out.println("Oh não! Parece que sua resposta está incorreta!");
                        System.out.println("Sua resposta: " +resposta);
                        System.out.println("Resposta correta: " +a*b/2+ " cm");
                    };
            } else if (q.equalsIgnoreCase("perimetro")||q.equalsIgnoreCase("perímetro")) {
            //perímetro: da o número da base (random int), do lado 1 (random int) e do lado 2 (random int) e o usuário deve calcular o perímetro
                System.out.println("Qual é o perímetro (em cm) de um triângulo de lado 1" +l+ " cm, lado 2 " +l2+ " cm e base " +b+ " cm?");
                resposta = scanner.nextLine().trim();

                if (resposta.equalsIgnoreCase(l+b+l2+ "cm")){
                    System.out.println("Parabéns! Sua resposta está correta!");
                } else {
                    System.out.println("Oh não! Parece que sua resposta está incorreta!");
                    System.out.println("Sua resposta: " +resposta);
                    System.out.println("Resposta correta: " +l+b+l2+ " cm");
                };
            };
            break;
            case 5:
            System.out.print("Você saiu do programa!");
            break;
            default:
            System.out.println("Essa opção não é válida, por favor, escolha outra opção!");
            };
        };
    };
};
