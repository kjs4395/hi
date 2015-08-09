
public class CalendarDemo {
	public static void main(String[] args) {
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int date = Integer.parseInt(args[2]);
		int[] arr1 = {31,28,31,30,31,30,31,31,30,31,30,31};
		int[] arr2 = {31,29,31,30,31,30,31,31,30,31,30,31};
		String[] day = {"��","ȭ","��","��","��","��","��"};
		int count;
		//Argument =>2012 12 30
		//1�� 1�� 1���� ������
		//�� ��¥�� ���ؼ� 7�� ���� �������� 1�̸� ������
		//��� =>365�� ���� =>366��
		//������ 4�� ��� , 4�� ��� �� 100�� ����� ������ �ƴϴ�.���� 400�� ����� ����
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
		System.out.println(year+"�� "+month+"��"+date+"����"+day[count%7-1]+"����"+"�Դϴ�.");
	}
}