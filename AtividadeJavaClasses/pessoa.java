public class Piloto {
    private String nome;
    private int idade;
    private String equipe;
    private String carro;
    private int posicaoCorrida;
    private String nacionalidade;
    private int corridasDisputadas;
    private int vitorias;

    public Piloto(String nome, int idade, String equipe, String carro, int posicaoCorrida, String nacionalidade, int corridasDisputadas, int vitorias) {
        this.nome = nome;
        this.idade = idade;
        this.equipe = equipe;
        this.carro = carro;
        this.posicaoCorrida = posicaoCorrida;
        this.nacionalidade = nacionalidade;
        this.corridasDisputadas = corridasDisputadas;
        this.vitorias = vitorias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public int getPosicaoCorrida() {
        return posicaoCorrida;
    }

    public void setPosicaoCorrida(int posicaoCorrida) {
        this.posicaoCorrida = posicaoCorrida;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getCorridasDisputadas() {
        return corridasDisputadas;
    }

    public void setCorridasDisputadas(int corridasDisputadas) {
        this.corridasDisputadas = corridasDisputadas;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nIdade: %d\nEquipe: %s\nCarro: %s\nPosição na corrida: %d\nNacionalidade: %s\nCorridas Disputadas: %d\nVitórias: %d",
                nome, idade, equipe, carro, posicaoCorrida, nacionalidade, corridasDisputadas, vitorias);
    }
}
