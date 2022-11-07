import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Video[] v = new Video[3];

        v[0] = new Video("Aula 1 POO");
        v[1] = new Video("Aula 10 PHP");
        v[2] = new Video("Aula 100 HTML5");

        Gafanhoto[] g = new Gafanhoto[2];

        g[0] = new Gafanhoto("Thiago",21,'M',"thifer");
        g[1] = new Gafanhoto("Creuza", 23, 'F',"Creuzita");

        Visualizacao[] vis = new Visualizacao[3];
        vis[0] = new Visualizacao(g[0], v[2]); //Thiago assiste aula 100 HTML
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[0], v[1]); //Thiago assiste aula 10 PHP
        vis[1].avaliar(87f);
        System.out.println(vis[1].toString());
        /*System.out.println(v[0].toString());
        System.out.println(g[0]);*/

    }
}