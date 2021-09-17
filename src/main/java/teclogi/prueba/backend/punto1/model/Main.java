package teclogi.prueba.backend.punto1.model;
public class Main {
    private float temp;
    private float feels_like;
    private float temp_min;
    private float temp_max;
    private int pressure;
    private int humidity;
    /**
     * Contructor de la clase Main
     * @param temp informacion de la ciudad
     * @param feels_like informacion de la ciudad
     * @param temp_min informacion de la ciudad
     * @param temp_max informacion de la ciudad
     * @param pressure informacion de la ciudad
     * @param humidity informacion de la ciudad
     */
    public Main(float temp, float feels_like, float temp_min, float temp_max, int pressure, int humidity ) {
        this.temp = temp;
        this.feels_like = feels_like;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.pressure = pressure;
        this.humidity = humidity;
    }
    /**
     * Contructor de la clase Main
     */
    public Main() {

    }
    public float getTemp() {
        return temp;
    }
    public void setTemp(float temp) {
        this.temp = temp;
    }
    public float getFeels_like() {
        return feels_like;
    }
    public void setFeels_like(float feels_like) {
        this.feels_like = feels_like;
    }
    public float getTemp_min() {
        return temp_min;
    }
    public void setTemp_min(float temp_min) {
        this.temp_min = temp_min;
    }
    public float getTemp_max() {
        return temp_max;
    }
    public void setTemp_max(float temp_max) {
        this.temp_max = temp_max;
    }
    public int getPressure() {
        return pressure;
    }
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
    public int getHumidity() {
        return humidity;
    }
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}