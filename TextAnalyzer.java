/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package text.analyzer;

/**
 *
 * @author aditya
 */
public class TextAnalyzer {
    
    private String inputText;
    private int textLength;
    private int wordCount;
    private int lineCount;
    private int tabCount;
    private int spaceCount;
    private String uniqueCharText;

    // Constructor that takes the input text
    public TextAnalyzer(String inputText) {
        this.inputText = inputText;
    }

    // Analyze the input text and store the results
    public void analyze() {
        // Count total characters
        textLength = inputText.length();

        // Count number of lines
        if (inputText.isEmpty()) {
            lineCount = 0;
        } else {
            lineCount = inputText.split("\n").length;
        }

        // Count spaces and tabs
        spaceCount = 0;
        tabCount = 0;
        for (int i = 0; i < inputText.length(); i++) {
            char ch = inputText.charAt(i);
            if (ch == ' ') {
                spaceCount++;
            } else if (ch == '\t') {
                tabCount++;
            }
        }

        // Count words (split by spaces, tabs, or newlines)
        String trimmed = inputText.trim();
        if (trimmed.isEmpty()) {
            wordCount = 0;
        } else {
            String[] words = trimmed.split("\\s+"); // split by space, tab, or newline
            wordCount = words.length;
        }

        // Collect unique characters
        StringBuilder uniqueBuilder = new StringBuilder();
        for (int i = 0; i < inputText.length(); i++) {
            char ch = inputText.charAt(i);
            if (uniqueBuilder.indexOf(String.valueOf(ch)) == -1) {
                uniqueBuilder.append(ch);
            }
        }
        uniqueCharText = uniqueBuilder.toString();
    }

    public int getTextLength() {
        return textLength;
    }

    public int getWordCount() {
        return wordCount;
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getTabCount() {
        return tabCount;
    }

    public int getSpaceCount() {
        return spaceCount;
    }

    public String getUniqueCharText() {
        return uniqueCharText;
    }

    @Override
    public String toString() {
        return "TextAnalyzer{" +
                "inputText='" + inputText + '\'' +
                ", textLength=" + textLength +
                ", wordCount=" + wordCount +
                ", lineCount=" + lineCount +
                ", tabCount=" + tabCount +
                ", spaceCount=" + spaceCount +
                ", uniqueCharText='" + uniqueCharText + '\'' +
                '}';
    }

    public static void main(String[] args) {
        TextAnalyzer textSample = new TextAnalyzer("hello@# there is anything special");
        textSample.analyze();
        System.out.println(textSample);
    }
}
