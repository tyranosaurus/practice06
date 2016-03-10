package prob7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put( "blue", 85 );
		map.put( "red", 96 );
		map.put( "black", 92 );

		String name = null;   // 최고 점수를 받은 아이디 저장
		int maxScore = 0;  // 최고 점수
		int totalScore = 0;   // 점수 합계


		/* 코드를 작성하세요 */
		
		int cnt = 0;
//		Set<String> set = map.keySet();
		Iterator<String> it = map.keySet().iterator();

		while(it.hasNext() == true)
		{
			String k1 = it.next();
			Integer val = map.get(k1);
			
			totalScore += val;
			
			if ( val > maxScore)
			{
				maxScore = val;
				name = k1;
			}
	
			cnt++;
		}
		
		System.out.println("평균점수: " + totalScore/cnt);
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고 점수를 받은 아이디 : " + name);
		
	}

}
