package projetoprog;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cliente {
    private int id = 1;
    private static int nextId = 1;
    private double lat, longi, pesoE, volumeE;
    private String dataI, dataF;
    private double valorE, multaAtraso;
    private int horasServ;

    public Cliente(double lat, double longi, double pesoE, double volumeE, String dataI, String dataF, double valorE, double multaAtraso, int horasServ) {
        id = nextId;
        nextId++;
        this.lat = lat;
        this.longi = longi;
        this.pesoE = pesoE;
        this.volumeE = volumeE;
        this.dataI = dataI;
        this.dataF = dataF;
        this.valorE = valorE;
        this.multaAtraso = multaAtraso;
        this.horasServ = horasServ;
    }
    
    public Cliente(int id, double lat, double longi, double pesoE, double volumeE, String dataI, String dataF, double valorE, double multaAtraso, int horasServ) {
        this.id = id;
        this.lat = lat;
        this.longi = longi;
        this.pesoE = pesoE;
        this.volumeE = volumeE;
        this.dataI = dataI;
        this.dataF = dataF;
        this.valorE = valorE;
        this.multaAtraso = multaAtraso;
        this.horasServ = horasServ;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Cliente.nextId = nextId;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLongi() {
        return longi;
    }

    public void setLongi(double longi) {
        this.longi = longi;
    }

    public double getPesoE() {
        return pesoE;
    }

    public void setPesoE(double pesoE) {
        this.pesoE = pesoE;
    }

    public double getVolumeE() {
        return volumeE;
    }

    public void setVolumeE(double volumeE) {
        this.volumeE = volumeE;
    }

    public String getDataI() {
        return dataI;
    }

    public void setDataI(String dataI) {
        this.dataI = dataI;
    }

    public String getDataF() {
        return dataF;
    }

    public void setDataF(String dataF) {
        this.dataF = dataF;
    }

    public double getValorE() {
        return valorE;
    }

    public void setValorE(double valorE) {
        this.valorE = valorE;
    }

    public double getMultaAtraso() {
        return multaAtraso;
    }

    public void setMultaAtraso(double multaAtraso) {
        this.multaAtraso = multaAtraso;
    }

    public int getHorasServ() {
        return horasServ;
    }

    public void setHorasServ(int horasServ) {
        this.horasServ = horasServ;
    }
    
    
    
}
