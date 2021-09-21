package teclogi.prueba.backend.puntoDos.Model;


/**
 * Esta clase define el objeto de dueño el cual tiene la información de el
 * @author Santiago Agustin Laiton Cubides
 * @version 20/09/2021
 */
public class Owner {
    private String documentTypeId;
    private String documentTypeName;
    private String document;
    private String name;

    public Owner() {
    }


    /**
     * Constructor del conductor
     * @param documentTypeId Tipo de documento
     * @param documentTypeName Nombre del tipo de documento
     * @param document Numero de identificación
     * @param name Nombre del propietario
     */

    public Owner(String documentTypeId, String documentTypeName, String document, String name) {
        this.documentTypeId = documentTypeId;
        this.documentTypeName = documentTypeName;
        this.document = document;
        this.name = name;
    }

    public String getDocumentTypeId() {
        return documentTypeId;
    }

    public void setDocumentTypeId(String documentTypeId) {
        this.documentTypeId = documentTypeId;
    }

    public String getDocumentTypeName() {
        return documentTypeName;
    }

    public void setDocumentTypeName(String documentTypeName) {
        this.documentTypeName = documentTypeName;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
