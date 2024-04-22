INSERT INTO Rol (codigo, nombre)
VALUES
  (1, 'Administrador'),
  (2, 'Agente'),
  (3, 'Viewer');

INSERT INTO MyUser (idUser, creationDate, modificationDate, login, name, password, creatorUser, modifierUser)
VALUES
  ('user1', '2024-04-08', '2024-04-08', 'admin', 'Stan Marsh', 'password123', null, null),
  ('user2', '2024-04-08', '2024-04-08', 'instructor', 'Kyle Broflovski', 'password456', null, null),
  ('user3', '2024-04-08', '2024-04-08', 'cliente1', 'Eric Cartman', 'password789', null, null),
  ('user4', '2024-04-08', '2024-04-08', 'recepcionista', 'Kenny McCormick', 'password000', null, null),
  ('user5', '2024-04-08', '2024-04-08', 'mantenimiento', 'Bebe Stevens', 'password111', null, null),
  ('user6', '2024-04-08', '2024-04-08', 'seguridad', 'Randy Marsh', 'password222', null, null),
  ('user7', '2024-04-08', '2024-04-08', 'supervisor', 'Gerald Broflovski', 'password333', null, null),
  ('user8', '2024-04-08', '2024-04-08', 'gerente', 'Stuart Cartman', 'password444', null, null),
  ('user9', '2024-04-08', '2024-04-08', 'cajero', 'Stephen Stotch', 'password555', null, null),
  ('user10', '2024-04-08', '2024-04-08', 'instructor_snowboard', 'Trey Parker', 'password666', null, null),
  ('user11', '2024-04-08', '2024-04-08', 'instructor_esqui', 'Matt Stone', 'password777', null, null),
  ('user12', '2024-04-08', '2024-04-08', 'instructor_tubing', 'Chef', 'password888', null, null),
  ('user13', '2024-04-08', '2024-04-08', 'operador_sillas', 'Mr. Mackey', 'password999', null, null);
  

INSERT INTO Client (idClient, idTiid, email, creationDate, modificationDate, name, identificationNumber, lastName, gender, cellphone)
VALUES
  ('client4', '123456780', 'stark@southpark.com', '2024-04-08', '2024-04-08', 'Tweek Stark', '1234567810', 'Stark', 'M', '312-555-1215'),
  ('client5', '987654322', 'mcormick@southpark.com', '2024-04-08', '2024-04-08', 'Kenny McCormick', '9876543230', 'McCormick', 'M', '312-555-1216'),
  ('client6', '000000001', 'stevens@southpark.com', '2024-04-08', '2024-04-08', 'Bebe Stevens', '0000000010', 'Stevens', 'F', '312-555-1217'),
  ('client7', '123456782', 'randy@southpark.com', '2024-04-08', '2024-04-08', 'Randy Marsh', '1234567820', 'Marsh', 'M', '312-555-1218'),
  ('client8', '987654324', 'broflovski2@southpark.com', '2024-04-08', '2024-04-08', 'Sheila Broflovski', '9876543240', 'Broflovski', 'F', '312-555-1219'),
  ('client9', '000000002', 'stotsch@southpark.com', '2024-04-08', '2024-04-08', 'Stephen Stotch', '0000000020', 'Stotch', 'M', '312-555-1220'),
  ('client10', '123456783', 'parker@southpark.com', '2024-04-08', '2024-04-08', 'Trey Parker', '1234567830', 'Parker', 'M', '312-555-1221'),
  ('client11', '987654325', 'stone@southpark.com', '2024-04-08', '2024-04-08', 'Matt Stone', '9876543250', 'Stone', 'M', '312-555-1222'),
  ('client12', '000000003', 'chef@southpark.com', '2024-04-08', '2024-04-08', 'Chef', '0000000030', 'Chef', 'M', '312-555-1223'),
  ('client13', '123456784', 'mackey@southpark.com', '2024-04-08', '2024-04-08', 'Mr. Mackey', '1234567840', 'Mackey', 'M', '312-555-1224');

INSERT INTO Activity (code, name, description)
VALUES
  ('FUTBOL1', 'Fútbol', 'Disfruta de un emocionante partido de fútbol con tus amigos'),
  ('FUTBOL2', 'Fútbol', 'Alquila esta cancha de fútbol y demuestra tus habilidades'),
  ('VOLEY1', 'Voleibol', 'Salta y remata en un partido de voleibol lleno de emoción'),
  ('VOLEY2', 'Voleibol', 'Alquila esta cancha de voleibol y practica con tu equipo'),
  ('EVENT', 'Salón de Eventos', 'Celebra tus eventos más especiales en nuestro amplio y versátil salón'),
  ('POOL', 'Piscina', 'Refresca tu cuerpo y mente en nuestra refrescante piscina'),
  ('GYM', 'Gimnasio', 'Mantente en forma en nuestro gimnasio equipado con máquinas de última generación'),
  ('PLAYROOM', 'Sala de Juegos', 'Diviértete con tus amigos en nuestra sala de juegos con mesas de billar, futbolito y más'),
  ('KARAOKE', 'Karaoke', 'Canta tus canciones favoritas en nuestro divertido karaoke'),
  ('GAMEROOM', 'Sala de Videojuegos', 'Disfruta de los últimos videojuegos en nuestra sala de videojuegos');

