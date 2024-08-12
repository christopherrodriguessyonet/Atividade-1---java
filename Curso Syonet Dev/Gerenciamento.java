import java.util.List;

public interface Gerenciamento {
    public void adicionarAluno(Aluno aluno);
    public void removerAluno(String matricula);
    public List<Aluno> listarAlunos();
    public double calcularMedia = 0;

}
