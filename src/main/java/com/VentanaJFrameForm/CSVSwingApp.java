package com.VentanaJFrameForm;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVSwingApp extends JFrame {

    private JTextField txtId, txtNombre, txtEdad;  // Campo de texto para Edad
    private JTable table;
    private DefaultTableModel tableModel;
    private String rutaArchivo = "C:\\Users\\josue\\Documents\\NetBeansProjects\\Java_Swing_AccesoDatos_CSV\\src\\main\\java\\Datos_CSV\\Datos_table_1.csv";

    public CSVSwingApp() {
        // Configuración de la ventana principal
        setTitle("Gestión de CSV con Swing");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel superior para ingreso de datos
        JPanel panelInput = new JPanel(new GridLayout(4, 2));
        panelInput.add(new JLabel("ID:"));
        txtId = new JTextField();
        panelInput.add(txtId);

        panelInput.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelInput.add(txtNombre);

        panelInput.add(new JLabel("Edad:"));  // Agregar campo Edad
        txtEdad = new JTextField();
        panelInput.add(txtEdad);

        JButton btnGuardar = new JButton("Guardar");
        panelInput.add(btnGuardar);

        JButton btnMostrar = new JButton("Mostrar CSV");
        panelInput.add(btnMostrar);

        add(panelInput, BorderLayout.NORTH);

        // Tabla para mostrar los datos
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[]{"ID", "Nombre", "Edad"});
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        // Acción para guardar datos en CSV
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                escribirCSV();
            }
        });

        // Acción para mostrar datos desde CSV
        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leerCSV();
            }
        });
    }

    // Método para escribir datos en el CSV
    private void escribirCSV() {
        // Verificar que no haya campos vacíos antes de escribir
        if (txtId.getText().isEmpty() || txtNombre.getText().isEmpty() || txtEdad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos antes de guardar.");
            return;
        }

        String[] fila = {txtId.getText(), txtNombre.getText(), txtEdad.getText()};  // Incluir Edad

        try (CSVWriter writer = new CSVWriter(new FileWriter(rutaArchivo, true))) {
            writer.writeNext(fila);
            JOptionPane.showMessageDialog(this, "Datos guardados correctamente en el archivo CSV.");
            limpiarCampos();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al escribir el archivo CSV.");
        }
    }

    // Método para leer los datos del CSV y mostrarlos en la JTable
    private void leerCSV() {
        tableModel.setRowCount(0);  // Limpiar tabla antes de cargar datos

        try (CSVReader reader = new CSVReader(new FileReader(rutaArchivo))) {
            List<String[]> filas = reader.readAll();
            for (String[] fila : filas) {
                // Verificar que la fila tenga la cantidad correcta de columnas
                if (fila.length == 3) {
                    tableModel.addRow(fila);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al leer el archivo CSV.");
        }
    }

    // Método para limpiar los campos después de guardar los datos
    private void limpiarCampos() {
        txtId.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CSVSwingApp app = new CSVSwingApp();
            app.setVisible(true);
        });
    }
}
