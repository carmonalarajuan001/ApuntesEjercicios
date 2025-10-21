create table coches(
marca varchar(20)
modelo varchar(20)
matricula varchar(8) PRIMARY key
precio float
idDueno varchar(10)
FOREIGN KEY (idDueno) references PERSONAS (dni)
);

(toyota, Corolla, 1234ABE, 20000.0, 54567689R);
(honda, Civic, 4566CDN, 22000.0, 67894532M);
(ford, Focus, 7896EFJ, 21000.0, 78945612J);
(chevrolet, Malibu, 3216YGH, 25000.0, 12345678A);
(nissan, Altima, 6546JIJ, 23000.0, 98765432B);
(mazda, 3, 9874MKL, 24000.0, 54567689R);
(audi, A4, 1470PMN, 35000.0, 45678912C);
(bmw, 320i, 2588KOP, 37000.0, 23456789D);
(mercedes, C200, 369QR, 40000.0, 34567891E);
(volkswagen, Golf, 741ST, 27000.0, 56789123F);
      


