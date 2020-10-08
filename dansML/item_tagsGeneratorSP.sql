DELIMITER //

CREATE PROCEDURE blah(
	numTags INT
)
BEGIN
	DECLARE counter INT DEFAULT 1;
	WHILE counter <= numTags DO
		INSERT INTO hackathondb.items_tags (idItem,idTag)
		SELECT prodID, counter
		FROM hackathondb.items
		WHERE hackathondb.items.prodName RLIKE 'shoe';
        SET counter = counter + 1;
	END WHILE;
END//

DELIMITER ;

CALL blah(3);