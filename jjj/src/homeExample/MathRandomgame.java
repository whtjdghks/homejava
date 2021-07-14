package homeExample;

public class MathRandomgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Dice = (int)(Math.random()*6+1);
		//Dice 는 그저 값이 들어간 변수
		//(int)는 math.random() 을 진행할때 실수를 정수로 바꾸는거다
		// 정수로 바꿀때 *6에 6은 0부터 6개 즉 0 1 2 3 4 5 를 뜻하고
		// +1 을 해줌으로써 6이라는 정수까지 추가 되서 주사위가 갖춰지는거다
		//*6은 나온 정수값에 6을 곱한거고 +1은 n개의 정수에서 임의값을 얻기위함
		if(Dice == 1) {
			System.out.println("1이 나왔습니다.");
		}else if(Dice == 2) {
			System.out.println("2가 나왔습니다.");
		}else if(Dice == 3) {
			System.out.println("3이 나왔습니다.");
		}else if(Dice == 4) {
			System.out.println("4가 나왔습니다.");
        }else if(Dice == 5) {
			System.out.println("5가 나왔습니다.");
        }else if(Dice == 6) {
			System.out.println("6이 나왔습니다.");
		}
		} }
