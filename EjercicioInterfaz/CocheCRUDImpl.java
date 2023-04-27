package poo.EjercicioInterfaz;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("Utsed esta utilizando el metodo save");
    }

    @Override
    public void findAll() {
        System.out.println("Usted esta utilizando el metodo findAll");
    }

    @Override
    public void delete() {
        System.out.println("Usted esta utilizando el metodo delete");
    }
}
