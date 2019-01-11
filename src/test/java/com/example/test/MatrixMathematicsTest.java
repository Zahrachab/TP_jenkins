package com.example.test;

import static org.junit.Assert.*;

import com.example.exception.NoSquareException;
import com.example.model.*;
import com.example.service.*;

import org.junit.Test;

public class MatrixMathematicsTest {

	@Test
	public void testDeterminant1() throws NoSquareException {
		double [][] dataEnter= {{1,-2},{3,4}};
		Matrix matrix = new Matrix(dataEnter); 
		assertEquals(MatrixMathematics.determinant(matrix), 10.0 , 0.1);
	}
	
	@Test (expected = NoSquareException.class)
	public void testDeterminant2() throws NoSquareException {
		double [][] dataEnter= {{1,-2,7},{3,4,1}};
		Matrix matrix = new Matrix(dataEnter); 
        MatrixMathematics.determinant(matrix);
	}
	
	@Test
	public void testDeterminant3() throws NoSquareException {
		double [][] dataEnter= {{6}};
		Matrix matrix = new Matrix(dataEnter); 
		assertEquals(MatrixMathematics.determinant(matrix), 6 , 0.1);
	}
	
	@Test
	public void testCofactor1() throws NoSquareException{
		double [][] dataEnter= {{1,2,3},{0,4,5}, {1,0,6}};
		double [][] dataCofactor = {{24,5,-4}, {-12,3, 2}, {-2, -5, 4}};
		Matrix matrix = new Matrix(dataEnter); 
		Matrix matrixCofactor = MatrixMathematics.cofactor(matrix);
		for (int i=0; i<dataEnter.length; i++)
		{
			assertArrayEquals(matrixCofactor.getValues()[i], dataCofactor[i],0.01);
		}
	}
	
	@Test (expected = NoSquareException.class)
	public void testCofactor2() throws NoSquareException{
		double [][] dataEnter= {{1,2,3},{0,4,5}};
		Matrix matrix = new Matrix(dataEnter); 
		MatrixMathematics.cofactor(matrix);
	}
	
	

}
