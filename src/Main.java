public class Main {
    public static void main(String[] args) {

        //Snack 1
        Studente studente1 = new Studente("Luca", "Rossi", 25);
        Studente studente2 = new Studente("Anna", "Bianchi", 19);
        studente1.info();
        studente2.info();
        //

        //Snack 2
        ContoBancario cliente1 = new ContoBancario(113);
        cliente1.saldoCorrente();
        cliente1.deposito(150);
        cliente1.saldoCorrente();
        cliente1.prelievo(200);
        cliente1.saldoCorrente();
        cliente1.prelievo(100);
        cliente1.saldoCorrente();
        //

        //Snack 3
        RegistroStudenti classe1 = new RegistroStudenti();
        classe1.aggiungiStudente("Sara", "Bianchi", 19);
        classe1.aggiungiStudente("Dario", "Bianchi", 29);
        classe1.aggiungiStudente("Denise", "Bianchi", 16);
        classe1.aggiungiStudente("Luca", "Bianchi", 20);
        classe1.aggiungiStudente("Marta", "Bianchi", 18);
        classe1.aggiungiStudente("Lucia", "Bianchi", 18);
        classe1.aggiungiStudente("Danny", "Bianchi", 19);
        classe1.aggiungiStudente("Paola", "Bianchi", 17);
        classe1.aggiungiStudente("Federica", "Bianchi", 19);
        classe1.aggiungiStudente("Matteo", "Bianchi", 18);
        classe1.aggiungiStudente("Riccardo", "Bianchi", 17);
        classe1.elencoStudenti();
        //
    }
}