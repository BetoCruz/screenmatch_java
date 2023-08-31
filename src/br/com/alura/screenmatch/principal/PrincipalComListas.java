package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;


import java.util.ArrayList;

import java.util.List;
// "Interface List", que especificará todos os métodos que utilizamos até
// agora.Dentro dele, temos o add(), o size(), o get(), o sort(),
// entre outros métodos que definem como funciona uma lista — ou seja,
// uma sequência de referências a objetos.

import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(" O poderoso chefão", 1970);
        meuFilme.avalia(9);

        Filme outroFilme = new Filme(" Avatar", 2023);
        outroFilme.avalia(6);

        var filmeDoPaulo = new Filme(" Dogville", 2003);
        filmeDoPaulo.avalia(10);

        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoPaulo; // Variaveis de referencia apontam , referenciam,
        // para o objeto, mas não RECRIAM um novo objeto que JA exista.
        /*É importante lembrar que as referências a objetos em Java não são o
        próprio objeto em si, pois elas apenas apontam para o objeto. Quando
        você passa uma referência a um método ou atribui uma referência a
        outra variável, está apenas copiando o valor da referência e não do
         objeto em si.*/

        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item : lista) {
            System.out.println(item.getNome());

            //___Forma menos elegante de uso do instanceof, encontrada em codigos legados.
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
            //Filme filme = (Filme) item; //cast não muda o tipo do valor
            //mas alterna a forma como o sistema interpretará o valor.
            // No polimorfismo , não é o objeto que tem varias formas,
            // mas são varias formas de interpretar o objeto.
        }


//
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println("Arrei BuscaPorArtista: "+buscaPorArtista);

        //____Collections.sort() organiza por comparação os itens,
        // funciona bem com tipos primitivos.
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de titulos ordenados após uso do Comparable : ");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println("Lista apos uso do Comparator: "+lista);
    }
}