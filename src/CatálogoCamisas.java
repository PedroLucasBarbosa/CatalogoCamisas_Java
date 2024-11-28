import java.util.ArrayList;

public class CatálogoCamisas {

    private ArrayList<Camisas> Listagem = new ArrayList<>();
    public void cadastrarCamisas (String descricao, String tamanho, double preço){
        Listagem.add(new Camisas(descricao, tamanho, preço));


    }
    public void removerCamisas (String descricao){
        for(Camisas i:Listagem){
            if(i.getDescricao().equals(descricao)){
                Listagem.remove(i);
                break;

            }
        }
    }
    public void listarCamisas(){
        for(Camisas i:Listagem){
            System.out.println(i.getDescricao());
            System.out.println(i.getTamanho());
            System.out.println(i.getPreço());
        }

    }
    public void buscarCamisas(String tamanho){
        for(Camisas i:Listagem){
            if(i.getTamanho().equals(tamanho)){
                System.out.println(i.getDescricao());
                System.out.println(i.getTamanho());
                System.out.println(i.getPreço());
            }
        }
    }

}
