package org.example.example12;

public class Trie {

    private TrieNode root;

    public Trie(){
        this.root=new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;

        for (char ch : word.toCharArray()) {

            if (current.getChildren() == null) {
                current.setChildren(new java.util.HashMap<>());
            }

            if (!current.getChildren().containsKey(ch)) {
                current.getChildren().put(ch, new TrieNode());
            }

            current = current.getChildren().get(ch);

            current.setCount(current.getCount() + 1);
        }

        current.setEndOfWord(true);
    }

    public boolean search(String word) {
        TrieNode current = root;

        for (char ch : word.toCharArray()) {

            if (current.getChildren() == null ||
                    !current.getChildren().containsKey(ch)) {
                return false;
            }

            current = current.getChildren().get(ch);
        }

        return current.isEndOfWord();
    }

    public boolean startsWith(String prefix) {
        TrieNode current = root;

        for (char ch : prefix.toCharArray()) {

            if (current.getChildren() == null ||
                    !current.getChildren().containsKey(ch)) {
                return false;
            }

            current = current.getChildren().get(ch);
        }

        return true;
    }


}
