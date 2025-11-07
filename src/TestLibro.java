public class TestLibro {
    public static void main(String[] args){
        Libro libro1 = new Libro();
        libro1.setTitulo("Título 1");
        libro1.setAutor("Autor1");
        libro1.setYear(2001);

        libro1.mostrarInfo();
        System.out.println("Información: objeto libro1");
        System.out.println("Titulo: "+libro1.getTitulo());
        System.out.println("Autor: "+libro1.getAutor());
        System.out.println("Year: "+libro1.getYear());
    }
}