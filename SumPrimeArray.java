
import java.util.Scanner;

public class DayONe {

public static int SumPrimeArray(int a[], int s) {
		int total = 0;
		for (int i = 0; i < s; i++) {
			total = total + x(a[i]);
		}

		return total;
	}


	public static int x(int y) {
		 if (y <= 1)
	            return 0;
		for (int i = 2; i < y; i++)
			if (y % i == 0)
				return 0;

		return y;

	}

	

	public static void main(String[] args) {

		int z;
		int flag = 0;

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter size:");
		z = obj.nextInt();
		if (z <= 0) {
			System.out.println("Invalid array size");
			System.exit(0);
		}
		int arr[] = new int[z];

		System.out.println("Enter elements:");
		for (int i = 0; i < z; i++) {
			arr[i] = obj.nextInt();
			if (arr[i] < 0) {
				flag = 1;
				System.out.println("Invalid Input:");
				System.exit(0);
			}

		}
		obj.close();
		if (flag != 1) {
			System.out.println("Output:" + SumPrimeArray(arr, z));

		}
	}
}
