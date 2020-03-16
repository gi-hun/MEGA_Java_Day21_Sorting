/*
 * # 2Â÷¿ø¹è¿­[Á¤·Ä]
 * ¿µÈñ : °¨
 * ¿µÈñ : ±è¹ä
 * ¿µÈñ : »ç°ú
 * Ã¶¼ö : ±è¹ä
 * Ã¶¼ö : »ç°ú
 */
//11:56-12:31
//ÃÖ´ë°ª ÀÌ¿ëÇØ¼­ Á¤·ÄÇÏ´Â°ÍÃ³·³
package day_21;

public class ArrayEx48 {
	public static void main(String[] args) {
		int jangCount = 5;
		String[][] jang = {
			{"Ã¶¼ö", "±è¹ä"},
			{"¿µÈñ", "°¨"},
			{"Ã¶¼ö", "»ç°ú"},
			{"¿µÈñ", "»ç°ú"},
			{"¿µÈñ", "±è¹ä"}
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
