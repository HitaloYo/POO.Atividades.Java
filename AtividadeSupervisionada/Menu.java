import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Banco banco = new Banco();
        Scanner menu = new Scanner(System.in);

        while (true) {

            System.out.print("##--Teste Estrutura de Menu--##\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Novo Cadastro     |\n");
            System.out.print("| Opção 2 - Buscar Clientes   |\n");
            System.out.print("| Opção 3 - Remover Conta     |\n");
            System.out.print("| Opção 4 - Imprimir Contas   |\n");
            //System.out.print("| Opção 5 - sacar             |\n");
            //System.out.print("| Opção 6 - depositar         |\n");
            //System.out.print("| Opção 7 - transferencia     |\n");
            System.out.print("| Opção 5 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = menu.nextInt();

            if (opcao == 5) {
                System.out.print("\nAté logo!");
                menu.close();
            }

            switch (opcao) {
                case 1:
                    double saldo = 0.0;
                    String tipoDeConta;

                    System.out.println("\nOpção Novo Cadastro Selecionado");
                    
                    System.out.println("Digite o titular da conta: ");
                    String titular = menu.next();
                    
                    System.out.println("Digite o Numero da conta");
                    int numero = menu.nextInt();
                    
                    System.out.println("Digite a Agência da conta");
                    int agencia = menu.nextInt();
                    
                    System.out.print("|-----------------------------|\n");
                    System.out.print("| Opção 1 - Conta Corrente    |\n");
                    System.out.print("| Opção 2 - Conta poupanca    |\n");
                    System.out.print("|-----------------------------|\n");
                    int tipo = menu.nextInt();
                    
                    if(tipo == 1){
                        tipoDeConta = "corrente";
                    }else if(tipo == 2){
                        tipoDeConta = "poupanca";
                    }else{
                        tipoDeConta = "Invalido";
                    }
                                
                    banco.armazenaContas(titular, numero, agencia, saldo, tipoDeConta);
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("\nOpção Clientes Selecionado");
                    System.out.println("Digite o nome do titular");
                    String nomeTitular = menu.next();
                    banco.buscaConta(nomeTitular);
                    System.out.println("");
                    break;

                case 3:
                    System.out.print("\nOpção Remover Conta Selecionado\n");
                    System.out.println("Digite o nome do titular a ser removido");
                    String nomeTitularRemove = menu.next();
                    banco.removeConta(nomeTitularRemove);
                    break;

                case 4:
                    System.out.print("\nOpção Imprimir Contas Selecionado\n");
                    banco.imprimeContas();
                    break;
                
                case 5:
                    System.out.print("\nOpção sacar Selecionado\n");
                    break;
                case 6:
                    System.out.print("\nOpção depositar Selecionado\n");
                    break;
                case 7:
                    System.out.print("\nOpção transferencia Selecionado\n");
                    break;

                default:
                    System.out.print("\nOpção Inválida!");
                    break;
            }
        }
    }
}