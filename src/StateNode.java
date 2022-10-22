import java.util.HashMap;

public class StateNode {

	private boolean accepted;
	private HashMap<Integer, StateNode> paths = new HashMap<Integer, StateNode>();
	
	public StateNode(boolean accepted) {
		this.accepted = accepted;
	}
	public void setPath(int x, StateNode node) {
		paths.put(x, node);
	}
	public StateNode getPath(int x) {
		return paths.get(x);
	}
	public boolean isAccepted() {
		return accepted;
	}
	
}
