/*
 * # 2�����迭[����]
 * ���� : ��
 * ���� : ���
 * ���� : ���
 * ö�� : ���
 * ö�� : ���
 */
//11:56-12:31
//�ִ밪 �̿��ؼ� �����ϴ°�ó��
package day_21;

public class ArrayEx48 {
	public static void main(String[] args) {
		int jangCount = 5;
		String[][] jang = {
			{"ö��", "���"},
			{"����", "��"},
			{"ö��", "���"},
			{"����", "���"},
			{"����", "���"}
		};
		
		for(int i=0; i<jang.length; i++) 
		{
			String max = jang[i][0];
			int maxIdx = i;
			
			for(int j=i; j<jang.length;j++)
			{
				if(max.compareTo(jang[j][0]) > 0)
				{
					max = jang[j][0];
					maxIdx = j;
				}
			}
			
			String[] temp = jang[i];
			jang[i] = jang[maxIdx];
			jang[maxIdx] = temp;
		}
		
		for(int i=0; i<jang.length; i++) 
		{
			String max = jang[i][1];
			int maxIdx = i;
			
			for(int j=i; j<jang.length;j++)
			{
				if(jang[i][0].equals(jang[j][0]))
				{
					if(max.compareTo(jang[j][1]) > 0)
					{
						max = jang[j][1];
						maxIdx = j;
					}
				}
			}
			
			String[] temp = jang[i];
			jang[i] = jang[maxIdx];
			jang[maxIdx] = temp;
		}
		
		for(int i=0; i<jang.length; i++) 
		{
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
	}
}
