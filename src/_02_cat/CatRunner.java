package _02_cat;

public class CatRunner {
public static void main(String[] args) {
	Cat dave = new Cat("Ted");
	dave.meow();
	dave.printName();
	for(int i = 0; i<10; i++) {
	dave.kill();
}
}
}