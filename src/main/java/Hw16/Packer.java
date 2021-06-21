package Hw16;

public class Packer {

    public static void main(String[] args) {
        Packer packer = new Packer();
        Box<Food> foodBox = new Box<>();
        Box<Cake> cakeBox = new Box<>();
        cakeBox.put(new Cake());
        foodBox.put(new Food());
        System.out.println(foodBox.get().toString());

        packer.repackage( foodBox,cakeBox);
        System.out.println(foodBox.get().toString());

        Box<String> stringBox = new Box<>();
        stringBox.put("Some string");
      //  packer.repackage( stringBox,foodBox); // ошибка компеляции
    }

    public <T> void repackage(Box<? super T> to, Box< ? extends T> from) {
        repackageAdd(to , repackageGet(from));
    }


    private <T> void repackageAdd(Box<T> box, T item) {
        box.put(item);
    }

    private <T> T repackageGet(Box<T> box) {
        return box.get();
    }


}

