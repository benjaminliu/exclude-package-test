in springboot,

if you are running schedule tasks, or listeing to kafka.

when you want to test some parts of the code, these is sometime you don't want tasks or listener,

so here is one solution.

careful at @SpringBootApplication(scanBasePackages = {"${packages}"}) and application.yml in main resoures folder and test resources foulder