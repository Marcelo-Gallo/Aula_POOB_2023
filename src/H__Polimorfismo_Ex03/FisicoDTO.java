package H__Polimorfismo_Ex03;

import G__Heranca_Ex02.*;

public class FisicoDTO extends ClienteDTO{
    private String cpf, rg;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    
    
}
