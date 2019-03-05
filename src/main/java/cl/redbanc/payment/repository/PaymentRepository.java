package cl.redbanc.payment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cl.redbanc.payment.api.model.PaymentDTO;
import cl.redbanc.payment.model.Payment;

public interface PaymentRepository extends MongoRepository<Payment, String> {

	void updatePayment(PaymentDTO payment);

	String savePayment(PaymentDTO payment);

	

}
