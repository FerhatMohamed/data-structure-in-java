package DSAlgorithem;

public class SimpleAraay {
     public static void main(String [] args){
    	 //One Dimesion Array
    	 int[] number = new int[5];
    	 number[0] = 11;
    	 number[1] = 21;
    	 number[2] = 18;
    	 number[3] = 14;
    	 number[4] = 31;
    	 System.out.println("simple array");
    	 for(int i=0; i<number.length; i++)
    		 System.out.print(number[i] + "\t" );
    	 
    	 // Array of object
    	 System.out.println("\nobject array");
    	 Students[] stu = new Students[3];
    	 
    	 stu[0] = new Students("mohamed", 1);
    	 stu[1] = new Students("aissa", 2);
    	 stu[2] = new Students("hamza", 3);
    	 
    	 for (Students students : stu) {
			System.out.println(students.name + ":" + students.id);
		}
    	 
    	// Tow Dimension
    	 int[][] data = new  int[3][3];
    	 data[0][0] = 14;
    	 data[0][1] = 24;
    	 data[0][2] = 9;
    	 data[1][0] = 40;
    	 data[1][1] = 18;
    	 data[1][2] = 6;
    	 data[2][0] = 11;
    	 data[2][1] = 29;
    	 data[2][2] = 33;
    	 
    	 for(int i=0; i<3; i++){
    		 for(int j=0; j<3; j++)
    			 System.out.print(data[i][j] + "\t");
    		 System.out.println("\n");
    	 }
    	 
    	 
     }
}