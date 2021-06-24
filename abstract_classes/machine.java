package abstract_classes;

public abstract class machine {
 private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
public abstract void start();
public abstract void dostuff();
public abstract void shutdown();

public  void run() {
	start();
	dostuff();
	shutdown();
};

}
