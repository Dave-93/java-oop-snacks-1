public class Studente {
    
    //Attributi
    private String nome;
    private String cognome;
    private int eta;

    //Costruttore con PARAMETRI
    public Studente(String nome, String cognome, int eta){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }
    
    //Metodo
    public void info(){
        System.out.println(String.format("I dati dello studente sono %s %s, %d anni", nome, cognome, eta));
    }
}