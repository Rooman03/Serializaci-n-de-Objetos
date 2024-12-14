import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Crear un estudiante
        Estudiante estudiante = new Estudiante("Jose Daniel", 21);

        // Crear un curso y agregar el estudiante
        Curso curso = new Curso();
        curso.agregarEstudiante(estudiante);

        // Crear un objeto JAXBUtil para marshalling
        JAXBUtil jaxbUtil = new JAXBUtil();

        // Especificar el archivo XML de salida
        File file = new File("curso.xml");

        // Marshal el curso a XML
        jaxbUtil.marshal(curso, file);

        // Mensaje de éxito
        System.out.println("El archivo XML se ha creado correctamente: " + file.getAbsolutePath());
    }
}
