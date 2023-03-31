package by.teachmeskills.lesson8;

public class Accountant extends Staff {
    public Accountant() {
        setPosition("Accountant");
    }

    @Override
    public void getStaffMemberPosition() {
        System.out.println(getPosition());
    }
}
