package cinema;

public class Assento {
    private int coluna, fileira;
    private String nome_reserva;

    public Assento(int coluna, int fileira, String nome_reserva) {
        this.coluna = coluna;
        this.fileira = fileira;
        this.nome_reserva = nome_reserva;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getFileira() {
        return fileira;
    }

    public void setFileira(int fileira) {
        this.fileira = fileira;
    }

    public String getNome_reserva() {
        return nome_reserva;
    }

    public void setNome_reserva(String nome_reserva) {
        this.nome_reserva = nome_reserva;
    }

    @Override
    public String toString() {
        return " *";
    }
}
