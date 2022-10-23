import java.util.*;
import java.io.*;

public class TempFileList {
    private List<String> tempFileList = new ArrayList<>();
    String name;
    public TempFileList(String name) {
        File file = new File(name);
        File[] list = file.listFiles();
        for(int i = 0; i < list.length; i++) {
            if(list[i].getName().contains("Temp")) {
                this.tempFileList.add(name + "/" + list[i].getName());
            } else {
                this.name = name;
            }
        }
    }
    /*public String getName() {
        return this.name;
    }*/
    public int getSize() {
        return this.tempFileList.size();
    }
    public String get(int i) {
        return this.tempFileList.get(i);
    }
}
