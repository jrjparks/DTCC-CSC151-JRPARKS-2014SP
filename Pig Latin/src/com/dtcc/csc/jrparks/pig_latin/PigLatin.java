package com.dtcc.csc.jrparks.pig_latin;

import java.util.Arrays;

public class PigLatin {
	public static String pigLatinize(String normal_sentence) {
		String pattern = "[^\\w\\s]";
		normal_sentence = normal_sentence.replaceAll(pattern, "");
		String[] sentence_split = normal_sentence.split("\\s");
		for (Integer i = 0; i < sentence_split.length; ++i)
			if (sentence_split[i] != null && sentence_split[i].length() > 0)
				sentence_split[i] = pigLatinizeWord(sentence_split[i]);
		return Arrays.toString(sentence_split).replace(", ", " ")
				.replaceAll("[\\[\\]]", "");
	}

	public static String pigLatinizeWord(String word) {
		word = word.toLowerCase();
		return String.format("%s%say", word.substring(1), word.substring(0, 1));
	}
}
