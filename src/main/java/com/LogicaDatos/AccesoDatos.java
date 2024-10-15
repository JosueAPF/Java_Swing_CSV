package com.LogicaDatos;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatos {

    public static List<String[]> filas;

    public AccesoDatos() {
        filas = new ArrayList<>();
    }

    public static void InsertarDatos(List<String[]> nuevosDatos) {
        File archivo = new File("C:\\Users\\josue\\Documents\\NetBeansProjects\\Java_Swing_AccesoDatos_CSV\\src\\main\\java\\Datos_CSV\\Datos.csv");
        try {
            FileWriter outputFile = new FileWriter(archivo, true);
            CSVWriter writer = new CSVWriter(outputFile);
            //encabezado
            // No agregar el encabezado si ya existe
            // Si el archivo ya tiene datos, no escribir el encabezado
            if (archivo.length() == 0) {
                String[] cabecera = {"id", "nombre", "apellido", "edad", "identificacion"};
                writer.writeNext(cabecera);  // Escribe encabezado solo si el archivo está vacío
            }

            //datos
            /*
            filas.add(new String[]{"1", "Maria", "Gonzalez", "25", "67890"});
            filas.add(new String[]{"2", "Maria", "Gonzalez", "25", "67890"});
            filas.add(new String[]{"3", "Carlos", "Lopez", "40", "54321"});
            filas.add(new String[]{"4", "Ana", "Martinez", "22", "98765"});
            filas.add(new String[]{"5", "Pedro", "Rodriguez", "35", "13579"});
            filas.add(new String[]{"6", "Laura", "Sanchez", "28", "24680"});
            filas.add(new String[]{"7", "Diego", "Hernandez", "31", "56789"});
            filas.add(new String[]{"8", "Isabel", "Torres", "29", "01234"});
            filas.add(new String[]{"9", "Raul", "Garcia", "37", "98760"});
            filas.add(new String[]{"10", "Elena", "Perez", "24", "43210"});
             */
            for (String[] fila : nuevosDatos) {
                writer.writeNext(fila);
            }
            // Cerrando los recursos
            writer.close();
            outputFile.close();
            System.out.println("Datos escritos en el archivo CSV.");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
/*
    public void MostrarDatos() {
        System.out.println("Datos en el archivo CSV:");
        // Imprimir los encabezados
        String[] cabecera = filas.get(0);
        for (String columna : cabecera) {
            System.out.print(columna + "\t");
        }
        System.out.println();
        // Imprimir las filas de datos
        for (int i = 1; i < filas.size(); i++) {
            String[] fila = filas.get(i);
            for (String valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }
*/
    // Nuevo método para leer los datos del archivo CSV y almacenarlos en la lista 'filas'
    public void leerDatosDesdeCSV() {
        File archivo = new File("C:\\Users\\josue\\Documents\\NetBeansProjects\\Java_Swing_AccesoDatos_CSV\\src\\main\\java\\Datos_CSV\\Datos.csv");
        try {
            CSVReader reader = new CSVReader(new FileReader(archivo));
            filas = reader.readAll();  // Carga los datos en 'filas'
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public String MostarData() {
        StringBuilder datosCSV = new StringBuilder();

        if (!filas.isEmpty()) {
            // Imprimir los encabezados
            String[] cabecera = filas.get(0);
            for (String columna : cabecera) {
                datosCSV.append(columna).append("\t");
            }
            datosCSV.append("\n");

            // Imprimir las filas de datos
            for (int i = 1; i < filas.size(); i++) {
                String[] fila = filas.get(i);
                for (String valor : fila) {
                    datosCSV.append(valor).append("\t");
                }
                datosCSV.append("\n");
            }
        } else {
            datosCSV.append("No hay datos en el archivo CSV.\n");
        }

        return datosCSV.toString();  // Devuelve los datos como una cadena
    }
    
    public static void eliminarLineaDelCSV(String lineaAEliminar) {
        File archivoCSV = new File("C:\\Users\\josue\\Documents\\NetBeansProjects\\Java_Swing_AccesoDatos_CSV\\src\\main\\java\\Datos_CSV\\Datos.csv");
        List<String[]> filasActualizadas = new ArrayList<>();

        try (CSVReader csvReader = new CSVReader(new FileReader(archivoCSV))) {
            List<String[]> todasLasFilas = csvReader.readAll();  // Lee todas las filas del archivo

            // Recorre cada fila y elimina la que coincida con la línea seleccionada
            for (String[] fila : todasLasFilas) {
                String filaTexto = String.join("\t", fila);  // Convierte la fila a una cadena de texto

                if (!filaTexto.equals(lineaAEliminar.trim())) {
                    filasActualizadas.add(fila);  // Añade las filas que no coincidan con la seleccionada
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reescribe el archivo CSV con las filas actualizadas (sin la fila eliminada)
        try (CSVWriter csvWriter = new CSVWriter(new FileWriter(archivoCSV))) {
            csvWriter.writeAll(filasActualizadas);  // Escribe las filas restantes en el archivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        AccesoDatos data = new AccesoDatos();
        //data.InsertarDatos();
        //data.MostrarDatos();
    }
}
