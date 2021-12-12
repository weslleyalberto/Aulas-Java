public class App {
    public static void main(String[] args)  {
        String[] vects = new String[]{"Marina","Jonas","Gabriel","Pedro"};

        for(int i =0; i < vects.length; i++){
            System.out.println(vects[i]);
        }
        for(String nome : vects){
            System.out.println(nome);
        }
    }
}
