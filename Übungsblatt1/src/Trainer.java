import java.util.ArrayList;

//Attribute
public class Trainer {
  private String firstname;
  private String lastname;
  private Pokemon pokemon;
  private ArrayList<Pokemon> Beutel;

  // constructor
  public Trainer(String firstname, String lastname, ArrayList<Pokemon> beutel) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.Beutel = beutel;
  }

  // getter&setter Methods

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public Pokemon getPokemon() {
    return pokemon;
  }

  public void setPokemon(Pokemon pokemon) {
    this.pokemon = pokemon;
  }

  public ArrayList<Pokemon> getBeutel() {
    return Beutel;
  }

  public void setBeutel(ArrayList<Pokemon> beutel) {
    Beutel = beutel;
  }

  public void addPokemon(Pokemon object) // hinzufügen eines Pokemons
  {
    if (object.isBelongingToTrainer() == true) {
      System.out.println(
          "Dieses Pokemon gehört bereits einem Trainer,bitte wähle ein anderes Pokemon!");
    }
    else {
      this.Beutel.add(object);
      object.setBelongingToTrainer(true);
      object.setTrainerOfPokemon(this); // speichere den Pokemontrainer zu jedem
                                        // Pokemon
      System.out.println(this.getFirstname() + "." + object.getName()
          + " wurde erfolgreich deinem Beutel hinzugefügt!");
    }
  }

  public Pokemon getSpecificPokemon(String pokename) // Rückgabe eines
                                                     // bestimmten Pokemons
                                                     // eines Trainers
  {
    int ret = 0;
    for (int i = 0; i < this.Beutel.size(); ++i) {
      if (this.Beutel.get(i).getName() == pokename) {
        ret = i;
      }
    }
    System.out.println(this.Beutel.get(ret).getName()
        + " befindet sich in Pokeball Nummer:" + (ret));
    return this.Beutel.get(ret);
  }

  public void getAllPokemon() // Ausgabe aller Pokemon des aufrufenden Trainers
  {
    System.out.println(this.firstname
        + ".Die folgenden Pokemon befinden sich in deinem Besitz:");
    for (int i = 0; i < this.Beutel.size(); ++i) {
      System.out.println(this.Beutel.get(i).getName());
    }
  }

  public void getAllPoisonPokemon() // Ausgabe aller Pokemon vom Typ Gift des
                                    // aufrufenden Trainers
  {
    System.out.println(this.firstname
        + ".Die folgenden Gift-Pokemon befinden sich in deinem Besitz:");
    for (int i = 0; i < this.Beutel.size(); ++i) {
      if (this.Beutel.get(i).getType() == Type.Poison) {
        System.out.println(this.Beutel.get(i).getName());
      }
    }
  }

  // B2 Bestimmtes Pokemon aus Beutel entfernen
  public void removePokemon(Pokemon object) {
    this.Beutel.remove(
        object.getTrainerOfPokemon().getSpecificPokemon(object.getName()));
    object.setTrainerOfPokemon(null);
    object.setBelongingToTrainer(false);
    System.out.println(this.getFirstname() + "." + "Dein " + object.getName()
        + " wurde aus deinem Beutel entfernt!");
  }

  public static void main(String[] args) {

  }
}
