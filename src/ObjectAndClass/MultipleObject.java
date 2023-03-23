package ObjectAndClass;

class MultipleObject {

    int length;
    int width;

    void insert(int l, int w){

        length = l;
        width = w;
    }

    void calculateArea(){

        System.out.println(length * width);
    }
}

class TestRectangle{

    public static void main(String[] args) {

        MultipleObject m1 = new MultipleObject(), m2 = new MultipleObject(); // Creating two objects

        m1.insert(11, 5);
        m2.insert(3, 15);

        m1.calculateArea();
        m2.calculateArea();
    }
}
