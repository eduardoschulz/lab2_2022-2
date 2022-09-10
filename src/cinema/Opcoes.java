package cinema;

import java.util.Calendar;

public class Opcoes {
    private Sala sala;
    public Opcoes(Sala sala){
        this.sala = sala;
    }
    public void locarAssento(int fileira, int coluna, String nome){
        if((fileira > sala.getNum_fileira() || fileira < 0) || (coluna >
                sala.getNum_coluna() || coluna < 0)){
            System.out.printf("Posição Inválida!\n");
            return;
        }
        else if(sala.getAssentos()[fileira][coluna] != null){
            System.out.printf("Erro! Assento Ocupado\n");
            return;
        }
        else
            sala.getAssentos()[fileira][coluna] = new Assento(fileira, coluna, nome);
        System.out.printf("Assento Locado\n");
    }
    public void cancelarAssento(int fileira, int coluna){
        if((fileira > sala.getNum_fileira() || fileira < 0) ||
                (coluna > sala.getNum_coluna() || coluna < 0))
            System.out.printf("Erro! Posição da Cadeira é Inválido");

        sala.getAssentos()[fileira][coluna] = null;
        System.out.printf("Reserva Cancelada!\n");
    }

}
