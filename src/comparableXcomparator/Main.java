package comparableXcomparator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Livro 1", "Autor 1", 2021);
        System.out.println("- " + livro.getTitulo() + ", " + livro.getAutor() + " - " + livro.getAno());
    }
}
