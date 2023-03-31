package by.teachmeskills.lesson8;

public class Director extends Staff {
    public Director() {
        setPosition("Director");
    }

    @Override
    public void getStaffMemberPosition() {
        System.out.println(getPosition());
    }
}
