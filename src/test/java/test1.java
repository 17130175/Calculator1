package test.java;


/* ����������� ���������� JUnit, ����������� ��������� ����� ��� �������� */
import org.junit.Assert;
import org.junit.Test;

import main.java.Calculator;

/* �������� ������, ����������� ��� ����� */
public class test1 {
    
	/* ��������� @Test ��������� JUnit, ��� � ������ ��������� ��� ����� */
    @Test
    public void testCalculator(){
		/* ��������� ���������� �� ������ ������������� ������ � �������� ���������� ����� */
        try{
			/* �������� ������� ������, ����������� ��������� */
            Calculator lc = new Calculator();
			/* ���������� ���� ����� ��������� ������������ ������������������� �������� */
            lc.fields[0].setText("hggfhjk");
			/* ������ ��������� */
            lc.calculate();
			/* ��������� ����������, ����������� ����������, � ��������� ��������� */
            Assert.assertTrue("7".equals(lc.fields[1].getText()));
        }
		/* ���, ����������� ��� ������������� ������ � �������� ���������� ����� */
        catch(Exception e){
			/* ��������� ���������� ���������� ����� */
            Assert.fail("��������� ������������ ������� ��������");
        }
    }
}
