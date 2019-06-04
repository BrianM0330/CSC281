package week9;

import java.util.ArrayList;

public class Network {
	
	public class Member {
		private String name;
		private ArrayList<Member> friends;
		
		public Member(String n) {
			name = n;
			friends = new ArrayList<>();
		}
		
		public String toString() {
			return String.format("Name: %s", name);
		}
		
		// The inner class can see the instance variables
		// of the outer class
		public void leave() {
			// remove myself from members
			members.remove(this);
		}
		
		// Was the member created as part of the Network n?
		public boolean createdIn(Network n) {
			return Network.this == n;
		}
	}
	
	private ArrayList<Member> members;
	
	public Network() {
		members = new ArrayList<>();
	}
	
	public Member enroll(String n) {
		Member newMember = new Member(n);
		members.add(newMember);
		return newMember;
	}
}
