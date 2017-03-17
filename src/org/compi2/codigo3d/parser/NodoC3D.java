package org.compi2.codigo3d.parser;

import java.util.ArrayList;

public class NodoC3D {
    private String cad = "";
    private ArrayList<String> lvs = new ArrayList<>();
    private ArrayList<String> lfs = new ArrayList<>();

    public NodoC3D(String cad) {
        this.cad = cad;
    }
    
    public NodoC3D(String lv, String lf){        
        lvs.add(lv);
        lfs.add(lf);
    }
    
    public NodoC3D(ArrayList<String> lvs, ArrayList<String> lfs){
        this.lvs = lvs;
        this.lfs = lfs;
    }
    
    public String getCad(){
        return cad;
    }
    
    public ArrayList<String> getLvs(){
        return this.lvs;
    }
    
    public ArrayList<String> getLfs(){
        return this.lfs;
    }
    
    public ArrayList<String> unirLvs(ArrayList<String> lvs){
        for (String lv : lvs) {
            if(!this.lvs.contains(lv))
                this.lvs.add(lv);
        }
        return this.lvs;
    }
    
    public ArrayList<String> unirLfs(ArrayList<String> lfs){
        for (String lf : lfs) {
            if(!this.lfs.contains(lf))
                this.lfs.add(lf);
        }
        return this.lfs;
    }
    
    
    public String printLvs(){
        String cadLvs = "";
        
        for (String lv : this.lvs) {
            cadLvs += lv + ":\n";
        }
        
        return cadLvs;
    }
    
    public String printLfs(){
        String cadLfs = "";
        
        for (String lf : this.lfs) {
            cadLfs += lf + ":\n";
        }
        
        return cadLfs;
    }
        
}
