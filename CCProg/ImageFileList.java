import java.util.*;
import java.io.*;

public class ImageFileList {
    private List<String> imageFileList = new ArrayList<>();

    public ImageFileList(String name) {
        File file = new File(name);
        File[] list = file.listFiles();
        for(int i = 0; i < list.length; i++) {
            if(list[i].getName().contains(".png")) {
                this.imageFileList.add(list[i].getName());
            } else if(list[i].getName().contains(".jpg")) {
                this.imageFileList.add(list[i].getName());
            } else if(list[i].getName().contains(".jpeg")) {
                this.imageFileList.add(list[i].getName());
            } else if(list[i].getName().contains(".gif")) {
                this.imageFileList.add(list[i].getName());
            }
        }
    }
    public int getSize() {
        return this.imageFileList.size();
    }
    public String get(int i) {
        return this.imageFileList.get(i);
    }
}
