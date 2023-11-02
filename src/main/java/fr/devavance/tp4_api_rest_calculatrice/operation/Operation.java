/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.devavance.tp4_api_rest_calculatrice.operation;

import lombok.Data;

/**
 * Bean représentant une opération exécutable par la calculatrice
 * @author B. LEMAIRE
 * @version 2023
 */

@Data
public class Operation {
    private int id;  // Est initialisation (mutateur) avant insertion 
                     // dans la base de données  
    private double operande1;
    private double operande2;
    private String operateur;
    private double resultat;
    private boolean isCalculated = false; // change d'état (mutateur) lorsque
                                          // la calculatrice a réalisé
                                          // l'opération
}
