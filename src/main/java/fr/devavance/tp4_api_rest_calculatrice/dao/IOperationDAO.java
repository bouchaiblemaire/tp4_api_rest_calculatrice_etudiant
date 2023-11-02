package fr.devavance.tp4_api_rest_calculatrice.dao;


import fr.devavance.tp4_api_rest_calculatrice.operation.Operation;
import fr.devavance.tp4_api_rest_calculatrice.operation.exceptions.OperationNonTrouveException;
import java.util.List;




/**
 * Interface définissant un contrat des service offert
 * par la "base de données" des Opérations
 * Implémente les opérations CRUD
 * @author B. LEMAIRE
 */
public interface IOperationDAO {

	// 1- Insert new Operation
    
        /**
         * Crée une opération
         * @param operation
         * @return opération qui a été crée, null si aucune 
         *         opération n'a pu être  créee
         * 
         * Important : L'id de l'opération doit-être initialisé avec 
         * le prochain identifiant disponible dans la base de données 
         * (voir classe Operations qui simule la base de données)
         */
	public Operation createOperation(Operation operation);
	
        
        /**
         * Lit l'opération ayant pour identifiant id
         * @param id
         * @return
         * @throws OperationNonTrouveException 
         */
	public Operation readOperation(int id) throws OperationNonTrouveException;
	
        
	/**
         * Supprime l'opération ayant pour identifiant id
         * @param id 
         * @return true si opération réussie, false sinon
         */
	public boolean deleteOperation(int id);
	
	/**
         * Mets à jour l'opération ayant pour identifiant idfiant id 
         * avec les informations de l'opération recue en paramètre.
         * Seule les opérandes et l'opérateur seront mis à jour
         * @param operation
         * @return opération mise à jour, null si aucune l'opération n'a pu 
         *         mise à jour être  créee
         */
	public Operation updateOperation(Operation operation);
	
	/**
         * Retourne la liste de toutes les opérations
         * @return 
         */
	public List<Operation> getAllOperations();
        
        
                
        /**
         * Retourne l'opération d'indentifiant id
         * @param id
         * @return (Operation)
         * @throws OperationNonTrouveException : Si operation non trouvée
         */
        public Operation findOperationById(int id) throws OperationNonTrouveException;
}
