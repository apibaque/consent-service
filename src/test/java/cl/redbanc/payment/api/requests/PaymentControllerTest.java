package cl.redbanc.payment.api.requests;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hackerrank.test.utility.Order;
import com.hackerrank.test.utility.OrderedTestRunner;
import com.hackerrank.test.utility.TestWatchman;

import cl.redbanc.payment.api.model.CreditorAccountDTO;
import cl.redbanc.payment.api.model.DebtorAccountDTO;
import cl.redbanc.payment.api.model.InstructedAmountDTO;
import cl.redbanc.payment.api.model.PaymentDTO;
import cl.redbanc.payment.api.model.PaymentDTO.StatusEnum;

import java.math.BigDecimal;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(OrderedTestRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PaymentControllerTest {
    @ClassRule
    public static final SpringClassRule springClassRule = new SpringClassRule();

    @Rule
    public final SpringMethodRule springMethodRule = new SpringMethodRule();

    @Rule
    public TestWatcher watchman = TestWatchman.watchman;

    @Autowired
    private MockMvc mockMvc;

    @BeforeClass
    public static void setUpClass() {
        TestWatchman.watchman.registerClass(PaymentControllerTest.class);
    }

    @AfterClass
    public static void tearDownClass() {
        TestWatchman.watchman.createReport(PaymentControllerTest.class);
    }

    /**
     *
     * @throws Exception
     *
     * It tests response to be "Hello Java!"
     */
    @Test
    @Order(1)
    public void paymentConsentJava() throws Exception {
    	
    	ObjectMapper obj = new ObjectMapper();
    	PaymentDTO payment = new PaymentDTO(); 
    	CreditorAccountDTO creditorAccount = new CreditorAccountDTO();
    	creditorAccount.setDestinationDNI("76000000");
    	creditorAccount.setIdentification("00100");
    	creditorAccount.setName("SOPROLE -1");
    	
		payment.setCreditorAccount(creditorAccount);
    	
		DebtorAccountDTO debtorAccount = new DebtorAccountDTO();
		debtorAccount.setDestinationDNI("8000000");
		debtorAccount.setIdentification("03700");
		debtorAccount.setName("SANTANDER");
		
		payment.setDebtorAccount(debtorAccount);
    	payment.setId("3F2504E0-4F89-11D3-9A0C-0305E82C3303");
    	
    	InstructedAmountDTO instructedAmount = new InstructedAmountDTO();
    	instructedAmount.amount(BigDecimal.valueOf(500000));
    	instructedAmount.setCurrency(BigDecimal.valueOf(152));
    	
		payment.setInstructedAmount(instructedAmount);
    	payment.setStatus(StatusEnum.APPROVED);
    	
        
    	
    	String response = mockMvc.perform(MockMvcRequestBuilders.post("/payments/consent")
    			.contentType(MediaType.APPLICATION_JSON)
                .content(obj.writeValueAsString(payment)))
            .andExpect(MockMvcResultMatchers.status().isCreated())
            .andReturn()
            .getResponse()
            .getContentAsString();
        
        System.out.println("POST CONSENT--> " + response);
    }
    
    
    @Test
    @Order(4)
    public void paymentOrderByIdJava() throws Exception {
    	
    	ObjectMapper obj = new ObjectMapper();
    	PaymentDTO payment = new PaymentDTO(); 
    	CreditorAccountDTO creditorAccount = new CreditorAccountDTO();
    	creditorAccount.setDestinationDNI("76000000");
    	creditorAccount.setIdentification("00100");
    	creditorAccount.setName("SOPROLE -1");
    	
		payment.setCreditorAccount(creditorAccount);
    	
		DebtorAccountDTO debtorAccount = new DebtorAccountDTO();
		debtorAccount.setDestinationDNI("8000000");
		debtorAccount.setIdentification("03700");
		debtorAccount.setName("SANTANDER");
		
		payment.setDebtorAccount(debtorAccount);
    	payment.setId("3F2504E0-4F89-11D3-9A0C-0305E82C3303");
    	
    	InstructedAmountDTO instructedAmount = new InstructedAmountDTO();
    	instructedAmount.amount(BigDecimal.valueOf(500000));
    	instructedAmount.setCurrency(BigDecimal.valueOf(152));
    	
		payment.setInstructedAmount(instructedAmount);
    	payment.setStatus(StatusEnum.APPROVED);
    	
        
    	
    	String response = mockMvc.perform(MockMvcRequestBuilders.get("/payments/3F2504E0-4F89-11D3-9A0C-0305E82C3303")
    			.contentType(MediaType.APPLICATION_JSON))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andReturn()
            .getResponse()
            .getContentAsString();
        
        System.out.println("GET--> " + response);
    }
    
    
    @Test
    @Order(3)
    public void paymentJava() throws Exception {
    	
    	ObjectMapper obj = new ObjectMapper();
    	PaymentDTO payment = new PaymentDTO(); 
    	CreditorAccountDTO creditorAccount = new CreditorAccountDTO();
    	creditorAccount.setDestinationDNI("76000000");
    	creditorAccount.setIdentification("00100");
    	creditorAccount.setName("SOPROLE -1");
    	
		payment.setCreditorAccount(creditorAccount);
    	
		DebtorAccountDTO debtorAccount = new DebtorAccountDTO();
		debtorAccount.setDestinationDNI("8000000");
		debtorAccount.setIdentification("03700");
		debtorAccount.setName("SANTANDER");
		
		payment.setDebtorAccount(debtorAccount);
    	payment.setId("3F2504E0-4F89-11D3-9A0C-0305E82C3303");
    	
    	InstructedAmountDTO instructedAmount = new InstructedAmountDTO();
    	instructedAmount.amount(BigDecimal.valueOf(500000));
    	instructedAmount.setCurrency(BigDecimal.valueOf(152));
    	
		payment.setInstructedAmount(instructedAmount);
    	payment.setStatus(StatusEnum.REJECTED);
    	
        
    	
    	String response = mockMvc.perform(MockMvcRequestBuilders.post("/payments/")
    			.contentType(MediaType.APPLICATION_JSON)
                .content(obj.writeValueAsString(payment)))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andReturn()
            .getResponse()
            .getContentAsString();
        
        System.out.println( "UPDATE--> " + response);
    }
    
    
}
