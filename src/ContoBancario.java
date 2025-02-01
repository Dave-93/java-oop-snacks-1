public class ContoBancario {
    
    //Attributi
    public int conto;
    public int saldo;
    //

    //Costruttore
    public ContoBancario(int conto){
        this.conto = conto;
        this.saldo = 0;
    }
    //
    
    //Metodi
    public void saldoCorrente(){
        System.out.println(String.format("Il conto numero %d ha saldo %d", conto, saldo));
    }

    public int deposito (int quantitaDeposito){
        saldo += quantitaDeposito;
        return saldo;
    }

    public int prelievo (int quantitaPrelievo){
        /* saldo -= quantitaPrelievo;
        return saldo; */
        if(saldo >= quantitaPrelievo){
            saldo -= quantitaPrelievo;
            return saldo;
        }else{
            System.out.println(String.format("Mi dispiace, il conto %d non ha il credito sufficiente(%d) che si intende prelevare(%d)", conto, saldo, quantitaPrelievo));
            return saldo;
        }
    }
    //
}
