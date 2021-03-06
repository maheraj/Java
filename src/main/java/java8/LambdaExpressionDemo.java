import java.io.File;
import java.io.FileFilter;
public class LambdaExpressionDemo {
  public static void main(String[] args) {
    
    // File Filter
    FileFilter javaFileFilter = (File file) -> file.getName().endsWith(".java");
    File dir = new File("/Users/maheraj/Documents/study/Contest/src");
    File[] files = dir.listFiles(javaFileFilter);
    for(File f : files) {
      System.out.println(f);
    }
    
    // Runnable 
        Runnable runnable = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Hellow world from thread [" + Thread.currentThread().getName() + "]");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    
    // comparator string sorting
        Comparator<String> comp = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());
        List<String> list = Arrays.asList("***", "**", "*");
        Collections.sort(list, comp);
        list.forEach(x -> System.out.println(x));
    

  }
}
