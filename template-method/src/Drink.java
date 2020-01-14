public abstract class Drink {

    public void prepare(){

        addWater();
        addMaterial();

        if(putSugar()){
            addSugar();
        }

        stir();
    }

    protected abstract void stir();

    protected abstract void addSugar();

    protected abstract boolean putSugar();

    protected abstract void addMaterial();

    protected abstract void addWater();
}
