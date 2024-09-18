package projetoprog;

import java.awt.List;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class ProblemSolution {
    BancoDeDados bd = new BancoDeDados();
    ArrayList<Cliente> listaC = bd.getListaClientes();
    ArrayList<Cliente> rotaAleatoria = new ArrayList<>();
    ArrayList<Cliente> melhorRota = new ArrayList<>();
    ArrayList<Veiculo> listaV = bd.getListaVeiculos();
    double tempo;
    
    public void rotaAleatoria(double distancia, double velMedia, double capacVeiculo){
            Random rand = new Random();
            for(int i=0;i<listaC.size();i++){
                int int_random = rand.nextInt(listaC.size());
                rotaAleatoria.add(listaC.get(int_random));
            }
    }
    
    public boolean ValidarRota(ArrayList<Cliente> rotaAleatoria, ArrayList<Veiculo> listaV){
        double aux = listaV.get(0).getCapacVeiculos();
        for(int i=0;i<rotaAleatoria.size();i++){
            aux = aux - rotaAleatoria.get(i).getPesoE();
        }
        if(aux >= 0){
            return true;
        } else{
            return false;
        }
    }
    
    
    public void CalcularDistanciaRota(){
        double aux =0;
        for(int i=0;i<rotaAleatoria.size();i++){
            aux = sqrt(pow((rotaAleatoria.get(i).getLat()) - listaV.get(0).getLatDeposito(), 2) + pow((rotaAleatoria.get(i).getLongi() - listaV.get(0).getLongDeposito()), 2));
            aux += aux;
        }
        tempo = aux/listaV.get(0).getVelMedia();
    }
    
    
        
}
  
