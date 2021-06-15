
import java.io.File;
import java.io.IOException;

public class ConfigLoad extends VinylTools {

    public static void configLoad(File config){
        int frameNumber = 1;
        String configFound;
        String configPath = config.getPath();
        selectedFile = config;

        if (config.canRead()) {
            configFound = "YES";
            try{
                FileHandler.fileHandler();
            } catch (IOException g){

            }
        } else {
            configFound = "NO";
            configPath = "NULL";
        }
        System.out.println(configFound);
    }


}
