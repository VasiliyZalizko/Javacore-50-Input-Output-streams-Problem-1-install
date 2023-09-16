import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {


        File oneDir = new File ("C://Games//src//main");
        if (oneDir.mkdirs()) {
            System.out.println("Directory oneDir is created");
        }
        File oneFile = new File (oneDir + "//Main.java");
        try {
            if (oneFile.createNewFile())
                System.out.println("File oneFile is created");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        File twoFile = new File (oneDir + "//Utils.java");
        try {
            if (twoFile.createNewFile())
                System.out.println("File twoFile is created");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        File twoDir = new File ("C://Games//src//test");
        if (twoDir.mkdirs()) {
            System.out.println("Directory twoDir is created");
        }
        File threeDir = new File ("C://Games//res//drawables");
        if (threeDir.mkdirs()) {
            System.out.println("Directory threeDir is created");
        }
        File fourDir = new File ("C://Games//res//vectors");
        if (fourDir.mkdirs()) {
            System.out.println("Directory fourDir is created");
        }
        File fiveDir = new File ("C://Games//res//icons");
        if (fiveDir.mkdirs()) {
            System.out.println("Directory fiveDir is created");
        }
        File sixDir = new File ("C://Games//savegames");
        if (sixDir.mkdir()) {
            System.out.println("Directory sixDir is created");
        }
        File sevenDir = new File ("C://Games//temp");
        if (sevenDir.mkdirs()) {
            System.out.println("Directory sevenDir is created");
        }
        File threeFile = new File (sevenDir + "//temp.txt");
        try {
            if (threeFile.createNewFile())
                System.out.println("File threeFile is created");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileWriter writer = new FileWriter("C://Games//temp//temp.txt", false)) {
            String oneFile1 = "Directory Main.java is created";
            writer.write(oneFile1);
            writer.append('\n');
            String twoFile1 = "Directory Utils.java is created";
            writer.write(twoFile1);
            writer.append('\n');
            String threeFile1 = "Directory temp.txt is created";
            writer.write(threeFile1);
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
