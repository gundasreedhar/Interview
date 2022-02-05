package com.java8.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class DictionaryWordFormer {

	public static void main(String[] args) {
		DictionaryWordFormer dictionaryWordFormer = new DictionaryWordFormer();
		List<String> testData = new ArrayList<>();
		testData.add("hot");
		testData.add("dot");
		testData.add("dog");
		testData.add("lot");
		testData.add("log");
		Set<String> set = new HashSet<>(testData);

		List<String> data = dictionaryWordFormer.ladderLength("hit", "cog", set);
		System.out.println("set is " + data);
	}

	public List<String> ladderLength(String beginWord, String endWord, Set<String> wordList) {
		List<String> result = new ArrayList<>();

		Queue<String> queue = new LinkedList<String>();
		queue.add(beginWord);
		int count = 1;

		while (!queue.isEmpty()) {

			int size = queue.size();

			for (int j = 0; j < size; j++) {
				String word = queue.remove();

				if (word.equals(endWord)) {
					result.add(word);
					return result;
				}

				for (int i = 0; i < word.length(); i++) {
					for (char c = 'a'; c <= 'z'; c++) {
						if (c != word.charAt(i)) {
							char[] s = word.toCharArray();
							s[i] = c;
							String trans = new String(s);

							if (wordList.contains(trans)) {
								queue.add(trans);
								wordList.remove(trans);
								result.add(trans);
							}
						}
					}
				}
			}

			count++;
		}

		return result;
	}

}
