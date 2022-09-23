package cinema;
import utils.*;
public class Menu {
    public static void main(String[] args) {
        Inputs inputs = new Inputs();
        System.out.printf("Criando Cinema...\nTamanho da Sala");

        int num_colunas = inputs.inputInt("\nNúmero de Colunas >");
        int num_fileiras = inputs.inputInt("\nNúmero de Fileiras >");

        Sala sala = new Sala(1,num_colunas,num_fileiras);
        Opcoes opcoes = new Opcoes(sala);
        Mapa mapa = new Mapa(sala);
        while(true) {
            menu();
            switch (inputs.inputInt("> ")) {
                case 1:
                    opcoes.locarAssento(inputs.inputInt("\nNúmero da Fileira:")-1, (inputs.inputChar("\nLetra da Coluna: ") - 'a'),
                            inputs.inputS("\nNome do Locador: "));
                    break;
                case 2:
                    opcoes.cancelarAssento(inputs.inputInt("\n Número da Fileira: ")-1, (inputs.inputChar("\nLetra da Colunai: ") - 'a'));
                    break;
                case 3:
                    mapa.listarAssentos();
                    break;
                case 4:
                    System.out.printf("\nNúmero de Cadeiras Vagas: %d", mapa.assentosVagos());
                    break;
                case 5:
                    System.out.printf("\nSaindo...");
                    System.exit(0);
                default:
                    System.out.printf("\nOpção Inválida");
            }
        }

    }
    public static void menu(){
        System.out.printf("\n\tCinema\nOpções:");
        System.out.printf("\n(1)- Locar Cadeira");
        System.out.printf("\n(2)- Cancelar Reserva");
        System.out.printf("\n(3)- Mapa da Sala");
        System.out.printf("\n(4)- Número de Cadeiras Vagas\n");
        System.out.printf("\n(5)- Sair");
    }

}
