import java.util.*;
import java.io.*;

public class tempAAChange {
  public static void main(String[] args) {
    List<String> listCsv = new ArrayList<>();
    List<String> listBefore = new ArrayList<>();

    try {
      /* csvファイル読込 */
      readFile(listCsv, "./tempA.csv");

      /* テンプレのjavaファイル読込 */
      readFile(listBefore, "./tempAA.java");

      /* csvファイルの１行目を配列key[]に分割しながら格納 */
      String[] keys;
      keys = listCsv.get(0).split(",");

      /* 新規フォルダ "keys[0]" を作成 */
      createNewFolder("./" + keys[0] + "Question");

      /* PrintWriterのリストをつくって、各ファイルのwriterを格納する */
      List<PrintWriter> writers = new ArrayList<>();
      for (int i = 1; i < listCsv.size(); i++) {
        String pathName = "./" + keys[0] + "Question" + "/" + listCsv.get(i).split(",")[0] + ".java";
        createNewFile(pathName);
        FileWriter fw = new FileWriter(pathName);
        PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
        writers.add(pw);
      }

      /* 文字列が含まれているかどうか判別し、書き込む */
      for (String templateLine : listBefore) {
        boolean isContain = false;
        int[] keyIndex;
        for (int i = 0; i < keys.length; i++) {
          String key = keys[i];
          if (templateLine.contains(key)) {
            isContain = true;
            keyIndex = new int[i];
          }
        }
        if (isContain) {
          write(writers, templateLine, keyIndex, listCsv);
        } else {
          write(writers, templateLine);
        }
      }
      for (PrintWriter writer : writers) {
        writer.close();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * ファイルを読み込み、リストに一行ずつ格納します。
   *
   * @param list     格納先リスト
   * @param pathName 読み込むファイルのパス
   * @throws IOException 例外
   */
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

  /**
   * フォルダを作成します。
   *
   * @param pathName フォルダ名
   */
  public static void createNewFolder(String pathName) {
    File newFolder = new File(pathName);
    if (newFolder.mkdir()) {
      System.out.println("make directory: " + pathName);
    }
  }

  /**
   * ファイルを作成します。
   *
   * @param pathName ファイル名
   * @throws IOException 例外
   */
  public static void createNewFile(String pathName) throws IOException {
    File newFile = new File(pathName);
    if (newFile.createNewFile()) {
      System.out.println("make file: " + pathName);
    }
  }

  /**
   * 文字列更新をしないでそのまま書き込みます。
   *
   * @param writers writerのリスト
   * @param line    書き込む文字列
   */
  public static void write(List<PrintWriter> writers, String line) {
    for (PrintWriter writer : writers) {
      writer.println(line);
    }
  }

  /**
   * 指定の文字だけ書き換えて書き込みます。
   *
   * @param writers  writerのリスト
   * @param line     書き込む文字列
   * @param keyIndex 変更keyのインデックス
   * @param listCsv  csvのリスト
   */
  public static void write(List<PrintWriter> writers, String line, int[] keyIndex, List<String> listCsv) {
    for (int i = 1; i < listCsv.size(); i++) {
      PrintWriter writer = writers.get(i - 1);
      for (int j = 0; j < keyIndex.length; i++){
      line = line.replace(
        listCsv.get(0).split(",")[keyIndex[j]],
        listCsv.get(i).split(",")[keyIndex[j]]);
      }
      writer.println(line);
    }
  }
}