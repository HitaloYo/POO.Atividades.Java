public class Teste {
    public static void main(String[] args){
        Retangulo retangulo1 = new Retangulo(10,15,"Azul");
        Triangulo triangulo1 = new Triangulo(25, 16, "Verde");
        Circulo circulo1 = new Circulo(25, "preto");
        //Quadrado quadrado = new quadrado(PARAMENTROS);
        System.out.println(retangulo1.toString());
        System.out.println("==========");
        System.out.println(triangulo1.toString());
        System.out.println("==========");
        System.out.println(circulo1.toString());
        System.out.println("==========");
    }
}
