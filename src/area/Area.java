package area;

public class Area {
	double lado1, lado2;
	public Area(double ladoA, double ladoB){
		lado1 = ladoA;
		lado2 = ladoB;
	}
	public double calculaArea() throws OperacaoException{
		//System.out.println(lado1*lado2);
		return lado1*lado2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area b1 = new Area(2.0,3.5);
		try{
			b1.calculaArea();
		}catch(OperacaoException ex){
			
		}
		
	}

}
