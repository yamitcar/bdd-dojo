package edu.model;


import org.junit.Assert;
import org.junit.Test;

public class LoginValidatorTest {
	
	@Test
	public void deberiaDejarloEntrarSiElUsuarioEsYamityElPasswordEs12345(){
		//arrange
		LoginValidator loginValidator = new LoginValidator();
		//act
		boolean result=loginValidator.validar("yamit", "12345");
		//assert
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void deberiaNoDejarloEntrarSiElUsuarioEsYamityElPasswordEs1234567(){
		//arrange
		LoginValidator loginValidator = new LoginValidator();
		//act
		boolean result=loginValidator.validar("yamit", "1234567");
		//assert
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void deberiaDejarloEntrarSiElUsuarioEsAliCateyElPasswordEs123456789(){
		//arrange
		LoginValidator loginValidator = new LoginValidator();
		//act
		boolean result=loginValidator.validar("AliCate", "123456789");
		//assert
		Assert.assertEquals(true, result);
	}

}
