import java.util.ArrayList;


public class Queue {

	private ArrayList<Object> list = new ArrayList<Object>();;

	
	public Object deque() {
		if(isEmpty()){
			return null;
		}
		return list.remove(0);
	}

	public boolean isEmpty() {
		return list.size() == 0;
	}

	public void enque(String string) {
		this.list.add(string);
	}

	public int size() {
		return list.size();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Queue other = (Queue) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		return true;
	}
	
	
	
	

}
