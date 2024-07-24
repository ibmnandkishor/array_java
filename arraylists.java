
// import java.util.HashMap;

// public class arraylists {
//   public static void main(String[] args) {

    
//     HashMap<String, Integer> people = new HashMap<String, Integer>();

   
//     people.put("John", 32);
//     people.put("Steve", 30);
//     people.put("Angie", 33);

//     for (String i : people.keySet()) {
//       System.out.println("Name: " + i + " Age: " + people.get(i));
//     }
//   }
// }


//////////////multiple array list//
// import java.util.ArrayList;

// public class arraylists {
//     public static void main(String[] args) {
        
//         ArrayList<Object> list = new ArrayList<>();
   
//         list.add(1);
//         list.add("two");
//         list.add(3);
//         list.add("four");
//         list.add(5);

//         for (Object element : list) {
//            System.out.println(element);
//         }
//     }
// }


///with class/////////

import java.util.ArrayList;
class Students{
	public String name;
	public int value;
	
	public Students(String name, int value) {
		this.name = name;
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	
@Override
public String toString(){
	return name + value;
}
}

public class arraylists{
    public static void main(String[] args){
        ArrayList<Students> list = new ArrayList<Students>();

        list.add(new Students("Nandkishor", 20));
        list.add(new Students("Arshad", 21));
        list.add(new Students("Neha", 22));
        list.add(new Students("Nikhil", 23));


        for (Students element : list) {
            System.out.println(element);
        }
    }
}