package hw6Q2Inheritance;

public class TestAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Bird birds = new Bird();
		BullDog bulldog = new BullDog();
		Cobra cobra = new Cobra();
		Dog dog = new Dog();
		Mammal mammal = new Mammal();
		Reptile reptile = new Reptile();
		Robin robin = new Robin();
		Snake snake = new Snake();
//hierarchy level inheritance
		animal.animalInfo();
		birds.birdsInfo();
		cobra.cobrainfo();
		dog.dogInfo();
		mammal.mammalInfo();
		reptile.reptileInfo();
		robin.robinInfo();
		snake.snakeinfo();
//Single inheritance
		birds.animalInfo();
		bulldog.dogInfo();
		bulldog.mammalInfo();
//multilevel inheritance
		cobra.animalInfo();
		cobra.snakeinfo();
		cobra.reptileInfo();
		dog.animalInfo();
		dog.mammalInfo();
		mammal.animalInfo();
		reptile.animalInfo();
		robin.birdsInfo();
		robin.animalInfo();
		snake.animalInfo();
		snake.reptileInfo();

	}

}
