package weekfour.daythree;

public class NormalClass  {

    Human hObjone = new Human() {
        @Override
        public void say() {
            System.out.println("I am James");
        }
    };

   Human hObjTwo = new Human() {
        @Override
        public void say() {
            System.out.println("i am Tony");
        }
    };
}
