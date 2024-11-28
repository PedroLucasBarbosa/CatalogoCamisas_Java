public class TestarCatálogo {
    public static void main(String[] args) {
        String descricao = "Camisa Preta";
        String tamanho = "P";
        double preço = 29.90;
        String descricao2 = "Camisa Vermelha";
        String tamanho2 = "M";
        double preço2 = 35.90;
        String descricao3 = "Camisa Azul";
        String tamanho3 = "G";
        double preço3 = 40.90;
        CatálogoCamisas objCatálogo = new CatálogoCamisas();
        Camisas objCamisas = new Camisas();
        objCatálogo.cadastrarCamisas(descricao, tamanho, preço);
        objCatálogo.cadastrarCamisas(descricao2,tamanho2,preço2);
        objCatálogo.cadastrarCamisas(descricao3,tamanho3,preço3);
        objCatálogo.removerCamisas("Camisa Vermelha");
        objCatálogo.listarCamisas();
        objCatálogo.buscarCamisas(tamanho);
        System.out.println(objCamisas);
    }
}
