package sn.pouyelayese.tools;

import java.io.File;

import android.os.Environment;

/**
 * 
 * @author pouyelayese
 * Permet de faire differentes opérations sur les fichiers
 */
public class PFile {

	/**
	 * 
	 * @param name
	 * @return newFile
	 * Crée un nouveau répertoire
	 */
	public static File createDirectory(String name){
		return new File(Environment.getExternalStorageDirectory()+File.separator+name);
	}
}
