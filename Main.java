import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static public void main(String[] args){
        ArrayList<Pessoas> pessoas = new ArrayList<Pessoas>();
        ArrayList<Restaurante> restauranteList = new ArrayList<Restaurante>();

        Cardapio c1 = new Cardapio("produto1", "descricao", "imagem",1, 45.4);
        Cardapio c2 = new Cardapio("produto", "descricao", "imagem",2, 45.4);
        Cardapio c3 = new Cardapio("produto", "descricao", "imagem",3, 45.4);
        Restaurante rest1 = new Restaurante("Rest 1", "String nome", "String descricao", 1, c1);
        Restaurante rest2 = new Restaurante("Rest 2", "String nome", "String descricao", 2, c2);
        Restaurante rest3 = new Restaurante("Rest 3", "String nome", "String descricao", 3, c3);
        restauranteList.add(rest1);
        restauranteList.add(rest2);
        restauranteList.add(rest3);
        rest1.setCardapio(c2);
        rest1.setCardapio(c3);
        Pessoas pessoa1 = new Fisica("leandr", "email", "telefone", "cidade", 1, 1, 1,1,"String cpf");
        Pessoas pessoa2 = new Fisica("Roberto", "email", "telefone", "cidade", 2, 1, 1,1,"String cpf");
        Pessoas pessoa3 = new Fisica("leandro", "email", "telefone", "cidade", 3, 1, 1,1,"String cpf");
        Pessoas pessoa4 = new Fisica("Roberto", "email", "telefone", "cidade", 4, 1, 1,1,"String cpf");
        Pessoas pessoa5 = new Fisica("leandro", "email", "telefone", "cidade", 5, 1, 1,1,"String cpf");
        Pessoas pessoa6 = new Juridica("Roberto", "email", "telefone", "cidade", 1, 1, 1,1,"String cnpj");
        Pessoas pessoa7 = new Juridica("leandro", "email", "telefone", "cidade", 1, 1, 1,1,"String cnpj");
        Pessoas pessoa8 = new Juridica("Roberto", "email", "telefone", "cidade", 1, 1, 1,1,"String cnpj");
        pessoas.add(pessoa1);

        int opcao = 0;
		Scanner scan = new Scanner(System.in);
        
		do{
			System.out.println("Digite o número da opção desejada");
            System.out.println(" 1 -> Cadastro/consulta/remoção de Pessoas");
			System.out.println(" 2 -> Mostrar todos os itens que estão no cardápio");
			System.out.println(" 3 -> Cadastro/consulta e pesquisa de todos os restaurantes");
			System.out.println(" 4 -> Pesquisa os pedidos realizados por uma determinada pessoa jurídica em um restaurante específico");
            System.out.println(" 5 -> Realiza o cadastro de um pedido com três itens do cardápio de um determinado restaurante.");
            System.out.println(" 6 -> O restaurante irá criar um cardápio específico para as festas juninas. Cadastre esse novo cardápio associado a um determinado restaurante");
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
                            }                     
                        }
                    }
                    if(opcaoB==3){
                        System.out.println("Dgite o id da pessoa: ");
                        int id = scan.nextInt();
                        for(int i=0; i < pessoas.size(); i++){
                            if(id==pessoas.get(i).getId()){
                               pessoas.remove(i);
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
                                Cardapio obj = c.get(j);
                                System.out.println(obj.toString());
                            }
                        }                
                    }
				break;
				case 3:
                System.out.println("Digite o numero 1 para Cadastro");
                System.out.println("Digite o numero 2 para Consultar");
                System.out.println("Digite o numero 3 para Pesquisar todos");
                int opcaoD = scan.nextInt();
				break;
				case 8:
					System.out.println("Até logo");
				break;
				default:
					System.out.println("Opção inválida, tente novamente.");
			}
			
		}while(opcao != 8);
		scan.close();
	}


}