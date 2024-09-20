class Vendas extends ControleEstoque {
    String produto;
    float preco;

    // get e set: produto, preco
    String getProduto(){
        return produto;
    }
    void setProduto(String produto){
        this.produto = produto;
    }
    float getPreco(){
        return preco;
    }
    void setPreco(float preco){
        this.preco = preco;
    }

    // funcoes UML
    void vender(int idProduto){
        // nao sei como fazer para pegar id correspondente da classe.
        
    }
}
