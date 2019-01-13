public class Controller {
    private String gebiet;
    private ReadingDevice readingDevice;

    public String getGebiet() {
        return gebiet;
    }

    public void setGebiet(String gebiet) {
        this.gebiet = gebiet;
    }

    public void setReadingDevice(ReadingDevice readingDevice) {
        this.readingDevice = readingDevice;
    }

    public Controller(String gebiet, ReadingDevice readingDevice) {
        this.gebiet = gebiet;
        this.readingDevice = readingDevice;
    }

    public void controll (Driver driver){

    }
}
