public class Libro {
    private String titulo;
    private String autor;
    private int year;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getYear() {
        return year;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setYear(int year) {
        this.year = year;
    }
public void mostrarInfo(){
    System.out.println("Titulo: "+titulo);
    System.out.println("Autor: "+autor);
    System.out.println("Year: "+year);    }
}