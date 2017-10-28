import java.util.Date;
import java.util.UUID;

public class Swap {
  private String ID;
  private Date date;
  private String swapInformation;

  // Constructor
  public Swap(Pokemon p1, Pokemon p2) {
    this.ID = UUID.randomUUID().toString();
    Date actDate = new Date();
    this.date = actDate;

    this.swapInformation = "Trainer1:" + p1.getTrainerOfPokemon().getFirstname()
        + "," + p1.getTrainerOfPokemon().getLastname() + " tauschte:"
        + p1.getName() + " gegen " + p2.getName() + " von Trainer2 :"
        + p2.getTrainerOfPokemon().getFirstname() + ","
        + p2.getTrainerOfPokemon().getLastname() + "\n" + "Zum Zeitpunkt :"
        + actDate.toString() + "\n" + "SwapID:" + this.getID();

  }

  // getter&setter
  public String getID() {
    return ID;
  }

  public void setID(String iD) {
    ID = iD;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getSwapInformation() {
    return swapInformation;
  }

  public void setSwapInformation(String swapInformation) {
    this.swapInformation = swapInformation;
  }

  public void execute(Pokemon p1, Pokemon p2) {
    if (p1.isSwapAllow() == false) {
      System.out.println("Abbruch des Tauschvorganges:" + p1.getName()
          + " ist nicht zum Tausch berechtigt! ");
    }

    else if (p2.isSwapAllow() == false) {
      System.out.println("Abbruch des Tauschvorganges:" + p2.getName()
          + " ist nicht zum Tausch berechtigt! ");
    }

    else if (p1.getType() == p2.getType()) {
      System.out.println(p1.getName() + " kann nicht mit " + p2.getName()
          + " getauscht werden, da beide vom Typ " + p1.getType() + " sind!");
    }

    else if (p1.getTrainerOfPokemon() == p2.getTrainerOfPokemon()) {

      System.out.println(
          "Abbruch des Tauschvorganges,da beide Pokemon im Besitz des gleichen Trainers sind");
    }

    else {
      Trainer temp1 = new Trainer(p1.getTrainerOfPokemon().getFirstname(),
          p1.getTrainerOfPokemon().getLastname(),
          p1.getTrainerOfPokemon().getBeutel()); // alten Trainer speichern
      p1.getTrainerOfPokemon().removePokemon(p1); // löschen von p1 aus dem
                                                  // Beutel des alten Besitzers
      p2.getTrainerOfPokemon().addPokemon(p1); // hinzufügen von p1 in des neuen
                                               // Trainer's Beutel

      p2.getTrainerOfPokemon().removePokemon(p2); // löschen von p1 aus dem
                                                  // Beutel des alten Besitzers
      temp1.addPokemon(p2);
      p1.addSwaps(this);
      p2.addSwaps(this);
    }

  }

}
