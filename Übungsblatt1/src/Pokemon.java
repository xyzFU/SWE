import java.util.ArrayList;
import java.util.List;

public class Pokemon {

  private String name;
  private Type type;
  private int number;
  private boolean belongingToTrainer;
  private Trainer trainerOfPokemon;
  private List<Swap> swaps;
  private boolean swapAllow;
  static int nextNumber = 1;
  private List<Competition> competitions;
  private double Tagesform;

  public Pokemon(String name, Type type, boolean swapAllow) {
    this.name = name;
    this.type = type;
    this.number = nextNumber;
    ++nextNumber;
    this.swapAllow = swapAllow;
    swaps = new ArrayList();
  }

  public String toString() {
    String output = this.name;
    System.out.println(this.name);
    System.out.println(this.type);
    System.out.println(this.number);
    return output;
  }
  // getter&setter Methods

  public String getName() {
    return name;
  }

  public void setName(String name) { // Die this Referenz enthält die Adresse
                                     // unter der man den reservierten
    // Speicherbereich des aktuellen Objektes findet.
    // Das Schlüsselwort this liefert eine Referenz auf den Speicherbereich, in
    // dem
    // ein Objekt gespeichert ist zurück.
    this.name = name;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public boolean isBelongingToTrainer() {
    return belongingToTrainer;
  }

  public void setBelongingToTrainer(boolean belongingToTrainer) {
    this.belongingToTrainer = belongingToTrainer;
  }

  public boolean isSwapAllow() {
    return swapAllow;
  }

  public void setSwapAllow(boolean swapAllow) {
    this.swapAllow = swapAllow;
  }

  // B2

  public List<Swap> getSwaps() {
    return swaps;
  }

  public void setSwaps(List<Swap> swaps) {
    this.swaps = swaps;
  }

  public void addSwaps(Swap swaps) {
    this.swaps.add(swaps);
  }

  public Trainer getTrainerOfPokemon() {
    return trainerOfPokemon;
  }

  public void setTrainerOfPokemon(Trainer trainerOfPokemon) {
    this.trainerOfPokemon = trainerOfPokemon;
  }

  public List<Competition> getCompetitions() {
    return competitions;
  }

  public void setCompetitions(List<Competition> competitions) {
    this.competitions = competitions;
  }

  public double getTagesform() {
    return Tagesform = java.lang.Math.random();
  }

}
