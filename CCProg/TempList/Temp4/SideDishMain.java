/**
 * 
 * @question TempCB�@�i��o���F SideDish.java, FriedFood.java,MisoSoup.java�j
 * 
 * ���̖��́C�u�������iSideDish�j�v�u�t���C�iFriedFood�j�v�u�݂��`�iMisoSoup�j�v�������v���O�����ł��D�i�P�j�`�i�S�j�̎菇�ɂ��������āC�v���O�������쐬���Ȃ����D
 * 
 * @subquestion �N���X�} SideDish, FriedFood, MisoSoup ����\�[�X�R�[�h�𓱏o���Ȃ����D
 * 
 * @make.inputClass SideDish1
 * scale 1.2
 * align center
 * class SideDish
 * 
 * @make.inputClass FriedFood1
 * scale 1.2
 * align center
 * class FriedFood
 * 
 * @make.inputClass MisoSoup1
 * scale 1.2
 * align center
 * class MisoSoup
 * 
 * @clearpage
 * 
 * @make.inputClass SideDishMain1
 * align center
 * class SideDish   0  0
 * class FriedFood    -4 -5
 * class MisoSoup 4 -5
 * arrow FriedFoodImplementsSideDish     0 -2.5
 * arrow MisoSoupImplementsSideDish 0 -2.5
 * 
 * 
 * @clearpage
 *
 * @subquestion ����m�F�p�v���O���� SideDishMain.java ���쐬���Ȃ����D
 * 
 * @execution SideDishMain
 * 
 * @source SideDishMain.java
 * 
 * @subquestion API�d�l FriedFood �𖞑�����悤�� FriedFood.java ���������Ȃ����D
 * 
 * @api FriedFood
 * 
 * @subquestion API�d�l MisoSoup �𖞑�����悤�� MisoSoup.java ���������Ȃ����D
 * 
 * @api MisoSoup
 * 
 * @author arai
 * 
 */
public class SideDishMain{
    public static void main(String[] args){
        SideDish sideDish1 = new FriedFood("����", 200);
        SideDish sideDish2 = new MisoSoup("���", 100);
        System.out.println(sideDish1.getFood());
        System.out.println(sideDish1.getPrice());
        System.out.println(sideDish1.getName());
        sideDish1.print();
        sideDish2.print();
    }
}