class Animal {

    void makeNoise(int x) throws Exception {
        if(x==1){
            throw new Exception();
        }
    }
}

public class excep {
    public static void main(String args[]){
        Animal a = new Animal();
        try {
            a.makeNoise(1);
        }

        catch(Exception e){
            System.out.print("Error has occured");
        }
    }
}