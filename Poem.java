package application;

public class Poem {

	private int count;
	private String word;
	private int max;

	public Poem() {
		this.count = 0;
		this.word = "";
		this.max = 0;
	}

	public Poem(int count, String word, int max) {
		this.count = count;
		this.word = word;
		this.max = max;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

}

