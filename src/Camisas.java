public class Camisas {

    //area de atributos
    private String descricao;
    private String tamanho;
    private double preço;

    //construtores
    public Camisas (){
        setCamisas("--A--Descricao--Da--Camisa--","--G--M--P--",0.0);

    }
    public Camisas (String descricao, String tamanho, double preço){

        setCamisas(descricao, tamanho, preço);

    }
    //área de métodos (get/set == métodos de acesso)
    public void setCamisas ( String descricao, String tamanho, double preço){

        this.descricao = descricao;
        this.tamanho = tamanho;
        this.preço = preço;


    }
    public String getDescricao (){

        return this.descricao;

    }

    public String getTamanho (){

        return this.tamanho;
    }

    public double getPreço (){

        return this.preço;

    }
    @Override
    public String toString(){
        return
                "descrição: " + this.descricao + "\ntamanho: " + this.tamanho + "\npreço: " + this.preço;

    }
}
