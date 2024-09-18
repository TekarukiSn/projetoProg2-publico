package projetoprog;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BancoDeDados {
    private static ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
    private static ArrayList<Veiculo> listaVeiculosInF = new ArrayList<>();
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    private static ArrayList<Cliente> listaClientesInF = new ArrayList<>();
    private static ArrayList<Double> listaDistancias = new ArrayList<>();
    private static ArrayList<Double> listaTempos = new ArrayList<>();
    private static ArrayList<Double> listaDistanciasInF = new ArrayList<>();
    private static ArrayList<Double> listaTemposInF = new ArrayList<>();
    
    public void addVeiculo(Veiculo veiculo){
        listaVeiculos.add(veiculo);
    }
    
    public void addDistancia(Double distancia){
        listaDistancias.add(distancia);
    }
    
    
    public void addTempos(Double tempos){
        listaTempos.add(tempos);
    }
    
    public ArrayList<Double> getListaDistancias(){
        return listaDistancias;
    }
    
    public ArrayList<Double> getListaTempos(){
        return listaTempos;
    }
    
    public ArrayList<Veiculo> getListaVeiculos(){
        return listaVeiculos;
    }
    
    public void addCliente(Cliente cliente){
        listaClientes.add(cliente);
    }
    
    public ArrayList<Cliente> getListaClientes(){
        return listaClientes;
    }
    
    public void addClienteInF (Cliente cliente){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Windows\\Documents\\NetBeansProjects\\ProjetoProg\\files\\bdClientes.txt"))){
                bw.write(cliente.getId() + "\n");
                bw.write(cliente.getLat() + "\n");
                bw.write(cliente.getLongi() + "\n");
                bw.write(cliente.getPesoE() + "\n");
                bw.write(cliente.getVolumeE() + "\n");
                bw.write(cliente.getDataI() + "\n");
                bw.write(cliente.getDataF() + "\n");
                bw.write(cliente.getValorE() + "\n");
                bw.write(cliente.getMultaAtraso() + "\n");
                bw.write(cliente.getHorasServ() + "\n");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<Cliente> getClientesInF(){
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Windows\\Documents\\NetBeansProjects\\ProjetoProg\\files\\bdClientes.txt"))){
            for(int i = 0;i<listaClientes.size();i++){
                    if(br.readLine() == null){
                        
                    }else{
                        double lat = Double.parseDouble(br.readLine());
                        double longi = Double.parseDouble(br.readLine());
                        double pesoE = Double.parseDouble(br.readLine());
                        double volumeE = Double.parseDouble(br.readLine());
                        String dataI = br.readLine();
                        String dataF = br.readLine();
                        double valorE = Double.parseDouble(br.readLine());
                        double multaAtraso = Double.parseDouble(br.readLine());
                        int horasServ = Integer.parseInt(br.readLine());
                        Cliente cliente = new Cliente(lat, longi, pesoE, volumeE, dataI, dataF, valorE, multaAtraso, horasServ);
                        listaClientesInF.add(cliente);
                    }
                    
                
                
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        
        return listaClientesInF;
    }

    public void addVeiculosInF (Veiculo veiculo){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Windows\\Documents\\NetBeansProjects\\ProjetoProg\\files\\bdVeiculos.txt"))){
                bw.write(veiculo.getNumVeiculos() + "\n");
                bw.write(veiculo.getCapacVeiculos() + "\n");
                bw.write(veiculo.getVolumCarroceria() + "\n");
                bw.write(veiculo.getMaxDuracRota() + "\n");
                bw.write(veiculo.getLatDeposito() + "\n");
                bw.write(veiculo.getLongDeposito() + "\n");
                bw.write(veiculo.getConsumoPorKm() + "\n");
                bw.write(veiculo.getPrecoPorL() + "\n");
                bw.write(veiculo.getVelMedia() + "\n");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<Veiculo> getVeiculoInF(){
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Windows\\Documents\\NetBeansProjects\\ProjetoProg\\files\\bdVeiculos.txt"))){
            for(int i = 0;i<listaVeiculos.size();i++){
                    int numVeiculos = Integer.parseInt(br.readLine());
                    double capacVeiculos = Double.parseDouble(br.readLine());
                    double volumCarroceria = Double.parseDouble(br.readLine());
                    int maxDuracRota = Integer.parseInt(br.readLine());
                    double latDeposito = Double.parseDouble(br.readLine());
                    double longDeposito = Double.parseDouble(br.readLine());
                    double consumoPorKm = Double.parseDouble(br.readLine());
                    double precoPorKm = Double.parseDouble(br.readLine());
                    double velMedia = Double.parseDouble(br.readLine());
                    Veiculo veiculo = new Veiculo(numVeiculos, capacVeiculos, volumCarroceria, maxDuracRota, latDeposito, longDeposito, consumoPorKm, precoPorKm, velMedia);
                    listaVeiculosInF.add(veiculo);
                
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        
        return listaVeiculosInF;
    }
    
    public void addDistanciasInF (){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Windows\\Documents\\NetBeansProjects\\ProjetoProg\\files\\bdDistancias.txt"))){
            for(int i=0; i<listaDistancias.size();i++){
                bw.write(listaDistancias.get(i) + "\n");
            }
            
            
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void addTemposInF (){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Windows\\Documents\\NetBeansProjects\\ProjetoProg\\files\\bdTempos.txt"))){                
            for(int i=0; i<listaTempos.size();i++){
                bw.write(listaTempos.get(i) + "\n");
            }           
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<Double> getDistanciasInF(){
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Windows\\Documents\\NetBeansProjects\\ProjetoProg\\files\\bdDistancias.txt"))){
            for(int i = 0; i<listaDistancias.size(); i++){
                for(int j = 0; j<listaDistancias.size(); j++){
                    if(br.readLine() == null){
                        listaDistanciasInF.add(0.0);
                    }else{
                        listaDistanciasInF.add(Double.parseDouble(br.readLine()));
                    }
                    
                }
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        return listaDistanciasInF;
    }
    
    public ArrayList<Double> getTemposInF(){
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Windows\\Documents\\NetBeansProjects\\ProjetoProg\\files\\bdDistancias.txt"))){
            for(int i = 0; i<listaTempos.size(); i++){
                for(int j = 0; j<listaTempos.size(); j++){
                    if(br.readLine() == null){
                        listaTemposInF.add(0.);
                    }else{
                        listaTemposInF.add(Double.parseDouble(br.readLine()));
                    }
                }
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        return listaTemposInF;
    }
    
    public void saveReport(ArrayList<Veiculo> listaV, ArrayList<Cliente> listaC, ArrayList<Double> distancias, ArrayList<Double> tempos){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Windows\\Documents\\NetBeansProjects\\ProjetoProg\\files\\bdRelatorio.txt"))){
            DecimalFormat deci = new DecimalFormat("00.00");
            bw.write("Num. Cadastros de Veiculos: " + listaV.size());
            for(int i = 0; i<listaV.size(); i++){
                bw.write("Num. Veiculos: " + listaV.get(i).getNumVeiculos() + " \n");
                bw.write("Capacidade Veiuclos: " + listaV.get(i).getCapacVeiculos() + " \n");
                bw.write("Volume Carroceria: " + listaV.get(i).getVolumCarroceria() + " \n");
                bw.write("Duracao max. Rota: " + listaV.get(i).getMaxDuracRota() + " \n");
                bw.write("Consumo por km: " + listaV.get(i).getConsumoPorKm() + " \n");
                bw.write("Preco por litro: " + listaV.get(i).getPrecoPorL() + " \n");
                bw.write("Vel. Media frota: " + listaV.get(i).getVelMedia() + " \n");
                bw.write("Latitude Deposito: " + listaV.get(i).getLatDeposito() + " \n");
                bw.write("Longitude Deposito: " + listaV.get(i).getLongDeposito() + " \n");
                bw.write(" -------------------------- \n");
        }
            bw.write("Num. Cadastros de Clientes: " + listaC.size());
            for(int i = 0; i<listaC.size(); i++){
            int a = i;
            int c = 1;
            int b = a + 1;
            bw.write("Cliente iD: " + c + " \n");
            bw.write("Latitude: " + listaC.get(i).getLat() + " \n");
            bw.write("Longitude: " + listaC.get(i).getLongi() + " \n");
            bw.write("Data inicial: " + listaC.get(i).getDataI() + " \n");
            bw.write("Data Final: " + listaC.get(i).getDataF() + " \n");
            bw.write("Peso Encomenda: " + listaC.get(i).getPesoE() + " \n");
            bw.write("Volume Encomenda: " + listaC.get(i).getVolumeE() + " \n");
            bw.write("Valor Encomenda: " + listaC.get(i).getValorE() + " \n");
            bw.write("Tempo de Servico: " + listaC.get(i).getHorasServ() + " \n");
            bw.write("Multa por Atraso: " + listaC.get(i).getMultaAtraso() + " \n");
            
            if(i == 0){
                bw.write("--------------------------- \n");
            }
            else{
                bw.write("Distancia entre Cliente n" + a + " e Cliente n " + b + ": " + deci.format(listaDistancias.get(i)) + " \n");
                bw.write("Tempo de viagem entre Cliente n" + a + " e Cliente n " + b + ": " + deci.format(listaTempos.get(i)) + " \n");
                bw.write("--------------------------- \n");
            }
            c++;
        }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
