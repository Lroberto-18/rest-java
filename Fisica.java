public class Fisica extends Pessoas{
    private String cpf;
    private int idade;

    public Fisica(String nome, String email, String telefone,  String cidade, int id,int diaNa, int mesNa, int anoNa, String cpf){
        super(nome, email,telefone,cidade,id,diaNa,mesNa,anoNa);
        setCpf(cpf);
    }
    public String toString(){
        return super.toString() + this.getCpf();
    }
    public int getIdade() {
        return idade;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    void calcularIdade(int dia, int mes, int anoAtual){
        if(this.getDiaNa()>= dia){
            if(this.getMesNa() >= mes){
                this.idade = anoAtual - this.getAnoNa();
            }else{
                this.idade = anoAtual - this.getAnoNa()-1;
            }
        }else{
            if(this.getMesNa() < mes){
                this.idade = anoAtual - getAnoNa()-1;
            }
        }
    }
}