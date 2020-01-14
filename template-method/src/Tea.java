public class Tea extends Drink {

    @Override
    protected void stir() {
        System.out.println("Mexendo o chá");
    }

    @Override
    protected void addSugar() {
    }

    @Override
    protected boolean putSugar() {
        return false;
    }

    @Override
    protected void addMaterial() {
        System.out.println("Adicionando chá");
    }

    @Override
    protected void addWater() {
        System.out.println("Adicionando água ao chá");
    }
}
