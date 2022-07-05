import java.util.ArrayList;

public class Pessoas {
    private String nome;
	private String email;
	private String telefone;
	private String cidade;
	private String password;
    private String dataNacimento;
    private int quantidadeDePedidos;
    private int id;
    private int diaNa;
    private int mesNa;
    private int anoNa;
    private ArrayList<Pedidos> pedidos = new ArrayList<Pedidos>();
    
    public int getQuantidadeDePedidos(){
        return quantidadeDePedidos;
    }
    public void setQuantidade(){
        this.quantidadeDePedidos = 0;
    }
    public Pessoas(String nome, String email, String telefone,  String cidade, int id,int diaNa, int mesNa, int anoNa){
        setNome(nome);
        setCidade(cidade);
        setEmail(email);
        setId(id);
        setTelefone(telefone);
        setAnoNa(anoNa);
        setDiaNa(diaNa);
        setMesNa(mesNa);
        this.setQuantidade();
    }
    public String getNome(){
        return nome;
    }
    public void setPedidos(Pedidos pedido){
        this.pedidos.add(pedido);
        this.quantidadeDePedidos+=1;
    }
    public ArrayList<Pedidos> getPedidos(){
        return pedidos;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setDataNacimento(){
        this.dataNacimento = "Dia: "+this.diaNa+"Mes: "+this.mesNa+"Ano: "+this.anoNa;
    }
    public String getDataNacimento(){
        return dataNacimento;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getCidade(){
        return cidade;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getDiaNa(){
        return diaNa;
    }
    public void setDiaNa(int diaNa){
        this.diaNa = diaNa;
    }
    public int getMesNa() {
        return mesNa;
    }
    public void setMesNa(int mesNa){
        this.mesNa = mesNa;
    }
    public int getAnoNa(){
        return anoNa;
    }
    public void setAnoNa(int anoNa){
        this.anoNa = anoNa;
    }
    public String toString(){ 
        String tostring ="Nome: "+this.nome+'\n'+"Email: "+this.email+'\n'+
                        "Data de nacimento: "+this.dataNacimento+'\n'+"Telefone: "+this.telefone+'\n'+
                        "Cidade: "+this.cidade+'\n'+"Id: "+this.id+'\n';
        return tostring;
   }
}