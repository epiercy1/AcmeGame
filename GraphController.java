import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class GraphController {
	public static void main(String[]args)
	{
		GraphController controller = new GraphController();
		controller.go();
	}
	private List <Integer>nodes = new ArrayList<Integer>();
	
	public void go() {
		JFileChooser chooser = new JFileChooser();
		int returnVal = chooser.showOpenDialog(null);
		
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			File file = chooser.getSelectedFile();
			
			Scanner input = null;
			try {
				Scanner input2 = new Scanner(file);
			}catch(FileNotFoundException e) {
				
				System.out.println("Could not find the file " + file.getName());
				return;
			}
			Graph graph = readGraphFromFile();
			for(int i = 0; i < nodes.size(); i += 4) {
				int startNode = nodes.get(i);
				int secondNode = nodes.get(i + 1);
				int thirdNode = nodes.get(i + 2);
				int fourthNode = nodes.get(i + 3);
				int endNode = nodes.get(i + 4);
				String result = graph.solve(startNode, secondNode, thirdNode, fourthNode, endNode);
				System.out.println(result);
			}
			
			public Graph readGraphFromFile() {
				File file = getGraphFileFromUser();
				Scanner graphFile = null;
				try {
					graphFile = new Scanner(file);
				} catch (FileNotFoundException e) {
					
					e.printStackTrace();
				}
				return graphFile;
		}
			public File getGraphFileFromUser() {
				JFileChooser chooser = new JFileChooser();
				
				int returnVal = chooser.showOpenDialog(null);
				
				if(returnVal == JFileChooser.APPROVE_OPTION) {
					File file = chooser.getSelectedFile();
					
					Scanner input = null;
					try {
						Scanner input2 = new Scanner(file);
					}catch(FileNotFoundException e) {
						
						System.out.println("Could not find the file " + file.getName());
						return null;
					}
			}
				return null;
	}
	}


