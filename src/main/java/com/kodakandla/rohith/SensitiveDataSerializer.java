package com.kodakandla.rohith;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class SensitiveDataSerializer extends StdSerializer<String> implements ContextualSerializer{

	private static final long serialVersionUID = 1L;
	
	private SensitiveData sensitiveAnnotation;

	protected SensitiveDataSerializer() {
		super(String.class);
	}
	
	protected SensitiveDataSerializer(SensitiveData annotationVal) {
		super(String.class);
		this.sensitiveAnnotation = annotationVal;
	}

	@Override
	public JsonSerializer<?> createContextual(SerializerProvider prov, BeanProperty property)
			throws JsonMappingException {
		
		if (property != null) {
			sensitiveAnnotation = property.getAnnotation(SensitiveData.class);
		}
		
		return new SensitiveDataSerializer(sensitiveAnnotation);
	}

	@Override
	public void serialize(String value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		if (sensitiveAnnotation != null && value != null && !value.isEmpty()) {
			gen.writeString(sensitiveAnnotation.value());
		    } else {
		    	gen.writeString(value);
		    }
	}

}
