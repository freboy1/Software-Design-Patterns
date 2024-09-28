package first_lesson;

public class BookAvailability {
    private boolean isavailable;

    public BookAvailability(boolean isavailable) {
        this.isavailable = isavailable;
    }
    public boolean isAvailable() {
        return this.isavailable;
    }
    public void setAvailable(boolean isavailable) {
        this.isavailable = isavailable;
    }
}
