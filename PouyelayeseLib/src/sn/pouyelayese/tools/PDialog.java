package sn.pouyelayese.tools;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * 
 * @author pouyelayese
 * Permet de créer une boite de dialogue avec des options
 */
public class PDialog {

	/**
	 * Afficher une popup dialog avec les options OUI et NON
	 */
	public static void dialogBox(Context context, String title,
			String message, 
			String messageYes, DialogInterface.OnClickListener listenerYes, 
			String messageNo, DialogInterface.OnClickListener listenerNo){
			AlertDialog.Builder alert = new AlertDialog.Builder(context);                 
			alert.setTitle(title);  
			alert.setMessage(message);
			alert.setPositiveButton(messageYes, listenerYes);
		    alert.setNegativeButton(messageNo, listenerNo);
		alert.show();
		return ;
	}
	
	/**
	 * Afficher une popup dialog avec les options OUI, NON, et CANCEL
	 */
	public static void dialogBox(Context context, String title,
			String message, 
			String messageYes, DialogInterface.OnClickListener listenerYes,
			String messageNo, DialogInterface.OnClickListener listenerNo,
			String messageCancel,DialogInterface.OnClickListener listenerNeutral){
			AlertDialog.Builder alert = new AlertDialog.Builder(context);                 
			alert.setTitle(title);  
			alert.setMessage(message);
			alert.setPositiveButton(messageYes, listenerYes);
		    alert.setNegativeButton(messageNo, listenerNo);
		    alert.setNeutralButton(messageCancel, listenerNeutral);
			alert.show();
		return ;
	}
	
	/**
	 * Afficher une popup dialog à titre d'information
	 */
	public static void dialogBox(Context context, String title, String message,
			String messageNeutre, DialogInterface.OnClickListener listenerNeutral){
			AlertDialog.Builder alert = new AlertDialog.Builder(context);                 
			alert.setTitle(title);  
			alert.setMessage(message);
		    alert.setNeutralButton(messageNeutre, listenerNeutral);
		alert.show();
		return ;
	}
}
