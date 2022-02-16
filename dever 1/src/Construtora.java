public class Construtora {
    private String cnpj;
    private Endereco endereco = new Endereco("Joaquin Nabuco", "Rio Preto", "RJ", 1333);
    private int totalVendas;
        //xx.xxx.xxx/0001-xx  
        //0001=matrix
        //0002=filial

    public Construtora(String cnpj) {
        this.cnpj = cnpj;
    }
    //métodos acessores
    public String getCnpj() {
        return this.cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public Endereco getEndereco() {
        return this.endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public int getTotalVendas() {
        return this.totalVendas;
    }
    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }
    //Outros métodos
    public boolean validacaoCnpj(){
        if(this.cnpj.length() == 18){
            return true;
        }
        else{
        return false;
        }    
    }
    public void atualizarVendas(int vendaCorretor){
        if(validacaoCnpj()){
        this.totalVendas = vendaCorretor;
        
        System.out.println("Total de vendas atualizado com sucesso.\nVendas totais: "+this.totalVendas);
        }
        else{
        }

    }
    public void status(){
        if(validacaoCnpj()){
            System.out.println("==================Constroi Super Rápido====================");
            System.out.println("CNPJ:"+this.cnpj);
            System.out.println("CNPJ validado com sucesso.");
            System.out.println("ENDEREÇO\nCIDADE:"+this.endereco.getCidade());
            System.out.println("ESTADO:"+this.endereco.getEstado()+"\nRUA:"+this.endereco.getRua());
            System.out.println("NÚMERO:"+this.endereco.getNumero());
            System.out.println("___________________________________________________________");
        }
        else{
            System.out.println("NÂO FOI POSSÍVEL MOSTRAR OS DADOS DA EMPRESA DEVIDO AO CNPJ INVÁLIDO.");
        }
    }
}
