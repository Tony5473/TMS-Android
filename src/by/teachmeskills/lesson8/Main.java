package by.teachmeskills.lesson8;

public class Main {

    public static void main(String[] args) {
        Staff[] members = new Staff[]{
                new Accountant(),
                new Director(),
                new Worker()
        };
        for (Staff member : members) {
            System.out.println(member.getPosition());
        }
        Staff manager = new Manager();
        manager.getStaffMemberPosition();
    }
}
