public class TestStudent {

    public static void main(String[] args) {
        Student student = new Student("S001", "Ana Torres");

        System.out.println("Estudiante: " + student.getName()
                + " (ID: " + student.getStudentId() + ")");

        boolean n1 = student.setName("Ana Maria Torres");
        System.out.println("Actualizar nombre -> " + (n1 ? "Aceptado" : "Rechazado"));

        boolean n2 = student.setName("");
        System.out.println("Actualizar nombre a vacío -> " + (n2 ? "Aceptado" : "Rechazado"));

        boolean g1 = student.setFirstGrade(4.5);
        boolean g2 = student.setSecondGrade(3.8);
        boolean g3 = student.setThirdGrade(5.0);
        System.out.println("Registrar calificaciones válidas -> "
                + g1 + ", " + g2 + ", " + g3);

        System.out.println("Promedio actual: " + student.getAverage());

        boolean g4 = student.setFirstGrade(6.0);
        System.out.println("Registrar calificación 6.0 -> " + (g4 ? "Aceptado" : "Rechazado"));
        System.out.println("Promedio después del intento inválido: " + student.getAverage());
    }
}