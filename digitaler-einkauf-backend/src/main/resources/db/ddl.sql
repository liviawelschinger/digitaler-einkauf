CREATE TABLE IF NOT EXISTS `geodata` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `strasse` varchar(50) NOT NULL DEFAULT '0',
  `nummer` varchar(15) NOT NULL DEFAULT '0',
  `plz` int(5) NOT NULL DEFAULT 0,
  `ort` varchar(50) NOT NULL DEFAULT '0',
  `longitude` varchar(21) NOT NULL DEFAULT '0',
  `latitude` varchar(21) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_einkaeufer` int(11) NOT NULL DEFAULT 0,
  `id_kommissionaer` int(11) DEFAULT 0,
  `id_lieferant` int(11) DEFAULT 0,
  `summe_kosten` varchar(5) DEFAULT '0',
  `id_status` int(11) NOT NULL DEFAULT 0,
  `created` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`),
  KEY `id` (`id`),
  KEY `FK_order_einkaeufer_person` (`id_einkaeufer`),
  KEY `FK_order_kommissionaer_user` (`id_kommissionaer`),
  KEY `FK_order_lieferant_user` (`id_lieferant`),
  KEY `FK_order_status` (`id_status`),
  CONSTRAINT `FK_order_einkaeufer_person` FOREIGN KEY (`id_einkaeufer`) REFERENCES `person` (`id`),
  CONSTRAINT `FK_order_kommissionaer_user` FOREIGN KEY (`id_kommissionaer`) REFERENCES `user` (`id`),
  CONSTRAINT `FK_order_lieferant_user` FOREIGN KEY (`id_lieferant`) REFERENCES `user` (`id`),
  CONSTRAINT `FK_order_status` FOREIGN KEY (`id_status`) REFERENCES `orderstatus` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `orderstatus` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `order_product` (
  `id_order` int(11) NOT NULL,
  `id_product` int(11) NOT NULL,
  PRIMARY KEY (`id_order`,`id_product`),
  KEY `FK__product` (`id_product`),
  KEY `FK__order` (`id_order`),
  CONSTRAINT `FK__order` FOREIGN KEY (`id_order`) REFERENCES `order` (`id`),
  CONSTRAINT `FK__product` FOREIGN KEY (`id_product`) REFERENCES `product` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vorname` varchar(100) NOT NULL,
  `nachname` varchar(100) NOT NULL,
  `id_geodata` int(11) NOT NULL DEFAULT 0,
  `telefon` varchar(25) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`),
  KEY `FK_person_geodata` (`id_geodata`),
  CONSTRAINT `FK_person_geodata` FOREIGN KEY (`id_geodata`) REFERENCES `geodata` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL DEFAULT '0',
  `alternativ` varchar(100) NOT NULL DEFAULT '0',
  `anzahl` int(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `passwort` varchar(50) DEFAULT NULL,
  `id_person` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id` (`id`),
  KEY `FK_user_person` (`id_person`),
  CONSTRAINT `FK_user_person` FOREIGN KEY (`id_person`) REFERENCES `person` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
