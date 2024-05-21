public abstract class Conta{
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    
    public Conta(String titular, int numero, String agencia, double saldo){
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }
    
    public void saca(double valor){
        this.saldo = valor - this.saldo;
    }
    public void deposita(double valor){
        this.saldo = valor + this.saldo;
    }
    public void transfere(double valor, Conta conta){
        this.saca(valor);
        conta.deposita(valor);
    }
    
public void setTitular(String titular){
    this.titular = titular;
}
public void setNumero(int inteiro){
    this.numero = numero;
}
public void setAgencia(String linha){
    this.agencia = linha;
}
public void setSaldo(double duploflutuante){
    this.saldo = duploflutuante;
}

public String getTitular(){
    return this.titular;
}
public int getNumero(){
    return this.numero;
}
public String getAgencia(){
    return this.agencia;
}
public double getSaldo(){
    return this.saldo;
}
    
}