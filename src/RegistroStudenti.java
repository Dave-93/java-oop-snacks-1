public class RegistroStudenti {
    //Attributi
    private String[] studenti;
    private int numeroStudenti;
    //

    //Costruttore
    public RegistroStudenti(){
        studenti = new String[10];
        numeroStudenti = 0; //numero di studenti attualmente registrati
    }
    //
 
    //Metodi
    public void aggiungiStudenti(String...elenco){
        for(int i = 0; i < elenco.length; i++){
            if(numeroStudenti < studenti.length) {
                studenti[numeroStudenti] = elenco[i];
                numeroStudenti++;
             }else {
                 System.out.println("Impossibile aggiungere lo studente: registro pieno.");
             }
        }
    }

    public void elencoStudenti(/*String... studenti*/) {
        for (int i = 0; i < studenti.length; i++) {
            System.out.print("Studenti registrati: ");
            System.out.println(studenti[i]);
        }
    }
    //
}
