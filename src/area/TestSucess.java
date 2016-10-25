package area;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class TestSucess{
	@Test
	public void testFail() throws OperacaoException{
		Area a1 = new Area(2.5,3.9);
		try{
		a1.calculaArea();
		Assert.assertEquals(a1.calculaArea(), 9.75, 0.001);
		}catch (OperacaoException ex){
	}
	}
}
