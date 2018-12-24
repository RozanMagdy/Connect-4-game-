/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connect.pkg4;

import java.util.Scanner;
/**
 *
 * @author Rozan
 */
public class Connect4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        //inserting first plane 
        String [][]paln=new String[7][7]; 
        System.out.println("player one enter your name :");
        String player_1=input.next();
        System.out.println("player two enter your name :");
        String player_2=input.next();
        for(int index=0;index<7;index++ ){
            String x =Integer.toString(index);
            paln[0][index]=x;
        }
        for(int i=1;i<7;i++){
            for(int j=0;j<7;j++){
                paln[i][j]=" ";
            }
        }
        System.out.println("starting game");
        //printing plan for first time  
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                System.out.print(" "+ paln[i][j]+" "+'|' );
            } 
            System.out.println(" ");
        }
        int x =0;
        while(x==0){
            //player one
            int z=0;
            while(z==0){
                System.out.println(player_1+":" );
                int play_1= input.nextInt(); 
                if(play_1>6){
                    System.out.println("invalid place");
                    continue;
                }
                for(int j=6;j<7;j--){
                    if(paln[j][play_1]==" "){
                        paln[j][play_1]="x";
                        z=1;
                        break;
                    } 
                }
            }    
            //printing plan  
            for(int i=0;i<7;i++){
                for(int j=0;j<7;j++){
                    System.out.print(" "+ paln[i][j]+" "+'|' );
                } 
                System.out.println("");
            }
            // scheking rows 
            for(int i=0;i<7;i++){
                for(int j=0;j<4;j++){
                    if((paln[i][j]=="x")&&(paln[i][j]==paln[i][j+1])&&(paln[i][j]==paln[i][j+2])&&(paln[i][j]==paln[i][j+3])){
                        System.out.println(player_1+" wins ");
                        x=1;
                    }    
                }
            }
            
            // scheking colmns 
            for(int i=0;i<4;i++){
                for(int j=0;j<7;j++){
                    if((paln[i][j]=="x")&&(paln[i][j]==paln[i+1][j])&&(paln[i][j]==paln[i+2][j])&&(paln[i][j]==paln[i+3][j])){
                        System.out.println(player_1+" wins ");
                        x=1;
                    }    
                }  
            }
            
            // scheking +ve digonals  
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    if((paln[i][j]=="x")&&(paln[i][j]==paln[i+1][j+1])&&(paln[i][j]==paln[i+2][j+2])&&(paln[i][j]==paln[i+3][j+3])){
                        System.out.println(player_1+" wins ");
                        x=1;
                    }    
                } 
            }
            
            // scheking -ve digonals  
            for(int i=6;i>4;i--){
                for(int j=0;j<4;j++){
                    if((paln[i][j]=="x")&&(paln[i][j]==paln[i-1][j+1])&&(paln[i][j]==paln[i-2][j+2])&&(paln[i][j]==paln[i-3][j+3])){
                        System.out.println(player_1+" wins ");
                        x=1;
                    }    
                }
            }
            if(x==1){
                break;   
            }
            //player two
            z=0;
            while(z==0){
                System.out.println(player_2+":" );
                int play_2= input.nextInt(); 
                if(play_2>6){
                    System.out.println("invalid place");
                    continue;
                }
                for(int j=6;j<7;j--){
                    if(paln[j][play_2]==" "){
                        paln[j][play_2]="o";
                        z=1;
                        break;
                    } 
                }
            }    
            //printing plan  
            for(int i=0;i<7;i++){
                for(int j=0;j<7;j++){
                    System.out.print(" "+ paln[i][j]+" "+'|' );
                } 
                System.out.println("");
            }
            // scheking rows 
            for(int i=0;i<7;i++){
                for(int j=0;j<4;j++){
                    if((paln[i][j]=="o")&&(paln[i][j]==paln[i][j+1])&&(paln[i][j]==paln[i][j+2])&&(paln[i][j]==paln[i][j+3])){
                        System.out.println(player_2+" wins ");
                        x=1;
                    }    
                }
            }
            
            // scheking colmns 
            for(int i=0;i<4;i++){
                for(int j=0;j<7;j++){
                    if((paln[i][j]=="o")&&(paln[i][j]==paln[i+1][j])&&(paln[i][j]==paln[i+2][j])&&(paln[i][j]==paln[i+3][j])){
                        System.out.println(player_2+" wins ");
                        x=1;     
                    }    
                }
            }
            
            // scheking +ve digonals  
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    if((paln[i][j]=="o")&&(paln[i][j]==paln[i+1][j+1])&&(paln[i][j]==paln[i+2][j+2])&&(paln[i][j]==paln[i+3][j+3])){
                        System.out.println(player_2+" wins");
                        x=1;
                    }    
                }
            }
            
            // scheking -ve digonals  
            for(int i=6;i>4;i--){
                for(int j=0;j<4;j++){
                    if((paln[i][j]=="o")&&(paln[i][j]==paln[i-1][j+1])&&(paln[i][j]==paln[i-2][j+2])&&(paln[i][j]==paln[i-3][j+3])){
                        System.out.println(player_2+" wins ");
                        x=1;
                    }    
                }
            }
           if(x==1){
                break;
            }
         
        }
    }
}
