package src.com.hillel.hw12;

import java.util.*;

public class FileNavigator {

    private Map<String, List<FileData>> fileMap;

    public FileNavigator() {
         fileMap = new HashMap<>();
    }

//2. Реалізувати метод add у класі FileNavigator
    public void add(FileData file) {
        String path =  file.getPath();
        List<FileData> fileList = fileMap.getOrDefault(path, new ArrayList<>());
        fileList.add(file);
        fileMap.put(path, fileList);
    }
//      public void add(FileData file) {
//        if(fileMap.containsKey(file.getPath())){
//            fileMap.put(file.getPath(), new ArrayList<>());
//        }
//        List<FileData> files = fileMap.get(file.getPath());
//    }

//3. Реалізувати метод find у класі FileNavigator.
    public List<FileData> find(String path) {
        return fileMap.getOrDefault(path, new ArrayList<>());
    }

//4. Реалізувати метод filterBySize у класі FileNavigator.
public List<FileData> filterBySize(long maxSize) {
    List<FileData> filteredList = new ArrayList<>();
    for (List<FileData> fileList : fileMap.values()) {
        for (FileData file : fileList) {
            if (file.getSize() <= maxSize) {
                filteredList.add(file);
            }
        }
    }
    return filteredList;
}

//5. Реалізувати метод remove у класі FileNavigator.
    public void remove(String path) {
        fileMap.remove(path);
    }

//6. * Реалізувати метод sortBySize у класі FileNavigator.
public List<FileData> sortBySize() {
    List<FileData> allFiles = new ArrayList<>();
    for (List<FileData> fileList : fileMap.values()) {
        allFiles.addAll(fileList);
    }
    allFiles.sort(Comparator.comparingLong(FileData::getSize));
    return allFiles;
}

//7. ** Реалізувати перевірку консистентності у методі add у класі FileNavigator. Не дозволяти додавати значення і повідомити про це в консолі,
// при спробі додати значення FileData значення шляху якого не відповідає шляху-ключу, що веде до списку файлів.
    public void addWithConsistencyCheck(FileData file) {
        String path = file.getPath();
        if (fileMap.containsKey(path)) {
            List<FileData> fileList = fileMap.get(path);
            if (!fileList.isEmpty()) {
                String existingPath = fileList.get(0).getPath();
                if (!existingPath.equals(path)) {
                    System.out.println("Error: К сожалению путь-ключ и путь к файлу не совпадают: " + path);
                    return;
                }
            }
        }
        add(file);
    }

    public void printCollection(){
//        fileMap.entrySet().iterator();
        for(String key :fileMap.keySet()){
            System.out.println(key + ":" +fileMap.get(key));
        }
    }


}
