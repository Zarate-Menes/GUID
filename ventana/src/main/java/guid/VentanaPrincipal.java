package guid;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    private Usuario usuario;

    public VentanaPrincipal() {
        usuario = new Usuario("Zarate Menes Quetzalli", "420051936", "26/04/2000", "Calle 14, Lopez Portillo, Iztapalapa", "D:\\Escuela\\POO\\Códigos\\GUID\\fotoMia.jpg");

        JButton botonCuenta = new JButton(usuario.getNumeroCuenta());
        botonCuenta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarDetallesUsuario();
            }
        });

        setLayout(new FlowLayout());
        add(botonCuenta);

        setTitle("Ventana Principal");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void mostrarDetallesUsuario() {
        JFrame ventanaDetalles = new JFrame("Detalles del Usuario");
        ventanaDetalles.setLayout(new GridLayout(5, 2));

        ventanaDetalles.add(new JLabel("Nombre:"));
        ventanaDetalles.add(new JLabel(usuario.getNombre()));

        ventanaDetalles.add(new JLabel("Número de Cuenta:"));
        ventanaDetalles.add(new JLabel(usuario.getNumeroCuenta()));

        ventanaDetalles.add(new JLabel("Fecha de Nacimiento:"));
        ventanaDetalles.add(new JLabel(usuario.getFechaNacimiento()));

        ventanaDetalles.add(new JLabel("Dirección:"));
        ventanaDetalles.add(new JLabel(usuario.getDireccion()));

        ventanaDetalles.add(new JLabel("Fotografía:"));
        ImageIcon icon = new ImageIcon(usuario.getRutaFoto());
        JLabel labelFoto = new JLabel(icon);
        ventanaDetalles.add(labelFoto);

        ventanaDetalles.setSize(600, 500);
        ventanaDetalles.setLocationRelativeTo(null);
        ventanaDetalles.setVisible(true);
    }


}

