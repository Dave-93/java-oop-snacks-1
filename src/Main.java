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
        classe1.aggiungiStudenti("anna", "luca", "sara", "tony", "gino", "danny", "lucia", "marco", "chiara", "maria", "paolo", "dario");
        classe1.elencoStudenti();
        //
    }
}
