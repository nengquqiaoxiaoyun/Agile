package cn.cnhoyun.agile.ocp;

/**
 * @author: huakaimay
 * @since: 2020-12-23
 */
public class DrawAllShapes {

    public void drawAllShapes(Shape list[], int n) {
        int i;
        for (i = 0; i < n; i++) {
            Shape s = list[i];
            switch (s.itsType) {
                case CIRCLE:
                    // drawCircle);
                    break;
                case SQUARE:
                    // drawSquare();
                    break;
                default:
                    break;
            }

        }

    }

}
