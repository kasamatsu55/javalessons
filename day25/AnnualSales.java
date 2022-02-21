package day25;
import java.util.*;
public class AnnualSales{
	final int MAX_DAYS = 31;
	int month;
	int[] sales;
	int totalSale;
	public AnnualSales(int month , int totalDays){
		this.month = month;
		this.sales = new int[totalDays];
		Random rand = new Random();
		for(int i = 0; i < this.sales.length; i++){
			this.sales[i] = rand.nextInt(41) + 10;
			this.totalSale += this.sales[i];
		}
	}
	public void showInfo(){
		System.out.printf("%2d:",this.month);
		for(int i = 0; i < MAX_DAYS; i++){
			if(i > this.sales.length-1){
				System.out.printf("%3s","*");
			}else{
				System.out.printf("%3s",this.sales[i]);
			}
		}
		System.out.printf("|%4d%n",this.totalSale);
	}
}
