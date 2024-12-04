Neste repositório será possivel encontrar o CRUD de um projeto Spring boot completo de web services REST, contendo assim as cinco operações básicas de um CRUD. Sendo estas:
 Busca paginada de recursos
 Busca de recurso por id
 Inserir novo recurso
 Atualizar recurso
 Deletar recurso

O projeto foi realizado no ambiente de testes configurando e acessando o banco de dados H2, usando o Maven como gerenciador de dependências, e Java como linguagem.
Segue a baixo imagem do modelo de diagrama proposto para realização deste projeto:
![image](https://github.com/user-attachments/assets/3baa7155-1f7b-4d82-9bfe-1af690c64fca)

Foram incluídos 10 seed's de clientes conforme sugerido no desafio, seguindo a baixo o script do mesmos:
insert into tb_client (name, cpf, income, birth_Date, children) values('João batista', '324.961.970-12', 1450.00, '2001-07-25', 2)
insert into tb_client (name, cpf, income, birth_Date, children) values('Alice de Oliveira', '260.407.140-18', 2550.00, '1988-08-02', 1)
insert into tb_client (name, cpf, income, birth_Date, children) values('Daniel Juscelino', '742.451.110-62', 5200.00, '1974-01-20', 4)
insert into tb_client (name, cpf, income, birth_Date, children) values('Marie Currie', '102.300.860-20', 3500.00, '1998-03-03', 0)
insert into tb_client (name, cpf, income, birth_Date, children) values('Thais de Souza', '903.939.940-90', 2800.00, '1992-10-23', 2)
insert into tb_client (name, cpf, income, birth_Date, children) values('Antônio Carlos', '787.370.090-95', 3200.00, '1983-02-22', 3)
insert into tb_client (name, cpf, income, birth_Date, children) values('Pedro Júnior da Silva', '541.888.410-79', 2200.00, '2004-11-15', 0)
insert into tb_client (name, cpf, income, birth_Date, children) values('Elázio Schmitt', '933.317.680-22', 5500.00, '1973-08-28', 4)
insert into tb_client (name, cpf, income, birth_Date, children) values('Ana Beatrice de Silva', '164.166.460-64', 6700.00, '1964-12-25', 5)
insert into tb_client (name, cpf, income, birth_Date, children) values('Ursulina Petry Simones', '853.563.380-40', 1950.00, '2000-01-14', 1)

O projeto apresenta os seguintes tratamentos de para os recorrentes erros do checklist sugerido:
1. Busca por id retorna cliente existente
2. Busca por id retorna 404 para cliente inexistente
3. Busca paginada retorna listagem paginada corretamente
4. Inserção de cliente insere cliente com dados válidos
5. Inserção de cliente retorna 422 e mensagens customizadas com dados inválidos
6. Atualização de cliente atualiza cliente com dados válidos
7. Atualização de cliente retorna 404 para cliente inexistente
8. Atualização de cliente retorna 422 e mensagens customizadas com dados inválidos
9. Deleção de cliente deleta cliente existente
10. Deleção de cliente retorna 404 para cliente inexistente
