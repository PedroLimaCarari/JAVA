public class Endereco {
    private String rua, cidade, estado;
    private int numero;


    public Endereco(String rua, String cidade, String estado, int numero) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;
    }

    //métodos acessores
    public String getRua() {
        return this.rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getCidade() {
        return this.cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return this.estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public int getNumero() {
        return this.numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    //Outros métodos
}
