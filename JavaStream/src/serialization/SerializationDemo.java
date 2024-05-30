package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class SerializationDemo {
	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
        Dog d1= new Dog();
		FileOutputStream fos = new FileOutputStream( new File("‪abc.ser"));
		ObjectOutputStream objoutstream = new ObjectOutputStream(fos);
		objoutstream.writeObject(d1);
		
		FileInputStream fis = new FileInputStream( new File("‪abc.ser"));
		ObjectInputStream inputStream= new ObjectInputStream(fis);
		Dog d2=(Dog)inputStream.readObject();
		
		System.out.println(d2.a + "...."+d1.a);
		
	}

}
