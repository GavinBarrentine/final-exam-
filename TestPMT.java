package pkgUT;

import static org.junit.Assert.*;

import org.apache.poi.ss.formula.functions.*;
import org.junit.Test;
import app.controller.Loan;

public class TestPMT extends Loan{


	@Test
	public void test() {
		double PMT;
		double r = 0.07 / 12;
		double n = 20 * 12;
		double p = 150000;
		double f = 0;
		boolean t = false;
		PMT = Math.abs(FinanceLib.pmt(r, n, p, f, t));
		
		double PMTExpected = 1162.95;
		
		assertEquals(PMTExpected, PMT, 0.01);
		
		
	@Test
	public void totalPaymentTest1() {
		double loanAmount = 100000;
		int loanTerm = 10;
		double interestRate = 7;
			
		double expected = 139330;
		double actual = findTotalPayments(loanAmount, loanTerm, interestRate);
		actual = Math.round(actual * 100) / 100;
			
		assertEquals(expected, actual, 0);
		}
		
	@Test
	public void totalPaymentTest2() {
		double loanAmount = 400000;
		int loanTerm = 5;
		double interestRate = 8;
			
		double expected = 48663;
		double actual = findTotalPayments(loanAmount, loanTerm, interestRate);
		actual = Math.round(actual * 100) / 100;
			
		assertEquals(expected, actual, 0);		
			
		}

	}

}

 

