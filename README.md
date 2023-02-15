# EmailSender

### The issue:

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.0.2)

2023-02-16T02:13:52.886+05:30  INFO 9600 --- [           main] c.e.m.MailattachmentApplication          : Starting MailattachmentApplication using Java 17.0.5 with PID 9600 (C:\Users\anvdu\Documents\Projects\MailSender\mailattachment\target\classes started by anvdu in C:\Users\anvdu\Documents\Projects\MailSender\mailattachment)
2023-02-16T02:13:52.886+05:30  INFO 9600 --- [           main] c.e.m.MailattachmentApplication          : No active profile set, falling back to 1 default profile: "default"
2023-02-16T02:13:53.846+05:30  INFO 9600 --- [           main] c.e.m.MailattachmentApplication          : Started MailattachmentApplication in 1.653 seconds (process running for 2.217)
2023-02-16T02:13:55.532+05:30 ERROR 9600 --- [           main] o.s.boot.SpringApplication               : Application run failed

org.springframework.mail.MailSendException: Failed messages: com.sun.mail.smtp.SMTPSendFailedException: 530 5.7.0 Must issue a STARTTLS command first. ba1-20020a170902720100b00198ff118fd3sm1240227plb.101 - gsmtp

        at org.springframework.mail.javamail.JavaMailSenderImpl.doSend(JavaMailSenderImpl.java:491) ~[spring-context-support-6.0.4.jar:6.0.4]  
        at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:361) ~[spring-context-support-6.0.4.jar:6.0.4]    
        at org.springframework.mail.javamail.JavaMailSenderImpl.send(JavaMailSenderImpl.java:356) ~[spring-context-support-6.0.4.jar:6.0.4]    
        at com.example.mailattachment.EmailSenderService.sendMailWithAttachment(EmailSenderService.java:30) ~[classes/:na]
        at com.example.mailattachment.MailattachmentApplication.triggeredEmail(MailattachmentApplication.java:23) ~[classes/:na]
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(Unknown Source) ~[na:na]
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source) ~[na:na]
        at java.base/java.lang.reflect.Method.invoke(Unknown Source) ~[na:na]
        at org.springframework.context.event.ApplicationListenerMethodAdapter.doInvoke(ApplicationListenerMethodAdapter.java:343) ~[spring-context-6.0.4.jar:6.0.4]
        at org.springframework.context.event.ApplicationListenerMethodAdapter.processEvent(ApplicationListenerMethodAdapter.java:228) ~[spring-context-6.0.4.jar:6.0.4]
        at org.springframework.context.event.ApplicationListenerMethodAdapter.onApplicationEvent(ApplicationListenerMethodAdapter.java:165) ~[spring-context-6.0.4.jar:6.0.4]
        at org.springframework.context.event.SimpleApplicationEventMulticaster.doInvokeListener(SimpleApplicationEventMulticaster.java:176) ~[spring-context-6.0.4.jar:6.0.4]
        at org.springframework.context.event.SimpleApplicationEventMulticaster.invokeListener(SimpleApplicationEventMulticaster.java:169) ~[spring-context-6.0.4.jar:6.0.4]
        at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:143) ~[spring-context-6.0.4.jar:6.0.4]
        at org.springframework.context.support.AbstractApplicationContext.publishEvent(AbstractApplicationContext.java:413) ~[spring-context-6.0.4.jar:6.0.4]
        at org.springframework.context.support.AbstractApplicationContext.publishEvent(AbstractApplicationContext.java:370) ~[spring-context-6.0.4.jar:6.0.4]
        at org.springframework.boot.context.event.EventPublishingRunListener.ready(EventPublishingRunListener.java:109) ~[spring-boot-3.0.2.jar:3.0.2]
        at org.springframework.boot.SpringApplicationRunListeners.lambda$ready$6(SpringApplicationRunListeners.java:80) ~[spring-boot-3.0.2.jar:3.0.2]
        at java.base/java.lang.Iterable.forEach(Unknown Source) ~[na:na]
        at org.springframework.boot.SpringApplicationRunListeners.doWithListeners(SpringApplicationRunListeners.java:118) ~[spring-boot-3.0.2.jar:3.0.2]
        at org.springframework.boot.SpringApplicationRunListeners.doWithListeners(SpringApplicationRunListeners.java:112) ~[spring-boot-3.0.2.jar:3.0.2]
        at org.springframework.boot.SpringApplicationRunListeners.ready(SpringApplicationRunListeners.java:80) ~[spring-boot-3.0.2.jar:3.0.2]  
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:327) ~[spring-boot-3.0.2.jar:3.0.2]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1302) ~[spring-boot-3.0.2.jar:3.0.2]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1291) ~[spring-boot-3.0.2.jar:3.0.2]
        at com.example.mailattachment.MailattachmentApplication.main(MailattachmentApplication.java:18) ~[classes/:na]
 ```
