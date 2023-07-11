-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 11-07-2023 a las 03:12:15
-- Versión del servidor: 8.0.31
-- Versión de PHP: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `e-commerce-prueba`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `employee_seq`
--

DROP TABLE IF EXISTS `employee_seq`;
CREATE TABLE IF NOT EXISTS `employee_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Volcado de datos para la tabla `employee_seq`
--

INSERT INTO `employee_seq` (`next_val`) VALUES
(5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

DROP TABLE IF EXISTS `producto`;
CREATE TABLE IF NOT EXISTS `producto` (
  `idproducto` bigint NOT NULL AUTO_INCREMENT,
  `nompro` varchar(45) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  PRIMARY KEY (`idproducto`)
) ENGINE=InnoDB AUTO_INCREMENT=354 DEFAULT CHARSET=utf8mb3;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idproducto`, `nompro`, `precio`) VALUES
(352, 'Coca Cola 2.5l', 500),
(353, 'Sprite 2.5l', 500);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto_seq`
--

DROP TABLE IF EXISTS `producto_seq`;
CREATE TABLE IF NOT EXISTS `producto_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Volcado de datos para la tabla `producto_seq`
--

INSERT INTO `producto_seq` (`next_val`) VALUES
(451);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `stock`
--

DROP TABLE IF EXISTS `stock`;
CREATE TABLE IF NOT EXISTS `stock` (
  `idstock` bigint NOT NULL,
  `idproducto` bigint NOT NULL,
  `nompro` varchar(45) DEFAULT NULL,
  `cantidad` float DEFAULT NULL,
  PRIMARY KEY (`idstock`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Volcado de datos para la tabla `stock`
--

INSERT INTO `stock` (`idstock`, `idproducto`, `nompro`, `cantidad`) VALUES
(3, 352, 'Coca Cola 2.5l', 1),
(4, 353, 'Sprite 2.5l', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `stock_seq`
--

DROP TABLE IF EXISTS `stock_seq`;
CREATE TABLE IF NOT EXISTS `stock_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Volcado de datos para la tabla `stock_seq`
--

INSERT INTO `stock_seq` (`next_val`) VALUES
(101);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

DROP TABLE IF EXISTS `venta`;
CREATE TABLE IF NOT EXISTS `venta` (
  `idventa` bigint NOT NULL,
  `idventafecha` bigint NOT NULL,
  `idproducto` bigint NOT NULL,
  `nompro` varchar(45) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `cantidad` float DEFAULT NULL,
  `total` float DEFAULT NULL,
  PRIMARY KEY (`idventa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`idventa`, `idventafecha`, `idproducto`, `nompro`, `precio`, `cantidad`, `total`) VALUES
(52, 20230205185548, 2, 'Arroz 500gr', 120, 1, 120),
(53, 20230205185548, 3, 'Tallarines 500gr', 250, 1, 250),
(54, 20230205185548, 4, 'Papel higienico', 500, 1, 500),
(55, 20230205185548, 1, 'Coca Cola 2.5l', 500, 1, 500),
(56, 20230205185708, 10, 'Jabon tocador', 150, 4, 150),
(57, 20230205185708, 1, 'Coca Cola 2.5l', 500, 2, 500),
(58, 20230205185708, 7, 'Galletitas surtidas Terrabussi', 500, 2, 500),
(59, 20230205185708, 6, 'Pure de tomate', 300, 1, 300),
(60, 20230206013524, 3, 'Tallarines 500gr', 250, 1, 250),
(61, 20230206013524, 7, 'Galletitas surtidas Terrabussi', 500, 1, 500),
(62, 20230206013524, 6, 'Pure de tomate', 300, 1, 300),
(102, 20230702014129, 2, 'Arroz 500gr', 120, 1, 120),
(103, 20230702014129, 1, 'Coca Cola 2.5l', 500, 1, 500),
(104, 20230702014129, 3, 'Tallarines 500gr', 250, 1, 250),
(105, 20230702014205, 1, 'Coca Cola 2.5l', 500, 11, 500),
(106, 20230702020830, 1, 'Coca Cola 2.5l', 500, 10, 500),
(107, 20230702020830, 2, 'Arroz 500gr', 120, 10, 120),
(152, 20230702170803, 2, 'Arroz 500gr', 120, 3, 120),
(153, 20230702170803, 1, 'Coca Cola 2.5l', 500, 3, 500),
(154, 20230702171132, 1, 'Coca Cola 2.5l', 500, 3, 500),
(155, 20230702171132, 2, 'Arroz 500gr', 120, 3, 120),
(156, 20230702171344, 1, 'Coca Cola 2.5l', 500, 5, 500),
(157, 20230702171344, 2, 'Arroz 500gr', 120, 5, 120),
(158, 20230702171344, 4, 'Papel higienico', 500, 5, 500),
(159, 20230702172707, 1, 'Coca Cola 2.5l', 500, 1, 500),
(160, 20230702172717, 1, 'Coca Cola 2.5l', 500, 1, 500),
(161, 20230702172727, 1, 'Coca Cola 2.5l', 500, 1, 500),
(162, 20230702172727, 2, 'Arroz 500gr', 120, 1, 120),
(163, 20230702172743, 1, 'Coca Cola 2.5l', 500, 2, 500),
(164, 20230702172743, 2, 'Arroz 500gr', 120, 2, 120),
(165, 20230702172801, 3, 'Tallarines 500gr', 250, 3, 250),
(166, 20230702172801, 1, 'Coca Cola 2.5l', 500, 3, 500),
(167, 20230702172924, 3, 'Tallarines 500gr', 250, 1, 250),
(168, 20230702172924, 2, 'Arroz 500gr', 120, 3, 120),
(169, 20230702172924, 4, 'Papel higienico', 500, 2, 500),
(170, 20230702173046, 2, 'Arroz 500gr', 120, 5, 120),
(171, 20230702173046, 1, 'Coca Cola 2.5l', 500, 5, 500),
(172, 20230702173046, 3, 'Tallarines 500gr', 250, 5, 250),
(173, 20230702173046, 4, 'Papel higienico', 500, 5, 500),
(241, 20230705211001, 1, 'Coca Cola 2.5l', 500, 1, 500),
(242, 20230705211024, 1, 'Coca Cola 2.5l', 500, 1, 500),
(243, 20230705211155, 1, 'Coca Cola 2.5l', 500, 1, 500),
(252, 20230706164122, 1, 'Coca Cola 2.5l', 500, 1, 500),
(253, 20230706164130, 1, 'Coca Cola 2.5l', 500, 1, 500),
(254, 20230706164342, 1, 'Coca Cola 2.5l', 500, 1, 500),
(255, 20230706164433, 1, 'Coca Cola 2.5l', 500, 1, 500),
(256, 20230706164925, 1, 'Coca Cola 2.5l', 500, 1, 500),
(257, 20230706165050, 1, 'Coca Cola 2.5l', 500, 1, 500),
(258, 20230706165304, 1, 'Coca Cola 2.5l', 500, 1, 500),
(259, 20230706165331, 1, 'Coca Cola 2.5l', 500, 1, 500),
(260, 20230706165539, 1, 'Coca Cola 2.5l', 500, 1, 500),
(261, 20230706165955, 1, 'Coca Cola 2.5l', 500, 1, 500),
(262, 20230706170112, 1, 'Coca Cola 2.5l', 500, 1, 500),
(263, 20230706170119, 1, 'Coca Cola 2.5l', 500, 1, 500),
(264, 20230706170132, 1, 'Coca Cola 2.5l', 500, 1, 500),
(265, 20230706170221, 2, 'Arroz 500gr', 120, 1, 120),
(266, 20230706170355, 1, 'Coca Cola 2.5l', 500, 1, 500),
(267, 20230706170435, 1, 'Coca Cola 2.5l', 500, 1, 500),
(268, 20230706170525, 1, 'Coca Cola 2.5l', 500, 1, 500),
(302, 20230708162458, 1, 'Coca Cola 2.5l', 500, 1, 500);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta_seq`
--

DROP TABLE IF EXISTS `venta_seq`;
CREATE TABLE IF NOT EXISTS `venta_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Volcado de datos para la tabla `venta_seq`
--

INSERT INTO `venta_seq` (`next_val`) VALUES
(401);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
