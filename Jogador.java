public class Jogador {

    private int id;
    private String nome;
    private int pontos;
    static int vidas;
    private Boolean morto;




    public  Jogador(String nome ) {
        this.id = id;
        this.nome = nome;
        this.morto = false;
        this.pontos = 0;
        this.vidas = 3;


    }
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    public int getPontos(int pontos) {
        return pontos;
    }
    public Boolean getMorto() {
        return morto;
    }

    public void setId(int id) {
        this.id = ++id;
    }
    public  Boolean setMorto(){
        this.morto = true;
        return morto;


    }

    public void infoJogador(){
        System.out.printf("%nO seu nome é: %s%n",nome);
        System.out.printf("%nVocê tem: %d Pontos%n",pontos);
        System.out.printf("%nVocê esta morto: %s%n",morto ? "Sim" : "Não");

    }


}
