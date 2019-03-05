package cl.redbanc.payment.model;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "payments")
@TypeAlias("payment")
public class Payment {

	@Id
	private String id;

	@Field("status")
	private String status;

	@NotEmpty(message = "debtorAccount can not be empty")
	private DebtorAccount debtorAccount = null;

	@NotEmpty(message = "creditorAccount can not be empty")
	private CreditorAccount creditorAccount = null;

	@NotEmpty(message = "instructedAmount can not be empty")
	private InstructedAmount instructedAmount = null;

	@PersistenceConstructor
	public Payment(String id, String status, DebtorAccount debtorAccount, CreditorAccount creditorAccount,
			InstructedAmount instructedAmount) {
		super();
		this.id = id;
		this.status = status;
		this.debtorAccount = debtorAccount;
		this.creditorAccount = creditorAccount;
		this.instructedAmount = instructedAmount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Payment [id=");
		builder.append(id);
		builder.append(", status=");
		builder.append(status);
		builder.append(", debtorAccount=");
		builder.append(debtorAccount);
		builder.append(", creditorAccount=");
		builder.append(creditorAccount);
		builder.append(", instructedAmount=");
		builder.append(instructedAmount);
		builder.append("]");
		return builder.toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DebtorAccount getDebtorAccount() {
		return debtorAccount;
	}

	public void setDebtorAccount(DebtorAccount debtorAccount) {
		this.debtorAccount = debtorAccount;
	}

	public CreditorAccount getCreditorAccount() {
		return creditorAccount;
	}

	public void setCreditorAccount(CreditorAccount creditorAccount) {
		this.creditorAccount = creditorAccount;
	}

	public InstructedAmount getInstructedAmount() {
		return instructedAmount;
	}

	public void setInstructedAmount(InstructedAmount instructedAmount) {
		this.instructedAmount = instructedAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
