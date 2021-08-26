package com.jjeanjacques.email.repositories;

import com.jjeanjacques.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}
