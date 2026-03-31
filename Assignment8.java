interface Filterable {
    void applyFilter(String filterType);
    void resetFilter();
}
class ImageProcessor implements Filterable {
    public void applyFilter(String filterType) {
        System.out.println("Applying " + filterType + " filter to the image.");
    }
    public void resetFilter() {
        System.out.println("Resetting image to original.");
    }
}
class DataAnalyzer implements Filterable {
    public void applyFilter(String filterType) {
        System.out.println("Applying " + filterType + " filter to the data.");
    }
    public void resetFilter() {
        System.out.println("Resetting data to original.");
    }
}
public class Assignment8 {
    public static void main(String[] args) {
        ImageProcessor img = new ImageProcessor();
        img.applyFilter("grayscale");
        img.resetFilter();

        DataAnalyzer data = new DataAnalyzer();
        data.applyFilter("remove empty rows");
        data.resetFilter();
    }
}
