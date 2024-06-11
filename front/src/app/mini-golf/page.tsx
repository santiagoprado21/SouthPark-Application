import React from "react";

export default function MiniGolfPage() {
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
        "Descubre la diversión del mini golf en nuestro campo. ¡Únete a la aventura y perfecciona tu swing!"
        </h1>
      </header>
      <main className="flex flex-grow items-start">
        <section className="w-1/2 p-10">
          <div className="text-lg pl-10 pt-10">
            <p className="mb-4">
            El mini golf es una actividad divertida y desafiante para todas las edades. Nuestro campo de mini golf te ofrece un entorno perfecto para disfrutar con familia y amigos
            </p>
            <p className="mb-4">
            No importa si eres un novato o un experto en mini golf, nuestras instalaciones están diseñadas para que te diviertas y desafíes tus habilidades
            </p>
            <p>
            Participa en nuestros torneos de mini golf y eventos especiales para mostrar tu destreza y pasar un buen rato con otros aficionados
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
