package H__Polimorfismo_ExPratica;

public class JuridicoDTO extends ClienteDTO{
    private String CNPJ, IE;

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getIE() {
        return IE;
    }

    public void setIE(String IE) {
        this.IE = IE;
    }
    
}
