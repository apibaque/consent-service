package cl.redbanc.payment.api.model;

import java.util.Date;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import cl.redbanc.payment.model.Payment;

/**
 * **NOTE:** May be completely merged with
 * &#x60;&#x60;&#x60;transaction&#x60;&#x60;&#x60;. A
 * &#x60;&#x60;&#x60;payment&#x60;&#x60;&#x60; is a planned payment/transaction
 * that has not yet been carried out. Details about a payment. Used by: *
 * /payments/due/{accountNumber}: Returning a list of payments, with _empty_
 * PaymentDetails * /payments/due/{accountNumber}/details: Returning a list of
 * payments, with PaymentDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-27T15:27:51.266Z")

public class PaymentDTO {
	
	@JsonProperty("id")
	private String id = null;
	
	@JsonProperty("transactionId")
	private String transactionId = null;
	
	@JsonProperty("creationDate")
	private Date creationDate;
	
	@JsonProperty("modificationDate")
	private Date modificationDate;
	
	@JsonProperty("debtorAccount")
	private DebtorAccountDTO debtorAccount = null;

	@JsonProperty("creditorAccount")
	private CreditorAccountDTO creditorAccount = null;

	@JsonProperty("instructedAmount")
	private InstructedAmountDTO instructedAmount = null;

	/**
	 * Gets or Sets status
	 */
	public enum StatusEnum {
		APPROVED("APPROVED"),

		REJECTED("REJECTED");

		private String value;

		StatusEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static StatusEnum fromValue(String text) {
			for (StatusEnum b : StatusEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}	

	@JsonProperty("status")
	private StatusEnum status = null;

	public PaymentDTO build(Payment payment) {
		this.setId(payment.getId());
		this.setCreationDate(payment.getCreationDate());
		this.setModificationDate(payment.getModificationDate());
		this.setCreditorAccount(new CreditorAccountDTO().build(payment.getCreditorAccount()));
		this.setDebtorAccount(new DebtorAccountDTO().build(payment.getDebtorAccount()));
		this.setInstructedAmount(new InstructedAmountDTO().build(payment.getInstructedAmount()));
		StatusEnum status = StatusEnum.fromValue(payment.getStatus());
		this.setStatus(status);
		this.setTransactionId(payment.getTransactionId());
		
		return this;
	}
	
	public PaymentDTO debtorAccount(DebtorAccountDTO debtorAccount) {
		this.debtorAccount = debtorAccount;
		return this;
	}

	/**
	 * Get debtorAccount
	 * 
	 * @return debtorAccount
	 **/
	@Valid

	public DebtorAccountDTO getDebtorAccount() {
		return debtorAccount;
	}

	public void setDebtorAccount(DebtorAccountDTO debtorAccount) {
		this.debtorAccount = debtorAccount;
	}

	public PaymentDTO creditorAccount(CreditorAccountDTO creditorAccount) {
		this.creditorAccount = creditorAccount;
		return this;
	}

	/**
	 * Get creditorAccount
	 * 
	 * @return creditorAccount
	 **/
	@Valid

	public CreditorAccountDTO getCreditorAccount() {
		return creditorAccount;
	}

	public void setCreditorAccount(CreditorAccountDTO creditorAccount) {
		this.creditorAccount = creditorAccount;
	}

	public PaymentDTO instructedAmount(InstructedAmountDTO instructedAmount) {
		this.instructedAmount = instructedAmount;
		return this;
	}

	/**
	 * Get instructedAmount
	 * 
	 * @return instructedAmount
	 **/
	@Valid

	public InstructedAmountDTO getInstructedAmount() {
		return instructedAmount;
	}

	public void setInstructedAmount(InstructedAmountDTO instructedAmount) {
		this.instructedAmount = instructedAmount;
	}

	public PaymentDTO status(StatusEnum status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 **/

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	/**
	 * Get id
	 * @return id
	 */
	@Valid
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PaymentDTO payment = (PaymentDTO) o;
		return Objects.equals(this.id, payment.id)
				&& Objects.equals(this.transactionId, payment.transactionId)
				&& Objects.equals(this.creationDate, payment.creationDate)
				&& Objects.equals(this.modificationDate, payment.modificationDate)
				&& Objects.equals(this.debtorAccount, payment.debtorAccount)
				&& Objects.equals(this.creditorAccount, payment.creditorAccount)
				&& Objects.equals(this.instructedAmount, payment.instructedAmount)
				&& Objects.equals(this.status, payment.status);
	}

	@Override
	public int hashCode() {
		return Objects.hash(debtorAccount, creditorAccount, instructedAmount, status);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Payment {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
		sb.append("    createdDate: ").append(toIndentedString(creationDate)).append("\n");
		sb.append("    modifyDate: ").append(toIndentedString(modificationDate)).append("\n");
		sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
		sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
		sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
}
