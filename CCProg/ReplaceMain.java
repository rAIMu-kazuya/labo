import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.Charset;

public class ReplaceMain {
    public static void main(String[] args) {
        /* テンプレートファイルのリストを作成 */
        //TempFileList tempFileList = new TempFileList();
        TempFileList tempFileList = new TempFileList("./TempList/" + args[0]);
        
        /*tempFileList.add("./Temp/TempAA.java");
        tempFileList.add("./Temp/TempBA.java");
        tempFileList.add("./Temp/TempCA.java");*/
        
        /* csvの中身を入れるリストを作成 */
        List<String> listCsv = new ArrayList<>();
        for(int i = 0; i < tempFileList.getSize(); i++) {
            System.out.println(tempFileList.get(i));
        }

        try {
            /* csvファイルの読み込み */
            readFile(listCsv, "./TempList/" + args[0] + "/Change.csv");
            /* csvファイルの1行目を配列keysに格納 */
            String[] keys;
            keys = listCsv.get(0).split(",");
            /* 問題を入れるフォルダの作成 */
            String mainFolder = "./QAllList/" + keys[0];
            createNewFolder(mainFolder);
            
            for(int i = 0; i < listCsv.size() - 1; i++) {
                /* csvファイルの行ごとにフォルダー作成 */
                String newFolder = mainFolder + "/" + listCsv.get(i + 1).split(",")[0];
                createNewFolder(newFolder);

                for(int j = 0; j < tempFileList.getSize(); j++) {
                    Path path = Paths.get(tempFileList.get(j));
                    System.out.println(tempFileList.get(j));
                    /* フォルダの中にjavaファイルを作成 */
                    String newFile = newFolder + "/" + listCsv.get(i + 1).split(",")[j + 1] + ".java";
                    createNewFile(newFile);
                    String content = Files.readString(path, Charset.forName("MS932"));
                    /* csvファイルの2行目以降を配列valuesに格納 */
                    String[] values;
                    values = listCsv.get(i + 1).split(",");

                    for(int k = 0; k < keys.length; k++) {
                        /* 文字の置換 */
                        if(content.contains(keys[k])) {
                            content = content.replace(keys[k], values[k]);
                        }
                    }
                    /* 置換後の文字列を作成したファイルに格納 */
                    FileWriter fw = new FileWriter(newFile);
                    fw.write(content);
                    fw.close();
                }
            }
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
    /* フォルダ作成 */
    public static void createNewFolder(String pathName) {
        File newFolder = new File(pathName);
        if (newFolder.mkdir()) {
            System.out.println("make directory: " + pathName);
        }
    }
    /* ファイル作成 */
    public static void createNewFile(String pathName) throws IOException {
        File newFile = new File(pathName);
        if (newFile.createNewFile()) {
            System.out.println("make file: " + pathName);
        }
    }
    /* ファイル読み込み */
    public static void readFile(List<String> list, String pathName) throws IOException {
        BufferedReader bufferedReader;
        File file = new File(pathName);
        FileInputStream input;
        input = new FileInputStream(file);
        InputStreamReader stream = new InputStreamReader(input);
        bufferedReader = new BufferedReader(stream);
    
        String line;
        while ((line = bufferedReader.readLine()) != null) {
          list.add(line);
        }
        bufferedReader.close();
    }
}