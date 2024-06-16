-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 16/06/2024 às 19:09
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
(2, 2, 'afazeres', 'Não esquecer de lavar o uniforme\r\n\r\n'),
(3, 2, 'estudos', 'Prova de Cálculo no dia 10'),
(4, 2, 'compras', 'Shampoo\r\nCondicionador\r\n'),
(8, 6, 'afazeres', 'Limpar o banheiro'),
(9, 6, 'compras', 'Banana\nFrango'),
(10, 6, 'estudos', 'Estudar Framework'),
(11, 6, 'outros', 'Johnny');

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
(15, 6, 2024, 12, 13, 'Níver de alguém...'),
(16, 6, 2024, 2, 15, 'Início das aulas'),
(18, 6, 2024, 1, 1, 'Johnny');

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
(6, 6, 'mercado', 0, 6, 0, 'Alimentos', 45.8),
(7, 6, 'mercado', 0, 6, 1, 'Whey Protein', 75),
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
(18, 6, 'outros', 0, 1, 0, 'Johnny', 10),
(19, 6, 'mercado', 0, 6, 2, 'Shampoo', 12);

-- --------------------------------------------------------

--
-- Estrutura para tabela `usuario`
--

CREATE TABLE `usuario` (
  `cod_usuario` int(4) NOT NULL,
  `nome` varchar(60) NOT NULL,
  `email` varchar(60) NOT NULL,
  `login` varchar(30) NOT NULL,
  `senha` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `usuario`
--

INSERT INTO `usuario` (`cod_usuario`, `nome`, `email`, `login`, `senha`) VALUES
(0, 'Aladim', 'lampadamagica123@email.com', 'admin', '123456'),
(2, 'Thais', 'thais.ferreira@email.com', 'thaisf', '354679'),
(6, 'Johnny Mukai', 'johnny.bravo@email.com', 'johnny', '1');

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
  MODIFY `cod_anotacoes` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de tabela `calendario`
--
ALTER TABLE `calendario`
  MODIFY `cod_calendario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de tabela `gastos`
--
ALTER TABLE `gastos`
  MODIFY `cod_gastos` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de tabela `usuario`
--
ALTER TABLE `usuario`
  MODIFY `cod_usuario` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
