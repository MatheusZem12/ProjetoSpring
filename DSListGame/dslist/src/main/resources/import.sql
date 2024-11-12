INSERT INTO tb_games(title, genre, short_description, long_description, platform, img_url, launch_year, score)VALUES('Minecraft', 'Aventura', 'Criação e sobrevivência', 'Explore um mundo infinito e crie desde casas simples até castelos grandiosos', 'PC', 'minecraft.jpeg', 2011, 4.9);

INSERT INTO tb_games(title, genre, short_description, long_description, platform, img_url, launch_year, score)VALUES('The Witcher 3', 'RPG', 'Caça-monstros lendário', 'Siga Geralt em uma jornada épica para encontrar sua filha', 'PS4', 'witcher3.jpeg', 2015, 4.7);

INSERT INTO tb_games(title, genre, short_description, long_description, platform, img_url, launch_year, score)VALUES('Among Us', 'Estratégia', 'Desmascare o impostor', 'Trabalhe em equipe para identificar o impostor ou sabote seus colegas', 'PC', 'amongus.jpeg', 2018, 4.2);

INSERT INTO tb_games(title, genre, short_description, long_description, platform, img_url, launch_year, score)VALUES('God of War', 'Ação', 'Aventura épica', 'Acompanhe Kratos e seu filho em uma jornada cheia de desafios e mitologia nórdica', 'PS4', 'godofwar.jpeg', 2018, 4.9);

INSERT INTO tb_games(title, genre, short_description, long_description, platform, img_url, launch_year, score)VALUES('Valorant', 'FPS', 'Jogo de tiro tático', 'Combate tático entre agentes com habilidades únicas', 'PC', 'valorant.jpeg', 2020, 4.3);

INSERT INTO tb_games(title, genre, short_description, long_description, platform, img_url, launch_year, score)VALUES('Stardew Valley', 'Simulação', 'Fazenda e amizade', 'Construa sua fazenda e faça amigos na comunidade', 'Switch', 'stardew.jpeg', 2016, 4.6);

INSERT INTO tb_games(title, genre, short_description, long_description, platform, img_url, launch_year, score)VALUES('League of Legends', 'MOBA', 'Batalha de equipes', 'Compita em equipes para destruir a base inimiga', 'PC', 'lol.jpeg', 2009, 4.5);

INSERT INTO tb_games(title, genre, short_description, long_description, platform, img_url, launch_year, score)VALUES('Dark Souls III', 'RPG', 'Desafio sombrio', 'Explore um mundo brutal enquanto enfrenta inimigos implacáveis', 'PC', 'darksouls3.jpeg', 2016, 4.8);

INSERT INTO tb_games(title, genre, short_description, long_description, platform, img_url, launch_year, score)VALUES('Cyberpunk 2077', 'RPG', 'Futuro distópico', 'Explore a cidade de Night City em uma narrativa intensa', 'PS4', 'cyberpunk.jpeg', 2020, 4.0);

INSERT INTO tb_games(title, genre, short_description, long_description, platform, img_url, launch_year, score)VALUES('Animal Crossing', 'Simulação', 'Ilha paradisíaca', 'Construa sua própria ilha e faça amizades com habitantes únicos', 'Switch', 'animalcrossing.jpeg', 2020, 4.8);


INSERT INTO tb_game_list(name)VALUES('MMO RPG');

INSERT INTO tb_game_list(name)VALUES('Aventura');

INSERT INTO tb_belonging(games_id, games_list_id, position)VALUES(1,1,0);
INSERT INTO tb_belonging(games_id, games_list_id, position)VALUES(2,1,1);
INSERT INTO tb_belonging(games_id, games_list_id, position)VALUES(3,1,2);
INSERT INTO tb_belonging(games_id, games_list_id, position)VALUES(4,1,3);
INSERT INTO tb_belonging(games_id, games_list_id, position)VALUES(5,1,4);
INSERT INTO tb_belonging(games_id, games_list_id, position)VALUES(6,2,0);
INSERT INTO tb_belonging(games_id, games_list_id, position)VALUES(7,2,1);
INSERT INTO tb_belonging(games_id, games_list_id, position)VALUES(8,2,2);
INSERT INTO tb_belonging(games_id, games_list_id, position)VALUES(9,2,3);
INSERT INTO tb_belonging(games_id, games_list_id, position)VALUES(10,2,4);