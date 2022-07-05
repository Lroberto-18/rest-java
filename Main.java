import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static public void main(String[] args){

        ArrayList<Pessoas> pessoas = new ArrayList<Pessoas>();
        ArrayList<Restaurante> restauranteList = new ArrayList<Restaurante>();

        
        Cardapio c1 = new Cardapio("produto1", "descricao", "imagem",1, 45.4);
        Cardapio c2 = new Cardapio("produto", "descricao", "imagem",2, 45.4);
        Cardapio c3 = new Cardapio("produto", "descricao", "imagem",3, 45.4);
        Restaurante rest1 = new Restaurante("Rest 1", "String nome", "String descricao", 1);
        Restaurante rest2 = new Restaurante("Rest 2", "String nome", "String descricao", 2);
        Restaurante rest3 = new Restaurante("Rest 3", "String nome", "String descricao", 3);
        restauranteList.add(rest1);
        restauranteList.add(rest2);
        restauranteList.add(rest3);
        rest1.setCardapio(c1);
        rest1.setCardapio(c2);
        rest1.setCardapio(c3);
        Pessoas pessoa1 = new Fisica("leandro", "email1", "telefone", "cidade", 1, 1, 1,1,"String cpf");
        Pessoas pessoa2 = new Fisica("Roberto", "email2", "telefone", "cidade", 2, 1, 1,1,"String cpf");
        Pessoas pessoa3 = new Fisica("Carlos", "email3", "telefone", "cidade", 3, 1, 1,1,"String cpf");
        Pessoas pessoa4 = new Fisica("Joao", "email4", "telefone", "cidade", 4, 1, 1,1,"String cpf");
        Pessoas pessoa5 = new Fisica("Marta", "email5", "telefone", "cidade", 5, 1, 1,1,"String cpf");
        Pessoas pessoa6 = new Juridica("Paulo", "email6", "telefone", "cidade", 6, 1, 1,1,"String cnpj");
        Pessoas pessoa7 = new Juridica("Junior", "email7", "telefone", "cidade", 7, 1, 1,1,"String cnpj");
        Pessoas pessoa8 = new Juridica("Maria", "email8", "telefone", "cidade", 8, 1, 1,1,"String cnpj");
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);
        pessoas.add(pessoa5);
        pessoas.add(pessoa6);
        pessoas.add(pessoa7);
        pessoas.add(pessoa8);
        Pedidos p = new Pedidos();
        p.setPedidos(c1);
        p.setPedidos(c3);
        p.setPedidos(c2);
        p.setIdrestaurante(rest1.getId());
        pessoa1.setPedidos(p);

        int opcao = 0;
		Scanner scan = new Scanner(System.in);
        
		do{
			System.out.println("Digite o número da opção desejada");
            System.out.println(" 1 -> Cadastro/consulta/remoção de Pessoas");
			System.out.println(" 2 -> Mostrar todos os itens que estão no cardápio");
			System.out.println(" 3 -> Cadastro/consulta e pesquisa de todos os restaurantes");
			System.out.println(" 4 -> Pesquisa os pedidos realizados por uma determinada pessoa jurídica em um restaurante específico");
            System.out.println(" 5 -> Realiza o cadastro de um pedido com três itens docardápio de um determinado restaurante.");
            System.out.println(" 6 -> Criar um cardápio específico para as festas juninas associado a um determinado restaurante");
			System.out.println(" 7 -> Pesquisa dos usuários que mais realizaram pedidos.");
            opcao = scan.nextInt();
			switch(opcao){
				case 1:
					System.out.println("Digite o numero 1 para Cadastro");
                    System.out.println("Digite o numero 2 para Consultar");
                    System.out.println("Digite o numero 3 para Remover");
                    int opcaoB = scan.nextInt();
                    if(opcaoB==1){
                        System.out.println("Digite 5 para PF ou 6 para PJ");
                        int opcaoC = scan.nextInt();
                        System.out.println("Nome: ");
                        String nome = scan.next();
                        System.out.println("Email: ");
                        String email = scan.next();
                        System.out.println("Telefone: ");
                        String telefone = scan.next();
                        System.out.println("Cidade: ");
                        String cidade = scan.next();
                        System.out.println("Id: ");
                        int id = scan.nextInt();
                        System.out.println("Dia: ");
                        int diaNa = scan.nextInt();
                        System.out.println("Mes: ");
                        int mesNa = scan.nextInt();
                        System.out.println("ano: ");
                        int anoNa= scan.nextInt();
                        if(opcaoC==5){
                            System.out.println("CPF: ");
                            String cpf = scan.next();
                            Pessoas pessoa = new Fisica(nome, email, telefone, cidade, id, diaNa, mesNa, anoNa, cpf);
                            pessoas.add(pessoa);
                        }
                        if(opcaoC==6){
                            System.out.println("CNPJ: ");
                            String cnpj = scan.next();
                            Pessoas pessoa = new Juridica(nome, email, telefone, cidade, id, diaNa, mesNa, anoNa, cnpj);
                            pessoas.add(pessoa);
                        }
                    }
                    if(opcaoB==2){
                        System.out.println("Dgite o id da pessoa: ");
                        int id = scan.nextInt();
                        for(int i=0; i < pessoas.size(); i++){
                            if(id==pessoas.get(i).getId()){
                               System.out.println(pessoas.get(i).toString());
                               break;
                            }                     
                        }
                    }
                    if(opcaoB==3){
                        System.out.println("Dgite o id da pessoa: ");
                        int id = scan.nextInt();
                        for(int i=0; i < pessoas.size(); i++){
                            if(id==pessoas.get(i).getId()){
                               pessoas.remove(i);
                               break;
                            }                          
                        }
                    }
				break;
				case 2:
					System.out.println("Digite o id do restaurante");
                    int idRest = scan.nextInt();
                    for(int i=0; i < restauranteList.size(); i++){
                        if(idRest==restauranteList.get(i).getId()){
                            ArrayList<Cardapio> c = restauranteList.get(i).getCardapio();
                            for(int j=0; j < c.size(); j++) {
                                System.out.println(c.get(j).toString());
                            }
                        }                
                    }
				break;
				case 3:
                System.out.println("Digite o numero 1 para Cadastro de restaurante");
                System.out.println("Digite o numero 2 para Consultar restaurante");
                System.out.println("Digite o numero 3 para Pesquisar todos");
                int opcaoD = scan.nextInt();
                if(opcaoD==1){
                    System.out.println("Endereço: ");
                    String endereco = scan.next();
                    System.out.println("Nome: ");
                    String nome = scan.next();
                    System.out.println("Descrição: ");
                    String descricao = scan.next();
                    System.out.println("Id: ");
                    int id = scan.nextInt();
                    Restaurante restaurante = new Restaurante(endereco, nome, descricao, id);
                    restauranteList.add(restaurante);
                }else if(opcaoD==2){
                    System.out.println("Digite o id do restaurante");
                    int Rest = scan.nextInt();
                    for(int i=0; i < restauranteList.size(); i++){
                        if(Rest==restauranteList.get(i).getId()){
                            System.out.println(restauranteList.get(i).toString());
                            break;
                        }                
                    }
                }else if(opcaoD==3){
                    for(int i=0; i < restauranteList.size(); i++){
                        System.out.println(restauranteList.get(i).toString());         
                    }
                }
				break;
                case 4:
                    System.out.println("Digite o nome ID da pessoa");
                    int idPessoa = scan.nextInt();
                    System.out.println("Digite o ID do restaurante");
                    int idRestaurante = scan.nextInt();
                    for(int i=0; i < pessoas.size(); i++){
                        if(idPessoa==pessoas.get(i).getId()){
                            for(int j=0;j<pessoas.get(i).getPedidos().size();j++){
                                if(idRestaurante==pessoas.get(i).getPedidos().get(j).getIdRestaurante()){
                                    System.out.println(pessoas.get(i).getPedidos().get(j).getProdutos().get(j).toString());
                                }
                            }
                        }                    
                    }

                break;
                case 5:
                    System.out.println("Digite o nome ID da pessoa");
                    int idPe = scan.nextInt();
                    System.out.println("Digite o ID do restaurante");
                    int idRe = scan.nextInt();
                    System.out.println("Digite o ID do produto 1");
                    int idP1 = scan.nextInt();
                    System.out.println("Digite o ID do produto 2");
                    int idP2 = scan.nextInt();
                    System.out.println("Digite o ID do produto 3");
                    int idP3 = scan.nextInt();

                    Pedidos pedidoIdPessoas = new Pedidos();
                    int ini = 0;
                    for(int i=0; i < pessoas.size(); i++){
                        if(ini==3) break;
                        if(idPe==pessoas.get(i).getId()){
                            for(int j=0; j < restauranteList.size(); j++){
                                if(ini==3) break;
                                if(idRe==restauranteList.get(j).getId()){
                                    for(int z = 0; z<restauranteList.get(j).getCardapio().size(); z++){
                                        if(idP1 ==restauranteList.get(j).getCardapio().get(z).getId()){
                                            pedidoIdPessoas.setPedidos(restauranteList.get(j).getCardapio().get(z));
                                            ini+=1;
                                        }
                                        if(idP2 ==restauranteList.get(j).getCardapio().get(z).getId()){
                                            pedidoIdPessoas.setPedidos(restauranteList.get(j).getCardapio().get(z));
                                            ini+=1;
                                        }
                                        if(idP3 ==restauranteList.get(j).getCardapio().get(z).getId()){
                                            pedidoIdPessoas.setPedidos(restauranteList.get(j).getCardapio().get(z));
                                            pedidoIdPessoas.setIdrestaurante(restauranteList.get(j).getId());
                                            ini+=1;
                                        }
                                        if(ini==3){
                                            pessoas.get(i).setPedidos(pedidoIdPessoas);
                                            break;
                                        }
                                    }
                                }               
                            }
                        }                   
                    }
                break;
                case 6:
                    System.out.println("Digite o id do restaurante");
                    int Rest = scan.nextInt();
                    for(int i=0; i < restauranteList.size(); i++){
                        if(Rest==restauranteList.get(i).getId()){
                            Cardapio boloMilho = new Cardapio("Bolo de Milho", "Massas", "B_Milho.jpeg", 70, 32.50);
                            Cardapio canjica = new Cardapio("Canjica", "Massas", "canjica.jpeg", 71, 12.50);
                            Cardapio cuscuz= new Cardapio("Cuscuz", "porção", "cuscuz.jpeg", 72, 17.50);
                            Cardapio pacoca = new Cardapio("Paçoca", "sobremesa", "pacoca.jpeg", 73, 8.50);
                            restauranteList.get(i).setCardapio(boloMilho);
                            restauranteList.get(i).setCardapio(canjica);
                            restauranteList.get(i).setCardapio(cuscuz);
                            restauranteList.get(i).setCardapio(pacoca);
                            break;
                        }                
                    }
                break;
                case 7:
                    int p1 = pessoas.get(0).getQuantidadeDePedidos();
                    int maior = 0;
                    for(int i =1;i<pessoas.size();i++){;
                        if(pessoas.get(i).getQuantidadeDePedidos()>=p1) {
                            p1 = pessoas.get(i).getQuantidadeDePedidos();
                            maior = i;
                        }
                    }
                    System.out.println(pessoas.get(maior).toString());
                break;
				case 8:
					System.out.println("Encerrado");
				break;
				default:
					System.out.println("Opção inválida, tente novamente.");
			}
			
		}while(opcao != 8);
		scan.close();
	}
}