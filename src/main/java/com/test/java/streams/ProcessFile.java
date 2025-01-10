package com.test.java.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProcessFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Cat> cats = loadCats("src/main/resources/cat.txt");
		cats.stream().forEach(System.out::println);
	}

	public static List<Cat> loadCats(String Filename) {
		List<Cat> catList = new ArrayList<>();
		try (Stream<String> stream = Files.lines(Paths.get(Filename))) {
			stream.forEach(line -> {
				String[] catsArray = line.split("/");
				catList.add(new Cat(catsArray[0], catsArray[1]));
			});

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return catList;

	}

}
