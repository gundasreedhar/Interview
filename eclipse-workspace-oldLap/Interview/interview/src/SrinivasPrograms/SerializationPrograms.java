import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerializationPrograms implements Serializable {
	private Tree tree = new Tree();

	public static void main(String[] args) {
		SerializationPrograms ser = new SerializationPrograms();
		try {
			FileOutputStream fs = new FileOutputStream("Serialize_Programs");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(ser);
			os.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	// out flow: java.io.NotSerializableException: com.test.Tree
}

class Tree {

}

class A implements Serializable {
	private final B field = new B();
}

class B implements Serializable {
	private final A field = new A();
}

class SerializationProg {
	public static void main(String[] args) {
		A obj = new A();
	}

	// output : stack over flow
}