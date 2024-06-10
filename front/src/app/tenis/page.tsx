import React from "react";

export default function TenisPage() {
  const images = [
    { src: "/images/voley1.png", title: "Escuelas" },
    { src: "/images/voley2.png", title: "Canchas" },
    { src: "/images/voley3.png", title: "Torneo" },
    { src: "/images/voley4.png", title: "Fotos Destacadas" },
  ];

  return (
    <div className="min-h-screen flex flex-col font-serif">
      <header className="text-center my-8">
        <h1 className="text-2xl font-ligth">
          "Perfecciona tu juego en nuestras canchas de tenis. ¡Únete a nosotros
          y vive la pasión del tenis!"
        </h1>
      </header>
      <main className="flex flex-grow items-start">
        <section className="w-1/2 p-10">
          <div className="text-lg pl-10 pt-10">
            <p className="mb-4">
              El tenis es un deporte elegante y competitivo que requiere
              precisión y estrategia. En nuestras instalaciones, encontrarás
              todo lo necesario para mejorar tu juego y disfrutar al máximo
            </p>
            <p className="mb-4">
              Tanto si eres un principiante como un jugador avanzado, nuestras
              canchas de tenis están a tu disposición. Ven y experimenta el
              tenis con nosotros
            </p>
            <p>
              Organizamos torneos y clínicas de tenis regularmente para que
              puedas demostrar tus habilidades y conocer a otros entusiastas del
              tenis
            </p>
          </div>
        </section>
        <section className="w-1/2 p-10 flex flex-wrap justify-center items-start">
          {images.map((image, index) => (
            <div key={index} className="w-48 m-4 flex flex-col items-center">
              <p className="text-center font-semibold mb-2 truncate w-48">
                {image.title}
              </p>
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
