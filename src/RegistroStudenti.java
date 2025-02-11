public class RegistroStudenti {
    //Attributi
    private Studente[] studenti;
    private int prossimaPosizione;
    //

    //Costruttore
    public RegistroStudenti(){
        this.studenti = new Studente[10];
        prossimaPosizione = 0; //numero di studenti attualmente registrati
    }
    //
 
    //Metodi
    public void aggiungiStudente(String nome, String cognome, int eta){
        if(prossimaPosizione < studenti.length) {
            studenti[prossimaPosizione] = new Studente(nome, cognome, eta);
            prossimaPosizione++;
        }else {
            System.out.println("Impossibile aggiungere lo studente: registro pieno.");
        }
    }

    public void elencoStudenti() {
        for (int i = 0; i < studenti.length; i++) {
            if(studenti[i] != null){
                studenti[i].info();
            }
        }
    }
    //
}