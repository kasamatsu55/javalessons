package day25;
public class SalesApp{
	public static void main(String[] args){
		int[] perDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		AnnualSales[] sales = new AnnualSales[12];
		for(int i = 0; i < 12; i++){
			sales[i] = new AnnualSales(i+1 , perDays[i]);
		}
		for(AnnualSales s : sales){ //あとは表示するだけ
			s.showInfo();
		}
		System.out.println("売り上げ降順に並び替え");
		for(int i = 0; i < sales.length; i++){
			for(int j = i+1; j < sales.length; j++){
				if(sales[i].totalSale < sales[j].totalSale){
					AnnualSales temp = sales[i];
					sales[i] = sales[j];
					sales[j] = temp;
				}
			}
		}
		for(AnnualSales s : sales){
			s.showInfo();
		}
	}
}
