package final_project;

public class OrganizationLogger implements OrganizationObserver{
    @Override
    public void memberAdded(Student student) {
        System.out.println("Добавлен новый член: " + student.getName());
    }

    @Override
    public void memberRemoved(Student student) {
        System.out.println("Удален член: " + student.getName());
    }
}
