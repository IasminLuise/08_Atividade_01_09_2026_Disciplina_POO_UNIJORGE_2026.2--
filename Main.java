final class Main {
    void main() {
        Veiculo veiculo1 = new Veiculo();
        veiculo1.setMarca("Ford");
        veiculo1.setModelo("Carro");
        veiculo1.setAno(2025);
        veiculo1.setKm((double)50000.0F);
        veiculo1.setDisponivel(false);
        veiculo1.getDisponivel();
        veiculo1.calcularIdade();
        veiculo1.devolverVeiculo();
        veiculo1.realizarLocacao();
        veiculo1.devolverVeiculo();
        veiculo1.exibirDados();
        Veiculo veiculo2 = new Veiculo();
        veiculo2.setMarca("Ford");
        veiculo2.setModelo("Carro");
        veiculo2.setAno(2026);
        veiculo2.setKm((double)20000.0F);
        veiculo2.setDisponivel(true);
        veiculo2.getDisponivel();
        veiculo2.calcularIdade();
        veiculo2.devolverVeiculo();
        veiculo2.realizarLocacao();
        veiculo2.devolverVeiculo();
        veiculo2.exibirDados();
    }
}
