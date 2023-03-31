package by.teachmeskills.lesson8;

public class Staff implements StaffMembers {
    private String position;

    public Staff() {
        this.position = "Unknown";
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void getStaffMemberPosition() {
        System.out.println("Unknown");
    }
}
