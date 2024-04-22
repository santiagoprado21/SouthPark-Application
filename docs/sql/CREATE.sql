CREATE TABLE Rol (
  codigo INT PRIMARY KEY,
  nombre VARCHAR(255) NOT NULL
);

CREATE TABLE MyUser (
  idUser VARCHAR(255) PRIMARY KEY,
  creationDate DATE NOT NULL,
  modificationDate DATE,
  login VARCHAR(255) NOT NULL,
  name VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL,
  creatorUser VARCHAR(255) REFERENCES MyUser(idUser),
  modifierUser VARCHAR(255) REFERENCES MyUser(idUser)
);

CREATE TABLE Client (
  idClient VARCHAR(255) PRIMARY KEY,
  idTiid VARCHAR(255),
  email VARCHAR(255) NOT NULL,
  creationDate DATE NOT NULL,
  modificationDate DATE,
  name VARCHAR(255) NOT NULL,
  identificationNumber VARCHAR(255),
  lastName VARCHAR(255),
  gender CHAR(1),  -- You can adjust the data type for gender based on your needs (e.g., VARCHAR(10) for more options)
  cellphone VARCHAR(255)
);

CREATE TABLE Activity (
  code VARCHAR(255) PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  description TEXT
);

CREATE TABLE ActivityDetails (
  idActivityDetails VARCHAR(255) PRIMARY KEY,
  code VARCHAR(255) REFERENCES Activity(code),
  details TEXT,
  cost DECIMAL(10,2), -- Adjust decimal places if needed
  status VARCHAR(255)
);

CREATE TABLE Booking (
  idBooking VARCHAR(255) PRIMARY KEY,
  idClient VARCHAR(255) REFERENCES Client(idClient),
  idActivity VARCHAR(255) REFERENCES Activity(code),
  bookingDate DATE NOT NULL,
  duration INT NOT NULL,
  hour TIME NOT NULL,
  status VARCHAR(255),
  description TEXT
);

CREATE TABLE CancelationBooking (
  idCancelationBooking VARCHAR(255) PRIMARY KEY,
  idBooking VARCHAR(255) REFERENCES Booking(idBooking),
  reason TEXT NOT NULL
);

CREATE TABLE PhysicalSpace (
  idPhysicalSpace VARCHAR(255) PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  description TEXT,
  location VARCHAR(255) NOT NULL,
  capacity INT NOT NULL
);

CREATE TABLE Schedule (
  idSchedule VARCHAR(255) PRIMARY KEY,
  dayOfWeek VARCHAR(255) NOT NULL,  -- You can adjust the data type for dayOfWeek based on your needs (e.g., INT for numeric representation)
  month VARCHAR(255),  -- You can adjust the data type for month based on your needs (e.g., INT for numeric representation)
  iniHour TIME NOT NULL,
  endHour TIME NOT NULL
);

CREATE TABLE Availability (
  idAvailability VARCHAR(255) PRIMARY KEY,
  idPhysicalSpace VARCHAR(255) REFERENCES PhysicalSpace(idPhysicalSpace),
  idSchedule VARCHAR(255) REFERENCES Schedule(idSchedule),
  availableDate DATE NOT NULL,
  availableCapacity INT NOT NULL
);