package H__Polimorfismo_Ex03;

import G__Heranca_Ex02.*;

public class JuridicoDTO extends ClienteDTO{
    private String cnpj, ie;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }
    
    
    
}
