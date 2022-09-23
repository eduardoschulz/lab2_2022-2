package cinema;

public class Mapa {
    Sala sala;

    public Mapa(Sala sala){
        this.sala = sala;
    }
    public void listarAssentos(){
        for(int i=0; i < sala.getAssentos().length; i++){
            System.out.printf("%d" , (i+1)); //0 + 'a' = 'a'; 1 + 'a' = b ASCII
            for(int j=0; j < sala.getAssentos()[0].length; j++){
                if(sala.getAssentos()[i][j] != null)
                    System.out.printf(" * ");
                else
                    System.out.printf(" - ");
            }
            System.out.printf("\n");
        }
        System.out.printf(" ");
        for(int i=0; i < sala.getAssentos()[0].length; i++)
            System.out.printf(" %c ", (i + 'a'));
    }
    public int assentosVagos(){
        int vagos = 0;
        for(int i=0; i < sala.getAssentos().length; i++)
            for(int j=0; j < sala.getAssentos()[0].length ; j++)
                if(sala.getAssentos()[i][j] == null)
                    vagos++;
        return vagos;
    }
}


