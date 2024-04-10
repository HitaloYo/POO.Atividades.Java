
public class Circulo extends Figura{
    private double raio;
    //Construtor
    Circulo(double raio, String cor){
        this.raio = raio;
        this.cor = cor;
    }
    //Metodo Setter
    void setRaio(double raio){
        this.raio = raio;
    }
    //Metodo Getter
    double getRaio(){
        return this.raio;
    }
    //Metodos
    double area(){
        return 3.14 * (this.raio * this.raio);
    }
}
