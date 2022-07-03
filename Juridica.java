public class Juridica extends Pessoas{
    private String cnpj;

    public Juridica(String nome, String email,String telefone, String cidade, int id,int diaNa, int mesNa, int anoNa, String cnpj){
        super(nome, email,telefone,cidade,id,diaNa,mesNa,anoNa);
        setCnpj(cnpj);
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String toString(){
        return super.toString() + this.getCnpj();
    }
}