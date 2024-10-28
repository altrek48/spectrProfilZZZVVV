package dev.spectrProfil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmailController {

    private static final Logger LOG = LoggerFactory.getLogger(EmailController.class);

    @Autowired
    EmailService emailService;

    @PostMapping(value = "/order-email")
    public @ResponseBody ResponseEntity<String> sendSimpleEmail(@RequestBody Order order) {

        try {
            //subject это заголовок
            emailService.sendSimpleEmail(order.getEmail(),  "Заказ", "Поступил заказ от " + order.getName() +
                    ", г. " + order.getCity() + ", номер телефона: " + order.getNumber() + ", email: " +
                    order.getEmail() + ". " +
                    "Cообщение: " +
                    order.getMessage());
        } catch (MailException mailException) {
            LOG.error("Error while sending out email: ", mailException);
            return new ResponseEntity<>("Unable to send email", HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>("Please check your inbox", HttpStatus.OK);
    }

}
