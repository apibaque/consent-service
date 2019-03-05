package cl.redbanc.payment.api.model;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import cl.redbanc.payment.model.CreditorAccount;

/**
 * CreditorAccount.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-27T15:27:51.266Z")

public class CreditorAccountDTO {
	@JsonProperty("identification")
	private String identification = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("destinationDNI")
	private String destinationDNI = null;

	public CreditorAccountDTO identification(String identification) {
		this.identification = identification;
		return this;
	}

	/**
	 * Get identification
	 * 
	 * @return identification
	 **/
	@NotNull
	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public CreditorAccountDTO name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get name
	 * 
	 * @return name
	 **/
	@NotNull

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CreditorAccountDTO destinationDNI(String destinationDNI) {
		this.destinationDNI = destinationDNI;
		return this;
	}

	/**
	 * Get destinationDNI
	 * 
	 * @return destinationDNI
	 **/
	@NotNull

	public String getDestinationDNI() {
		return destinationDNI;
	}

	public void setDestinationDNI(String destinationDNI) {
		this.destinationDNI = destinationDNI;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CreditorAccountDTO creditorAccount = (CreditorAccountDTO) o;
		return Objects.equals(this.identification, creditorAccount.identification)
				&& Objects.equals(this.name, creditorAccount.name)
				&& Objects.equals(this.destinationDNI, creditorAccount.destinationDNI);
	}

	@Override
	public int hashCode() {
		return Objects.hash(identification, name, destinationDNI);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreditorAccount {\n");

		sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    destinationDNI: ").append(toIndentedString(destinationDNI)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	public CreditorAccountDTO build(CreditorAccount creditorAccount) {
		this.setDestinationDNI(creditorAccount.getDestinationDNI());
		this.setIdentification(creditorAccount.getIdentification());
		this.setName(creditorAccount.getName());
		
		return this;
	}
}
