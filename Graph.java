
public class Graph {
	private char[][]graph;
	private int N;
	public Graph() {
		this.N = N;
		this.graph = new char[N][N];
	}
	public int getN() {
		return N;
	}
	public void set(char character, int vertex) {
		vertex = N;
		character = graph[0][0];
	}
	public String solve(int startNode, int secondNode, int thirdNode, int fourthNode, int endNode) {
		String result = " ";
		startNode = graph[0][0];
		secondNode = graph[0][1];
		thirdNode = graph[0][2];
		fourthNode = graph[0][3];
		endNode = graph[0][4];
		
		if(startNode == graph[0][0]) {
			char character = graph[0][1];
		}
		else {
			result = "unsolvable";
			return result;
		}
		if(secondNode == graph[0][1]) {
			char character = graph[0][2];
		}
		else {
			result = "unsolvable";
			return result;
		}
		if(thirdNode == graph[0][2]) {
			char character = graph[0][3];
		}
		else {
			result = "unsolvable";
			return result;
		}
		if(fourthNode == graph[0][3]) {
			char character = graph [0][4];
		}
		else {
			result = "unsolvable";
			return result;
		}
		if(endNode == graph[0][4]) {
			result = "solvable";
		}
		else {
			result = "unsolvable";
			return result;
		}
		return result;
	}
}
