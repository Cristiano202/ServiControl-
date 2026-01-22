import Model.Cliente;

public class Main{
    public static void main(String[] args){

        try {
            Cliente c1 =new Cliente(10000,"cris","email@",10);
            System.out.println(c1.toString());
            System.out.println("Cliente cadastrado");
        }catch (IllegalArgumentException e ){
            System.out.println("Erro ao criar cliente "+ e.getMessage());

        }


    }
}