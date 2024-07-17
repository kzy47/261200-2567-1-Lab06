public class Duck extends Animal{
    
void clean(Animal cleanee){
    System.out.println(this.toString() + " is cleaning " + cleanee);
}


    @Override
        public void sound() {
            System.out.println("Uwack");
        } 
        public void fly(){
            System.out.println("I Belive I Can Fly");
        }       
        public void glide() {
            System.out.println("I Can Ron");
        }
        public void land() {
            System.out.println("I Can Land on ground");
        }
        public void pet() {
            System.out.println("You pet the duck.");
        }
    }