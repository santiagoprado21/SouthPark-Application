import React from "react";

export default function FutbolSinteticoPage() {
  const images = [
    { src: "/images/escuelaSintetica.png", title: "Escuelas" },
    { src: "/images/canchasSinteticas.png", title: "Canchas" },
    { src: "/images/torneoSintetica.png", title: "Torneo" },
    { src: "/images/fotoDestacadaSintetica.png", title: "Fotos Destacadas" },
  ];

  return (
    <div className="min-h-screen flex flex-col font-serif">
      <header className="text-center my-8">
        <h1 className="text-2xl font-ligth">
        "Domina el juego en nuestros campos de fútbol sintético. ¡Ven y juega en las mejores condiciones!"
        </h1>
      </header>
      <main className="flex flex-grow items-start">
        <section className="w-1/2 p-10">
          <div className="text-lg pl-10 pt-10">
            <p className="mb-4">
            El fútbol en campos sintéticos ofrece una superficie uniforme y condiciones ideales para jugar. Nuestras instalaciones están diseñadas para que disfrutes de cada partido al máximo
            </p>
            <p className="mb-4">
            Ya seas un jugador principiante o un experto, nuestros campos de fútbol sintético están listos para ti. Únete a nosotros y vive la experiencia del fútbol sintético
            </p>
            <p>
            Organizamos torneos y ligas de fútbol sintético para que puedas competir y demostrar tu habilidad mientras conoces a otros jugadores apasionados
            </p>
          </div>
        </section>
        <section className="w-1/2 p-10 flex flex-wrap justify-center items-start">
          {images.map((image, index) => (
            <div key={index} className="w-48 m-4 flex flex-col items-center">
              <p className="text-center font-semibold mb-2 truncate w-48">{image.title}</p>
              <div className="w-full h-48 bg-gray-200 rounded-lg overflow-hidden">
                <img
                  src={image.src}
                  alt={image.title}
                  className="w-full h-full object-cover rounded-lg"
                />
              </div>
            </div>
          ))}
        </section>
      </main>
    </div>
  );
}
