package teclogi.prueba.backend.puntoDos.Model;

public class Driver {
    private String documentTypeId;
    private String documentTypeName;
    private String document;
    private String name;
    public Driver() {
    }
    public Driver(String documentTypeId, String documentTypeName, String document, String name) {
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
