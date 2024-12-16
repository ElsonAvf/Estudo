import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] quartos = new String[100];
        String[] clientes = new String[100];
        int[] dias = new int[100];
        boolean sair = false;
        while (!sair) {
            // Menu
            System.out.println("-------- MENU --------");
            System.out.println("1 - Cadastro de Quarto");
            System.out.println("2 - Associar Cliente");
            System.out.println("3 - Desassociar Cliente");
            System.out.println("4 - Relatório de Quartos Vazios");
            System.out.println("5 - Relatório de Quartos Ocupados");
            System.out.println("6 - Sair");
            
            int comando = Integer.valueOf(sc.nextLine());
            System.out.print("\033[H\033[2J"); // Limpa o console
            
            switch (comando) {
                case 1: {
                    // Cadastro de quarto
                    boolean todosQuartosCadastrados = true;
                    for (int i = 0; i < 100; i++) {
                        if (quartos[i] == null) {
                            todosQuartosCadastrados = false;
                            break;    
                        }
                    }
                    if (todosQuartosCadastrados) {
                        System.out.println("Todos quartos já estão cadastrados");
                    } else {
                        System.out.println("Qual o nome do quarto?");
                        String nome = sc.nextLine();
                        for (int i = 0; i < 100; i++) {
                            if (quartos[i] == null) {
                                quartos[i] = nome;
                                System.out.println("O índice do seu quarto é: " + i);
                                break;
                            }
                        }
                    }
                    break;
                }
                case 2: {
                    // Associar Cliente
                    boolean temQuartosVagos = false;
                    for (int i = 0; i < 100; i++) {
                        if (quartos[i] != null && clientes[i] == null) {
                            temQuartosVagos = true;
                        }
                    }
                    if(temQuartosVagos) {
                        System.out.println("Digite o nome do cliente");
                        String nome = sc.nextLine();
                        System.out.println("Esses são os quartos disponíveis:");
                        for (int i = 0; i < 100; i++) {
                            if (quartos[i] != null && clientes[i] == null) {
                                System.out.println("Nome do quarto: " + quartos[i] + ", Índice do quarto: " + i);
                            }
                        }
                        System.out.println("Digite o índice do quarto que ele deseja ficar");
                        int indice = Integer.valueOf(sc.nextLine());
                        if (quartos[indice] == null) {
                            System.out.println("Esse quarto não existe");
                            break;
                        }
                        System.out.println("Quantos dias ele deseja ficar?");
                        int quantidadeDeDias = Integer.valueOf(sc.nextLine());
                        clientes[indice] = nome;
                        dias[indice] = quantidadeDeDias;
                    } else {
                        System.out.println("Não há quartos vagos");
                    }
                    break;
                }
                case 3: {
                    // Desassociar Cliente
                    System.out.println("Nome do cliente que deseja desassociar");
                    String nome = sc.nextLine();
                    boolean clienteEncontrado = false;
                    for (int i = 0; i < 100; i++) {
                        if (clientes[i] != null && clientes[i].equals(nome)) {
                            clienteEncontrado = true;
                            System.out.println(clientes[i] + " deixou o hotel");
                            clientes[i] = null;
                            dias[i] = 0;
                            break;
                        }
                    }
                    if (!clienteEncontrado) {
                        System.out.println("O cliente \"" + nome + "\" não foi encontrado. Tente novamente");
                    }
                    break;
                }
                case 4: {
                    // Relatório de quartos vazios
                    System.out.println("Quartos vazios:");
                    int quantidadeQuartosVazios = 0;
                    for (int i = 0; i < 100; i++) {
                        if (quartos[i] != null && clientes[i] == null) {
                            System.out.println("Nome do quarto: " + quartos[i] + ", Índice do quarto: " + i);
                            quantidadeQuartosVazios++;
                        }
                    }
                    if (quantidadeQuartosVazios == 0) {
                        System.out.println("Não há quartos vazios");
                    }
                    
                    break;
                }
                case 5: {
                    // Relatório de quartos ocupados
                    System.out.println("Quartos ocupados:");
                    int quantidadeQuartosOcupados = 0;
                    for (int i = 0; i < 100; i++) {
                        if (quartos[i] != null && clientes[i] != null) {
                            System.out.println("Nome do quarto: " + quartos[i] + ", Cliente: " + clientes[i] + ", Índice do quarto: " + i + ", Tempo de estadia: " + dias[i]);
                            quantidadeQuartosOcupados++;
                        }
                    }
                    if (quantidadeQuartosOcupados == 0) {
                        System.out.println("Não há quartos ocupados");
                    }
                    
                    break;
                }
                case 6: {
                    sair = true;
                    break;
                }
            }
            // Caso o comando seja inválido
            if (comando < 1 || comando > 5) {
                System.out.println("Comando inválido");
            }
            // Qualquer comando que não seja o de saída
            if (comando != 6) {
              System.out.println();  
              System.out.println("Digite qualquer coisa para continuar");
              sc.nextLine();
              System.out.print("\033[H\033[2J"); // Limpa o console
            }                
        }
        
        System.out.println("See you, space cowboy");
        sc.close();
    }
}
