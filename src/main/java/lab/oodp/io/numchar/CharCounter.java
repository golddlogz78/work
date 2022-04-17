package lab.oodp.io.numchar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharCounter {
	
	int numE = 0;
    int total = 0;
    
    

    public int getNumE() {
		return numE;
	}

	public int getTotal() {
		return total;
	}

	public void start() {

        printNumEsWithFileReader();

    }

    private void printNumEsWithFileReader() {
    	
    	//TODO: read file and count Es and total number of character, uncomment sysout below
    	File myFile = new File ("input1.txt");
    	try(BufferedReader reader = new BufferedReader(new FileReader(myFile))){
    		int num = -1;
    		while((num = reader.read()) != -1) {
    			char check = (char) num;
    			if (check == 'e' || (char) check == 'E')
    				numE++;
    			total++;
    		}
    		
    	} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        

        System.out.println("Number of e/E's: " + numE + " out of " + total);
    }

    public static void main(String[] args) {
        new CharCounter().start();
    }

}
