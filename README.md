## Subir container docker rabbitmq

```sh
docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.9-management
```
- Criar fila com nome "teste" ;
- Criar exchange com nome "teste-exchange" apostanto para a fila "teste" com routing key "routing-key-teste";

## Clonar esse repositório
```sh
https://github.com/julioosilva97/spring-boot-rabbit-mq-test.git-management
```
- Importar e executar os dois projetos; 
- Chamar o producer passando mensagem como parametro : http://localhost:8081/send/{mensagem}; 
- A mensagem passada como parametro será mostrada no log do consumer.
