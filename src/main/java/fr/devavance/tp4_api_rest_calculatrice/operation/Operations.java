
package fr.devavance.tp4_api_rest_calculatrice.operation;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Simule la base de données des opérations
 * @author B. LEMAIRE
 * @version 2023
 */
public class Operations extends ArrayList<Operation> {

    // Pattern SIngleton
    private static Operations instance = null;
    
    // Simule la clef primaire de type SERIAL (Postgresql)
    private static int id=0;
    
    
    private Operations() {
        super();
    }
    
    public static Operations getInstance(){
        if (Operations.instance == null ){
            Operations.instance = new Operations();
        }
        
        return Operations.instance;
                
    }
    
    
    /**
     * Simule la séquence de PostgreSQL
     * Retourne la prochaine valeur disponible pour la clef primaire
     * @return 
     */
    public static int nextId(){
        Operations.id += 1;
        return id;
    }
    
}
