package meu_pacote;

public class Professor extends Funcionario{
    
    public Professor(String nome, String cpf, int anoAdmissao, double salario) {
        super(nome, cpf, anoAdmissao, salario);
    }
    private String formacao;
    private String disciplina;
    private String turma;


    public void inserirFormacao(String formacao){
        this.formacao = formacao;
    }
    public void alterarFormacao(String novaFormacao){
        this.formacao = novaFormacao;
    }
    public void inserirTurma(String turma){
        this.turma = turma;
    }
    public void alterarTurma(String novaTruma){
        this.turma = novaTruma;
    }
    public void inserirDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    public void alterarDisciplina(String novaDisciplina){
        this.disciplina = novaDisciplina;
    }
}
