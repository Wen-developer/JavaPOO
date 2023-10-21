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

    // Getters e setters...

    @Override
    public String toString() {
        return String.format("Nome: %s\nIdade: %d\nEquipe: %s\nCarro: %s\nPosição na corrida: %d\nNacionalidade: %s\nCorridas Disputadas: %d\nVitórias: %d",
                nome, idade, equipe, carro, posicaoCorrida, nacionalidade, corridasDisputadas, vitorias);
    }
}
