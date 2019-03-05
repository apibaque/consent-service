package cl.redbanc.payment.service;

import java.util.Objects;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.redbanc.payment.api.model.PaymentDTO;
import cl.redbanc.payment.model.CreditorAccount;
import cl.redbanc.payment.model.DebtorAccount;
import cl.redbanc.payment.model.InstructedAmount;
import cl.redbanc.payment.model.Payment;
import cl.redbanc.payment.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;

	private Payment findOne(String id) {
		Optional<Payment> entity = paymentRepository.findById(id);
		if (Objects.isNull(entity)) {
			throw new EntityNotFoundException(id);
		}
		return entity.get();
	}
	
	@Override
	public PaymentDTO getPayment(String id) {
		Payment entity = findOne(id);
		return new PaymentDTO().build(entity);
	}

	@Override
	public PaymentDTO addPayment(PaymentDTO payment) {
		CreditorAccount creditorAccount = new CreditorAccount(payment.getCreditorAccount().getIdentification(), payment.getCreditorAccount().getName(), payment.getCreditorAccount().getDestinationDNI());
		DebtorAccount debtorAccount = new DebtorAccount(payment.getDebtorAccount().getIdentification(), payment.getDebtorAccount().getName(), payment.getDebtorAccount().getDestinationDNI());
		InstructedAmount instructedAmount = new InstructedAmount(payment.getInstructedAmount().getAmount(), payment.getInstructedAmount().getCurrency());
		Payment entity = new Payment(payment.getId(), payment.getStatus().toString(), debtorAccount, creditorAccount, instructedAmount);
		
		paymentRepository.save(entity);
		
		return new PaymentDTO().build(entity);
	}

	@Override
	public PaymentDTO updatePayment(PaymentDTO payment) {

		Payment entity = this.findOne(payment.getId());
		entity.setStatus(payment.getStatus().toString());
		
		paymentRepository.save(entity);
		
		return new PaymentDTO().build(entity);
	}

	@Override
	public void deletePayment(String id) {
		paymentRepository.deleteById(id);
	}

}
