public class RunMovement implements Movement {

    @Override
    public void move(int distance) {
        int currentDistance = 0;

        while(currentDistance < distance){
            currentDistance++;

            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
            }

            System.out.println(String.format("Distancia percorrida de %sm", currentDistance));
        }
    }

}
