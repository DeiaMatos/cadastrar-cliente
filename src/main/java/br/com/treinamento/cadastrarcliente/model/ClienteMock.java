package br.com.treinamento.cadastrarcliente.model;

public class ClienteMock {
	private Long cpf;
	private String nome;
	private String dataNascimento;
	private String sexo;
	private Double salario;
	private String profissao;
	
	public ClienteMock(Long cpf, String nome, String dataNascimento, String sexo, Double salario, String profissao){
        this.setCpf(cpf);
        this.setNome(nome);
        this.setDataNascimento(dataNascimento);
        this.setSexo(sexo);
        this.setSalario(salario);
        this.setProfissao(profissao);
    }
	/*
	public void ClientMock(long cpf, String nome, String dataNascimento, String sexo, Double salario, String profissao) {
        ClienteMock c1 = new ClienteMock(99912345678L, "Luiz Otávio", "29/11/1983", "M", 3900.00, "Operador");
        ClienteMock c2 = new ClienteMock(88812345678L, "Antonio Mendes", "16/10/1983", "M", 2500.00, "Auxiliar");
        ClienteMock c3 = new ClienteMock(77712345678L, "Joaquim Silva", "10/04/1983", "M", 3300.00, "Atendente");
        ClienteMock c4 = new ClienteMock(66612345678L, "Maria Antonia", "28/02/1983", "F", 4100.00, "Vendedora");
        ClienteMock c5 = new ClienteMock(55512345678L, "Vanessa Oliveira", "08/09/1983", "F", 5200.00, "Supervisora");
        clientes.put(99912345678L, c1);
        clientes.put(88812345678L, c2);
        clientes.put(77712345678L, c3);
        clientes.put(66612345678L, c4);
        clientes.put(55512345678L, c5);
 
    }
 */
    public Long getCpf(){
        return cpf;
    }
    public void setCpf(Long cpf){
        this.cpf = cpf;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public Double getSalario(){
        return salario;
    }
    public void setSalario(Double salario){
        this.salario = salario;
    }
    public String getProfissao(){
        return profissao;
    }
    public void setProfissao(String Profissao){
        this.profissao = profissao;
    }

	
}
