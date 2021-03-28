/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtask;
import java.util.Scanner;
/**
 *
 * @author luca
 */
public class TestTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        //Metodo de ingreso de datos por el usuario
        Scanner leer = new Scanner(System.in);
        
        Task Tarea1;
        Task Tarea2;
        Task Tarea3;
        
        Tarea1 = new Task();
        Tarea2 = new Task();
        Tarea3 = new Task();
               
        System.out.println("*   *   *   *   *   BIENVENIDO   *   *   *   *   *");
        
        //DECLARACION DE VARIABLE
        String DESCRIP;
        String ESTADO;
        int DIA,MES,ANIO;
            
        int menu=-1;
        while(menu!=0){
            System.out.println("MENU PRINCIPAL");
            System.out.println("OPCION 1 - AGREGAR UNA TAREA");
            System.out.println("OPCION 2 - VER LISTADO DE TAREAS");
            System.out.println("OPCION 3 - MOSTRAR UNA TAREA");
            System.out.println("OPCION 0 - FINALIZAR");
            
            System.out.print("INGRESE EL NUMERO DE OPCION: ");
            menu = leer.nextInt();
            
            if(menu!=0){
                
                switch(menu){
                    case 1:
                        System.out.println("\n *   *   *   *   *   AGREGAR TAREA   *   *   *   *   *");
                        int posicion=0;
                        //BUSCA POSICION LIBRE
                        if(Tarea1.getDescripcion()=="VACIO"){
                            posicion=1;
                        }else{
                            if(Tarea2.getDescripcion()=="VACIO"){
                                posicion=2;
                            }else{
                                if(Tarea3.getDescripcion()=="VACIO"){
                                    posicion=3;
                                }
                            }
                        }
                        
                        if(posicion!=0){
                            System.out.print("INGRESE LA DESCRIPCION DE LA TAREA: ");
                            DESCRIP = leer.next();
                            System.out.print("INGRESE EL ESTADO DE LA TAREA (COMPLETO/INCOMPLETO): ");
                            ESTADO = leer.next();
                            System.out.println("FECHA LIMITE PARA COMPLETAR LA TAREA");
                            System.out.print("INGRESE EL DIA: ");
                            DIA = leer.nextInt();
                            System.out.print("INGRESE EL MES: ");
                            MES = leer.nextInt();
                            System.out.print("INGRESE EL AÑO: ");
                            ANIO = leer.nextInt();
                            
                            switch(posicion){
                                case 1:{
                                    //GUARDAMOS LOS DATOS INGRESADOS
                                    Tarea1.setDescripcion(DESCRIP);
                                    Tarea1.setEstado(ESTADO);
                                    Tarea1.setDia(DIA);
                                    Tarea1.setMes(MES);
                                    Tarea1.setAnio(ANIO);
                                    //CONFIRMACION DE DATOS GUARDADOS
                                    System.out.println("LA TAREA FUE REGISTRADA CON EXITO \n");
                                    break;
                                }
                                case 2:{
                                    //GUARDAMOS LOS DATOS INGRESADOS
                                    Tarea2.setDescripcion(DESCRIP);
                                    Tarea2.setEstado(ESTADO);
                                    Tarea2.setDia(DIA);
                                    Tarea2.setMes(MES);
                                    Tarea2.setAnio(ANIO);
                                    //CONFIRMACION DE DATOS GUARDADOS
                                    System.out.println("LA TAREA FUE REGISTRADA CON EXITO \n");
                                    break;
                                }
                                case 3:{
                                    //GUARDAMOS LOS DATOS INGRESADOS
                                    Tarea3.setDescripcion(DESCRIP);
                                    Tarea3.setEstado(ESTADO);
                                    Tarea3.setDia(DIA);
                                    Tarea3.setMes(MES);
                                    Tarea3.setAnio(ANIO);
                                    //CONFIRMACION DE DATOS GUARDADOS
                                    System.out.println("LA TAREA FUE REGISTRADA CON EXITO \n");
                                    break;
                                }
                            }
                        }else{
                            System.out.println("\n LAS 3 TAREAS ESTAN CARGADAS \n");
                        }
                        break;
                    case 2:
                        System.out.println("\n*   *   *   *   *   LISTADO DE TAREAS    *   *   *   *   *");
                        int contador=0;
                        if(Tarea1.getDescripcion()!="VACIO"){
                            contador++;
                            System.out.println("N° "+contador+" - ESTADO DE LA TAREA: "+Tarea1.getEstado()+". DESCRIPCION: "+Tarea1.getDescripcion()+". FECHA LIMITE: "+Tarea1.getDia()+"/"+Tarea1.getMes()+"/"+Tarea1.getAnio());
                        }
                        if(Tarea2.getDescripcion()!="VACIO"){
                            contador++;
                            System.out.println("N° "+contador+" - ESTADO DE LA TAREA: "+Tarea2.getEstado()+". DESCRIPCION: "+Tarea2.getDescripcion()+". FECHA LIMITE: "+Tarea2.getDia()+"/"+Tarea2.getMes()+"/"+Tarea2.getAnio());
                        }
                        if(Tarea3.getDescripcion()!="VACIO"){
                            contador++;
                            System.out.println("N° "+contador+" - ESTADO DE LA TAREA: "+Tarea3.getEstado()+". DESCRIPCION: "+Tarea3.getDescripcion()+". FECHA LIMITE: "+Tarea3.getDia()+"/"+Tarea3.getMes()+"/"+Tarea3.getAnio());
                        }
                         
                        if(contador==0){
                            System.out.println("\n NO SE ENCONTRARON TAREAS REGISTRADAS \n");
                        }                                               
                        
                        break;
                    
                    case 3:
                        System.out.println("\n*   *   *   *   *   BUSCAR TAREA   *   *   *   *   *");
                        contador=0;
                        if(Tarea1.getDescripcion()!="VACIO"){
                            contador++;
                            System.out.println("N° 1 - ESTADO DE LA TAREA: "+Tarea1.getEstado()+". DESCRIPCION: "+Tarea1.getDescripcion()+". FECHA LIMITE: "+Tarea1.getDia()+"/"+Tarea1.getMes()+"/"+Tarea1.getAnio());
                        }
                        if(Tarea2.getDescripcion()!="VACIO"){
                            contador++;
                            System.out.println("N° 2 - ESTADO DE LA TAREA: "+Tarea2.getEstado()+". DESCRIPCION: "+Tarea2.getDescripcion()+". FECHA LIMITE: "+Tarea2.getDia()+"/"+Tarea2.getMes()+"/"+Tarea2.getAnio());
                        }
                        if(Tarea3.getDescripcion()!="VACIO"){
                            contador++;
                            System.out.println("N° 3 - ESTADO DE LA TAREA: "+Tarea3.getEstado()+". DESCRIPCION: "+Tarea3.getDescripcion()+". FECHA LIMITE: "+Tarea3.getDia()+"/"+Tarea3.getMes()+"/"+Tarea3.getAnio());
                        }
                         
                        if(contador==0){
                            System.out.println("\n NO SE ENCONTRARON TAREAS REGISTRADAS \n");
                        }else{
                            //ELEGIR TAREA A MODIFICAR O ELIMINAR
                            int opcion;
                            System.out.print("\nINGRESE EL NUMERO DE TAREA A MODIFICAR O ELIMINAR (0 PARA VOLVER AL MENU): ");
                            opcion = leer.nextInt();
                            
                            switch(opcion){
                                case 1:{
                                    if(Tarea1.getDescripcion()!="VACIO"){
                                        System.out.println("N° 1 - ESTADO DE LA TAREA: "+Tarea1.getEstado()+". DESCRIPCION: "+Tarea1.getDescripcion()+". FECHA LIMITE: "+Tarea1.getDia()+"/"+Tarea1.getMes()+"/"+Tarea1.getAnio());
                                        
                                        int opcion1;
                                        System.out.println("OPCION 1 - MODIFICAR EL ESTADO DE LA TAREA");
                                        System.out.println("OPCION 2 - ELIMINAR TAREA");
                                        System.out.println("OPCION 0 - VOLVER AL MENU");
                                        System.out.print("SELECCIONE UNA OPCION: ");
                                        opcion1 = leer.nextInt();
                                        
                                        if(opcion1==1){
                                            Tarea1.CambiarEstado();
                                            System.out.println("N° 1 - ESTADO DE LA TAREA: "+Tarea1.getEstado()+". DESCRIPCION: "+Tarea1.getDescripcion()+". FECHA LIMITE: "+Tarea1.getDia()+"/"+Tarea1.getMes()+"/"+Tarea1.getAnio());
                                            System.out.println("LA MODIFICACION FUE REALIZADA CON EXITO.\n");
                                        }
                                        if(opcion1==2){
                                            Tarea1.Eliminar();
                                            System.out.println("\nLA TAREA FUE ELIMINADA CON EXITO.\n");
                                        }
                                    }else{
                                        System.out.println("\nLA OPCION INGRESA ES INVALIDA.");
                                    }
                                    break;
                                }
                                case 2:{
                                    if(Tarea2.getDescripcion()!="VACIO"){
                                        System.out.println("N° 2 - ESTADO DE LA TAREA: "+Tarea2.getEstado()+". DESCRIPCION: "+Tarea2.getDescripcion()+". FECHA LIMITE: "+Tarea2.getDia()+"/"+Tarea2.getMes()+"/"+Tarea2.getAnio());
                                        
                                        int opcion1;
                                        System.out.println("OPCION 1 - MODIFICAR EL ESTADO DE LA TAREA");
                                        System.out.println("OPCION 2 - ELIMINAR TAREA");
                                        System.out.println("OPCION 0 - VOLVER AL MENU");
                                        System.out.print("SELECCIONE UNA OPCION: ");
                                        opcion1 = leer.nextInt();
                                        
                                        if(opcion1==1){
                                            Tarea2.CambiarEstado();
                                            System.out.println("N° 2 - ESTADO DE LA TAREA: "+Tarea2.getEstado()+". DESCRIPCION: "+Tarea2.getDescripcion()+". FECHA LIMITE: "+Tarea2.getDia()+"/"+Tarea2.getMes()+"/"+Tarea2.getAnio());
                                            System.out.println("LA MODIFICACION FUE REALIZADA CON EXITO.\n");
                                        }
                                        if(opcion1==2){
                                            Tarea2.Eliminar();
                                            System.out.println("\nLA TAREA FUE ELIMINADA CON EXITO.\n");
                                        }
                                    }else{
                                        System.out.println("\nLA OPCION INGRESA ES INVALIDA.");
                                    }
                                    break;
                                }
                                case 3:{
                                    if(Tarea3.getDescripcion()!="VACIO"){
                                        System.out.println("N° 3 - ESTADO DE LA TAREA: "+Tarea3.getEstado()+". DESCRIPCION: "+Tarea3.getDescripcion()+". FECHA LIMITE: "+Tarea3.getDia()+"/"+Tarea3.getMes()+"/"+Tarea3.getAnio());
                                        
                                        int opcion1;
                                        System.out.println("OPCION 1 - MODIFICAR EL ESTADO DE LA TAREA");
                                        System.out.println("OPCION 2 - ELIMINAR TAREA");
                                        System.out.println("OPCION 0 - VOLVER AL MENU");
                                        System.out.print("SELECCIONE UNA OPCION: ");
                                        opcion1 = leer.nextInt();
                                        
                                        if(opcion1==1){
                                            Tarea3.CambiarEstado();
                                            System.out.println("N° 3 - ESTADO DE LA TAREA: "+Tarea3.getEstado()+". DESCRIPCION: "+Tarea3.getDescripcion()+". FECHA LIMITE: "+Tarea3.getDia()+"/"+Tarea3.getMes()+"/"+Tarea3.getAnio());
                                            System.out.println("LA MODIFICACION FUE REALIZADA CON EXITO.\n");
                                        }
                                        if(opcion1==2){
                                            Tarea3.Eliminar();
                                            System.out.println("\nLA TAREA FUE ELIMINADA CON EXITO.\n");
                                        }
                                    }else{
                                        System.out.println("\nLA OPCION INGRESA ES INVALIDA.");
                                    }
                                    break;
                                }
                                default:{
                                    break;
                                }
                            }
                        }
                        
                        break;
                }
            }
            
        }
        
        
    }
    
}
