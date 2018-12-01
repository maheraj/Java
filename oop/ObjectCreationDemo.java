import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreationDemo {
    public static void main(String[] args) {

        //1. Using new keyword
        SampleObject object1 = new SampleObject();
        System.out.println("Using new keyword - object name: " + object1.name);


        //2. Using New Instance
        try {
            Class cls = Class.forName("SampleObject");
            SampleObject obj = (SampleObject) cls.newInstance();
            System.out.println("Using new instance - object name: " + obj.name);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        //3. Using clone method
        SampleObject obj1 = new SampleObject();
        try {
            SampleObject obj2 = (SampleObject) obj1.clone();
            System.out.println("Using clone() method - object name: " + obj2.name + " is equal? " + obj1.equals(obj2));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        // Using deserialization
        SampleObject obj3 = new SampleObject();
        try {
            FileOutputStream fos = new FileOutputStream("file.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj3);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SampleObject obj4;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("file.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj4 = (SampleObject) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Using deserialization - object name: " + obj4.name + " is equal? " + obj3.equals(obj4));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // new instance method of constructor - reflective way
        try {
            Constructor<SampleObject> constructor = SampleObject.class.getDeclaredConstructor();
            SampleObject obj5 = constructor.newInstance();
            System.out.println("Using reflection - object name: " + obj5.name);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}

class SampleObject implements Cloneable, Serializable {
    String name;

    public SampleObject() {
        this.name = "MaherajObj";
    }

    public SampleObject(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
