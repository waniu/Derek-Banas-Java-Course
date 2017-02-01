import javax.swing.*;

//Input output library
import java.io.*;

public class Lesson31 extends JFrame{

	static String filePath, parentDirectory;
	
	//Create file in memory
	static File randomDir, randomFile, randomFile2;
	
	public static void main(String[] args) {
		
		//Define new directory
		randomDir = new File("E:/IT/Java/Projekty/Derek Banas/files31");
		
		//Create directory
		randomDir.mkdir();
		
		//Define new file
		randomFile = new File("random.txt");
		
		//Define new file with directory
		randomFile2 = new File("E:/IT/Java/Projekty/Derek Banas/files31/random2.txt");
		
		try{
			
			//Create file on the hard drive 
			randomFile.createNewFile();
			
			randomFile2.createNewFile();
			
			filePath = randomFile.getCanonicalPath();			
			
		}
		
		catch(IOException e){
			
			e.printStackTrace();
		}
		
		if(randomFile.exists()){
			
			System.out.println("File Exists");
			
			System.out.println("File Readable " + randomFile.canRead());
			
			System.out.println("File Writeable " + randomFile.canWrite());
			
			System.out.println("File Location " + filePath);
			
			System.out.println("File Name " + randomFile.getName());
			
			//I this example it's return null because I didn't define directory
			System.out.println("Parent Directory " + randomFile.getParent());
			
			parentDirectory = randomFile2.getParent();
			
			System.out.println("File 2 Parent " + parentDirectory);
			
			System.out.println("Is it a Directory: " + randomDir.isDirectory());
			
			//Return list of all files in this directory
			String[] filesInDir = randomDir.list();
			
			System.out.println("Files in Directory\n");
			
			for(String filesName : filesInDir)
			{
				System.out.println(filesName + "\n");
			}
			
			//Check something is a file
			System.out.println("Is a file: " + randomFile.isFile());
			
			System.out.println("Is hidden: " + randomFile.isHidden());
			
			System.out.println("Last modification: " + randomFile.lastModified());
			
			System.out.println("File size: " + randomFile.length());
			
			//How to rename a file
			randomFile2.renameTo(new File("E:/IT/Java/Projekty/Derek Banas/files31/renamedRandom2.txt"));
			
			new Lesson31();
			
		} else{
			
			System.out.println("File doesn't exist!");
		}
		
		if(randomFile.delete()){
			System.out.println("File Deleted");
		}
		
		File[] filesInDir = randomDir.listFiles();
		
		for(File fileName : filesInDir){
			
			fileName.delete();
		}
		
		if(randomDir.delete()){
			System.out.println("Directory Deleted");
		}
		
	}//End of main
	
	public Lesson31(){
		
		JFileChooser fileChooser = new JFileChooser(randomDir);
		
		fileChooser.showOpenDialog(this);
		
	}//End of Lesson31()
		
}//End of Lesson31 class















