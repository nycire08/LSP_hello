package org.howard.edu.lsp.hw2;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
	public String readToString(String resource) throws FileNotFoundException {
		URL url = getClass().getClassLoader().getResource(resource);
		
		//ArrayList for words and counter
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<Integer> count = new ArrayList<Integer>();
		
		
		if (url != null) {
			File file = new File(url.getPath());
			
			Scanner sc = new Scanner(file);
			
			while(sc.hasNext()) {
				String nextWord = sc.next();
				//if else statement to count a word and implement it in the index 
				if(words.contains(nextWord)) {
					int index = words.indexOf(nextWord);
					count.set(index, count.get(index) + 1);
				}
			
				else {
					words.add(nextWord);
					count.add(1);
				}
				//making each word lower case so Design and design will be read as the same word
			nextWord = nextWord.toLowerCase();
				sc.close();
				//making sure it fits the parameters for a word length
				for (String word : words) {
					if (nextWord.length() <= 3) {
					continue;
					}
				
				for(int i = 0; i < words.size(); i++) {
					System.out.println(words.get(i) + "appeared" + count.get(i));
			}
		}
		throw new FileNotFoundException();
		
	}
	}
		return resource;
	}
}

