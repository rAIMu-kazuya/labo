import java.util.*;
import java.io.*;

public class tempAChange {
  public static void main(String[] args) {
    List<String> listCsv = new ArrayList<>();
    List<String> listBefore = new ArrayList<>();

    try {
      /* csv�t�@�C���Ǎ� */
      readFile(listCsv, "./tempA.csv");

      /* �e���v����java�t�@�C���Ǎ� */
      readFile(listBefore, "./tempAA.java");

      /* csv�t�@�C���̂P�s�ڂ�z��key[]�ɕ������Ȃ���i�[ */
      String[] keys;
      keys = listCsv.get(0).split(",");

      /* �V�K�t�H���_ "keys[0]" ���쐬 */
      createNewFolder("./" + keys[0] + "Question");

      /* PrintWriter�̃��X�g�������āA�e�t�@�C����writer���i�[���� */
      List<PrintWriter> writers = new ArrayList<>();
      for (int i = 1; i < listCsv.size(); i++) {
        String pathName = "./" + keys[0] + "Question" + "/" + listCsv.get(i).split(",")[0] + ".java";
        createNewFile(pathName);
        FileWriter fw = new FileWriter(pathName);
        PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
        writers.add(pw);
      }

      /* �����񂪊܂܂�Ă��邩�ǂ������ʂ��A�������� */
      for (String templateLine : listBefore) {
        boolean isContain = false;
        List<Integer> keyIndexes = new ArrayList<>();
        for (int i = 0; i < keys.length; i++) {
          String key = keys[i];
          if (templateLine.contains(key)) {
            isContain = true;
            keyIndexes.add(i);
          }
        }
        if (isContain) {
          write(writers, templateLine, keyIndexes, listCsv);
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
   * �t�@�C����ǂݍ��݁A���X�g�Ɉ�s���i�[���܂��B
   *
   * @param list     �i�[�惊�X�g
   * @param pathName �ǂݍ��ރt�@�C���̃p�X
   * @throws IOException ��O
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
   * �t�H���_���쐬���܂��B
   *
   * @param pathName �t�H���_��
   */
  public static void createNewFolder(String pathName) {
    File newFolder = new File(pathName);
    if (newFolder.mkdir()) {
      System.out.println("make directory: " + pathName);
    }
  }

  /**
   * �t�@�C�����쐬���܂��B
   *
   * @param pathName �t�@�C����
   * @throws IOException ��O
   */
  public static void createNewFile(String pathName) throws IOException {
    File newFile = new File(pathName);
    if (newFile.createNewFile()) {
      System.out.println("make file: " + pathName);
    }
  }

  /**
   * ������X�V�����Ȃ��ł��̂܂܏������݂܂��B
   *
   * @param writers writer�̃��X�g
   * @param line    �������ޕ�����
   */
  public static void write(List<PrintWriter> writers, String line) {
    for (PrintWriter writer : writers) {
      writer.println(line);
    }
  }

  /**
   * �w��̕����������������ď������݂܂��B
   *
   * @param writers    writer�̃��X�g
   * @param line       �������ޕ�����
   * @param keyIndexes �ύXkey�̃C���f�b�N�X�̃��X�g
   * @param listCsv    csv�̃��X�g
   */
//  public static void write(List<PrintWriter> writers, String line, int[] keyIndex, List<String> listCsv) {
  public static void write(List<PrintWriter> writers, String line, List<Integer> keyIndexes, List<String> listCsv) {
    for (int i = 1; i < listCsv.size(); i++) {
      PrintWriter writer = writers.get(i - 1);
      String lineForWriting = line;
      for (int keyIndex : keyIndexes) {
        lineForWriting = lineForWriting.replace(
          listCsv.get(0).split(",")[keyIndex],
          listCsv.get(i).split(",")[keyIndex]
        );
      }
      writer.println(lineForWriting);
    }
  }
}