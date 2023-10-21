public class pessoa {
    private String nome;
    private int idade;
    private String sobrenome;

    public pessoa (String nome,String sobrenome,int idade, String cpf, String estadoCivil ) {
        this.nome = nome;
        this.idade = idade;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
    }
    
     public String getNome() {
        return nome;
    }
     
      public int getIdade() {
        return idade;
    }
      
       public String getSobrenome(){
           return sobrenome;
       }
    public String getCpf(){
           return cpf;
       }
    public String getEstadoCivil(){
           return estadoCivil;
       }
     
      public void setNome(String nome) {
        this.nome = nome;
    }
      
       public void setIdade(int idade) {
        this.idade = idade;
    }
       
        public void setSobrenome(String sobrenome){
           this.sobrenome = sobrenome;
       }
     public void setCpf(String cpf){
           this.cpf = cpf;
       }
     public void setEstadoCivil(String estadoCivil){
           this.estadoCivil = estadoCivil;
       }
}


classe: principal.java
public class principal {
 public static void main (String[] args) {
     pessoa pessoa = new pessoa("Rogério", "Ceni", 33, "422.333.113-12", "Casado");
     
     System.out.println("Nome: " + pessoa.getNome());
     System.out.println("Sobrenome: " + pessoa.getSobrenome());  
     System.out.println("Idade: " + pessoa.getIdade());
     System.out.println("Cpf: " + pessoa.getCpf());
     System.out.println("Estado Civil: " + pessoa.getEstadoCivil());
       
        
        pessoa.setNome("Wendell");
        pessoa.setSobrenome("Costa");
        pessoa.setIdade(33);
        pessoa.setCpf("993.772.725-12");
        pessoa.setEstadoCivil("Solteiro");
        
        
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Posição: " + pessoa.getSobrenome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Cpf: " + pessoa.getCpf());
        System.out.println("Estado Civil: " + pessoa.getEstadoCivil());
        
 }
}
