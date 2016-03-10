package prob6;

import java.util.ArrayList;
import java.util.List;

public class BoardDao 
{
	public BoardDao()
	{
		Board[] b = new Board[3];
		
		for (int i =0; i < 3; i++)
		{
			b[i] = new Board();
			b[i].setTitle("제목"+(i+1));
			b[i].setContent("내용"+(i+1));
			list.add(b[i]);
		}

	}
	
	List<Board> list = new ArrayList<Board>();  // List로 인스턴스를 만들지 못하므로 upcasting 할 수 있게 ArrayList를 사용, 업캐스팅은 자식이 부모의 탑입을 가지는 것.
	
	public List<Board> getBoardList()
	{
		return list;
	}
	
	
}
