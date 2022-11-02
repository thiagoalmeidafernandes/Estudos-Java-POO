public class ProjetoLivro {
    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro",22, 'M');
        p[1] = new Pessoa("Maria",25,'F');

        l[0] = new Livro("Neurociências, desvendando o Sistema Nervoso","BEAR",1200,p[0]);
        l[1] = new Livro("Porquê nós Dormimos", "Walker",600, p[1]);
        l[2] = new Livro("POO para iniciantes","João",200,p[0]);

        l[0].abrir();
        l[0].folhear(200);
        System.out.println(l[0].detalhes());
    }
}