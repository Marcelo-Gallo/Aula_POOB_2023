package F__Encapsulamento_Ex06;

public class TrianguloDAO {
    private int a, b, c;
    private String retorno = " ";
    
    public String verifica(TrianguloDTO trianguloDTO){
        this.a = trianguloDTO.getA();
        this.b = trianguloDTO.getB();
        this.c = trianguloDTO.getC();
        
        if(this.a > (this.b + this.c) || this.b > (this.a + this.c) || this.c > (this.b + this.a) ){
            this.retorno = "Valores invalidos, não forma triangulo!";
            return this.retorno;
        }
        else
            return this.tipo(trianguloDTO);
    
}
    public String tipo(TrianguloDTO trianguloDTO){
        
        this.a = trianguloDTO.getA();
        this.b = trianguloDTO.getB();
        this.c = trianguloDTO.getC();
        
        if(this.a!=this.b && this.b!=this.c){
            this.retorno = "Triangulo Escaleno";
        }
        else if(this.a == this.b && this.b == this.c){
            this.retorno = " Triangulo Equilatero";
        }
        else if(this.a == this.b || this.b ==this.c || this.c == this.a){
            this.retorno = "Triangulo Isósceles";
        }
        return this.retorno;
    }
    
}
