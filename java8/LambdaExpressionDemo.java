import java.io.File;
import java.io.FileFilter;
public class LambdaExpressionDemo {
  public static void main(String[] args) {
    FileFilter javaFileFilter = (File file) -> file.getName().endsWith(".java");
    File dir = new File("/Users/maheraj/Documents/study/Contest/src");
    File[] files = dir.listFiles(javaFileFilter);
    
    for(File f : files) {
      System.out.println(f);
    }
  }
}
