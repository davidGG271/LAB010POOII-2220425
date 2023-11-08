import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<EstudianteUniversitario> estudiantesUniversitarios = new ArrayList<>();
        // Crear 15 estudiantes universitarios y agregarlos a la lista
        /*
        for (int i = 1; i <= 15; i++) {
            Direccion direccion = new Direccion("ZIP" + i, "Calle " + i, "Distrito " + i, "Provincia " + i);
            List<NumeroCelular> celulares = new ArrayList<>();
            celulares.add(new NumeroCelular("XX-XXXX" + i + "A"));
            celulares.add(new NumeroCelular("XX-XXXX" + i + "B"));

            EstudianteUniversitario estudiante = new EstudianteUniversitario("Estudiante Universitario " + i, "Apellido " + i, 20 + i, "Carrera " + i, direccion, celulares);
            System.out.println(estudiante.toString());
            estudiantesUniversitarios.add(estudiante);
        }
         */

        EstudianteUniversitario estudiante1 = new EstudianteUniversitario("Juan", "Perez", 20, "Ingeniería Informática", new Direccion("15001", "Av. Arequipa 123", "Lima", "Lima"), Arrays.asList(new NumeroCelular("XX-XXXXB"), new NumeroCelular("9873210")));
        EstudianteUniversitario estudiante2 = new EstudianteUniversitario("María", "Gonzalez", 21, "Psicología", new Direccion("04002", "Jr. Cusco 456", "Cusco", "Cusco"), Arrays.asList(new NumeroCelular("555555")));
        EstudianteUniversitario estudiante3 = new EstudianteUniversitario("Luis", "Martínez", 22, "Medicina", new Direccion("08003", "Av. Trujillo 789", "Trujillo", "La Libertad"), Arrays.asList(new NumeroCelular("1113333"), new NumeroCelular("446666")));
        EstudianteUniversitario estudiante4 = new EstudianteUniversitario("Ana", "Sanchez", 23, "Derecho", new Direccion("21004", "Calle Ayacucho 101", "Arequipa", "Arequipa"), Arrays.asList(new NumeroCelular("777999")));
        EstudianteUniversitario estudiante5 = new EstudianteUniversitario("Carlos", "Lopez", 20, "Arquitectura", new Direccion("05005", "Jr. Huancayo 234", "Huancayo", "Junín"), Arrays.asList(new NumeroCelular("33399"), new NumeroCelular("444777")));
        EstudianteUniversitario estudiante6 = new EstudianteUniversitario("Laura", "Hernandez", 21, "Economía", new Direccion("03006", "Av. Tacna 567", "Tacna", "Tacna"), Arrays.asList(new NumeroCelular("222666")));
        EstudianteUniversitario estudiante7 = new EstudianteUniversitario("Javier", "Ramirez", 22, "Biología", new Direccion("22007", "Calle Puno 890", "Puno", "Puno"), Arrays.asList(new NumeroCelular("8886666")));
        EstudianteUniversitario estudiante8 = new EstudianteUniversitario("Isabel", "Torres", 23, "Historia", new Direccion("11008", "Jr. Chiclayo 123", "Chiclayo", "Lambayeque"), Arrays.asList(new NumeroCelular("123567"), new NumeroCelular("3337777")));
        EstudianteUniversitario estudiante9 = new EstudianteUniversitario("Daniel", "Gomez", 20, "Física", new Direccion("23009", "Av. Iquitos 456", "Iquitos", "Loreto"), Arrays.asList(new NumeroCelular("111777")));
        EstudianteUniversitario estudiante10 = new EstudianteUniversitario("Marta", "Jimenez", 21, "Química", new Direccion("19010", "Calle Pucallpa 789", "Pucallpa", "Ucayali"), Arrays.asList(new NumeroCelular("444888")));
        EstudianteUniversitario estudiante11 = new EstudianteUniversitario("Pedro", "Vargas", 22, "Matemáticas", new Direccion("16011", "Jr. Chimbote 101", "Chimbote", "Áncash"), Arrays.asList(new NumeroCelular("22299")));
        EstudianteUniversitario estudiante12 = new EstudianteUniversitario("Sofía", "Fernandez", 23, "Literatura", new Direccion("12012", "Av. Piura 234", "Piura", "Piura"), Arrays.asList(new NumeroCelular("777-333-4444")));
        EstudianteUniversitario estudiante13 = new EstudianteUniversitario("Pablo", "Rojas", 20, "Música", new Direccion("25013", "Calle Tarapoto 567", "Tarapoto", "San Martín"), Arrays.asList(new NumeroCelular("XX-XXXXB"), new NumeroCelular("XX-XXXXA")));
        EstudianteUniversitario estudiante14 = new EstudianteUniversitario("Elena", "Lara", 21, "Arte", new Direccion("20014", "Jr. Huaraz 890", "Huaraz", "Áncash"), Arrays.asList(new NumeroCelular("66333")));
        EstudianteUniversitario estudiante15 = new EstudianteUniversitario("José", "Soto", 22, "Educación", new Direccion("21015", "Av. Huancavelica 123", "Huancavelica", "Huancavelica"), Arrays.asList(new NumeroCelular("337")));

        estudiantesUniversitarios.add(estudiante1);
        estudiantesUniversitarios.add(estudiante2);
        estudiantesUniversitarios.add(estudiante3);
        estudiantesUniversitarios.add(estudiante4);
        estudiantesUniversitarios.add(estudiante5);
        estudiantesUniversitarios.add(estudiante6);
        estudiantesUniversitarios.add(estudiante7);
        estudiantesUniversitarios.add(estudiante8);
        estudiantesUniversitarios.add(estudiante9);
        estudiantesUniversitarios.add(estudiante10);
        estudiantesUniversitarios.add(estudiante11);
        estudiantesUniversitarios.add(estudiante12);
        estudiantesUniversitarios.add(estudiante13);
        estudiantesUniversitarios.add(estudiante14);
        estudiantesUniversitarios.add(estudiante15);



        // Búsqueda por nombre
        String nombreBuscado = "Juan";
        Optional<EstudianteUniversitario> estudiantePorNombre = estudiantesUniversitarios.stream()
                .filter(estudiante -> estudiante.getNombre().equals(nombreBuscado))
                .findFirst();

        if (estudiantePorNombre.isPresent()) {
            System.out.println("Estudiante encontrado por nombre: " + estudiantePorNombre.get());
        } else {
            System.out.println("Estudiante no encontrado por nombre: " + nombreBuscado);
        }

        // Búsqueda por dirección
        Direccion direccionBuscada = new Direccion("25013", "Calle Tarapoto 567", "Tarapoto", "San Martín");
        Optional<EstudianteUniversitario> estudiantePorDireccion = estudiantesUniversitarios.stream()
                .filter(estudiante -> estudiante.getDireccion().equals(direccionBuscada))
                .findFirst();

        if (estudiantePorDireccion.isPresent()) {
            System.out.println("Estudiante encontrado por dirección: " + estudiantePorDireccion.get());
        } else {
            System.out.println("Estudiante no encontrado por dirección: " + direccionBuscada);
        }

        // Búsqueda por número de celular
        String numeroCelularBuscado = "777999"; // Número de celular a buscar
        List<EstudianteUniversitario> estudiantesPorCelular = estudiantesUniversitarios.stream()
                .filter(estudiante -> estudiante.getCelulares().stream()
                        .anyMatch(celular -> celular.getNumero().equals(numeroCelularBuscado)))
                .collect(Collectors.toList());

        System.out.println("Estudiantes encontrados por número de celular: " + estudiantesPorCelular);

        // Búsqueda por dos números de celular
        String numeroCelularA = "XX-XXXXA";
        String numeroCelularB = "XX-XXXXB";
        List<EstudianteUniversitario> estudiantesPorDosCelulares = estudiantesUniversitarios.stream()
                .filter(estudiante ->
                        estudiante.getCelulares().stream()
                                .anyMatch(celular -> celular.getNumero().equals(numeroCelularA))
                                && estudiante.getCelulares().stream()
                                .anyMatch(celular -> celular.getNumero().equals(numeroCelularB)))
                .collect(Collectors.toList());

        System.out.println("Estudiantes encontrados por dos números de celular: " + estudiantesPorDosCelulares);
    }
}