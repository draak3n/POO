package biblioteca;

public class Biblioteca {
	  public static void main(String[] args) {
	        // Crear instancias de Alumno y Profesor
	        Alumno alumno1 = new Alumno(123456789, "Alejandro Alonso", "Hernan@example.com", "0992922622", 1001);
	        Profesor profesor1 = new Profesor(987654321, "Hernan Alonso", "Rodriguez@example.com", "0972376876", "Programación");

	        // Crear instancias de Libro y RevistaCientifica
	        Libro libro1 = new Libro(101, "Charles Leclerc", "Smooth Operator", 2000, "Disponible", "NewRecord");
	        RevistaCientifica revista1 = new RevistaCientifica(201, "Fernando Alonso", "El Nano", 2024, "Prestado", "Ciencia");

	        // Realizar préstamos
	        Prestamo prestamo1 = new Prestamo(libro1, alumno1, "2024-05-24", "2024-06-24");
	        Prestamo prestamo2 = new Prestamo(revista1, profesor1, "2024-05-24", "2024-06-24");

	        // Mostrar información de los préstamos
	        System.out.println("Prestamo 1:\n" + prestamo1 + "\n");
	        System.out.println("Prestamo 2:\n" + prestamo2);	
	  }
}
