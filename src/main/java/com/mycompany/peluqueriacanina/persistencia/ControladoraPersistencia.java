
package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;


public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        
        //Crear en la BD el dueño
        duenioJpa.create(duenio);
        
        //Crear en la BD la mascota
        mascoJpa.create(masco);
        

    }

    public List<Mascota> traerMascotas() {
        
        return mascoJpa.findMascotaEntities();
    }
}
