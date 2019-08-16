package hallowelt;

/*
 * Das ist ein Test.
 */

class Listenelement{
	int index;
	String daten;
	Listenelement next=null;
	Listenelement previous=null;
	boolean first=true;
	boolean last=true;	
	static Listenelement last_one;
	static Listenelement first_one;

	void setDaten(String new_data){
	daten=new_data;
	index++;
	}
	
	void add (String new_data){
		if(next==null){
			next=new Listenelement();
			next.previous=new Listenelement();
			next.setDaten(new_data);
			next.index=index+1;
			next.previous=this;
			last=false;
			next.first=false;
			last_one=next;
		}
		else {next.add(new_data);
		}
	}
	
	public Listenelement get_end(){
		return last_one;
	}
	
	void display(){
		System.out.println(daten);
		if(next!=null)next.display();
	}
	void setHead(Listenelement element){
		first_one=element;
	}
	
	public Listenelement get_head(){
		return first_one;
	}
}

public class HalloWelt{
	public static void main(String[] args) {
		Listenelement anfang=new Listenelement();
		anfang.setDaten("first");
		anfang.setHead(anfang);
		anfang.add("second");
		anfang.add("third");
		anfang.add("fourth");
		
		System.out.println(anfang.daten);
		System.out.println(anfang.index);
		System.out.println(anfang.next.daten);
		System.out.println(anfang.next.index);
		System.out.println(anfang.last_one.daten);
		System.out.println(anfang.next.next.first_one.daten);
		}
	}
