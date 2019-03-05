package cl.redbanc.payment.service;



import cl.redbanc.payment.api.model.PaymentDTO;




public interface PaymentService {

	/**
	 * Busqueda del pago mediante un identificador de orden.
	 * 
	 * @param accountNumber
	 * @return
	 */
	

	
	PaymentDTO getPayment(String orderId);

	/**
	 * Registro de solicitud de pago.
	 * 
	 * @param payment
	 */
	PaymentDTO addPayment(PaymentDTO payment);

	/**
	 * Actualizacion de registro de pago con respuesta de servicio de go socket.
	 * 
	 * @param payment
	 */
	PaymentDTO updatePayment(PaymentDTO payment);
	
	void deletePayment(String id);

}
