import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Piloto> contatos;

    public Agenda() {
        contatos = new ArrayList<>();  
    }

    public void adicionarContato(Piloto piloto) {
        contatos.add(piloto);
    }

    public Piloto buscarPorNome(String nome) {
        for (Piloto piloto : contatos) {
            if (piloto.getNome().equals(nome)) {
                return piloto;
            }
        }
        return null;
    }

    public List<Piloto> buscarPorEquipe(String equipe) {
        List<Piloto> pilotosEncontrados = new ArrayList<>();
        for (Piloto piloto : contatos) {
            if (piloto.getEquipe().equalsIgnoreCase(equipe)) {
                pilotosEncontrados.add(piloto);
            }
        }
        return pilotosEncontrados;
    }

    public void mostrarContatos() {
        System.out.println("Lista de Contatos:");
        for (Piloto piloto : contatos) {
            System.out.println(piloto.toString());
            System.out.println("-----------");
        }
    }
}
