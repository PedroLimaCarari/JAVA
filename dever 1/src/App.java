public class App {
    public static void main(String[] args) throws Exception {
        Construtora constroiSuperRapido = new Construtora("01.127.290/0001-27");
        Corretor corretor01 = new Corretor("Yuri", "11111111", 10, 9);
        Corretor corretor02 = new Corretor("Rogério", "22222222", 15, 13);
        Corretor corretor03 = new Corretor("Pelé", "33333333", 8, 17);

        Endereco endereco01 = new Endereco("Antônio Cardoso Coelho", "Cachoeiro de Itapemirim", "ES", 733);
        Endereco endereco02 = new Endereco("D.Pedro II", "Rio de Janeiro", "RJ", 56);
        Endereco endereco03 = new Endereco("Maracanã", "Rio de Janeiro", "RJ", 1977);

        constroiSuperRapido.status();
        constroiSuperRapido.atualizarVendas(corretor01.getTotalVendasMes()+corretor02.getTotalVendasMes()+corretor03.getTotalVendasMes());
        
        corretor01.setEndereco(endereco01);
        corretor02.setEndereco(endereco02);
        corretor03.setEndereco(endereco03);
        corretor01.status();
        corretor02.status();
        corretor03.status();
    }
}
