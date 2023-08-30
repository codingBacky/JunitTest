package test.com.backky;

import static org.junit.Assert.assertNotNull;

import com.backky.board.BoardVO;
import com.backky.board.DButil;

public class Test {
	@org.junit.Test
	public void ConnectionTest() {
		assertNotNull(DButil.getConnection());
		
	}
	@org.junit.Test
	public void daoInsertTest() {
		BoardVO vo = new BoardVO("b","title b","conctent b");
		
	}
}
