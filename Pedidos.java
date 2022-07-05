import java.util.ArrayList;

public class Pedidos{
    private int idPedido;
    private int idrestaurante;
    private ArrayList<Cardapio> produtos = new ArrayList<Cardapio>();

    public int getId(){
        return idPedido;
    }
    public void setId(int id){
        this.idPedido = id;
    }
    public int getIdPedido(){
        return idPedido;
    }
    public void setIdPedido(int idPedido){
        this.idPedido = idPedido;
    }
    public int getIdRestaurante(){
        return idrestaurante;
    }
    public void setIdrestaurante(int idrestaurante){
        this.idrestaurante = idrestaurante;
    }
    public ArrayList<Cardapio> getProdutos(){
        return produtos;
    }
    public void setPedidos(Cardapio produto){
        this.produtos.add(produto);
    }
}