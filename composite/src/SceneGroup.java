import java.util.ArrayList;
import java.util.List;

public class SceneGroup implements SceneObject {

    private final List<SceneObject> children = new ArrayList<>();

    public void add(SceneObject object){
        children.add(object);
    }

    public void remove(SceneObject object){
        children.remove(object);
    }

    @Override
    public void draw() {
        children.forEach(SceneObject::draw);
    }

}
