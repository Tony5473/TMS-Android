package by.teachmeskills.lesson8;

public class Manager extends Staff {
    public Manager() {
        setPosition("Manager");
    }

    @Override
    public void getStaffMemberPosition() {
        System.out.println(getPosition());
    }
}
