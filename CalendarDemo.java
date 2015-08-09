
public class CalendarDemo {
	public static void main(String[] args) {
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int date = Integer.parseInt(args[2]);
		int[] arr1 = {31,28,31,30,31,30,31,31,30,31,30,31};
		int[] arr2 = {31,29,31,30,31,30,31,31,30,31,30,31};
		String[] day = {"월","화","수","목","금","토","일"};
		int count;
		//Argument =>2012 12 30
		//1년 1월 1일은 월요일
		//총 날짜를 구해서 7로 나눈 나머지가 1이면 월요일
		//평년 =>365일 윤년 =>366일
		//윤년은 4의 배수 , 4의 배수 줃 100의 배수는 윤년이 아니다.그중 400의 배수는 윤년
		if(year%4 == 0){
			if(year%400 == 0){
				count = (year -1)*365 + year/4 - year/100 + year/400 + date;
				for(int i=0; i<month-1;i++){
					count += arr2[i];
					}
				}
			else if(year%100 ==0){
					count = (year -1)*365 + year/4 - year/100 + year/400 + date;
					for(int i=0; i<month-1;i++){
						count += arr1[i];
						}
					}
			else{
				count = (year -1)*365 + year/4 - year/100 + year/400 + date;
				for(int i=0; i<month-1;i++){
					count += arr2[i];
					}
			}
		}
		else{
			count = (year -1)*365 + year/4 - year/100 + year/400 + date;
			for(int i=0; i<month-1;i++){
				count += arr1[i];
			}
		}
		System.out.println(year+"년 "+month+"월"+date+"일은"+day[count%7-1]+"요일"+"입니다.");
	}
}