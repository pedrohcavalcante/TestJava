package area;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class TestFail {
	@Test
	public void testeErrado(){
		Area a1 = new Area(-1.0,2.5);
		try {
			a1.calculaArea();
			//fail("Não deve ser menor que 0");
		}catch (OperacaoException ex){
			
		}
	}
}
