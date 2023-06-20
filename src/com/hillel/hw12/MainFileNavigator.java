package src.com.hillel.hw12;

import java.util.List;

public class MainFileNavigator {

    public static void main(String[] args) {

        FileNavigator navigator = new FileNavigator();

        FileData file1 = new FileData("files.txt", 1024, "/path/to/file");
        FileData file2 = new FileData("firstApp.java", 2048, "/path/to/file");

        navigator.add(file1);
        navigator.add(file2);

        List<FileData> files = navigator.find("/path/to/file");
        for (FileData file : files) {
            System.out.println("Name: " + file.getName() + ", Size: " + file.getSize() + " bytes");
        }

        List<FileData> filteredFiles = navigator.filterBySize(1500);
        for (FileData file : filteredFiles) {
            System.out.println("Name: " + file.getName() + ", Size: " + file.getSize() + " bytes");
        }

        navigator.remove("/path/to/file");

        List<FileData> sortedFiles = navigator.sortBySize();
        for (FileData file : sortedFiles) {
            System.out.println("Name: " + file.getName() + ", Size: " + file.getSize() + " bytes");
        }

        FileData inconsistentFile = new FileData("file.txt", 512, "/another/path/");
        navigator.addWithConsistencyCheck(inconsistentFile);

    }
}
