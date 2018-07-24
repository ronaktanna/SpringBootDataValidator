package com.example.data.validator.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;


/**
 * A Prefix Tree structure used to store and validate data efficiently.
 */
@Component
public class Trie implements Serializable {
	private static final long serialVersionUID = 1L;

	private class TrieNode implements Serializable {
		private static final long serialVersionUID = 1L;
		
		private Map<Character, TrieNode> children;
		private boolean isEndOfWord;
		
		public TrieNode(){
			children = new HashMap<>();
			isEndOfWord = false;
		}
	}
	
	private final TrieNode root;
	
	public Trie(){
		root = new TrieNode();
	}
	
	/**
	 * Inserts a word into the Trie in an iterative fashion.
	 * @param word --> The word you want to insert into the Trie.
	 */
	public void insert(String word){
		TrieNode current = root;
		for(int index=0; index<word.length(); index++){
			char extractedCharacter = word.charAt(index);
			TrieNode node = current.children.get(extractedCharacter);
			if(node == null){
				node = new TrieNode();
				current.children.put(extractedCharacter, node);
			}
			current = node;
		}
		current.isEndOfWord = true;
	}
	
	/**
	 * Performs a search for the entire word's existence in the Trie.
	 * @param word --> The word you want to search for in the Trie.
	 * @return true if the word is present.
	 * @return false if the word is not present.
	 */
	public boolean search(String word){
		
		TrieNode current = root;
		for(int index=0; index<word.length(); index++) {
			TrieNode node = current.children.get(word.charAt(index));
			if(node == null)
				return false;
			current = node;
		}
		
		return current.isEndOfWord;
	}
	
}
