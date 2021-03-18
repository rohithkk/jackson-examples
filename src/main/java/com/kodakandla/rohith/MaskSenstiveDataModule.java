package com.kodakandla.rohith;

import com.fasterxml.jackson.databind.module.SimpleModule;

public class MaskSenstiveDataModule extends SimpleModule{

	private static final long serialVersionUID = 1L;

	private static final String NAME = "MaskSenstiveDataModule";
    
	public MaskSenstiveDataModule() {
		super(NAME);
		this.addSerializer(new SensitiveDataSerializer());
	}
	
}
