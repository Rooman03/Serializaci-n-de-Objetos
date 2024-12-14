import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Curso {

    private List<Estudiante> listaEstudiantes; // Lista de estudiantes en el curso

    // Constructor por defecto necesario para JAXB
    public Curso() {
        listaEstudiantes = new ArrayList<>();
    }

    @XmlElement(name = "estudiante") // Nombre en el XML
    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }
}
