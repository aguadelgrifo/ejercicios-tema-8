public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
                persona.setEdad(25);
                int edad = persona.getEdad();
                persona.setNombre("Juan");
                String nombre = persona.getNombre();
                persona.setTelefono(612345678);
                int telefono = persona.getTelefono();

        System.out.println(edad +" "+ nombre +" "+ telefono);
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad ;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return this.telefono;
    }

}