public class Main {
    public static void main(String[] args) {
        Duck psyduck = new Duck();
            psyduck.sound();
            psyduck.fly();
            psyduck.glide();
            psyduck.land();
            

        Owl ooreOwl = new Owl();
            ooreOwl.sound();
            ooreOwl.fly();
            ooreOwl.glide();
            ooreOwl.land();
            
            psyduck.clean(ooreOwl);
            
        Cow wowCow = new Cow();
            wowCow.sound();
            wowCow.pet();
            

        Pig munPig = new Pig();
            munPig.sound();
            munPig.pet();

        Fly wiFly = new Fly();
            wiFly.sound();
            wiFly.fly();
            wiFly.glide();
            wiFly.land();

            PekingDuck dish = new PekingDuck();
            dish.sound();
            dish.fly();
            dish.glide();
            dish.land();
            dish.beCrispy();
            dish.clean(psyduck);


    }
}
