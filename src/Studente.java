public class Studente {
    
    //Attributi
    public String nome;
    public String cognome;
    public int eta;

    //Costruttore con PARAMETRI
    public Studente(String nome, String cognome, int eta){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;

    }
    
    public void info(){
        System.out.println(String.format("I dati dello studente sono %s %s, %d anni", nome, cognome, eta));
    }

}
