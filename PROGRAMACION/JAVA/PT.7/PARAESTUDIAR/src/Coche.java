/**
 * La clase Car muestra ciertos atributos del cocche.
 */
public class Coche {

    private String make;
    private String model;
    private int year;
    private double price;

    /**
     * Constructor de la clase Car
     * 
     * @param make
     * @param model
     * @param year
     * @param price
     */
    public Coche(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * Obtiene la marca del coche
     * 
     * @return make Marca del coche
     */
    public String getMake() {
        return make;
    }

    /**
     * Establece la marca del coche
     * 
     * @param make Marca del coche
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Obtiene el modelo del coche
     * 
     * @return model (modelo del coche)
     */
    public String getModel() {
        return model;
    }

    /**
     * Establece el modelo del coche
     * 
     * @param model (modelo del coche)
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Obtiene el año de fabricación
     * 
     * @return year (año de fabricación)
     */
    public int getYear() {
        return year;
    }

    /**
     * Establece el año de fabricación
     * 
     * @param year (año de fabricación)
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Obtiene el precio del coche
     * 
     * @return price (Precio del coche)
     */
    public double getPrice() {
        return price;
    }

    /**
     * Establece el precio del coche
     * 
     * @param price (precio del coche)
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Genera una descripción del coche
     * 
     * @return Una cadena String que devuelve una descripción
     */
    public String carDescription() {
        return "The car is a " + year + " " + make + " " + model + " priced at $" + price;
    }
}
