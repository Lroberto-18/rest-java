import java.util.ArrayList;

public class Restaurante {
    private String endereco;
    private String nome;
    private String descricao;
    private int id;
    private ArrayList<Cardapio> cardapio = new ArrayList<Cardapio>();
    
    public Restaurante(String endereco, String nome, String descricao, int id, Cardapio cardapio){
        setEndereco(endereco);
        setNome(nome);
        setDescricao(descricao);
        setId(id);
        this.cardapio.add(cardapio);
    }

    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public ArrayList<Cardapio> getCardapio(){
        return cardapio;
    }
    public void setCardapio(Cardapio cardapio){
        this.cardapio.add(cardapio);
    }
}