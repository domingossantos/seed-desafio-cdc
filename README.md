# Jornada Dev Eficiente

O Objetivo será fazer um pequeno diário do aprendizado, duvidas e linhas de pensamento a cada commit.

## Desafio 1
- Cadastro de Autor
Iniciei com o projeto baseado no meu template que já uso a algum tempo.
* controllers
	* AutorController
* models
	* Autor
* repositories
	* AutorRepository
* dto
	* AutorForm
De cara comparei a estrutura que usei com o que havia visto nos videos iniciais e percebi que realmente algumas coisas não fazem sentido pra um simple registro de autor.
Criar uma interface extendendo de CrudRepository somente pra persistir um autor é meio forçar a barra.
Fiz a refatoração pra usar o EntityManager direto no controller pra diminuir a complexidade e facilitar o entendimento. Assim foi eliminado a interface
Interessante a visão.
Uma outra coisa interessante é que já utilizei uma classe pra tratar e validar a requisição, mas não havia pensado sobre a divisão de responsabilidade, só me preocupava com validar somente o que estava sendo enviado pelo cliente.


