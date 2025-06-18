
public interface Document {
    void open();
}
class WordDocument implements Document {
    public void open() {
        System.out.println("Opening a Word document...");
    }
}
class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening a PDF document...");
    }
}
class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening an Excel document...");
    }
}
abstract class DocumentFactory {
    public abstract Document createDocument();
}
class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}
class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}
class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}