
public class StateMachineRun {
	public static void main(String[] args) {
		StateNode q0 = new StateNode(false);
		StateNode q1 = new StateNode(false);
		StateNode q2 = new StateNode(true);
		StateNode q3 = new StateNode(false);
		StateNode q4 = new StateNode(false);
		
		q0.setPath(0, q1);
		q0.setPath(1, q2);
		q1.setPath(0, q1);
		q1.setPath(1, q1);
		q2.setPath(1, q3);
		q2.setPath(0, q4);
		q3.setPath(0, q3);
		q3.setPath(1, q2);
		q4.setPath(1, q4);
		q4.setPath(0, q2);
		
		for(int i = 1; i <= 100000; i++) {
			StateNode node = q0;
			String binary = Integer.toBinaryString(i);
			for(int j = 0; j < binary.length(); j++) {
				node = node.getPath(Character.getNumericValue(binary.charAt(j)));
			}
			if(node.isAccepted() && (i % 3 != 1)) {
				System.out.println("Contradiction at i = " + i + ". " + i + " % 3 = " + (i % 3));
			}
			/*
			System.out.print(i + " : " + binary + " : ");
			if(node.isAccepted()) {
				System.out.print("ACCEPTED STATE : ");
			} else {
				System.out.print("UNACCEPTED STATE : ");
			}
			System.out.println(i % 3);*/
		} 
		
		
	}
}
