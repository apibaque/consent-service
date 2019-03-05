package cl.redbanc.payment.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * InstructedAmount
 */
@Document(collection = "instructedAmounts")
@TypeAlias("instructedAmount")
public class InstructedAmount {

	@Id
	private String id;

	private BigDecimal amount;

	private BigDecimal currency;

	@PersistenceConstructor
	public InstructedAmount(BigDecimal amount, BigDecimal currency) {
		super();
		this.amount = amount;
		this.currency = currency;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InstructedAmount [id=");
		builder.append(id);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", currency=");
		builder.append(currency);
		builder.append("]");
		return builder.toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getCurrency() {
		return currency;
	}

	public void setCurrency(BigDecimal currency) {
		this.currency = currency;
	}

}
