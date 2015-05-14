/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package worldcup;
import java.applet.*;
import java.io.*;
import java.util.*;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author rishigoel
 */
public class Players {
    /*
     * pre: none
     * post: returns letters array
     * reads the player file, stores it in an array list, converts it into an array and sorts it alphabetically
     */
    public String [] players1 () {
    File textFile = new File("Neymar.txt");
    FileReader in;
    BufferedReader readFile;
    String line;
    ArrayList letters2=new ArrayList(10);
    String [] letters=new String [10];
    String y="";
    try {
    in = new FileReader(textFile);
    readFile=new BufferedReader(in);
    int counter=0;
    while ((line = readFile.readLine()) != null) {
                letters2.add(line);
                counter ++;
            }
    letters=new String [letters2.size()];
    letters2.toArray(letters);
    String sorter2;
           //sorts letters array
           for (int i = 1; i < letters.length; i++) {
            for (int j = i; j > 0; j--) {
                if (letters[j].compareToIgnoreCase(letters[j-1])<0) {
                    sorter2 = letters[j];
                    letters[j] = letters[j - 1];
                    letters[j - 1] = sorter2;
                }
            }
        }
           for (int x=0; x<letters.length;x++) {
               y=y+"\n "+letters[x].toString();
               
           }
            
    readFile.close();
    in.close();
    
}
    catch (FileNotFoundException e) {
            System.out.println("The file does not exist or could not be found");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem reading file");
            System.err.println("IOException: " + e.getMessage());
        }
  return (letters);
    
}
    /*
     * pre:none
     * post:returns guess
     * returns the goalies guess on the shot
     */
    public int save () {
        int guess=1 + (int)(Math.random() * ((5-1)+1));

   return guess;
    }
     /*
      * pre:none
      * post:returns nothing
      * plays the song but it doesn't work
      */      
    public static void music() {
        try {
        File f=new File("rec.wav");
        InputStream in =new FileInputStream(f);
        AudioStream y=new AudioStream(in);   
        AudioPlayer.player.start(y);
        }
        catch (FileNotFoundException e) {
            System.out.println("The file does not exist or could not be found");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem reading file");
            System.err.println("IOException: " + e.getMessage());
        }
        
    }
    
  
   
    
}