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

        switch (inputs.inputInt("> ")){
            case 1:
                opcoes.locarAssento(inputs.inputInt("\nNúmero da Fileira:"),(inputs.inputChar("\nLetra da Coluna: ") - 'a'),
                        inputs.inputS("\nNome do Locador: "));
                break;
            case 2:
                opcoes.cancelarAssento(inputs.inputInt("\n Número da Fileira: "), (inputs.inputChar("\nLetra da Colunai: ") - 'a'));
                break;
        }

    }

}
