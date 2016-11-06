/**
 * Created by lirandakrasniqi on 06/11/2016.
 */
public class ObjectPosition {
        private int dx;
        private int dy;

        /**
         * Empty constructor
         */
        public ObjectPosition() {
            //Empty
        }


        public ObjectPosition (int x, int y){
            this.dx = x;
            this.dy = y;
        }


        protected void setDx(int dx) {
            this.dx = dx;
        }


        protected void setDy(int dy) {
            this.dy = dy;
        }


        protected int getDx() {
            return dx;
        }

        protected int getDy() {
            return dy;
        }

}
