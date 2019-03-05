package cl.redbanc.payment.api.model;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import cl.redbanc.payment.model.InstructedAmount;

/**
 * InstructedAmount
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-27T15:27:51.266Z")

public class InstructedAmountDTO {
	@JsonProperty("amount")
	private BigDecimal amount = null;

	@JsonProperty("currency")
	private BigDecimal currency = null;

	public InstructedAmountDTO amount(BigDecimal amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * Get amount
	 * 
	 * @return amount
	 **/

	@Valid

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public InstructedAmountDTO currency(BigDecimal currency) {
		this.currency = currency;
		return this;
	}
	
	public InstructedAmountDTO build(InstructedAmount instructedAmount) {
		this.setAmount(instructedAmount.getAmount());
		this.setCurrency(instructedAmount.getCurrency());
		
		return this;
	}
	

	/**
	 * Get currency
	 * 
	 * @return currency
	 **/
	@Valid

	public BigDecimal getCurrency() {
		return currency;
	}

	public void setCurrency(BigDecimal currency) {
		this.currency = currency;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InstructedAmountDTO instructedAmount = (InstructedAmountDTO) o;
		return Objects.equals(this.amount, instructedAmount.amount)
				&& Objects.equals(this.currency, instructedAmount.currency);
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, currency);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InstructedAmount {\n");

		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
