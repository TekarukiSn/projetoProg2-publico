package projetoprog;

public class Veiculo {
    private int numVeiculos;
    private double capacVeiculos, volumCarroceria;
    private int maxDuracRota;
    private double latDeposito, longDeposito, consumoPorKm, precoPorL, velMedia;
    

    public int getNumVeiculos() {
        return numVeiculos;
    }

    public void setNumVeiculos(int numVeiculos) {
            this.numVeiculos = numVeiculos;
    }

    public double getCapacVeiculos() {
        return capacVeiculos * numVeiculos;
    }

    public void setCapacVeiculos(double capacVeiculos) {
        this.capacVeiculos = capacVeiculos;
    }

    public double getVolumCarroceria() {
        return volumCarroceria;
    }

    public void setVolumCarroceria(double volumCarroceria) {
        this.volumCarroceria = volumCarroceria;
    }

    public int getMaxDuracRota() {
        return maxDuracRota;
    }

    public void setMaxDuracRota(int maxDuracRota) {
        this.maxDuracRota = maxDuracRota;
    }

    public double getLatDeposito() {
        return latDeposito;
    }

    public void setLatDeposito(double latDeposito) {
        this.latDeposito = latDeposito;
    }

    public double getLongDeposito() {
        return longDeposito;
    }

    public void setLongDeposito(double longDeposito) {
        this.longDeposito = longDeposito;
    }

    public double getConsumoPorKm() {
        return consumoPorKm;
    }

    public void setConsumoPorKm(double consumoPorKm) {
        this.consumoPorKm = consumoPorKm;
    }

    public double getPrecoPorL() {
        return precoPorL;
    }

    public void setPrecoPorL(double precoPorL) {
        this.precoPorL = precoPorL;
    }

    public double getVelMedia() {
        return velMedia;
    }

    public void setVelMedia(double velMedia) {
        this.velMedia = velMedia;
    }

    public Veiculo(int numVeiculos, double capacVeiculos, double volumCarroceria, int maxDuracRota, double latDeposito, double longDeposito, double consumoPorKm, double precoPorL, double velMedia) {
        this.numVeiculos = numVeiculos;
        this.capacVeiculos = capacVeiculos;
        this.volumCarroceria = volumCarroceria;
        this.maxDuracRota = maxDuracRota;
        this.latDeposito = latDeposito;
        this.longDeposito = longDeposito;
        this.consumoPorKm = consumoPorKm;
        this.precoPorL = precoPorL;
        this.velMedia = velMedia;
    }
    
    
    
    
    
}
