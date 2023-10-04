/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gerenciamento;

/**
 *
 * @author wendell.salves
 */

public class pessoa {
        private String nome;
    private int idade;
    private String posicao;

    public pessoa (String nome, int idade,String posicao) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
    }
    
     public String getNome() {
        return nome;
    }
     
      public int getIdade() {
        return idade;
    }
      
       public String getPosicao(){
           return posicao;
       }
     
      public void setNome(String nome) {
        this.nome = nome;
    }
      
       public void setIdade(int idade) {
        this.idade = idade;
    }
       
        public void setPosicao(String posicao){
           this.posicao = posicao;
       }
}


public class principal {
 public static void main (String[] args) {
     pessoa pessoa = new pessoa("Wendell", 21, "Zagueiro");
     
     System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
       System.out.println("Posição: " + pessoa.getPosicao());
        
        pessoa.setNome("Ronaldinho Gaúcho");
        pessoa.setIdade(43);
        pessoa.setPosicao("Atacante");
        
         System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Posição: " + pessoa.getPosicao());
 }
}
