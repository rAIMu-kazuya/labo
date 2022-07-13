import java.util.*;
import java.io.*;

public class tempAAChange{
  public static void main(String[] args) {
    List<String> listCsv = new ArrayList<>();
    List<String> listBefore = new ArrayList<>();

    BufferedReader brCsv = null;
    BufferedReader brBef;

    try {
      /* csvファイル読込 */
      File file = new File("./tempA.csv");
      FileInputStream input = new FileInputStream(file);
      InputStreamReader stream = new InputStreamReader(input);
      brCsv = new BufferedReader(stream);

      /* csvファイルをlistCsvに格納 */
      String line;
      while((line = brCsv.readLine()) != null){  //”1行読み込んで格納”を繰り返す
        listCsv.add(line);
      }

      /* テンプレのjavaファイル読込 */
      File fileBef = new File("./tempAA.java");
      FileInputStream inputBef = new FileInputStream(fileBef);
      InputStreamReader streamBef = new InputStreamReader(inputBef);
      brBef = new BufferedReader(streamBef);

      /* javaファイルをlistBeforeに格納 */
      String lineBef;
      while((lineBef = brBef.readLine()) != null){
        listBefore.add(lineBef);
      }

      /* csvファイルの１行目を配列key[]に分割しながら格納 */
      String[] key;
      key = listCsv.get(0).split(",");

      /* 新規フォルダ "key[0]" を作成 */
      File newfolder = new File("./" + key[0]);
      if (newfolder.mkdir()){
          System.out.println("make directory: ./" + key[0]);
      }

      for (int i = 1; i < listCsv.size(); i++) {
        File newFile = new File("./" + key[0] + "/" + listCsv.get(i).split(",")[0] + ".java");
        if (newFile.createNewFile()){
            System.out.println("make file: ./" + key[0] + "/" + listCsv.get(i).split(",")[0] + ".java");
        }
      }

      /* listBeforeをlistAfterにコピー */
      List<String> listAfter = new ArrayList<>(listBefore);

      List<List<String>> values = new ArrayList<>();

      /* value1行目から最終行まで繰り返し */
      for (int j = 1 ; j < listCsv.size(); j++) {
        String[] value;
        value = listCsv.get(j).split(",");   //value[]にcsvファイルのi行目を分割しながら格納

        /* テンプレファイルの1行目から最終行目まで繰り返し */
        for (int k = 0 ; k < listBefore.size(); k++) {
          listAfter.set(k,listBefore.get(k));
          String strBefore = listAfter.get(k);//setを使うことで、listAfterに入っているひとつ前の作問をリセット
                                              //addにすると1問目はできるけど2問目以降前回の問題が継続されてしまう

          /* key配列の数文繰り返す */
          for(int l = 0 ; l < key.length; l++){
            if (strBefore.contains(key[l])) {                   //もしkey[l]があったら
              listAfter.set(k,strBefore.replace(key[l], value[l])); //key[l]とvalue[l]を入れ替えてもう一度set
            }
          }
        }
        /* この時点でlistAfterに文字列置換後の新しい問題が完成 */

        /* 新規フォルダー ”key[0]” に新しいファイル "value[0].java" を作成 */
//        File newFile = new File("./" + key[0] + "/" + value[0] + ".java");
//        newFile.createNewFile();

        /* 新規ファイルに書き込む準備 */
        FileWriter fw = new FileWriter("./" + key[0] + "/" + value[0] + ".java");
        PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

        /* listAfterを新規ファイルに書き込み！ */
        for (String changedLine : listAfter) {
          pw.println(changedLine);
        }
        pw.close();
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        brCsv.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}