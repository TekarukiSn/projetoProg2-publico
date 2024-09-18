package projetoprog;

import java.util.ArrayList;


public class ProblemData {
    private double pesoF;
    private double distancia;
    private ArrayList<Double> listaDistancias = new ArrayList<>();
    private ArrayList<Veiculo> listaV = new ArrayList<>();
    BancoDeDados bd = new BancoDeDados();
    
    public void getDistanciaBD(){
        listaDistancias = bd.getListaDistancias();
        
    }
    
    public void getVeiculoBD(){
        listaV = bd.getListaVeiculos();
    }
    
    
}
