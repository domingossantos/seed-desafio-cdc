# Jornada Dev Eficiente

O Objetivo ser� fazer um pequeno di�rio do aprendizado, duvidas e linhas de pensamento a cada commit.

## Desafio 1
- Cadastro de Autor
Iniciei com o projeto baseado no meu template que j� uso a algum tempo.
* controllers
	* AutorController
* models
	* Autor
* repositories
	* AutorRepository
* dto
	* AutorForm
De cara comparei a estrutura que usei com o que havia visto nos videos iniciais e percebi que realmente algumas coisas n�o fazem sentido pra um simple registro de autor.
Criar uma interface extendendo de CrudRepository somente pra persistir um autor � meio for�ar a barra.
Fiz a refatora��o pra usar o EntityManager direto no controller pra diminuir a complexidade e facilitar o entendimento. Assim foi eliminado a interface
Interessante a vis�o.
Uma outra coisa interessante � que j� utilizei uma classe pra tratar e validar a requisi��o, mas n�o havia pensado sobre a divis�o de responsabilidade, s� me preocupava com validar somente o que estava sendo enviado pelo cliente.


