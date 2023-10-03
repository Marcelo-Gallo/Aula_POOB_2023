package F__Encapsulamento_Ex10_comErro;

public class LancheDAO {
    private String cod, resp;
    private int conta1, conta2, conta3, conta4, conta5;
    
    public String sistema(LancheDTO lancheDTO){
        this.cod = lancheDTO.getCod();
        
        this.conta1 = lancheDTO.getConta1();
        this.conta2 = lancheDTO.getConta2();
        this.conta3 = lancheDTO.getConta3();
        this.conta4 = lancheDTO.getConta4();
        this.conta5 = lancheDTO.getConta5();
            
            if(this.cod.equals("1")){
                this.conta1++;
            }
            else if(this.cod.equals("2")){
                this.conta2++;
            }
            else if(this.cod.equals("3")){
                this.conta3++;
            }
            else if(this.cod.equals("4")){
                this.conta4++;
            }
            else if(this.cod.equals("5")){
                this.conta5++;
            }
            
            
            resp="=================="+
            "\n O pedido foi: "+
            "\n Hamburguer: "+this.conta1+
            "\n CheeseBurguer: "+this.conta2+
            "\n Misto quente: "+this.conta3+
            "\n Americano: "+this.conta4+
            "\n Queijo Prato: "+this.conta5+
            "\n=================="+
            "\nTotal: "+((this.conta1*1.5)+(this.conta2*1.8)+(this.conta3*1.2)+(this.conta4*2.0)+(this.conta5*1.0));

      /*  
        if(this.conta1>=1 &&this.conta2>=1&&this.conta3>=1&&this.conta4>=1&&this.conta5>=1){
            resp="=================="+
            "\n O pedido foi: "+
            "\n Hamburguer: "+this.conta1+
            "\n CheeseBurguer: "+this.conta2+
            "\n Misto quente: "+this.conta3+
            "\n Americano: "+this.conta4+
            "\n Queijo Prato: "+this.conta5+
            "\n=================="+
            "\nTotal: "+((this.conta1*1.5)+(this.conta2*1.8)+(this.conta3*1.2)+(this.conta4*2.0)+(this.conta5*1.0));
        }
        else if(this.conta1>=1 &&this.conta2>=1&&this.conta3>=1&&this.conta4>=1){
            resp="=================="+
            "\n O pedido foi: "+
            "\n Hamburguer: "+this.conta1+
            "\n CheeseBurguer: "+this.conta2+
            "\n Misto quente: "+this.conta3+
            "\n Americano: "+this.conta4+
            "\n=================="+
            "\nTotal: "+((this.conta1*1.5)+(this.conta2*1.8)+(this.conta3*1.2)+(this.conta4*2.0));
            }
        
        else if(this.conta1>=1 &&this.conta2>=1&&this.conta3>=1){
            resp="=================="+
            "\n O pedido foi: "+
            "\n Hamburguer: "+this.conta1+
            "\n CheeseBurguer: "+this.conta2+
            "\n Misto quente: "+this.conta3+
            "\n=================="+
            "\nTotal: "+((this.conta1*1.5)+(this.conta2*1.8)+(this.conta3*1.2));
            }
        
        else if(this.conta1>=1 &&this.conta2>=1){
            resp="=================="+
            "\n O pedido foi: "+
            "\n Hamburguer: "+this.conta1+
            "\n CheeseBurguer: "+this.conta2+
            "\n=================="+
            "\nTotal: "+((this.conta1*1.5)+(this.conta2*1.8));
            }
        
        else{
            resp="=================="+
            "\n O pedido foi: "+
            "\n Hamburguer: "+this.conta1+
            "\n=================="+
            "\nTotal: "+((this.conta1*1.5));
            }
        */
        
        
        
        
        return this.resp;
                
    }
    
}
