package Concrete;

import java.rmi.RemoteException;

import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManager {
	public boolean mernisManager(Player player) {
		KPSPublicSoap soapClient =new KPSPublicSoapProxy();
		boolean result=false;
		try {
			result=soapClient.TCKimlikNoDogrula(
					Long.parseLong(player.getIdNumber()), 
					player.getFirtName().toUpperCase(),
					player.getLastName().toUpperCase(), 
					player.getYearOfBirt());
		} catch (NumberFormatException e ) {
			
			e.printStackTrace();
		} catch(RemoteException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
