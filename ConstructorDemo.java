import java.lang.reflect.Class;

class Dog {
  private String breed;
  private int age;
  private double weight;

  public Dog(String breed, int age, double weight) {
    this.breed = breed;
    this.age = age;
    this.weight = weight;
  }

  public Dog clone() {
    return new Dog(this.breed, this.age, this.weight);
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
}

public class ObjectsCreationTypes {
  public static void main(String[] args) {
    Dog fido = new Dog("Labrador Retriever", 3, 70);

    Dog fidoCopy = fido.clone();

    System.out.println(fidoCopy.getBreed());

    // Class<?> dogClass = Class.forName("Dog");
    // Dog fido = (Dog) dogClass.newInstance();

    // fido.setBreed("Labrador Retriever");

    // System.out.println(fido.getBreed());
  }
}