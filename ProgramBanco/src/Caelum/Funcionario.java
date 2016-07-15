package Caelum;

abstract class Funcionario {
    
    private String senha;
    private String departamento;
    private String cpf;
    protected double salario;
    private Data dataEfetivacao;
    private String nome;

    void recebeAumento(double valor) {
        setSalario(getSalario() + valor);
    }

    double calculaGanhoAnual() {
        double anual;
        anual = 12 * this.salario;
        return anual;
    }

    void mostra() {
        System.out.println("Nome: " + nome);

        System.out.println("Data de efetivação: " + this.dataEfetivacao.formatada());

        System.out.println("");
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    //Bonificação padrão dos funcionários
    abstract double getBonification();
}
