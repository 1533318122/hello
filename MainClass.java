 interface Fruit {
	public void get();

}

 class Apple implements Fruit {

	@Override
	public void get() {
		System.out.println("获得苹果");

	}

}

class Banana implements Fruit {

	@Override
	public void get() {
		System.out.println("获得香蕉");

	}

}

 class FruitFactory {
	public static Fruit getFruit(String fruit) throws InstantiationException, IllegalAccessException {
		Fruit result = null;
		if (fruit.equalsIgnoreCase("apple")) {
			result = Apple.class.newInstance();
		} else if (fruit.equalsIgnoreCase("banana")) {
			result = Banana.class.newInstance();
		} else {
			System.out.println("找不到要实例化的类");
		}
		return result;
	}

}


public class MainClass {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Fruit fruit = FruitFactory.getFruit("apple");
		fruit.get();
		fruit = FruitFactory.getFruit("banana");
		fruit.get();

	}

}