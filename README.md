# keystore-config
Um projeto Spring Boot com a biblioteca Spring Web que usa o keystore para configurar o servidor web com HTTPS. 
O projeto será criado com o Spring Initializr (https://start.spring.io) e será executado em um servidor embutido (Tomcat) na porta 8443.

## O que é um Keystore?
Um keystore é um repositório seguro para armazenar chaves criptográficas, certificados e outras informações sensíveis. Ele é essencial para a segurança de sistemas, aplicativos e dispositivos móveis, permitindo o armazenamento protegido de informações utilizadas em criptografia, assinaturas digitais, autenticação e outros processos. 

## Objetivo deste Laboratório
Mostrar os requisitos de configuração para servidores `https`. Necessário um `keystore` a configuração dele no `application.properties`. Neste projeto, há um certificado autoassinado,
que não é recomendado para aplicações reais. Para importar certificados de Autoridades Certificadoras, podemos utilizar o [Let's Encrypt](https://letsencrypt.org/pt-br/).