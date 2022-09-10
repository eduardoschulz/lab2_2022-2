package cinema;

public class Sala {
    private Assento[][] assentos;
    private int numero;
    private int num_coluna, num_fileira;
    private String status, filme;
    private Mapa mapa;

    public Sala(int numero, int num_coluna, int num_fileira) {
        this.numero = numero;
        this.num_coluna = num_coluna;
        this.num_fileira = num_fileira;
        assentos = new Assento[num_fileira][num_coluna];
        Mapa mapa = new Mapa(this);
    }

    public Assento[][] getAssentos() {
        return assentos;
    }

    public void setAssentos(Assento[][] assentos) {
        this.assentos = assentos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNum_coluna() {
        return num_coluna;
    }

    public void setNum_coluna(int num_coluna) {
        this.num_coluna = num_coluna;
    }

    public int getNum_fileira() {
        return num_fileira;
    }

    public void setNum_fileira(int num_fileira) {
        this.num_fileira = num_fileira;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public Mapa getMapa() {
        return mapa;
    }

    public void setMapa(Mapa mapa) {
        this.mapa = mapa;
    }
}
