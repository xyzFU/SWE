public class Competition extends Swap {

  public Competition(Pokemon p1, Pokemon p2) {
    super(p1, p2);
  }

  public void execute(Pokemon p1, Pokemon p2) {

    // Kampf gleicher Typen
    if (p1.getType() == p2.getType()) {
      if (p1.getTagesform() > p2.getTagesform()) {
        // p1 wins
        p2.getTrainerOfPokemon().removePokemon(p2);
        p1.getTrainerOfPokemon().addPokemon(p2);
      }
      else {
        p1.getTrainerOfPokemon().removePokemon(p1);
        p2.getTrainerOfPokemon().addPokemon(p1);
      }
      // Poison vs. Water
    }
    else if (p1.getType() == Type.Poison && p2.getType() == Type.Water) {
      if (p2.getTagesform() - p1.getTagesform() > 0.2) {
        // winner is p2-water
        p1.getTrainerOfPokemon().removePokemon(p1);
        p2.getTrainerOfPokemon().addPokemon(p1);

      }
      else {
        // winner is p1-poison
        p2.getTrainerOfPokemon().removePokemon(p2);
        p1.getTrainerOfPokemon().addPokemon(p2);
      }

      // Water vs. Poison
    }
    else if (p1.getType() == Type.Water && p2.getType() == Type.Poison) {

      if (p1.getTagesform() - p2.getTagesform() > 0.2) {
        // winner is p1-water
        p2.getTrainerOfPokemon().removePokemon(p2);
        p1.getTrainerOfPokemon().addPokemon(p2);
      }
      else {
        // winner is p2-poison
        p1.getTrainerOfPokemon().removePokemon(p1);
        p2.getTrainerOfPokemon().addPokemon(p1);

      }

    }
    // Poison vs. Fire
    else if (p1.getType() == Type.Poison && p2.getType() == Type.Fire) {

      if (p2.getTagesform() - p1.getTagesform() > 0.4) {
        // winner is p2-fire
        p1.getTrainerOfPokemon().removePokemon(p1);
        p2.getTrainerOfPokemon().addPokemon(p1);

      }
      else {
        // winner is p1-poison
        p2.getTrainerOfPokemon().removePokemon(p2);
        p1.getTrainerOfPokemon().addPokemon(p2);
      }

    }

    // Fire vs. Poison
    else if (p1.getType() == Type.Fire && p2.getType() == Type.Poison) {

      if (p1.getTagesform() - p2.getTagesform() > 0.4) {
        // winner is p1-fire
        p2.getTrainerOfPokemon().removePokemon(p2);
        p1.getTrainerOfPokemon().addPokemon(p2);

      }
      else {
        // winner is p2-poison
        p1.getTrainerOfPokemon().removePokemon(p1);
        p2.getTrainerOfPokemon().addPokemon(p1);
      }

    }

    // Water vs. Fire
    else if (p1.getType() == Type.Water && p2.getType() == Type.Fire) {

      if (p2.getTagesform() - p1.getTagesform() > 0.2) {
        // winner is p2-fire
        p1.getTrainerOfPokemon().removePokemon(p1);
        p2.getTrainerOfPokemon().addPokemon(p1);

      }
      else {
        // winner is p1-water
        p2.getTrainerOfPokemon().removePokemon(p2);
        p1.getTrainerOfPokemon().addPokemon(p2);
      }

    }

    // Fire vs. Water
    else if (p1.getType() == Type.Fire && p2.getType() == Type.Water) {

      if (p1.getTagesform() - p2.getTagesform() > 0.2) {
        // winner is p1-fire
        p2.getTrainerOfPokemon().removePokemon(p2);
        p1.getTrainerOfPokemon().addPokemon(p2);

      }
      else {
        // winner is p2-water
        p1.getTrainerOfPokemon().removePokemon(p1);
        p2.getTrainerOfPokemon().addPokemon(p1);
      }

    }

  }

  public static void main(String[] args) {

  }

}
