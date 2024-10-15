package com.LogicaDatos;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

interface operacionesCRUD {

    void Insertar(List<String[]> datos);

    void Mostrar();

    void Modificar();

    void Eliminar();

    void LeerDatos();
}

public final class Accesdiedo_DatosTable {

    private List<String[]> ListaDatos;

    public Accesdiedo_DatosTable() {
        ListaDatos = new ArrayList<>();
    }

    public static void Insertar(List<String[]> datos) {
        File archivo = new File("C:\\Users\\josue\\Documents\\NetBeansProjects\\Java_Swing_AccesoDatos_CSV\\src\\main\\java\\Datos_CSV\\Datos_table_1.csv");
        try {
            FileWriter outputFile = new FileWriter(archivo, true);
            CSVWriter writer = new CSVWriter(outputFile);

            //si no existe la cabezera
            if (archivo.length() == 0) {
                String[] cabecera = {"id", "nombre"};
                writer.writeNext(cabecera);
            }
            //cuerpo
            for (int i = 0; i < datos.size(); i++) {
                writer.writeNext(datos.get(i));
            }
            writer.close();
            outputFile.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void LeerDatos() {
        File archivo = new File("C:\\Users\\josue\\Documents\\NetBeansProjects\\Java_Swing_AccesoDatos_CSV\\src\\main\\java\\Datos_CSV\\Datos_table_1.csv");
        try {
            CSVReader reader = new CSVReader(new FileReader(archivo));
            ListaDatos = reader.readAll();  // Carga los datos en 'filas'
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<String[]> Mostrar() {
        List<String[]> datosCSV = new ArrayList<>();
        if (!ListaDatos.isEmpty()) {
            // Imprimir los encabezados---no nessaria para la tabla
            String[] cabecera = ListaDatos.get(0); 
            /*
            for (String columna : cabecera) {
                datosCSV.append(columna).append("\t");
            }
            datosCSV.append("\n");
            */

            // Imprimir las filas de datos
            for (int i = 1; i < ListaDatos.size(); i++) {
                //String[] fila = ListaDatos.get(i);
                /*
                for (String valor : fila) {
                    datosCSV.add(valor);
                }*/
                datosCSV.add(ListaDatos.get(i));
                
            }
        }

        return datosCSV;
    }

    public void Modificar() {

    }

    public void Eliminar() {

    }

    public static void main(String[] args) {
        /*List<String[]> listado = new ArrayList<>();
        Accesdiedo_DatosTable obj1 = new  Accesdiedo_DatosTable();
        listado.add(new String[]{"1", "Maria", "F"});
        obj1.Insertar(listado);*/
    }

  }
