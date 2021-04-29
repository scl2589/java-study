package Chapter11.collection.treeset;

import java.util.TreeSet;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet manager = new MemberTreeSet();

        Member memberLee = new Member(300, "Lee");
        Member memberKim = new Member(100, "Kim");
        Member memberPark = new Member(200, "Park");


        manager.addMember(memberLee);
        manager.addMember(memberKim);
        manager.addMember(memberPark);

        manager.showAllMember();

    }
}
