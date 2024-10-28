package dev.spectrProfil;

public interface EmailService {
    void sendSimpleEmail(String toAddress, String subject, String message);
}
