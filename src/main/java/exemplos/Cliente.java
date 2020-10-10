package exemplos;

//Importando a colecao list para ser usado no endereco
import java.util.List;
import java.util.ArrayList;


//Exemplo de relacionamento entre classes
//Relacionamento de 1 para muitos
public class Cliente {
    private String nome;
    private List<Endereco> enderecos;

    public Cliente (String nome, Endereco endereco){
        this.enderecos = new ArrayList<>(); 
        this.nome = nome;
        //Para adicionar o endereco construtor na lista
        this.enderecos.add(endereco);
    }

    public String getNome(){
        return  nome;
    }

    public void addEndereco(Endereco endereco){
        enderecos.add(endereco);
    }

    public  List<Endereco> getEnderecos(){
        return enderecos;
    }
}

//Relacionamento de 1 para 1
//public class Cliente {
//    private String nome;
//    private Endereco endereco;
//
//    public Cliente (String nome, Endereco endereco){
//        this.nome = nome;
//        this.endereco = endereco;
//    }
//
//    public String getNome(){
//        return  nome;
//    }
//
//    public Endereco getEndereco(){
//        return endereco;
//    }
