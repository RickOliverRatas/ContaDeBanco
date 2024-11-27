import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
            String nome = "Henrique";
            String conta = "corrente";
            double saldoInicial = 3000.0;

            String dados = """
                    Operações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- tranferir valor
                    4- sair
                    """;
        System.out.println(dados);
            int escolha = leitura.nextInt();
            while (escolha != 4){
                if (escolha == 1){
                    System.out.println(nome + "\n" + conta + "\n" + saldoInicial);
                    System.out.println();
                    System.out.println(dados);
                    escolha = leitura.nextInt();
                } else if (escolha == 2){
                    System.out.println("quanto vc quer depositar");
                    double valor = leitura.nextDouble();
                    saldoInicial += valor;
                    System.out.println("saldo atualizado "+ saldoInicial);
                    System.out.println(dados);
                } else if (escolha == 3){
                    System.out.println("quanto vc quer transferir: ");
                    double valor = leitura.nextDouble();
                        if (valor > saldoInicial){
                            System.out.println("impossivel trasnferir esse valor");
                            System.out.println();
                        } else {
                            saldoInicial -= valor;
                            System.out.println("saldo atualizado" + saldoInicial);
                            System.out.println(dados);
                            escolha = leitura.nextInt();
                        }
                } else if (escolha != 4){
                    System.out.println("opção invalida");
                }
            }
    }
}