public class Principal {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Piloto piloto1 = new Piloto("Lewis Hamilton", 36, "Mercedes", "Mercedes W12", 1, "Britânico", 280, 100);
        Piloto piloto2 = new Piloto("Max Verstappen", 24, "Red Bull", "Red Bull RB16B", 2, "Holandês", 120, 20);

        agenda.adicionarContato(piloto1);
        agenda.adicionarContato(piloto2);

        Piloto pilotoEncontrado = agenda.buscarPorNome("Max Verstappen");

        if (pilotoEncontrado != null) {
            System.out.println("Piloto encontrado:\n" + pilotoEncontrado);
        } else {
            System.out.println("Piloto não encontrado.");
        }

        System.out.println("----------------------------------------");

        List<Piloto> pilotosDaMercedes = agenda.buscarPorEquipe("Mercedes");

        System.out.println("Pilotos da equipe Mercedes:");
        for (Piloto piloto : pilotosDaMercedes) {
            System.out.println(piloto);
        }

        agenda.mostrarContatos();
    }
}
