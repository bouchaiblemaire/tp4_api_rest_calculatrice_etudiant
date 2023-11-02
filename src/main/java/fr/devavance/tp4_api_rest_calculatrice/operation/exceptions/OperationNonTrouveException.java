/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.devavance.tp4_api_rest_calculatrice.operation.exceptions;

/**
 * Exception levée si une opération d'identifiant id n'a pas été
 * trouvée dans la base de données (voir classe Operations qui simule
 * la base de données)
 * @author B. LEMAIRE
 * @version 2023
 */
public class OperationNonTrouveException extends Exception {
    private int id;
    private static String message = "Opération non trouvée";

    public OperationNonTrouveException(int id) {
        super(message);
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    
    
}
