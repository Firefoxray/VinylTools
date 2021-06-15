
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.IOException;

public class FileHandler extends VinylTools {


    public static void fileHandler() throws IOException{
        File selectedFile = chooser.getSelectedFile();
        String selectedFileName = selectedFile.getName();
        String fileExtension = FilenameUtils.getExtension(selectedFileName);
        System.out.println(fileExtension);
        if(fileExtension == "txt"){
            FileScanner.fileReader();
        } else {

        }
    }
}
