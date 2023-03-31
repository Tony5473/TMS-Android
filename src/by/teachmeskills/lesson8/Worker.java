package by.teachmeskills.lesson8;

public class Worker extends Staff {
    public Worker() {
        setPosition("Worker");
    }

    @Override
    public void getStaffMemberPosition() {
        System.out.println(getPosition());
    }
}
