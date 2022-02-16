public class Corretor {
    private String nome, matrícula;
    private int metaVenda, totalVendasMes;
    private Endereco endereco;


    public Corretor(String nome, String matrícula, int metaVenda, int totalVendasMes) {
        this.nome = nome;
        this.matrícula = matrícula;
        this.metaVenda = metaVenda;
        this.totalVendasMes = totalVendasMes;
    }

    //métodos acessores
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatrícula() {
        return this.matrícula;
    }
    public void setMatrícula(String matrícula) {
        this.matrícula = matrícula;
    }
    public int getMetaVenda() {
        return this.metaVenda;
    }
    public void setMetaVenda(int metaVenda) {
        this.metaVenda = metaVenda;
    }
    public int getTotalVendasMes() {
        return this.totalVendasMes;
    }
    public void setTotalVendasMes(int totalVendasMes) {
        this.totalVendasMes = totalVendasMes;
    }
    public Endereco getEndereco() {
        return this.endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    } 

    //Outros métodos
    public void status(){
        System.out.println("NOME:"+this.nome+"\nMATRÍCULA:"+this.matrícula);
        System.out.println("META DE VENDA:"+this.metaVenda+"\nTOTAL DE VENDA"+this.totalVendasMes);
        System.out.println("ENDEREÇO\nCIDADE:"+this.endereco.getCidade());
        System.out.println("ESTADO:"+this.endereco.getEstado()+"\nRUA:"+this.endereco.getRua());
        System.out.println("NÚMERO:"+this.endereco.getNumero());
        System.out.println("___________________________________________________________");
    }
}
