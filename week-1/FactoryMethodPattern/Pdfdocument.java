package factorymethodpattern;
public class Pdfdocument implements Document {
    public void open() {
        System.out.println("Opening a PDF document.");
    }
}