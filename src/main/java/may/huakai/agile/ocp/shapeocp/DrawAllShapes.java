package may.huakai.agile.ocp.shapeocp;

/**
 * @author: huakaimay
 * @since: 2020-12-23
 */
public class DrawAllShapes {

    public void drawAllShapes(Shape list[], int n) {
        int i;
        for (i = 0; i < n; i++) {
            Shape s = list[i];
            s.draw();
        }

    }

}
