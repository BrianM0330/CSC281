package week9;

public class UseNetwork {

	public static void main(String[] args) {
		Network myNet = new Network();
		Network.Member dawn = myNet.enroll("Dawn");
		
		System.out.println(dawn + " created in myNet: " + dawn.createdIn(myNet));
		// The dawn object knows which Network object encloses it
		dawn.leave();
		
		Network secondNet = new Network();
		Network.Member trudy = secondNet.enroll("Gertrude");
		
		System.out.println(trudy + " created in myNet: " + trudy.createdIn(myNet));
	}
}
