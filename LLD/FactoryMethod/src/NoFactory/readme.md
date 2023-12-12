## Code with Out Factory
- Here method inside email class, send Email is not only sending email but also creating db 
- Which violates
  - SRP, 
  - Open close
  - DRY dont repeat your self (if the same db should be created to send whatsapp message) 
  - Not maintainable
  - If else hell in sendEmail method 
