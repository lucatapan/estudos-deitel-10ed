package orientacaoObjetos;

public class Conta {

    private String nome; //variavel String nome

    //metodo que define o nome no objeto
    public void setName(String nome){
        this.nome = nome; //armazena o nome
    }
    //metodo para recuperar o nome do objeto
    public String getName(){
        return nome;
    }
}
