public class Juice extends Drink {

    @Override
    protected void stir() {
        System.out.println("Mexendo o suco");
    }

    @Override
    protected void addSugar() {
        System.out.println("Adicionando açúcar ao suco");
    }

    @Override
    protected boolean putSugar() {
        return true;
    }

    @Override
    protected void addMaterial() {
        System.out.println("Adicionando suco");
    }

    @Override
    protected void addWater() {
        System.out.println("Adicionando água ao suco");
    }
}
