package Ejemplo2;

import java.util.ArrayList;

public class EjemploObjetoPersonas {

    public static ArrayList<Persona> lista_personas = new ArrayList<>();
    public static ArrayList<Docente> lista_docentes = new ArrayList<>();
    public static ArrayList<Curso> lista_cursos = new ArrayList<>();
    
    public static void main(String[] args) {
        // TODO code application logic here
        Dashboard ventana = new Dashboard();
        ventana.setVisible(true);
    }
    
}
