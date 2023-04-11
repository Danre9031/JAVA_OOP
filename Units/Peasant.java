

public class Peasant extends BaseHero {

    public Peasant(String name, int x, int y) {
        super(250, 255, 0, 0, 20, name, x, y);
    }


    @Override
    public String getName() {
        return "Peasant";
    }

}
