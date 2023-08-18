public class Principal {
    public static void main(String[] args) {
        Animal[] animais = new Animal[3];
        animais[0] = new Cachorro();
        animais[1] = new Gato();
        animais[2] = new Passaro();

        animais[0].falar(); 
        animais[1].falar();
        animais[2].falar();
    }
}
