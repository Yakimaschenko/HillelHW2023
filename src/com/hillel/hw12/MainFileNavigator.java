package src.com.hillel.hw12;

import java.util.List;

public class MainFileNavigator {

    public static void main(String[] args) {

        FileNavigator navigator = new FileNavigator();

        FileData file1 = new FileData("file1.txt", 1024, "/path/to/file");
        FileData file2 = new FileData("file2.txt", 100, "/path/to/file");
        FileData file3 = new FileData("file3.txt", 1024, "/path/to/another");
        FileData file4 = new FileData("file4.txt", 2048, "/path/to/another");
        FileData file5 = new FileData("file5.txt", 512, "/path/to/another");

        navigator.add(file1);
        navigator.add(file2);
        navigator.add(file3);
        navigator.add(file4);
        navigator.add(file5);

        navigator.printCollection();
        System.out.println("-------------");

        List<FileData> files = navigator.find("/path/to/file");
        for (FileData file : files) {
            System.out.println("Name: " + file.getName() + ", Size: " + file.getSize() + " bytes");
        }

        List<FileData> filteredFiles = navigator.filterBySize(1000);
        for (FileData file : filteredFiles) {
            System.out.println("Name: " + file.getName() + ", Size: " + file.getSize() + " bytes");
        }

        navigator.remove("/path/to/file");
        navigator.printCollection();
        System.out.println("-------------");

        List<FileData> sortedFiles = navigator.sortBySize();
        for (FileData file : sortedFiles) {
            System.out.println("Name: " + file.getName() + ", Size: " + file.getSize() + " bytes");
        }

        FileData inconsistentFile = new FileData("file.txt", 512, "/another/path/");
        navigator.addWithConsistencyCheck(inconsistentFile);



    }
}
