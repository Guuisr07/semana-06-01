package exemplos;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Relacionamento entre classes
        Endereco e1 = new Endereco("1455879", "24");
        Endereco e2 = new Endereco("4487516", "34");
        Endereco e3 = new Endereco("1485236", "44");

        Cliente c1 = new Cliente("Guilherme", e1);
        c1.addEndereco(e2);
        c1.addEndereco(e3);

        System.out.println(c1.getNome());

//        for(int i = 0; i < c1.getEnderecos().size(); i++){
//            Endereco e = c1.getEnderecos().get(i);
//            System.out.println(e.getNumero() + "," + e.getCep());
//        }

        //Criando um for mais simples para execucao
        for (Endereco e : c1.getEnderecos()) {
            System.out.println(e.getNumero() + "," + e.getCep());
        }

//        //List / ArrayList
//        String[] palavras = new String[3];
//        palavras[0] = "Ola";
//        palavras[1] = " World";
//
//        System.out.println(palavras[0]);
//
//        List<String> palavras2 = new ArrayList<>();
//        palavras2.add("Ola 2");
//        palavras2.add(" Mundo");
//        palavras2.add("!");
//        palavras2.add("!");
//        palavras2.add("!");
//
//        System.out.println(palavras2.get(0));
//
//        //Para mostrar o tamanho da list
//        System.out.println(palavras2.size());
//
//        //Usando o for each
//        for (String palavra : palavras2) {
//            System.out.println(palavra);
//        }
//
//        //Criando uma lista para a classe Alunos
//        List<Aluno> alunos = new ArrayList<>();
//
//        //Criando os alunos para serem adicionados na lista
//        Aluno a1 = new Aluno();
//        a1.nome = "João";
//
//        Aluno a2 = new Aluno();
//        a2.nome = "Maria";
//
//        //Adicionando alunos na lista
//        alunos.add(a1);
//        alunos.add(a2);
//
//        //Mostrando qual o tamanho da lista
//        System.out.println(alunos.size());
//
//        //Mostrando todos os alunos a com o seu nome
//        for(Aluno a: alunos) {
//            System.out.println(a.nome);
//        }



    }
}
