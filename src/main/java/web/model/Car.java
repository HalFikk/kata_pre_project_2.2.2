package web.model;

public class Car {
    private int series;
    private String brand;
    private String model;

    public Car() {
    }

    public Car(int series, String brand, String model) {
        this.series = series;
        this.brand = brand;
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
