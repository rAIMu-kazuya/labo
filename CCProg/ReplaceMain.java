import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.Charset;

public class ReplaceMain {
    public static void main(String[] args) {
        /* �e���v���[�g�t�@�C���̃��X�g���쐬 */
        String temp = "./TempList/" + args[0];
        TempFileList tempFileList = new TempFileList(temp);

        /* �C���[�W�t�@�C���̃��X�g���쐬 */
        ImageFileList imageFileList = new ImageFileList(temp);
        
        /* csv�̒��g�����郊�X�g���쐬 */
        List<String> listCsv = new ArrayList<>();

        for(int i = 0; i < tempFileList.getSize(); i++) {
            System.out.println(tempFileList.get(i));
        }
        for(int i = 0; i < imageFileList.getSize(); i++) {
            System.out.println(imageFileList.get(i));
        }

        try {
            /* csv�t�@�C���̓ǂݍ��� */
            readFile(listCsv, temp + "/Change.csv");
            /* csv�t�@�C����1�s�ڂ�z��keys�Ɋi�[ */
            String[] keys;
            keys = listCsv.get(0).split(",");
            /* ��������t�H���_�̍쐬 */
            String mainFolder = "./QAllList/" + keys[0];
            createNewFolder(mainFolder);
            
            for(int i = 0; i < listCsv.size() - 1; i++) {
                /* csv�t�@�C���̍s���ƂɃt�H���_�[�쐬 */
                String newFolder = mainFolder + "/" + listCsv.get(i + 1).split(",")[0];
                createNewFolder(newFolder);

                /* �摜�t�@�C��������ꍇ�͉摜�t�@�C���̒ǉ� */
                if(imageFileList != null) {
                    for(int j = 0; j < imageFileList.getSize(); j++) {
                        FileInputStream input = new FileInputStream(temp + "/" + imageFileList.get(j));
                        FileOutputStream output = new FileOutputStream(newFolder + "/" + imageFileList.get(j));
                        copyFile(input, output);
                    }
                }

                for(int j = 0; j < tempFileList.getSize(); j++) {
                    Path path = Paths.get(tempFileList.get(j));
                    /* �t�H���_�̒���java�t�@�C�����쐬 */
                    String newFile = newFolder + "/" + listCsv.get(i + 1).split(",")[j + 1] + ".java";
                    createNewFile(newFile);
                    String content = Files.readString(path, Charset.forName("MS932"));
                    /* csv�t�@�C����2�s�ڈȍ~��z��values�Ɋi�[ */
                    String[] values;
                    values = listCsv.get(i + 1).split(",");

                    for(int k = 0; k < keys.length; k++) {
                        /* �����̒u�� */
                        if(content.contains(keys[k])) {
                            content = content.replace(keys[k], values[k]);
                        }
                    }
                    /* �u����̕�������쐬�����t�@�C���Ɋi�[ */
                    FileWriter fw = new FileWriter(newFile);
                    fw.write(content);
                    fw.close();
                }
            }
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
    /* �t�H���_�쐬 */
    public static void createNewFolder(String pathName) {
        File newFolder = new File(pathName);
        if (newFolder.mkdir()) {
            System.out.println("make directory: " + pathName);
        }
    }
    /* �t�@�C���쐬 */
    public static void createNewFile(String pathName) throws IOException {
        File newFile = new File(pathName);
        if (newFile.createNewFile()) {
            System.out.println("make file: " + pathName);
        }
    }
    /* �t�@�C���ǂݍ��� */
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
    /* �t�@�C���̃R�s�[ */
    public static void copyFile(FileInputStream input, FileOutputStream output) {
        try{
            byte buf[] = new byte[256];
            int len;
            while ((len = input.read(buf)) != -1) {
                output.write(buf, 0, len);
            }
            output.flush();
            output.close();
            input.close();
            System.out.println("�R�s�[���������܂����B");
        } catch (IOException e) {
            System.out.println("�R�s�[�Ɏ��s���܂����B");
            e.printStackTrace();
        }
    }
}