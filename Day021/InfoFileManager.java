package fileInfo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class InfoFileManager implements Serializable{

    private HashMap<Integer, Info> infos;
    private File infoFile;
    private FileInputStream fis;
    private FileOutputStream fos;
    private ObjectInputStream ois;
    private ObjectOutputStream oos;
    public static final int ERROR = -1;

    // construct with fileName
    public InfoFileManager(String fileName) {
        infoFile = new File(fileName);
    }

    public File getInfoFile() {
    	return infoFile;
    }
    
    public void setInfoFile(File infoFile) {
    	this.infoFile = infoFile;
    }
    
    // make info to file
    public void makeFile(HashMap<Integer, Info> infos) {
        try {
        	oos = new ObjectOutputStream(new FileOutputStream(infoFile));
        	oos.writeObject(infos);
        	oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
	// read file
    public void readFile(File infoFile) {
    	try {
			ois = new ObjectInputStream(new FileInputStream(infoFile));
			HashMap<Integer, Info> fileData = new HashMap<>();
			while (true) {
				fileData = (HashMap<Integer, Info>)ois.readObject();
				if (fileData == null) {
					break;
				}
				for (Map.Entry<Integer, Info> entry : fileData.entrySet()) {
					Integer id = entry.getKey();
					Info info = entry.getValue();
					System.out.println("[ID] : " + id + "\t[NAME] : " + info.getName() + "\t[AGE] : " + info.getAge());
				}
			}
			ois.close();
    	} catch (EOFException e) {
    		//e.printStackTrace();
		} catch (IOException e) {
			//e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    }


}