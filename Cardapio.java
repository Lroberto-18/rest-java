public class Cardapio {
    private String produto;
    private String descricao;
    private String imagem;
    private int id;
    private Double valor;
    
    public Cardapio(String produto, String descricao, String imagem,int id,Double valor){
        setDescricao(descricao);
        setId(id);
        setProduto(produto);
        setImagem(imagem);
        setValor(valor);
    }
    public String getProduto(){
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public String getImagem() {
        return imagem;
    }
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String toString(){ 
        String tostring ="Produto: "+getProduto()+'\n'+
                        "Descrição: "+getDescricao()+'\n'+
                        "imagem: "+getImagem()+'\n'+
                        "id: "+getId()+'\n'+
                        "Valor: "+getValor()+'\n';
        return tostring;
   }
}