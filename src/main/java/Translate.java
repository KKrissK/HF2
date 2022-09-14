public class Translate {
    String name;
    String lang;

    public Translate(String name, String lang) {
        this.name = name;
        this.lang = lang;

    }

    public static void forditas(String name, String lang){

        if(lang.equals("hun")) System.out.println("Szia "+name);
        else if(lang.equals("port")) System.out.println("Hola "+name);
        else if(lang.equals("cz")) System.out.println("Ahoj "+name);
        else System.out.println("Ismeretlen nyelv \n Szia "+name);

    }


}
