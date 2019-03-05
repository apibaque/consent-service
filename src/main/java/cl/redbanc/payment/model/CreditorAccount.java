package cl.redbanc.payment.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * CreditorAccount
 */
@Document(collection = "creditorAccounts")
@TypeAlias("creditorAccount")
public class CreditorAccount {

	@Id
	private String id;

	String identification = null;

	String name = null;

	String destinationDNI = null;

	@PersistenceConstructor
	public CreditorAccount(String identification, String name, String destinationDNI) {
		super();
		this.identification = identification;
		this.name = name;
		this.destinationDNI = destinationDNI;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDestinationDNI() {
		return destinationDNI;
	}

	public void setDestinationDNI(String destinationDNI) {
		this.destinationDNI = destinationDNI;
	}

}
