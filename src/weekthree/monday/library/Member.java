package weekthree.monday.library;

import java.util.ArrayList;

public class Member {
    public int memberID;
    public String memberForename;
    public String memberSurname;
    public byte memberAge;
    ArrayList<Book> reservedBooks = new ArrayList<Book>();

    public Member(int memberID, String memberForename, String memberSurname, byte memberAge) {
        this.memberID = memberID;
        this.memberForename = memberForename;
        this.memberSurname = memberSurname;
        this.memberAge = memberAge;
    }
}
