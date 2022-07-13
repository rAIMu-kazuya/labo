import java.util.*;
import java.io.*;

public class tempAAChange{
  public static void main(String[] args) {
    List<String> listCsv = new ArrayList<String>();
    List<String> listBefore = new ArrayList<String>();
    List<String> listAfter = new ArrayList<String>();
    
    BufferedReader brCsv = null;
    BufferedReader brBef = null;

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

      /* listBeforeをlistAfterにコピー */
      for (int i = 0 ; i < listBefore.size(); i++) {
        listAfter.add(listBefore.get(i));
      }

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
            if (-1 < strBefore.indexOf(key[l])) {                   //もしkey[l]があったら
              listAfter.set(k,strBefore.replace(key[l], value[l])); //key[l]とvalue[l]を入れ替えてもう一度set 
            } 
          }
        }
        /* この時点でlistAfterに文字列置換後の新しい問題が完成 */

        /* 新規フォルダ "key[0]" を作成 */
        File newfolder = new File("./" + key[0] );
        newfolder.mkdir();

        /* 新規フォルダー ”key[0]” に新しいファイル "value[0].java" を作成 */
        File newFile = new File("./" + key[0] + "/" + value[0] + ".java");
        newFile.createNewFile();

        /* 新規ファイルに書き込む準備 */
        FileWriter fw = new FileWriter("./" + key[0] + "/" + value[0] + ".java");
        PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
            
        /* listAfterを新規ファイルに書き込み！ */
        for (int m = 0 ; m < listAfter.size(); m++) {
          String changedLine = listAfter.get(m);
          pw.println(changedLine);
        }
        pw.close();
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        brCsv.close();
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  }
}