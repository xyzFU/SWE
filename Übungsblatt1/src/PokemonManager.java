
//import java.sql.Date;
import java.util.ArrayList;
import java.util.Date;

public class PokemonManager {

  public static void main(final String[] args) {

    ArrayList<Pokemon> ashsBeutel = new ArrayList<Pokemon>();
    ArrayList<Pokemon> eichsBeutel = new ArrayList<Pokemon>();
    Trainer ash = new Trainer("ash", "Catchum", ashsBeutel);
    Trainer eich = new Trainer("Prof", "eich", eichsBeutel);

    Pokemon poke1 = new Pokemon("Glumanda", Type.Fire, false);
    Pokemon poke2 = new Pokemon("Bisasam", Type.Poison, true);
    Pokemon poke3 = new Pokemon("Shiggy", Type.Water, true);
    Pokemon poke4 = new Pokemon("Hornliu", Type.Poison, true);
    Pokemon poke5 = new Pokemon("Karpador", Type.Water, true);

    eich.addPokemon(poke1);
    eich.addPokemon(poke2);
    eich.addPokemon(poke3);
    eich.removePokemon(poke1);
    ash.addPokemon(poke1);
    ash.addPokemon(poke5);
    ash.getAllPokemon();
    ash.addPokemon(poke4);
    ash.getSpecificPokemon("Hornliu");
    ash.getAllPoisonPokemon();
    // Übungsblatt2
    Swap swap1 = new Swap(poke2, poke4);
    Swap swap2 = new Swap(poke1, poke3);
    Swap swap3 = new Swap(poke5, poke2);

    System.out.println(swap1.getID());
    System.out.println(swap1.getDate());
    System.out.println(swap1.getSwapInformation());

    ash.getAllPokemon();
    swap1.execute(poke2, poke4);
    swap2.execute(poke1, poke3);
    swap3.execute(poke5, poke2);
    ash.getAllPokemon();
    eich.getAllPokemon();

    System.out.println(poke5.getSwaps().indexOf(swap3));

    double a = java.lang.Math.random();

    System.out.println(a);

    Competition fight1 = new Competition(poke2, poke5);

    System.out.println(fight1.getID());
    System.out.println(fight1.getDate());
    System.out.println(fight1.getSwapInformation());

    fight1.execute(poke2, poke5);

    ash.getAllPokemon();
    eich.getAllPokemon();

    Date actDate1 = new Date();
    String datum = actDate1.toString();

    System.out.println(datum);
    // noch zu implementieren:
    // Zeitpunkt des Tausches soll gespeichert werden und nicht jedesmal die
    // aktuelle zeit ausgegeben werden!

  }

}
