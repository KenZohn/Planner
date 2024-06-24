-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 24/06/2024 às 15:56
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `planner`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `anotacoes`
--

CREATE TABLE `anotacoes` (
  `cod_anotacoes` int(11) NOT NULL,
  `cod_usuario` int(11) NOT NULL,
  `tipo` text NOT NULL,
  `conteudo` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `anotacoes`
--

INSERT INTO `anotacoes` (`cod_anotacoes`, `cod_usuario`, `tipo`, `conteudo`) VALUES
(2, 2, 'afazeres', 'não esquecer de entrar em contato com a Anhembi Morumbi.'),
(3, 2, 'estudos', 'Sistemas operacionais\nPOO\nestrutura de Dados\ningles'),
(4, 2, 'compras', 'Shampoo\r\nCondicionador\r\ndesodorante\nóleo'),
(8, 6, 'afazeres', 'Limpar o banheiro\nAgendar dentista'),
(9, 6, 'compras', 'Banana\nFrango\nCasa nova'),
(10, 6, 'estudos', 'Estudar Framework\nEstudar para a Maratona de Programação'),
(11, 2, 'outros', 'O que o MMC estava fazendo embaixo da escada?\nestava esperando o MDC.\nkkkk'),
(12, 17, 'afazeres', 'Hoje é um dia de muito trabalho'),
(13, 18, 'compras', 'presente da Mary (aniversário)'),
(14, 18, 'estudos', 'enviar para Carol o feedback da banca '),
(15, 18, 'outros', 'www.xyx'),
(16, 18, 'afazeres', 'academia 20h'),
(17, 6, 'outros', 'Salgado no mixaria: R$7,00\nSalgado na padaria: R$6,00\n\nO misto quente da pararia é muito bom.\nCusta R$8,50');

-- --------------------------------------------------------

--
-- Estrutura para tabela `calendario`
--

CREATE TABLE `calendario` (
  `cod_calendario` int(11) NOT NULL,
  `cod_usuario` int(11) NOT NULL,
  `ano` int(11) NOT NULL,
  `mes` int(11) NOT NULL,
  `dia` int(11) NOT NULL,
  `conteudo` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `calendario`
--

INSERT INTO `calendario` (`cod_calendario`, `cod_usuario`, `ano`, `mes`, `dia`, `conteudo`) VALUES
(1, 2, 2024, 5, 25, 'aula de ingles \nnao esquecer de entregar atividade '),
(2, 2, 2024, 6, 27, 'aniversario joaquim :D'),
(3, 0, 2024, 5, 25, 'Joinha'),
(5, 0, 2024, 5, 28, 'Eclipse solar 2'),
(10, 6, 2024, 6, 10, 'Prova de Cálculo'),
(11, 6, 2024, 6, 24, 'Prova de Contabilidade'),
(12, 6, 2024, 6, 25, 'Apresentação do PI'),
(14, 6, 2024, 7, 5, 'Último dia de aula!'),
(15, 6, 2024, 12, 13, 'Meu níver'),
(16, 6, 2024, 2, 15, 'Início das aulas'),
(17, 6, 2024, 6, 21, 'Maratona de Programação'),
(18, 6, 2024, 8, 7, 'Previsão de início das aulas'),
(20, 6, 2024, 3, 14, 'Um dia qualquer'),
(21, 2, 2024, 6, 24, 'prova do Norio'),
(22, 2, 2024, 6, 25, 'apresentação Feichas'),
(23, 2, 2024, 6, 29, 'ultima aula de inglês'),
(25, 2, 2024, 6, 19, '14h banca João\n15h banc Claudinei\n16h banca Vanderleia'),
(26, 18, 2024, 6, 19, '14h banca 1\n15h banca 2\n16h banca 3'),
(28, 6, 2024, 7, 20, 'Churrasco com a galera');

-- --------------------------------------------------------

--
-- Estrutura para tabela `gastos`
--

CREATE TABLE `gastos` (
  `cod_gastos` int(4) NOT NULL,
  `cod_usuario` int(4) NOT NULL,
  `tipo_gastos` text NOT NULL,
  `ano` int(4) NOT NULL,
  `mes` int(2) NOT NULL,
  `linha_item` int(4) NOT NULL,
  `descricao` text NOT NULL,
  `valor` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `gastos`
--

INSERT INTO `gastos` (`cod_gastos`, `cod_usuario`, `tipo_gastos`, `ano`, `mes`, `linha_item`, `descricao`, `valor`) VALUES
(1, 6, 'fixo', 0, 6, 0, 'Aluguel', 670),
(2, 6, 'fixo', 0, 6, 1, 'Internet', 94.9),
(3, 6, 'fixo', 0, 6, 2, 'Celular', 33),
(4, 6, 'fixo', 0, 6, 3, 'Água', 38.8),
(5, 6, 'fixo', 0, 6, 4, 'Luz', 45),
(6, 6, 'mercado', 0, 6, 0, 'Semana 1', 120),
(7, 6, 'mercado', 0, 6, 1, 'Semana 2', 130),
(8, 6, 'fixo', 0, 5, 0, 'Aluguel', 670),
(9, 6, 'fixo', 0, 5, 1, 'Água', 38),
(10, 6, 'fixo', 0, 5, 2, 'Luz', 45),
(11, 6, 'lazer', 0, 6, 0, 'Cinema', 40),
(12, 6, 'fixo', 0, 1, 0, 'Aluguel', 670),
(13, 6, 'fixo', 0, 2, 0, 'Aluguel', 670),
(14, 6, 'fixo', 0, 1, 1, 'Internet', 94.9),
(15, 6, 'fixo', 0, 1, 2, 'Celular', 33),
(16, 6, 'fixo', 0, 1, 3, 'Água', 38),
(17, 6, 'fixo', 0, 1, 4, 'Luz', 45),
(18, 2, 'fixo', 0, 6, 0, 'aluguel', 700),
(19, 2, 'fixo', 0, 6, 3, 'internet', 240),
(20, 2, 'fixo', 0, 6, 1, 'agua', 200),
(21, 2, 'mercado', 0, 6, 0, 'arroz', 30),
(22, 2, 'mercado', 0, 6, 1, 'feijao', 12),
(23, 2, 'mercado', 0, 6, 2, 'óleo', 10),
(24, 2, 'mercado', 0, 6, 3, 'sal', 8),
(25, 2, 'mercado', 0, 6, 4, 'açucar', 7),
(26, 2, 'mercado', 0, 6, 5, 'pó de café', 15),
(27, 2, 'lazer', 0, 6, 0, 'cinema', 50),
(28, 2, 'outros', 0, 6, 0, 'gasolina', 200),
(29, 2, 'fixo', 2024, 6, 2, 'Luz', 300),
(30, 2, 'fixo', 0, 5, 0, 'aluguel', 700),
(31, 2, 'fixo', 0, 5, 1, 'agua', 200),
(32, 2, 'fixo', 0, 5, 2, 'luz', 300),
(33, 2, 'fixo', 0, 5, 3, 'internet', 240),
(34, 2, 'mercado', 0, 5, 0, 'macarrao', 5),
(35, 2, 'mercado', 0, 5, 1, 'molho de tomate', 6),
(36, 2, 'lazer', 0, 5, 0, 'show', 100),
(37, 2, 'outros', 0, 5, 0, 'gasolina', 200),
(38, 18, 'lazer', 0, 6, 0, 'academia', 370),
(39, 18, 'mercado', 0, 6, 0, 'spani', 600),
(40, 18, 'outros', 0, 6, 0, 'carro', 300),
(41, 6, 'fixo', 0, 3, 0, 'Aluguel', 670),
(42, 6, 'fixo', 0, 2, 1, 'Internet', 94.9),
(43, 6, 'fixo', 0, 2, 2, 'Celular', 33),
(44, 6, 'fixo', 0, 2, 3, 'Luz', 45),
(45, 6, 'fixo', 0, 2, 4, 'Água', 38),
(46, 6, 'fixo', 0, 3, 1, 'Internet', 95),
(47, 6, 'fixo', 0, 3, 2, 'Celular', 40),
(48, 6, 'fixo', 0, 3, 3, 'Luz', 80),
(49, 6, 'fixo', 0, 3, 4, 'Água', 40),
(50, 6, 'fixo', 0, 4, 0, 'Aluguel', 700),
(51, 6, 'fixo', 0, 4, 1, 'Internet', 100),
(52, 6, 'fixo', 0, 4, 2, 'Celular', 33),
(53, 6, 'fixo', 0, 4, 3, 'Luz', 45),
(54, 6, 'fixo', 0, 4, 4, 'Água', 39),
(55, 6, 'fixo', 0, 5, 3, 'Internet', 95),
(56, 6, 'fixo', 0, 5, 4, 'Celular', 33),
(57, 6, 'fixo', 0, 7, 0, 'Aluguel', 0),
(58, 6, 'fixo', 0, 7, 1, '', 0),
(59, 6, 'fixo', 0, 7, 2, '', 0),
(60, 6, 'fixo', 0, 7, 3, '', 0),
(61, 6, 'fixo', 0, 7, 4, '', 0),
(62, 6, 'mercado', 0, 1, 0, 'Semana 1', 150),
(63, 6, 'mercado', 0, 1, 1, 'Semana 2', 200),
(64, 6, 'mercado', 0, 1, 2, 'Semana 3', 180),
(65, 6, 'mercado', 0, 1, 3, 'Semana 4', 200),
(66, 6, 'lazer', 0, 1, 0, 'Viagem', 95),
(67, 6, 'mercado', 0, 2, 0, 'Semana 1', 200),
(68, 6, 'mercado', 0, 2, 1, 'Semana 2', 250),
(69, 6, 'mercado', 0, 2, 2, 'Semana 3', 300),
(70, 6, 'mercado', 0, 2, 3, 'Semana 4', 400),
(71, 6, 'lazer', 0, 2, 0, 'Cinema', 50),
(72, 6, 'mercado', 0, 3, 0, 'Semana 1', 150),
(73, 6, 'mercado', 0, 3, 1, 'Semana 2', 200),
(74, 6, 'mercado', 0, 3, 2, 'Semana 3', 180),
(75, 6, 'mercado', 0, 3, 3, 'Semana 4', 192.5),
(76, 6, 'mercado', 0, 4, 0, 'Semana 1', 200),
(77, 6, 'mercado', 0, 4, 1, 'Semana 2', 150),
(78, 6, 'mercado', 0, 4, 2, 'Semana 3', 140),
(79, 6, 'mercado', 0, 4, 3, 'Semana 4', 150),
(80, 6, 'mercado', 0, 5, 0, 'Semana 1', 120),
(81, 6, 'mercado', 0, 5, 1, 'Semana 2', 130),
(82, 6, 'mercado', 0, 5, 2, 'Semana 3', 180),
(83, 6, 'mercado', 0, 5, 3, 'Semana 4', 200),
(84, 6, 'lazer', 0, 2, 1, 'Churrasco', 60),
(85, 6, 'mercado', 0, 6, 2, 'Semana 3', 140),
(86, 6, 'mercado', 0, 6, 3, 'Semana 4', 150),
(87, 6, 'lazer', 0, 6, 1, 'Churrasco', 100);

-- --------------------------------------------------------

--
-- Estrutura para tabela `usuario`
--

CREATE TABLE `usuario` (
  `cod_usuario` int(4) NOT NULL,
  `nome` varchar(60) NOT NULL,
  `email` varchar(60) NOT NULL,
  `login` varchar(30) NOT NULL,
  `senha` varchar(30) NOT NULL,
  `pergunta` text NOT NULL,
  `resposta` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `usuario`
--

INSERT INTO `usuario` (`cod_usuario`, `nome`, `email`, `login`, `senha`, `pergunta`, `resposta`) VALUES
(0, 'Aladim', 'lampadamagica123@email.com', 'admin', '123456', 'Qual é a cidade que sua mãe nasceu?', 'China'),
(2, 'Thais', 'thais.ferreira@email.com', 'thaisf', '123456', 'Quem você era no Naruto?', 'Itachi'),
(6, 'Johnny Mukai', 'johnny.bravo@email.com', 'johnny', '1', 'Quem você era no RBD?', 'Lupita'),
(14, 'joao guilherme', 'joao.guilherme@fatec.com', 'joao', '123', 'Qual é o nome do seu primeiro Pet?', 'Pancinha'),
(15, 'sophia ferreira capucho', 'sophiacapucho@planner.com', 'sophia', '354679', 'Qual é o nome do seu primeiro Pet?', 'Thor'),
(17, 'Billy Bruto', 'Seilá', 'kiling', 'kiling', 'Qual é o nome do seu primeiro Pet?', 'Titito');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `anotacoes`
--
ALTER TABLE `anotacoes`
  ADD PRIMARY KEY (`cod_anotacoes`);

--
-- Índices de tabela `calendario`
--
ALTER TABLE `calendario`
  ADD PRIMARY KEY (`cod_calendario`);

--
-- Índices de tabela `gastos`
--
ALTER TABLE `gastos`
  ADD PRIMARY KEY (`cod_gastos`);

--
-- Índices de tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`cod_usuario`),
  ADD UNIQUE KEY `login` (`login`),
  ADD UNIQUE KEY `email` (`email`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `anotacoes`
--
ALTER TABLE `anotacoes`
  MODIFY `cod_anotacoes` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de tabela `calendario`
--
ALTER TABLE `calendario`
  MODIFY `cod_calendario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT de tabela `gastos`
--
ALTER TABLE `gastos`
  MODIFY `cod_gastos` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=88;

--
-- AUTO_INCREMENT de tabela `usuario`
--
ALTER TABLE `usuario`
  MODIFY `cod_usuario` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
