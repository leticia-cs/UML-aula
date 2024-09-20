public class ControleEstoque {
    String nomeProduto;
    int IdProduto;
    int qtdEstoque;

    // get e set nome, id e qtd
    public String getNomeProduto(){
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }
    public int getIdProduto(){
        return IdProduto;
    }
    public void getIdProduto(int idProduto){
        this.IdProduto = idProduto;
    }
    public int getQtdEstoque(){
        return qtdEstoque;
    }
    public void setQtdEstoque(int qtdEstoque){
        this.qtdEstoque = qtdEstoque;
    }

    // funcoes do UML
    boolean existeEstoque(int IdProduto, int qtdEsperada){
        if(this.qtdEstoque >= qtdEsperada){
            return true;
        } else {
            return false;
        }
    }

    

}
