public class PekingDuck extends Duck{
    void beCrispy(){
        System.out.println("Krob");
    }

    @Override
        void clean(Animal cleanee){  //polymorph
            System.out.println("I Die Already, Sorry.");
        }
}
