package homework.lesson27;

abstract class Bird extends Animal implements Speakable{
    
    private String name;

    public Bird(String name) {
        super(name);
        this.name = name;
    }
    
    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " Sings"); 
    }

   
    
    
    
    
    
    
    

}