INSERT INTO Booking (idBooking, idClient, idActivity, bookingDate, duration, hour, status, description)
VALUES
  ('booking1', 'client4', 'FUTBOL1', '2024-04-09', 1, '09:00:00', 'Confirmado', 'Partido de fútbol con amigos'),
  ('booking2', 'client5', 'FUTBOL2', '2024-04-09', 1, '10:00:00', 'Confirmado', 'Alquiler de cancha de fútbol'),
  ('booking3', 'client6', 'VOLEY1', '2024-04-09', 1, '11:00:00', 'Confirmado', 'Partido de voleibol en familia'),
  ('booking4', 'client7', 'VOLEY2', '2024-04-09', 1, '12:00:00', 'Confirmado', 'Entrenamiento de voleibol con equipo'),
  ('booking5', 'client8', 'EVENT', '2024-04-09', 1, '13:00:00', 'Confirmado', 'Evento corporativo en el salón de eventos');

INSERT INTO CancelationBooking (idCancelationBooking, idBooking, reason)
VALUES
  ('cancel1', 'booking1', 'El cliente tuvo un cambio de horario inesperado'),
  ('cancel2', 'booking3', 'Condiciones climáticas adversas'),
  ('cancel3', 'booking5', 'Cambio en los planes de la empresa');

INSERT INTO ActivityDetails (idActivityDetails, code, details, cost, status)
VALUES
  ('detail1', 'FUTBOL1', 'Disfruta de una hora de emocionante partido de fútbol con tus amigos', 10.00, 'Disponible'),
  ('detail2', 'FUTBOL2', 'Alquila la cancha de fútbol para mostrar tus habilidades durante una hora', 20.00, 'Disponible'),
  ('detail3', 'VOLEY1', 'Juega un partido de voleibol durante una hora llena de diversión y emoción', 15.00, 'Disponible'),
  ('detail4', 'VOLEY2', 'Reserva la cancha de voleibol para entrenar con tu equipo durante una hora', 25.00, 'Disponible'),
  ('detail5', 'EVENT', 'Celebra tus eventos especiales en nuestro amplio y versátil salón de eventos', 100.00, 'Disponible'),
  ('detail6', 'POOL', 'Relájate y refréscate en nuestra piscina durante todo el día', 30.00, 'Disponible'),
  ('detail7', 'GYM', 'Mantén tu cuerpo en forma utilizando nuestras instalaciones de gimnasio', 25.00, 'Disponible'),
  ('detail8', 'PLAYROOM', 'Diviértete con amigos en nuestra sala de juegos con billar, futbolito y más', 15.00, 'Disponible'),
  ('detail9', 'KARAOKE', 'Canta tus canciones favoritas en nuestro divertido karaoke durante una hora', 20.00, 'Disponible'),
  ('detail10', 'GAMEROOM', 'Disfruta de los últimos videojuegos en nuestra sala de videojuegos', 10.00, 'Disponible');

INSERT INTO PhysicalSpace (idPhysicalSpace, name, description, location, capacity)
VALUES
  ('space1', 'Cancha de Fútbol', 'Cancha de fútbol reglamentaria con césped artificial', 'Campo de Deportes', 20),
  ('space2', 'Cancha de Voleibol', 'Cancha de voleibol de arena para partidos y entrenamiento', 'Área Recreativa', 12),
  ('space3', 'Salón de Eventos', 'Amplio salón con capacidad para eventos privados y corporativos', 'Centro de Convenciones', 100),
  ('space4', 'Piscina', 'Piscina al aire libre con toboganes y áreas de descanso', 'Área de Recreación Acuática', 50),
  ('space5', 'Gimnasio', 'Gimnasio equipado con máquinas de entrenamiento cardiovascular y pesas', 'Centro de Acondicionamiento Físico', 30),
  ('space6', 'Sala de Juegos', 'Sala de juegos con mesas de billar, futbolito, y juegos de arcade', 'Área de Entretenimiento', 20),
  ('space7', 'Karaoke Bar', 'Bar con escenario y equipo de sonido para divertidas noches de karaoke', 'Área de Entretenimiento Nocturno', 40),
  ('space8', 'Sala de Videojuegos', 'Espacio con consolas de última generación y una amplia selección de videojuegos', 'Área de Entretenimiento Digital', 15);

INSERT INTO Schedule (idSchedule, dayOfWeek, month, iniHour, endHour)
VALUES
  ('schedule1', 'Lunes', 'Abril', '09:00:00', '17:00:00'),
  ('schedule2', 'Martes', 'Abril', '09:00:00', '17:00:00'),
  ('schedule3', 'Miércoles', 'Abril', '09:00:00', '17:00:00'),
  ('schedule4', 'Jueves', 'Abril', '09:00:00', '17:00:00'),
  ('schedule5', 'Viernes', 'Abril', '09:00:00', '17:00:00');

INSERT INTO Availability (idAvailability, idPhysicalSpace, idSchedule, availableDate, availableCapacity)
VALUES
  ('availability1', 'space1', 'schedule1', '2024-04-09', 50),
  ('availability2', 'space2', 'schedule2', '2024-04-09', 200),
  ('availability3', 'space3', 'schedule3', '2024-04-09', 100),
  ('availability4', 'space4', 'schedule4', '2024-04-09', 50);
