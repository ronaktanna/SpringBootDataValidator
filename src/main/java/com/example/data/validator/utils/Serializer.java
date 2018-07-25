package com.example.data.validator.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.springframework.stereotype.Component;

@Component
public class Serializer {
	
	private Serializer() { 
		/* singleton class */
	}
	
	/**
	 * Serializes a given Object into a byte array(Serializable format) for persistence into a data store.
	 * @param obj --> The Object you want to persist.
	 * @return byte[] that is ready for persistence.
	 * @throws IOException
	 */
    public byte[] serialize(Object obj) throws IOException {
        try(ByteArrayOutputStream b = new ByteArrayOutputStream()){
            try(ObjectOutputStream o = new ObjectOutputStream(b)){
                o.writeObject(obj);
            }
            return b.toByteArray();
        }
    }

    /**
     * Deserializes a given array of bytes into a Object class that can be cast to a custom class for programmatic manipulation.
     * @param bytes --> The array of bytes that need to be deserialized.
     * @return a deserialized Object instance.
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deserialize(byte[] bytes) throws IOException, ClassNotFoundException {
        try(ByteArrayInputStream b = new ByteArrayInputStream(bytes)){
            try(ObjectInputStream o = new ObjectInputStream(b)){
                return o.readObject();
            }
        }
    }

}
