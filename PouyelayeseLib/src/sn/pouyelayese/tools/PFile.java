package sn.pouyelayese.tools;

import java.io.File;

import android.os.Environment;

/**
 * 
 * @author pouyelayese
 * Permet de faire differentes op�rations sur les fichiers
 */
public class PFile {

	/**
	 * 
	 * @param name
	 * @return newFile
	 * Cr�e un nouveau r�pertoire
	 */
	public static File createDirectory(String name){
		return new File(Environment.getExternalStorageDirectory()+File.separator+name);
	}
}
