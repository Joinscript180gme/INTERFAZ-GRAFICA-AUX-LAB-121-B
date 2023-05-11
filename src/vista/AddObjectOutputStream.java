/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author CRISTIAN
 */
public class AddObjectOutputStream extends ObjectOutputStream {

	protected AddObjectOutputStream(OutputStream out) throws IOException, SecurityException {
		super(out);
		// TODO Auto-generated constructor stub
	}
	protected void writeStreamHeader() throws IOException
	{
		this.reset();
	}
}
