import React from "react";

export default function FutbolPage() {
  const images = [
    { src: "/images/escuelaFutbol.png", title: "Escuelas" },
    { src: "/images/canchaFutbol.png", title: "Canchas" },
    { src: "/images/torneoFutbol.png", title: "Torneo" },
    { src: "/images/fotoDestacadaFutbol.png", title: "Fotos Destacadas" },
  ];

  return (
    <div className="min-h-screen flex flex-col font-serif">
      <header className="text-center my-8">
        <h1 className="text-2xl font-ligth">
        "Siente la emoción del fútbol en nuestros campos de césped natural. ¡Únete al equipo y juega al máximo!"
        </h1>
      </header>
      <main className="flex flex-grow items-start">
        <section className="w-1/2 p-10">
          <div className="text-lg pl-10 pt-10">
            <p className="mb-4">
            El fútbol sobre césped natural es una experiencia incomparable. Nuestros campos de primer nivel te ofrecen el escenario perfecto para tus partidos y entrenamientos
            </p>
            <p className="mb-4">
            No importa tu nivel de habilidad, nuestros campos están preparados para acogerte. Ven y disfruta del fútbol en su forma más pura con nosotros
            </p>
            <p>
            Participa en nuestros torneos y eventos especiales de fútbol natural para mostrar tu talento y conectarte con otros aficionados
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
