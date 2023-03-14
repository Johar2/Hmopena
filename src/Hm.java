public class Hm {
        public static Hero[] createHeroes() {
            Hero superman = new Hero(100,30,"Flight");
            Hero batman = new Hero(100,25,null);
            Hero flash = new Hero(100,20,"Speed");
            Hero[] heroesArray = new Hero[] {superman, batman, flash};
            return heroesArray;



        }
    public static void main(String[] args) {
        Hero[] heroesArray = createHeroes();
        for (Hero hero : heroesArray) {
            System.out.println(hero.toString());
        }
    }
    }
