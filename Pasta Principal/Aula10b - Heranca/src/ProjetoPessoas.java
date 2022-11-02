public class ProjetoPessoas {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        Professor p1 = new Professor();
        Funcionario p4 = new Funcionario();
        Tecnico t1 = new Tecnico();

        v1.setNome("Pedro");
        v1.setSexo('M');

        a1.setNome("Maria");
        a1.setSexo('F');
        a1.setIdade(21);
        a1.setCurso("Informática");

        b1.setNome("Thiago");
        b1.setMatricula(1112);
        b1.setBolsa(50.0f);
        b1.setSexo('M');

        p1.setNome("Cláudio");
        p1.setSexo('M');

        p4.setNome("Fabiana");
        p4.setSexo('F');

        a1.setCurso("Informática");
        p1.setSalario(1550.9f);
        p4.setSetor("Estoque");

        t1.setNome("Carlos");
        t1.setIdade(21);
        t1.setRegistroProfissional("blabla");

        //v1.receberAumento(550f);
        //p2.mudarTrabalho();

        System.out.println(v1.toString());
        System.out.println(a1.toString());
        System.out.println(p1.toString());
        System.out.println(p4.toString());
        System.out.println(t1.toString());

        a1.pagarMensalidade();
        b1.renovarBolsa();
        b1.pagarMensalidade();
        t1.praticar();

    }
}