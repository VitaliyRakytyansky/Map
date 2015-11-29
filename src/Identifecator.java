
public class Identifecator {

		String key;

		
		
		public Identifecator(String key) {
			super();
			this.key = key;
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}
		
		@Override
		public boolean equals(Object obj){
			if(!(obj instanceof Identifecator)) return false; 
			Identifecator st = (Identifecator) obj;
			if(this.getKey().equals(st.getKey())) return true;
			return false;
		}
		
		@Override
		public int hashCode(){
			return key.length();
		}
		
		@Override
		
		public String toString(){
			return key;
		}
}
