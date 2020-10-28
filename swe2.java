public class Main {

    public static void main(String[] args) {
        System.out.println("The 45 sequence fibonacci");
        for(int i=0;i<45;i++){
		System.out.print(fibonnaci(i));
	}
    }

    public static int fibonnaci(int value) {
        if (value >=0 && value < 2) {
            return value;
        }
        else return fibonnaci(value -1) + fibonnaci(value-2);
    }

}


