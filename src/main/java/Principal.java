
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naruk
 */
public class Principal {
    
    
     
     public List<Datacredito> leerarchivo (String archivo) throws Exception{
          List<Datacredito> personas = new ArrayList<>();
         
         String cadena;
          
         
         FileReader f;
         BufferedReader b;
         
         try{
             
             f = new FileReader (archivo);
             b = new BufferedReader(f);
             while((cadena = b.readLine())!=null ){
                 
                 String [] datacreditovector = cadena.split(",");
                 String [] reporteVector = cadena.split(";");
            
                 Datacredito datacredito = new Datacredito (Integer.parseInt(datacreditovector[0]),datacreditovector[1],datacreditovector[2],datacreditovector[3]);
                // Reporte credito = new Reporte (Integer.parseInt(reporteVector[0]),reporteVector [1],reporteVector [2],reporteVector[3],Integer.parseInt(reporteVector[4]));
                 personas.add(datacredito);
                 
                 //datacredito.getReporte().add(credito);
                 
                 
               
                   
                   
                 
                  
                  for(Datacredito pan : personas){
                       System.out.print(pan.getCodigo()+","+pan.getNombre()+","+pan.getApellido()+","+pan.getCorreo());
                     /* for(Reporte pin : pan.getReporte()){
                         // System.out.print(pin.getCodigo()+";"+pin.getEmpresa()+";"+pin.getDescripcion()+";"+pin.getEstado()+";"+pin.getValor());
                      }*/
                  }
                  
                 
                  
                  
                  //System.out.print(cadenas);
   
                  
                  
                  
                    //String [] reportefan = report.split(";");
                    
                     //Reporte reporte = new Reporte(Integer.parseInt(reportefan[0]),reportefan[1],reportefan[2],reportefan[3],Integer.parseInt(reportefan[4]));
                      //datacredito.getReporte().add(reporte);
             
              }
             
             b.close();
             return personas;
           
             }catch (FileNotFoundException ex){
             System.err.print("No se encuentra el archivo");
             throw new FileNotFoundException("No se puedo Encontrar el archivo");
             
             
             }catch (IOException ex){
             
             System.err.print("Error al leer el archivo");
             throw new IOException("Error al leer el archivo");
             
         }
             
             
    
         
         
     }
     
    
     
     
     /* public void leerarReporte (String archivo) throws Exception{
          
         String cadena;
         FileReader f;
         BufferedReader b;
         
         try{
             
             while((cadena = b.readLine())!=null ){
                 
                 String [] datacreditovector = cadena.split(",");
                 LitarDatacredito fan = new LitarDatacredito();
                 
                 
                 
                 Datacredito datacredito = new Datacredito (Integer.parseInt(datacreditovector[0]),datacreditovector[1],datacreditovector[2],datacreditovector[3]);
                 System.out.print(cadena);
                  while((cadenas = b.readLine())!=null ){
                 
                   
                   String [] reportVector = cadenas.split(";");
                   
                
                  
                  
                  Reporte credito = new Reporte (Integer.parseInt(reportVector[0]),reportVector[1],reportVector[2],reportVector[3],Integer.parseInt(reportVector[4]));
             
                  
                  System.out.print(cadenas);
   
                  rte().add(reporte);
             }
             
             b.close();
           
             }catch (FileNotFoundException ex){
             System.err.print("No se encuentra el archivo");
             throw new FileNotFoundException("No se puedo Encontrar el archivo");
             
             
             }catch (IOException ex){
             
             System.err.print("Error al leer el archivo");
             throw new IOException("Error al leer el archivo");
             
         }
             
          
      }*/
     
}


    

