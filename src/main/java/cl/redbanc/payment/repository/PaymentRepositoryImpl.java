package cl.redbanc.payment.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import cl.redbanc.payment.api.model.PaymentDTO;
import cl.redbanc.payment.model.Payment;

@Repository
public class PaymentRepositoryImpl implements PaymentRepository {
	
	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public List<Payment> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Payment> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Payment> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Payment> S insert(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Payment> List<S> insert(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Payment> List<S> saveAll(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Payment> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Payment> S save(S entity) {
		// TODO Auto-generated method stub		
		return mongoTemplate.save(entity);
	}

	@Override
	public Optional<Payment> findById(String id) {
		// TODO Auto-generated method stub			
		Optional <Payment> paymentOptional = Optional.empty();
		Payment lst = mongoTemplate.findById(id, Payment.class);
		paymentOptional = Optional.of(lst);
		return paymentOptional;
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Payment> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Payment entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Payment> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Payment> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Payment> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Payment> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Payment> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updatePayment(PaymentDTO payment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String savePayment(PaymentDTO payment) {
		// TODO Auto-generated method stub
		return null;
	}


}
