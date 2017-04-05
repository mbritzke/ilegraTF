# ilegraTF
Trabalho final do programa JTs

O desafio proposto é o projeto e implementação de uma aplicação para uma Farmácia que faz e-commerce.

A Farmácia precisa dos seguintes serviços (você deverá disponibilizar essas informações, para escolha do usuário, na forma de um Menu):
 -- Deverá conter um cadastro de cliente, no qual a busca se dará por CPF ou RG.
 -- Deverá conter um cadastro de medicamentos, no qual a busca se dará por nome, fabricante, principal composto, ou descrição parcial de acordo com o tipo de medicamento. Os medicamentos poderão ser Quimioterápicos ou Fitoterápicos. Os medicamentos Quimioterápicos deverão ter a informação sobre se são vendidos apenas mediante receita ou não (exemplo: remédios tarja preta e antibióticos).
 -- Através do sistema deverá ser possível efetuar vendas, e estas se darão APENAS para clientes cadastrados no sistema.
 -- Durante a venda, haverá 20% de desconto para clientes idosos, e 10% de desconto nas compras acima de 150 reais (os descontos não são
acumulativos).
 -- Existe um programa de fidelidade automático onde a cada 10 reais pagos pelo cliente, o sistema gera 5 pontos para ele.
 -- O cliente pode na hora da compra, optar por pagar com dinheiro/cartão ou pontos. Caso ele opte por pagar com pontos, o número de pontos total do cliente deverá corresponder a um valor maior ou igual ao total da venda.
 -- Durante a venda de remédios Quimioterápicos, se um dos remédios for do tipo controlado (que exige apresentação de receita para a compra), o sistema deverá emitir um alerta ao atendente questionando se o mesmo verificou a receita do respectivo remédio (deverá ser informado no alerta o nome do remédio controlado).

Impressão de relatórios:
-- Listagem de clientes cadastrados, por nome, em ordem alfabética crescente (A-Z), especificando os dados do cliente;
-- Listagem por tipo de clientes atendidos (idosos, clientes de convênios/planos de saúde e outros).
-- Listagem de medicamentos por ordem alfabética;
-- Listagem dos medicamentos Quimioterápicos ou Fitoterápicos;
-- Estatística (exibidas em percentual) dos atendimentos realizados ao final do dia:
   a) Tipos de clientes (idosos ou não);
   b) Remédio mais vendido;
   c) Quimioterápicos ou Fitoterápicos.
   
- Enunciado adaptado referente ao trabalho final de semestre na disciplina de Algoritmos e Programação I, ofertada na Faculdade de Informática ministrada pela Professora Lucia Giraffa na Pontifícia Universidade Católica do Rio Grande do Sul.
