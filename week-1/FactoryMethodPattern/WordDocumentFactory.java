package factorymethodpattern;
public class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new Worddocument();
    }
}
