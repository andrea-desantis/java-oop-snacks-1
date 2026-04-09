package org.snacks.conto;

import java.math.BigDecimal;

public class ContoBancario {
    private int conto;
    private BigDecimal saldo;

    // costruttore
    public ContoBancario(int conto){
        this.conto=conto;
        this.saldo = new BigDecimal(0);
    }

    // metodi
    public void deposita(BigDecimal versato){
        if(versato.compareTo(BigDecimal.ZERO) > 0){
        this.saldo = saldo.add(versato);
        }else{
            System.out.println("Errore: l'importo da depositare deve essere positivo.");
        }

    }

    public void preleva(BigDecimal prelevato){
        if(this.saldo.compareTo(prelevato) >= 0){
        this.saldo = saldo.subtract(prelevato);
        }else{
            System.out.println("Errore: l'importo da prelevare deve essere minore o uguale al saldo totale.");
        }
    }

    public BigDecimal getSaldo(){
        return this.saldo;
    }
}
