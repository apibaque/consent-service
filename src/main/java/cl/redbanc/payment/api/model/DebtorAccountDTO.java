package cl.redbanc.payment.api.model;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import cl.redbanc.payment.model.DebtorAccount;

/**
 * DebtorAccount
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-27T15:27:51.266Z")

public class DebtorAccountDTO {
	@JsonProperty("identification")
	private String identification = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("destinationDNI")
	private String destinationDNI = null;

	public DebtorAccountDTO identification(String identification) {
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

	public DebtorAccountDTO name(String name) {
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

	public DebtorAccountDTO destinationDNI(String destinationDNI) {
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
		DebtorAccountDTO debtorAccount = (DebtorAccountDTO) o;
		return Objects.equals(this.identification, debtorAccount.identification)
				&& Objects.equals(this.name, debtorAccount.name)
				&& Objects.equals(this.destinationDNI, debtorAccount.destinationDNI);
	}

	@Override
	public int hashCode() {
		return Objects.hash(identification, name, destinationDNI);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DebtorAccount {\n");

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
	
	public DebtorAccountDTO build(DebtorAccount debtorAccount) {
		this.setDestinationDNI(debtorAccount.getDestinationDNI());
		this.setIdentification(debtorAccount.getIdentification());
		this.setName(debtorAccount.getName());
		
		return this;
	}
}
