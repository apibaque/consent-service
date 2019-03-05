package cl.redbanc.payment.api.model;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The payment initiation object can be used for three types of payments, which
 * should be specified in the &#x60;&#x60;&#x60;type&#x60;&#x60;&#x60; property:
 * * &#x60;&#x60;&#x60;orderId&#x60;&#x60;&#x60;: The Go Socket identification
 * number specified by the receiving end, often described in the invoice. Not
 * including the \&quot;straksbetaling\&quot; (imediate payment) flag, as this
 * will be the default. Payment initiator: Part of the context object, but kept
 * here too for reference.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-27T15:27:51.266Z")

public class PaymentOrderRequest {
	@JsonProperty("orderId")
	private String orderId = null;

	@JsonProperty("payment")
	private PaymentDTO payment = null;

	public PaymentOrderRequest orderId(String orderId) {
		this.orderId = orderId;
		return this;
	}

	/**
	 * The payment type: orderId, message or order. A transfer is a payment
	 * order between two accounts with the same owner, a message is an outgoing
	 * payment with just a descriptive message and orderId is a payment order
	 * with a ID (order identification) number.
	 * 
	 * @return orderId
	 **/
	@NotNull

	@Pattern(regexp = "^\\w{8}-\\w{4}-\\w{4}-\\w{4}-\\w{12}$")
	@Size(min = 36, max = 36)
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public PaymentOrderRequest payment(PaymentDTO payment) {
		this.payment = payment;
		return this;
	}

	/**
	 * Get payment
	 * 
	 * @return payment
	 **/
	@NotNull

	@Valid

	public PaymentDTO getPayment() {
		return payment;
	}

	public void setPayment(PaymentDTO payment) {
		this.payment = payment;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PaymentOrderRequest paymentOrderRequest = (PaymentOrderRequest) o;
		return Objects.equals(this.orderId, paymentOrderRequest.orderId)
				&& Objects.equals(this.payment, paymentOrderRequest.payment);
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderId, payment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PaymentOrderRequest {\n");

		sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
		sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
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
