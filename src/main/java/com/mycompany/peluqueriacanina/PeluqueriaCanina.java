package com.mycompany.peluqueriacanina;

import com.mycompany.peluqueriacanina.igu.Principal;

public class PeluqueriaCanina {

    public static void main(String[] args) {
        //Llamar a principal
        Principal princ = new Principal();
        //Muestro ventana principal
        princ.setVisible(true);
        //Posicionada en el centro de la pantalla
        princ.setLocationRelativeTo(null);
    }
}
