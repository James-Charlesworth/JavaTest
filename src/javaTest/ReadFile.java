package javaTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.ArrayList;

public class ReadFile {
	
	public ArrayList<String> fileReader(String input){
		
		String line;
		ArrayList<String> all = new ArrayList<String>();
		int i=0;
		
		try{
			//FileReader reads text files (encoding default)
			FileReader fileReader = new FileReader(input);

			//Warning is annoying
			@SuppressWarnings("resource")
			//Always wrap FileReader in BufferedReader
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while((line = bufferedReader.readLine()) != null)
			{
				all.add(line);
			}
			
		}
		catch(IOException e)
		{
			System.out.println("IO Exception caught, likely that file is not present");
		}
		
		return all;
	}
	
	public ArrayList<String> sortArrays(ArrayList<String> all, String array){
		int stop = 0;
		ArrayList<String> marinas = new ArrayList<String>();
		ArrayList<String> boats = new ArrayList<String>();
		ArrayList<String> people = new ArrayList<String>();
		
		for (int i = 1;i<all.size();i++){
			if (all.get(i).equals("Boats")){
				stop = i;
				break;
				//ignore '%'
			}else if (all.get(i).contains("|")){
				
			}else{
				//add data to array
				marinas.add(all.get(i));
			}
		}
		
		for (int i = stop+1;i<all.size();i++){
			if (all.get(i).equals("People")){
				stop = i;
				break;
				//ignore '%'
			}else if (all.get(i).contains("|")){
				
			}else{
				//add data to array
				boats.add(all.get(i));
			}
		}
		
		for (int i = stop+1;i<all.size();i++){
			if (all.get(i).contains("|")){
				
			}else{
				//add data to array
				people.add(all.get(i));
			}
		}
		
		
		if (array == "marinas"){
			return marinas;
		}else if (array == "boats"){
			return boats;
		}else if (array == "people"){
			return people;
		}
		return null;
			
		
	}

}
