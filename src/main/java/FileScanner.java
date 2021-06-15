import java.io.*;

public class FileScanner extends VinylTools {

    public FileScanner(){

    }

    public static void fileReader() throws NullPointerException, IOException{

        File file = selectedFile; //Everything below is just to read file
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] savedLines = new String[10];
            int lineCount = 0;
            try {

                while ((line = bufferedReader.readLine()) != null){//Line Reader
                    lineCount++;
                    for (int i = -1; i < lineCount; i++){
                        savedLines[lineCount] = line;
                    }
                }

                while ((line = bufferedReader.readLine()) != null) { //Reader
                    //Reading Line
                    lineCount++;

                    for (int i = 0; i <= lineCount; i++){
                        if (line == "[VinylToolsConfig]"){
                            } else if (line.substring(0,17) == "lastknowndirectory"){
                                for (int c = 22; c < line.length()-1; c++){
                                    if (line.charAt(c) == '*'){
                                        i++;
                                    }
                                }
                            } else if (line == "[ConfigEnd]"){
                                i = lineCount;
                            }

                    }
                }
            } catch (IOException g) {
                System.out.println(g.getMessage());
            }
        } catch (FileNotFoundException | NullPointerException r) {
            System.out.println(r.getMessage());
        }
    }
}
