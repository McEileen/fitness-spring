CREATE TABLE `fitness`.`profiles` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `version` INT NOT NULL DEFAULT 0,
    `user_id` INT NOT NULL,
     `gender` ENUM('M', 'F') NOT NULL,
     `age` INT,
     `height` FLOAT,
     `weight` INT,
     `photo` VARCHAR(255),
     `created` TIMESTAMP NOT NULL DEFAULT NOW(),
     `modified` TIMESTAMP NOT NULL DEFAULT NOW(),
      CONSTRAINT `fk_userprofiles_v3`
      FOREIGN KEY (`user_id`)
      REFERENCES `fitness`.`users` (`id`)
        ON DELETE NO ACTION
        ON UPDATE NO ACTION,
      PRIMARY KEY (`id`));