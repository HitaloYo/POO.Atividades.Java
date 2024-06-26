
public class Circulo extends Figura implements AreaCalculavel{
    private double raio;
    //Construtor
    Circulo(double raio){
        this.raio = raio;
    }
    //Metodo Setter
    void setRaio(double raio){
        this.raio = raio;
    }
    //Metodo Getter
    double getRaio(){
        return this.raio;
    }
    double getDiametro(){
        return this.raio * 2;
    }
    //Metodos
    public double calculaArea(){
        return 3.14 * (raio * raio);
    }
}
