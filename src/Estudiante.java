import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Estudiante {

    private String nombreAlumno; // Nombre del estudiante
    private int edadAlumno; // Edad del estudiante

    // Constructor por defecto necesario para JAXB
    public Estudiante() {}

    public Estudiante(String nombreAlumno, int edadAlumno) {
        this.nombreAlumno = nombreAlumno;
        this.edadAlumno = edadAlumno;
    }

    @XmlElement(name = "nombre") // Nombre en el XML
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    @XmlElement(name = "edad") // Edad en el XML
    public int getEdadAlumno() {
        return edadAlumno;
    }

    public void setEdadAlumno(int edadAlumno) {
        this.edadAlumno = edadAlumno;
    }
}
