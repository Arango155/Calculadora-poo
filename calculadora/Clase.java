package calculadora;

public class Clase {
   
    
    public Clase(){
}
    
    public float suma (float a, float b){
        
        float suma= a+b; 
        return suma;
    }
    
       public float resta (float a, float b){
        float resta= a-b; 
        return resta;
    }
       
        public float multi (float a, float b){
        float multi= a*b; 
        return multi;
    }
        
        public float div (float a, float b){
        float div= a/b; 
        return div;
    }
        
        public float pota (float a){
        float pota= a*a; 
        return pota;
    }
        
        public float potb (float b){
        float potb= b*b; 
        return potb;
    }
      
        public float raiza (float a){
        float raiza= (float) Math.sqrt(a); 
     
        return raiza;
    }
    
        public float raizb (float b){
        float raizb= (float) Math.sqrt(b); 
     
        return raizb;
    }
      
        
        
      
             
         public float randomx (float x){
        float randomx= (float) (Math.random()*10); 
     
        return randomx;

    }
     
        public float raizx (float x){
        float raizx= (float) Math.sqrt(x); 
     
        return raizx;
    }
    
        public float raizy (float y){
        float raizy= (float) Math.sqrt(y); 
     
        return raizy;
    }
        
        public float pot (float x, float y){
        float pot= (float) Math.pow(x, y);
     
        return pot;
    }
       
        public float pi (float x){
        float pi= (float) Math.PI*x;
     
        return pi;
    }
   
   
}
