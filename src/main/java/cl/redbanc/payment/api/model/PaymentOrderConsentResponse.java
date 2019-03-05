package cl.redbanc.payment.api.model;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The payment initiation object can be used for three types of payments, which
 * should be specified in the &#x60;&#x60;&#x60;type&#x60;&#x60;&#x60; property:
 * * &#x60;&#x60;&#x60;ORDERID&#x60;&#x60;&#x60;: The Go Socket identification
 * number specified by the receiving end, often described in the invoice. *
 * &#x60;&#x60;&#x60;MESSAGE&#x60;&#x60;&#x60;: A payment just having a text
 * message attached with it. * &#x60;&#x60;&#x60;TRANSFER&#x60;&#x60;&#x60;: A
 * payment going between two DNB accounts having the same owner. Not including
 * the \&quot;straksbetaling\&quot; (imediate payment) flag, as this will be the
 * default.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-27T15:27:51.266Z")

public class PaymentOrderConsentResponse {
	@JsonProperty("orderId")
	private String orderId = null;

	@JsonProperty("description")
	private String description = null;

	public PaymentOrderConsentResponse orderId(String orderId) {
		this.orderId = orderId;
		return this;
	}

	/**
	 * Get orderId
	 * 
	 * @return orderId
	 **/
	@NotNull

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public PaymentOrderConsentResponse description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get description
	 * 
	 * @return description
	 **/
	@NotNull

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PaymentOrderConsentResponse paymentOrderConsentResponse = (PaymentOrderConsentResponse) o;
		return Objects.equals(this.orderId, paymentOrderConsentResponse.orderId)
				&& Objects.equals(this.description, paymentOrderConsentResponse.description);
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderId, description);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PaymentOrderConsentResponse {\n");

		sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
