package org.howard.edu.lsp.hw2;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
	@SuppressWarnings("null")
	public String readToString(String resource) throws FileNotFoundException {
		URL url = getClass().getClassLoader().getResource(resource);
		
		if (url != null) {
			File file = new File(url.getPath());
			
			ArrayList<String> words = new ArrayList<String>();
			ArrayList<Integer> count = new ArrayList<Integer>();
			
			Scanner sc = null;
			while(sc.hasNext()) {
				String nextWord = sc.next();
				if(words.contains(nextWord)) {
					int index = words.indexOf(nextWord);
					count.set(index, count.get(index) + 1);
				}
			
				else {
					words.add(nextWord);
					count.add(1);
				}
			
				sc.close();
				
				for(int i = 0; i < words.size(); i++) {
					System.out.println(words.get(i) + "appeared" + count.get(i));
			}
		}
		throw new FileNotFoundException();
		
	}
		return resource;
	}
}

