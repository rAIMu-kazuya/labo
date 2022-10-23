/**
 * 
 * @question ���P�b�g�@�i��o���@Racket.java, Ball.java�j
 * 
 * ���̖��́C���i(���P�b�g, �{�[��)�������v���O�����ł��D (1)����(4)�̎菇�ɂ��������āC�v���O�������쐬���Ȃ����D
 * 
 * @subquestion �N���X�} Racket ����\�[�X�v���O�����𓱏o���Ȃ����D
 * 
 * @make.inputClass Racket1
 * scale 1.2
 * align center
 * class Racket
 *
 * @subquestion �N���X�} Ball ����\�[�X�v���O�����𓱏o���Ȃ����D
 * 
 * @make.inputClass Ball1
 * scale 1.2
 * align center
 * class Ball
 * 
 * @clearpage
 *
 * @subquestion ����m�F�p�v���O���� BallMain.java ���쐬���Ȃ����D
 * 
 * @execution BallMain
 * 
 * @source BallMain.java
 * 
 * @subquestion API�d�l�@Ball�@�𖞑�����悤�Ɂ@Ball.java�@���������Ȃ����D
 * 
 * @api Ball
 * 
 * @author miura
 * 
 */
public class BallMain {
	public static void main(String[] args) {
		Ball Ball1 = new Ball(1);
		Ball Ball2 = new Ball(2);
		
		String item1 = Ball1.getItem();
		String item2 = Ball2.getItem();
		int weight1 = Ball1.getWeight();
		int weight2 = Ball2.getWeight();
		int sum = weight1 + weight2;
		System.out.println(item1 + " " + weight1 + "kg");
		System.out.println(item2 + " " + weight2 + "kg");
		System.out.println("���v" + sum + "kg");
	}
}